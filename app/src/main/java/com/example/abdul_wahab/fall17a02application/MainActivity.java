package com.example.abdul_wahab.fall17a02application;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.example.abdul_wahab.fall17a02application.events.ContactPressEvent;
import com.example.abdul_wahab.fall17a02application.fragments.ContactListFragment;
import com.example.abdul_wahab.fall17a02application.models.Contact;

import org.greenrobot.eventbus.EventBus;
import org.greenrobot.eventbus.Subscribe;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Contact> contactList;


    @Subscribe
    public void ContactSelected(ContactPressEvent contact) {

        Log.d("MTAG", "ContactSelected: " + contact.getId());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    @Override
    protected void onStart() {
        super.onStart();
        EventBus.getDefault().register(this);

    }

    @Override
    protected void onStop() {
        EventBus.getDefault().unregister(this);
        super.onStop();
    }


}
