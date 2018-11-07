package com.example.phamngoclinh.duan1_goimonan_linhpnph05985;



import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.adapter.OrdernowAdapter;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model.Order;

import java.util.ArrayList;

public class Ordernow extends Fragment {
    private View layoutHome;
    private RecyclerView recyclerviewBook;
    private LinearLayoutManager linearLayoutManager;
    private OrdernowAdapter bookAdapter;
    private ArrayList<Order> bookArrayList;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        layoutHome = inflater.inflate(R.layout.ordernow,container,false);
        recycler();
        return layoutHome;
    }

    public void recycler(){
        recyclerviewBook = layoutHome.findViewById(R.id.recyclerd);
        linearLayoutManager = new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false);

        bookArrayList = new ArrayList<>();
        bookArrayList.add(new Order("1","1","546546546"));
        bookArrayList.add(new Order("1","1","546546546"));
        bookArrayList.add(new Order("1","1","546546546"));
        bookArrayList.add(new Order("1","1","546546546"));
        bookArrayList.add(new Order("1","1","546546546"));
        bookArrayList.add(new Order("1","1","546546546"));


        bookAdapter=new OrdernowAdapter(bookArrayList, getActivity());
        recyclerviewBook.setLayoutManager(linearLayoutManager);
        recyclerviewBook.setHasFixedSize(true);
        recyclerviewBook.setAdapter(bookAdapter);

    }
}
