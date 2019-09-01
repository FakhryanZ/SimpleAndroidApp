package com.dicoding.indonesiatouristdestination;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class Detail extends AppCompatActivity {

    private static final String TAG = "Detail";
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        ImageView imageViewDestinasi = findViewById(R.id.image);
        TextView textViewNamaDestinasi = findViewById(R.id.nama_destinasi);
        TextView textViewDeskripsiDestinasi = findViewById(R.id.deskripsi_destinasi);

        String gambarDestinasi = getIntent().getStringExtra("Extra Gambar Destinasi");
        String namaDestinasi = getIntent().getStringExtra("Extra_Nama_Destinasi");
        String deskripsiDestinasi = getIntent().getStringExtra("Extra_Deskripsi_Destinasi");

        Glide.with(this)
                .asBitmap()
                .load(gambarDestinasi)
                .into(imageViewDestinasi);
        textViewNamaDestinasi.setText(namaDestinasi);
        textViewDeskripsiDestinasi.setText(deskripsiDestinasi);
    }
}
