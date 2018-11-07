package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.Historyorder;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.R;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.holder.HistoryorderHolder;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model.Historyordermodel;

import java.util.ArrayList;

public class HistoryorderAdapter extends RecyclerView.Adapter<HistoryorderHolder> {
    private ArrayList<Historyordermodel> arrayList;
    private Context context;

    public HistoryorderAdapter(ArrayList<Historyordermodel> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public HistoryorderHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cardviewhistoryorder,parent,false);
        return new HistoryorderHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull HistoryorderHolder holder, int position) {
        final Historyordermodel tablebook = arrayList.get(position);
        holder.soban.setText("STT: "+tablebook.getSTT());
        holder.sotang.setText("Thời gian: "+tablebook.getThoigian());
        holder.tongtien.setText("Tổng tiền: "+tablebook.getTongtien());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
