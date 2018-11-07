package com.example.phamngoclinh.duan1_goimonan_linhpnph05985.holder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.R;

public class TablebookHolder extends RecyclerView.ViewHolder {
    public final ImageView anhb;
    public final TextView soban;
    public final TextView sotang;
    public final CheckBox check;
    public TablebookHolder(View itemView) {
        super(itemView);
        anhb = itemView.findViewById(R.id.imgAnh);
        soban = itemView.findViewById(R.id.tvSoban);
        sotang = itemView.findViewById(R.id.tvSotang);
        check = itemView.findViewById(R.id.cbCheckban);
    }
}
