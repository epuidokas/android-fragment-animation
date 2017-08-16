package com.example.eric.myapplication;

import android.app.Activity;
import android.app.FragmentManager;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getFragmentManager()
                .beginTransaction()
                .add(android.R.id.content, new MyFragment(), MyFragment.TAG)
                .commit();

    }

    public void openAnotherFragment(View v)
    {
        getFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.animator.slide_up_375, R.animator.fade_out_375, R.animator.show, R.animator.slide_down_fade_out_375)
                .replace(android.R.id.content, new MySecondFragment(), MySecondFragment.TAG)
                .addToBackStack(null)
                .commit();
    }

    @Override
    public void onBackPressed()
    {
        FragmentManager fm = getFragmentManager();

        try
        {
            super.onBackPressed();
        }
        catch (IllegalStateException e)
        {
            //super.onBackPressed();
        }
    }
}
