package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myAdapter extends RecyclerView.Adapter<myAdapter.viewhold> {

    String data[];

    public myAdapter(String[] data) {
        this.data = data;
    }

    @NonNull
    @Override
    public viewhold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.singlrow,
                parent,
                false);
        return new viewhold(view);

    }

    @Override
    public void onBindViewHolder(@NonNull viewhold holder, int position) {

        holder.tv.setText(data[position]);

    }

    @Override
    public int getItemCount() {
        return data.length;
    }


    class viewhold extends RecyclerView.ViewHolder {
        ImageView img;
        TextView tv;

        public viewhold(@NonNull View itemView) {
            super(itemView);
            img = (ImageView) itemView.findViewById(R.id.img1);
            tv = (TextView) itemView.findViewById(R.id.t1);
        }
    }

}
