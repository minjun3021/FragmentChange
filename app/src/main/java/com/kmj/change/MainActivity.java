package com.kmj.change;

import android.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<android.support.v4.app.Fragment> arrayList;
    FrameLayout frameLayout;
    Button b1, b2, b3;
    FirstFragment firstFragment;
    SecondFragment secondFragment;
    ThirdFragment thirdFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        frameLayout = findViewById(R.id.frame);
        b1 = findViewById(R.id.b1);
        b2 = findViewById(R.id.b2);
        b3 = findViewById(R.id.b3);
        arrayList = new ArrayList<>();
        firstFragment = new FirstFragment();
        secondFragment = new SecondFragment();
        thirdFragment = new ThirdFragment();
        arrayList.add(firstFragment);
        arrayList.add(secondFragment);
        arrayList.add(thirdFragment);
        final FragmentUtils fragmentUtils=new FragmentUtils(R.id.frame,arrayList);
        fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(),0,new Bundle());
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(),0,new Bundle());
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(),1,new Bundle());
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fragmentUtils.setCurrentFragmentByPosition(getSupportFragmentManager(),2,new Bundle());
            }
        });
    }
}
