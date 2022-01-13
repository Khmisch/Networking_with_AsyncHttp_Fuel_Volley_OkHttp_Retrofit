package com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.activity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.R;
import com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.adapter.PlayerAdapter;
import com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.model.Player;
import com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.model.PlayerDatas;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    Context context;
    RecyclerView recyclerView;
    ProgressBar progressBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        apiUsingAsyncHttp();
        apiUsingFuel();
        apiUsingVolley();
        apiUsingOkHttp();
        apiUsingRetrofit();

    }

    // Methods

    private void initViews() {
        context = this;
        progressBar = findViewById(R.id.progressBar);
        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
    }

    void refreshAdapter(ArrayList<Player> players) {
        PlayerAdapter adapter = new PlayerAdapter(context, players);
        recyclerView.setAdapter(adapter);
    }

    private void processWithResponse(final PlayerDatas playerDates){
        progressBar.setVisibility(View.GONE);

        String message = playerDates.getMessage();
        ArrayList<Player> players = playerDates.getData();
        fireToast(message);
        refreshAdapter(players);
    }

    private void fireToast(String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    // Api Requests

    private void apiUsingRetrofit() {

    }

    private void apiUsingOkHttp() {

    }

    private void apiUsingVolley() {
    }

    private void apiUsingFuel() {
    }

    private void apiUsingAsyncHttp() {
    }
}