package com.dicoding.indonesiatouristdestination.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.dicoding.indonesiatouristdestination.Detail;
import com.dicoding.indonesiatouristdestination.R;
import com.dicoding.indonesiatouristdestination.model.Destinasi;

import java.util.ArrayList;

public class DestinasiAdapter extends RecyclerView.Adapter<DestinasiAdapter.DestinasiViewHolder> {
    private ArrayList<Destinasi> listDestinasi;
    private OnItemClickCallback onItemClickCallback;

    public DestinasiAdapter(ArrayList<Destinasi> listDestinasi) {
        this.listDestinasi = listDestinasi;
    }

    public void setOnItemClickCallback(OnItemClickCallback onItemClickCallback){
        this.onItemClickCallback = onItemClickCallback;
    }

    @NonNull
    @Override
    public DestinasiViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_destination, viewGroup, false);
        return new DestinasiViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final DestinasiViewHolder holder, int position) {
        Destinasi destinasi = listDestinasi.get(position);

        Glide.with(holder.itemView.getContext())
                .load(destinasi.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);

        holder.tvName.setText(destinasi.getName());
        holder.tvDeskripsi.setText(destinasi.getDescription());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClickCallback.onItemClicked(listDestinasi.get(holder.getAdapterPosition()));
            }
        });
    }

    public interface OnItemClickCallback {
        void onItemClicked(Destinasi data);
    }
    @Override
    public int getItemCount() {
        return listDestinasi.size();
    }

    public class DestinasiViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDeskripsi;

        public DestinasiViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDeskripsi = itemView.findViewById(R.id.tv_item_description);
        }
    }
}
