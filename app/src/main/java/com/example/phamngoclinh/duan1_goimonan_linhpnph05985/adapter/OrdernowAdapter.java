package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.R;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.holder.OrdernowHolder;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model.Order;

import java.util.ArrayList;

public class OrdernowAdapter extends RecyclerView.Adapter<OrdernowHolder> {
    private ArrayList<Order> arrayList;
    private Context context;

    public OrdernowAdapter(ArrayList<Order> arrayList, Context context) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public OrdernowHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.cardvieworder,parent,false);
        return new OrdernowHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull OrdernowHolder holder, int position) {
        final Order tablebook = arrayList.get(position);
        holder.soban.setText("Bàn: "+tablebook.getSoban());
        holder.sotang.setText("Tầng: "+tablebook.getSotang());
        holder.tongtien.setText("Tổng tiền: "+tablebook.getTongtien());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }
}
