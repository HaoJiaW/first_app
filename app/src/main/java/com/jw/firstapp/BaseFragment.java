package com.jw.firstapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link BaseFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class BaseFragment extends Fragment implements LazyLoad {

    private boolean viewCreated = false;
    private boolean userVisible = false;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewCreated =true;
        lazyLoad();
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser){
            userVisible = true;
            lazyLoad();
        }else {
            userVisible = false;
        }
    }


    private void lazyLoad(){
        if (viewCreated && userVisible){
            loadData();
            viewCreated = false;
            userVisible = false;
        }
    }

    @Override
    public void loadData() {

    }
}