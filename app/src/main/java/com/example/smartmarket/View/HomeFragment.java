package com.example.smartmarket.View;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.example.smartmarket.R;

/**
 * Created by oshinrawal on 7/27/16.
 */
public class HomeFragment extends Fragment {
    private GridView productGridView;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        productGridView = (GridView) view.findViewById(R.id.homeGridview);
        return view;
    }
}
