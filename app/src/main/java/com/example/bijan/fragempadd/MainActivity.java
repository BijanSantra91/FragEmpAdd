package com.example.bijan.fragempadd;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fragmentManager =getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        First first = new First();
        Second second = new Second();

        fragmentTransaction.add(R.id.container1, first);
        fragmentTransaction.add(R.id.container2, second, "frag2");//tag

        fragmentTransaction.commit();
    }
    public void passData(String eid,String ename,String esal){
        //passdata to second
        FragmentManager fragmentManager = getSupportFragmentManager();
        Second second = (Second) fragmentManager.findFragmentByTag("frag2");
        second.catchData(eid, ename, esal);

    }
}
