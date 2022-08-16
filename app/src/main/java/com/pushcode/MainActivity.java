package com.pushcode;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;

public class MainActivity extends AppCompatActivity {

    String AppSecret = "f5658011-c8ff-4679-811a-6e0efc05bb1f";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Distribute.setListener(new MyDistributeListener());
        AppCenter.start();

    }
}