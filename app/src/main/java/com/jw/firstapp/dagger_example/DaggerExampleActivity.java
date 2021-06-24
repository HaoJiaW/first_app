package com.jw.firstapp.dagger_example;

import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.jw.firstapp.R;

import org.w3c.dom.Text;

import javax.inject.Inject;

public class DaggerExampleActivity extends AppCompatActivity implements DaggerExampleContract.View {


    @Inject
    DaggerExamplePresenter presenter;
    private TextView tv;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dagger_example);
        tv = findViewById(R.id.tv);

        DaggerExampleComponent.builder().daggerExampleModule2(new DaggerExampleModule2(this)).build().inject(this);
        presenter.updateUI();
    }


    @Override
    public void updateUI(String text) {
        tv.setText(text);
    }


}
