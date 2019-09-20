package com.tryoasnafi.mymoviecatalogue.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tryoasnafi.mymoviecatalogue.R;
import com.tryoasnafi.mymoviecatalogue.adapter.MovieAdapter;
import com.tryoasnafi.mymoviecatalogue.data.Data;
import com.tryoasnafi.mymoviecatalogue.pojo.Movie;

import java.util.ArrayList;

public class MovieFragment extends Fragment {

    RecyclerView rvMovie;
    ArrayList<Movie> list = new ArrayList<>();

    public MovieFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_movie, container, false);

        rvMovie = view.findViewById(R.id.rv_list_movie);

        list.addAll(Data.getListMovieData());
        MovieAdapter movieAdapter = new MovieAdapter(list, getContext());
        rvMovie.setAdapter(movieAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvMovie.setLayoutManager(layoutManager);

        return view;

    }
}
