package com.example.eric.myapplication;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * Created by eric on 8/11/17.
 */

public class MyFragment extends Fragment
{
    final public static String TAG = "MyFragment";

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.my_fragment, null);


        return view;
    }

    // static required to reference inner classes via xml
    static public class CustomView extends ConstraintLayout
    {
        public CustomView(Context context)
        {
            super(context);
        }
        public CustomView(Context context, AttributeSet attrs)
        {
            super(context, attrs);
        }

        public CustomView(Context context, AttributeSet attrs, int defStyle)
        {
            super(context, attrs, defStyle);
        }

        public float getFoo(float bar)
        {
            Button button = (Button) findViewById(R.id.button);
            return button.getTranslationY() * 0.01f;
        }

        public void setFoo(float bar)
        {
            Button button = (Button) findViewById(R.id.button);
            button.setTranslationY((int) (bar * 100));
        }
    }
}
