package com.pushcode;

import android.app.Application;

import com.microsoft.appcenter.AppCenter;
import com.microsoft.appcenter.analytics.Analytics;
import com.microsoft.appcenter.crashes.Crashes;
import com.microsoft.appcenter.distribute.Distribute;
import com.microsoft.appcenter.distribute.UpdateTrack;

public class App extends Application {

    String AppSecret = "f5658011-c8ff-4679-811a-6e0efc05bb1f";
    @Override
    public void onCreate() {
        super.onCreate();

        AppCenter.configure(this, AppSecret);
        if (AppCenter.isConfigured()) {
            AppCenter.start(Analytics.class);
            AppCenter.start(Crashes.class);
        }

        if (!AppCenter.isConfigured()) {
            AppCenter.start(this, AppSecret, Analytics.class, Crashes.class);
        }

        AppCenter.start(this, AppSecret, Distribute.class);

        Distribute.setUpdateTrack(UpdateTrack.PRIVATE);
//        Distribute.disableAutomaticCheckForUpdate();

    }
}
