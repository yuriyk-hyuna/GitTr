package com.hyuna.bustest.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hyuna.bustest.R;

/**
 * Created by Iurii on 3/24/2015.
 */
public class LandskapeFragment extends Fragment  {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {


        View view=LayoutInflater.from(getActivity()).inflate(R.layout.fragment_land_layout, null);

        return view;
    }
}