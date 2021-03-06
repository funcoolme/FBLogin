package com.example.l33534.facebooksample;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;

/**
 * Created by L33534 on 11/17/2014.
 */
public class MainActivity extends FragmentActivity {

    private MainFragment mainFragment;
    private static final String TAG = "MainFragment";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        if (savedInstanceState == null) {
            // Add the fragment on initial activity setup
            mainFragment = new MainFragment();
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(android.R.id.content, mainFragment)
                    .commit();
        } else {
            // Or set the fragment from restored state info
            mainFragment = (MainFragment) getSupportFragmentManager()
                    .findFragmentById(android.R.id.content);
        }
    }

}
