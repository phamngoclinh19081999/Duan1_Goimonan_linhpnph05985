package com.example.phamngoclinh.duan1_goimonan_linhpnph05985;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.adapter.TablebookAdapter;
import com.example.phamngoclinh.duan1_goimonan_linhpnph05985.model.Tablebook;

import java.util.ArrayList;

public class TablebookActivity extends AppCompatActivity {
    private RecyclerView recyclerviewBook;
    private LinearLayoutManager linearLayoutManager;
    private TablebookAdapter bookAdapter;
    private ArrayList<Tablebook> bookArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablebook);
        recycler();
    }

    public void recycler(){
        recyclerviewBook = findViewById(R.id.recyclerS);
        linearLayoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        bookArrayList = new ArrayList<>();
        bookArrayList.add(new Tablebook("1","1"));
        bookArrayList.add(new Tablebook("2","1"));
        bookArrayList.add(new Tablebook("3","1"));
        bookArrayList.add(new Tablebook("4","1"));
        bookArrayList.add(new Tablebook("1","2"));
        bookArrayList.add(new Tablebook("2","2"));
        bookArrayList.add(new Tablebook("3","2"));
        bookArrayList.add(new Tablebook("4","2"));


        bookAdapter=new TablebookAdapter(bookArrayList, this);
        recyclerviewBook.setLayoutManager(linearLayoutManager);
        recyclerviewBook.setHasFixedSize(true);
        recyclerviewBook.setAdapter(bookAdapter);

    }
}
