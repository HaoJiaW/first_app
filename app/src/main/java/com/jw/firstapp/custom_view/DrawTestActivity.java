package com.jw.firstapp.custom_view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.HorizontalScrollView;
import android.widget.TextView;

import com.jw.firstapp.R;

public class DrawTestActivity extends AppCompatActivity {

    private TextView tv;
    private TextView tv2;
    private CustomHScrollView hs1;
    private CustomHScrollView hs2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw_test);

        TextView st = findViewById(R.id.st);
        TextView sb = findViewById(R.id.sb);
        tv = findViewById(R.id.tv);
        tv2 = findViewById(R.id.tv2);
        hs1 = findViewById(R.id.hs1);
        hs2 = findViewById(R.id.hs2);

        st.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hs1.scrollTo(100,0);
            }
        });

        sb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hs2.scrollBy(100,0);
            }
        });
    }
}