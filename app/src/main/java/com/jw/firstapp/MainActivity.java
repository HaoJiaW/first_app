package com.jw.firstapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;

import com.jw.firstapp.fragment_test.Test2Fragment;
import com.jw.firstapp.fragment_test.TestFragment;

public class MainActivity extends AppCompatActivity {

    @Nullable
    @Override
    public View onCreateView(@NonNull String name, @NonNull Context context, @NonNull AttributeSet attrs) {
        return super.onCreateView(name, context, attrs);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("MainActivity-onCreate");


        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        TestFragment testFragment = new TestFragment();
        transaction.add(R.id.fragment,testFragment);
        transaction.addToBackStack(null);
        transaction.commit();
        Button button =  findViewById(R.id.btn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


        Button changeFragment =  findViewById(R.id.changeFragment);
        changeFragment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                finish();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.add(R.id.fragment, Test2Fragment.newInstance("",""));
                transaction.addToBackStack(null);
                transaction.commit();
            }
        });


        Button back =  findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                finish();

                FragmentManager manager = getSupportFragmentManager();

                if (manager.getFragments().size()>0){
                    manager.popBackStackImmediate();
                }

//                if (manager.getFragments().size()>0){
//                    onKeyDown(KeyEvent.KEYCODE_BACK,null);
//                }
            }
        });
//        button.setBackgroundResource(R.drawable.frame_animation);
//        AnimationDrawable animationDrawable = (AnimationDrawable) button.getBackground();
//        animationDrawable.start();
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("MainActivity-onResume");
    }

    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("MainActivity-onStart");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("MainActivity-onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("MainActivity-onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("MainActivity-onDestroy");
    }


    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK && event.getRepeatCount() == 0){
            System.out.println("MainActivity-keyBackDown");
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }
}