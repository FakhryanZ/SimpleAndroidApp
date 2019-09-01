package com.dicoding.indonesiatouristdestination;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.dicoding.indonesiatouristdestination.adapter.DestinasiAdapter;
import com.dicoding.indonesiatouristdestination.model.Destinasi;
import com.dicoding.indonesiatouristdestination.model.DestinasiData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvDestinations;
    private ArrayList<Destinasi> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvDestinations = findViewById(R.id.rv_destinations);
        rvDestinations.setHasFixedSize(true);

        list.addAll(DestinasiData.getListData());
        showRecyclerList();
    }

    private void showRecyclerList() {
        rvDestinations.setLayoutManager(new LinearLayoutManager(this));
        DestinasiAdapter destinasiAdapter = new DestinasiAdapter(list);
        rvDestinations.setAdapter(destinasiAdapter);

        destinasiAdapter.setOnItemClickCallback(new DestinasiAdapter.OnItemClickCallback() {
            @Override
            public void onItemClicked(Destinasi data) {
                showSelectedDestinasi(data);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        setMode(item.getItemId());
        return super.onOptionsItemSelected(item);
    }


    private void setMode(int selectedMode) {
        switch (selectedMode){
            case R.id.aboutMe:
                aboutMe();
                break;
        }
    }

    private void showSelectedDestinasi(Destinasi destinasi){
        Toast.makeText(this, destinasi.getName(), Toast.LENGTH_SHORT).show();

        Intent intent = new Intent(this, Detail.class);
        intent.putExtra("Extra Gambar Destinasi", destinasi.getPhoto());
        intent.putExtra("Extra_Nama_Destinasi", destinasi.getName());
        intent.putExtra("Extra_Deskripsi_Destinasi", destinasi.getDescription());
        startActivity(intent);
    }

    private void aboutMe() {
        Intent moveIntent = new Intent(MainActivity.this, AboutMe.class);
        startActivity(moveIntent);
    }
}
