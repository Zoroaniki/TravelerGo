package com.melself.journeygo.ui.Adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.melself.journeygo.databinding.ListHotelBinding;

public class HotelAdapter extends RecyclerView.Adapter<HotelAdapter.HotelViewHolder> {


    public static class HotelViewHolder extends RecyclerView.ViewHolder {

        ListHotelBinding binding;

        public HotelViewHolder(ListHotelBinding item) {
            super(item.getRoot());
            binding = item;
        }
    }

    @NonNull
    @Override
    public HotelAdapter.HotelViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        return new HotelViewHolder(ListHotelBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull HotelAdapter.HotelViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
