package com.example.exemplorecyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView mRecyclerView = (RecyclerView) findViewById(R.id.id_recycler_view);

        //definimos o gerenciador de layout da RecyclerView:
        mRecyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        //definimos o adaptador de dados (alimentado por uma LinkedList na classe do adaptador):
        TrabalhadorAdapter mAdapter = new TrabalhadorAdapter();

        //relacionamos a RecyclerView com o adaptador de dados:
        mRecyclerView.setAdapter(mAdapter);
    }
}


