package com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.R;
import com.example.a17_networkingwithasynchttpfuelvolleyokhttpretrofit.model.Player;

import java.lang.reflect.Member;
import java.util.ArrayList;

public class PlayerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    Context context;
    ArrayList<Player> players;

    public PlayerAdapter(Context context, ArrayList<Player> players) {
        this.context = context;
        this.players = players;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_custom_layout,parent, false);
        return new MemberViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        Player player = players.get(position);

        if(holder instanceof  MemberViewHolder){
            ImageView tennis_image = ((MemberViewHolder) holder).tennis_image;
            TextView tennis_name = ((MemberViewHolder) holder).tennis_name;
            TextView tennis_location = ((MemberViewHolder) holder).tennis_location;

            tennis_name.setText(player.getTennis_name());
            tennis_location.setText(player.getCountry() + ", " + player.getCity());
        }
    }

    @Override
    public int getItemCount() {
        return players.size();
    }

    public class  MemberViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public ImageView tennis_image;
        public TextView tennis_name,tennis_location;

        public MemberViewHolder(View v){
            super(v);
            this.view = v;
            tennis_image = view.findViewById(R.id.tennis_image);
            tennis_name = view.findViewById(R.id.tennis_name);
            tennis_location = view.findViewById(R.id.tennis_location);
        }
    }
}
