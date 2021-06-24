package com.jw.firstapp.fragment_test;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jw.firstapp.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link TestFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class TestFragment extends Fragment {


    @NonNull
    @Override
    public Lifecycle getLifecycle() {
        return super.getLifecycle();
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test, container, false);
    }


    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        System.out.println("TestFragment-onAttach");
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        System.out.println("TestFragment-onCreate");
    }

    @Override
    public void onStart() {
        super.onStart();
        System.out.println("TestFragment-onStart");
    }

    @Override
    public void onResume() {
        super.onResume();
        System.out.println("TestFragment-onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        System.out.println("TestFragment-onPause");
    }

    @Override
    public void onStop() {
        super.onStop();
        System.out.println("TestFragment-onStop");
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        System.out.println("TestFragment-onDestroyView");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.out.println("TestFragment-onDestroy");
    }

    @Override
    public void onDetach() {
        super.onDetach();
        System.out.println("TestFragment-onDetach");
    }


}