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
 * Created by Iurii on 3/12/2015.
 */
public class SecondFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.first_fragment, null);
        TextView text = (TextView) view.findViewById(R.id.firstTitle);
        text.setText("SECOND activity");
        return view;

    }
}
