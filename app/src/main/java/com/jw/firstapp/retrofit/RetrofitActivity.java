package com.jw.firstapp.retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.jw.firstapp.R;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitActivity extends AppCompatActivity {

    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_retrofit);

        tv = findViewById(R.id.tv);

        //创建一个Retrofit客户端
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://192.168.9.3/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        DataService dataService = retrofit.create(DataService.class);

        Call<TestInfo> testInfoCall = dataService.getData();
        testInfoCall.enqueue(new Callback<TestInfo>() {
            @Override
            public void onResponse(Call<TestInfo> call, Response<TestInfo> response) {
                final TestInfo testInfo = response.body();
                runOnUiThread(new Runnable() {
                    @Override
                    public void run() {
                        tv.setText(testInfo.toString());
                    }
                });
            }

            @Override
            public void onFailure(Call<TestInfo> call, Throwable t) {

            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }
}