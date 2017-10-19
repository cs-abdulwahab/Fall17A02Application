package com.example.abdul_wahab.fall17a02application.fragments;


import android.app.Fragment;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdul_wahab.fall17a02application.R;
import com.example.abdul_wahab.fall17a02application.adapters.ContactAdapter;
import com.example.abdul_wahab.fall17a02application.models.Contact;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactListFragment extends Fragment {

    List<Contact> contactList;

    RecyclerView mRecyclerView;

    public ContactListFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_contact_list, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.myrecyclerview);
        mRecyclerView.setHasFixedSize(true);

        // dummy data
        contactList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            contactList.add(new Contact(i, "name : " + i, "http://lorempixel.com/400/200/people/" + "name" + i + "/"));
        }


        ContactAdapter contactAdapter = new ContactAdapter(getContext(), contactList);

        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setAdapter(contactAdapter);
        return view;
    }

}
