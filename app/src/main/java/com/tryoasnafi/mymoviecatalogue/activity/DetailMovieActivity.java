package com.tryoasnafi.mymoviecatalogue.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.tryoasnafi.mymoviecatalogue.R;
import com.tryoasnafi.mymoviecatalogue.pojo.Movie;

public class DetailMovieActivity extends AppCompatActivity {

    private String title = "MyMovieCatalogue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_movie);

        getIntentMovie();
    }

    private void getIntentMovie() {
        Movie movie = getIntent().getParcelableExtra("movieKey");

        ImageView imgPoster = findViewById(R.id.imgPoster);
        TextView imdb = findViewById(R.id.imdb);
        TextView tvTitle = findViewById(R.id.tvTitle);
        TextView tvOverview = findViewById(R.id.tvOverview);
        TextView tvDirector = findViewById(R.id.tvDirector);
        TextView tvRelease = findViewById(R.id.tvRelease);
        TextView tvRuntime = findViewById(R.id.tvRuntime);
        TextView tvGenre = findViewById(R.id.tvGenre);

        Glide.with(this)
                .load(movie.getPoster())
                .apply(new RequestOptions().override(300, 440))
                .into(imgPoster);

        imdb.setText(movie.getScore());
        tvTitle.setText(movie.getTitle());
        tvOverview.setText(movie.getOverview());
        tvDirector.setText(movie.getDirector());
        tvRelease.setText(movie.getRelease());
        tvRuntime.setText(movie.getRuntime());
        tvGenre.setText(movie.getGenre());

        title = movie.getTitle();
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
