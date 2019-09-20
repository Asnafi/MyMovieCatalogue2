package com.tryoasnafi.mymoviecatalogue.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tryoasnafi.mymoviecatalogue.R;
import com.tryoasnafi.mymoviecatalogue.adapter.TvShowAdapter;
import com.tryoasnafi.mymoviecatalogue.data.Data;
import com.tryoasnafi.mymoviecatalogue.pojo.Movie;
import com.tryoasnafi.mymoviecatalogue.pojo.TvShow;

import java.util.ArrayList;

public class TvShowFragment extends Fragment {

    RecyclerView rvTvShow;
    ArrayList<TvShow> list = new ArrayList<>();

    public TvShowFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_tvshow, container, false);

        rvTvShow = view.findViewById(R.id.rv_list_tvshow);

        list.addAll(Data.getListTvShowData());
        TvShowAdapter tvShowAdapter = new TvShowAdapter(list, getContext());
        rvTvShow.setAdapter(tvShowAdapter);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rvTvShow.setLayoutManager(layoutManager);

        return view;
    }

}
