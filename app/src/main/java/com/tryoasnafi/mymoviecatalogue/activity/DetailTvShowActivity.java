package com.tryoasnafi.mymoviecatalogue.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.tryoasnafi.mymoviecatalogue.R;
import com.tryoasnafi.mymoviecatalogue.pojo.TvShow;

public class DetailTvShowActivity extends AppCompatActivity {

    private String title = "MyMovieCatalogue";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_tv_show);

        getIntentTvShow();
    }

    private void getIntentTvShow() {
        TvShow tvShow = getIntent().getParcelableExtra("tvShowKey");

        ImageView imgPoster = findViewById(R.id.imgPosterShow);
        TextView imdb = findViewById(R.id.imdbShow);
        TextView tvTitle = findViewById(R.id.tvTitleShow);
        TextView tvOverview = findViewById(R.id.tvOverViewShow);
        TextView tvCreator = findViewById(R.id.tvCreatorShow);
        TextView tvRelease = findViewById(R.id.tvReleaseShow);
        TextView tvRuntime = findViewById(R.id.tvRuntimeShow);
        TextView tvEpisode = findViewById(R.id.tvEpisodeShow);
        TextView tvGenre = findViewById(R.id.tvGenreShow);

        Glide.with(this)
                .load(tvShow.getPoster())
                .apply(new RequestOptions().override(300, 440))
                .into(imgPoster);

        imdb.setText(tvShow.getScore());
        tvTitle.setText(tvShow.getTitle());
        tvOverview.setText(tvShow.getOverview());
        tvCreator.setText(tvShow.getCreator());
        tvRelease.setText(tvShow.getRelease());
        tvRuntime.setText(tvShow.getRuntime());
        tvEpisode.setText(tvShow.getEpisode());
        tvGenre.setText(tvShow.getGenre());

        title = tvShow.getTitle();
        setActionBarTitle(title);
    }

    private void setActionBarTitle(String title) {
        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle(title);
        }
    }
}
