package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.R;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.holder.TablebookHolder;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model.Tablebook;

import java.util.ArrayList;

public class TablebookAdapter extends RecyclerView.Adapter<TablebookHolder> {
    private ArrayList<Tablebook> arrayList;
    private Context context;

    public TablebookAdapter(ArrayList<Tablebook> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public TablebookHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.tablecardview,parent,false);
        return new TablebookHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull TablebookHolder holder, int position) {
        final Tablebook tablebook = arrayList.get(position);
        holder.soban.setText("Bàn: "+tablebook.getSoban());
        holder.sotang.setText("Tầng: "+tablebook.getSotang());
        holder.anhb.setImageResource(R.drawable.ban);

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
