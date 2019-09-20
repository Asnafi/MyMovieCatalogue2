package com.tryoasnafi.mymoviecatalogue.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.tryoasnafi.mymoviecatalogue.R;
import com.tryoasnafi.mymoviecatalogue.activity.DetailMovieActivity;
import com.tryoasnafi.mymoviecatalogue.pojo.Movie;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.CardViewViewHolder> {
    private ArrayList<Movie> listMovie;
    Context c;

    public MovieAdapter(ArrayList<Movie> listMovie, Context c) {
        this.listMovie = listMovie;
        this.c = c;
    }

    @NonNull
    @Override
    public MovieAdapter.CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_list, parent, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.CardViewViewHolder holder, int position) {
        final Movie movie = listMovie.get(position);

        Glide.with(holder.itemView.getContext())
                .load(movie.getPoster())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.imgPoster);

        holder.tvTitle.setText(movie.getTitle());
        holder.tvRelease.setText(movie.getRelease());
        holder.tvGenre.setText(movie.getGenre());
        holder.tvOverview.setText(movie.getOverview());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(c, DetailMovieActivity.class);
                mIntent.putExtra("movieKey", movie);
                c.startActivity(mIntent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listMovie.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
         ImageView imgPoster;
         TextView tvTitle, tvRelease, tvGenre, tvOverview;

        CardViewViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPoster = itemView.findViewById(R.id.img_item_poster);
            tvTitle = itemView.findViewById(R.id.tv_item_title);
            tvRelease = itemView.findViewById(R.id.tv_item_release);
            tvGenre = itemView.findViewById(R.id.tv_item_genre);
            tvOverview = itemView.findViewById(R.id.tv_item_overview);
        }
    }
}