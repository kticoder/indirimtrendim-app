package com.indirimtrendim.app;

import android.app.Application;
import com.onesignal.OneSignal;
import com.onesignal.debug.LogLevel;

public class MainApplication extends Application {
    public static final String ONESIGNAL_APP_ID = "2c0dfdb8-40cf-4d29-9d05-744de782bfd3";

    @Override
    public void onCreate() {
        super.onCreate();

        // OneSignal Başlatma
        OneSignal.getDebug().setLogLevel(LogLevel.VERBOSE);
        OneSignal.initWithContext(this, ONESIGNAL_APP_ID);
    }
}
