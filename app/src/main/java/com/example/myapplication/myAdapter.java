package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class myAdapter extends RecyclerView.Adapter<myAdapter.MyViewHolder> {

    Context context;

    ArrayList<myjourney> list;


    public myAdapter(Context context, ArrayList<myjourney> list) {
        this.context = context;
        this.list = list;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.journeyitem,parent,false);
        return  new MyViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        myjourney myj = list.get(position);
        holder.referenceid.setText(myj.getReferenceid());
        holder.startpoint.setText(myj.getStartpoint());
        holder.destination.setText(myj.getDestination());
        holder.date.setText(myj.getDate());
        holder.numoftickets.setText(myj.getNumoftickets());


    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView referenceid, startpoint, destination,date,numoftickets;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            referenceid = itemView.findViewById(R.id.referenceid);
            startpoint = itemView.findViewById(R.id.startpoint);
            destination = itemView.findViewById(R.id.destination);
            date = itemView.findViewById(R.id.date);
            numoftickets = itemView.findViewById(R.id.numoftickets);

        }
    }

}