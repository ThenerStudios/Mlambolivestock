package com.mlambo.mlamboenterprise.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.mlambo.mlamboenterprise.R;


public class HomeFragmant extends Fragment {

   // private OnFragmentInteractionListener mListener;

    public HomeFragmant() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home_fragmant, container, false);
    }


}
