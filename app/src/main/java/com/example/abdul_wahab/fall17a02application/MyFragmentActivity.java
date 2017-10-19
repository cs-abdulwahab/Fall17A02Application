package com.example.abdul_wahab.fall17a02application;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.abdul_wahab.fall17a02application.fragments.MySpecialFragment;
import com.example.abdul_wahab.fall17a02application.models.Contact;

public class MyFragmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_fragment);


        FragmentManager fm = getFragmentManager();
        FragmentTransaction transaction = fm.beginTransaction();

        transaction.add(R.id.fragContainer, MySpecialFragment.newInstance( new Contact(1,"c1","p1")), "f1");
      //  transaction.add(R.id.fragContainer, MySpecialFragment.newInstance("asd", "asd"), "f2");

        transaction.commit();


    }
}
