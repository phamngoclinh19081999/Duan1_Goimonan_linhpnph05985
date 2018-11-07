package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.R;

public class HistoryorderHolder extends RecyclerView.ViewHolder {
    public TextView soban;
    public  TextView sotang;
    public  TextView tongtien;
    public HistoryorderHolder(View itemView) {
        super(itemView);
        soban = itemView.findViewById(R.id.tvSobans);
        sotang = itemView.findViewById(R.id.tvSotangs);
        tongtien = itemView.findViewById(R.id.tvTongtiens);
    }
}
