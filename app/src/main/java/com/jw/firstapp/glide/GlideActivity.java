package com.jw.firstapp.glide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.jw.firstapp.R;

public class GlideActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_glide);

        ImageView iv = findViewById(R.id.iv);
        String url = "https://lottiefiles.com/41413-brahma-logo";
        Glide.with(this).load(url).into(iv);
    }
}