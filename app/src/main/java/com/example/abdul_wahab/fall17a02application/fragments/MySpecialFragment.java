package com.example.abdul_wahab.fall17a02application.fragments;


import android.app.Fragment;
import android.os.Bundle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdul_wahab.fall17a02application.R;
import com.example.abdul_wahab.fall17a02application.models.Contact;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MySpecialFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class MySpecialFragment extends Fragment {
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;


    public MySpecialFragment() {
        // Required empty public constructor
    }


    public static MySpecialFragment newInstance(Contact contact) {
        MySpecialFragment fragment = new MySpecialFragment();

        return fragment;
    }


    public static MySpecialFragment newInstance() {
        MySpecialFragment fragment = new MySpecialFragment();
        return fragment;
    }


    public static MySpecialFragment newInstance(String param1, String param2) {
        MySpecialFragment fragment = new MySpecialFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_special, container, false);
    }

}
