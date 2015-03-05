package com.swpbiz.simplechat;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ChatApplication extends Application {
    public static final String YOUR_APPLICATION_ID = "hn2THsVyPT0atFLwjULsvFFFlyFaftWopNo1fxBI";
    public static final String YOUR_CLIENT_KEY = "TYTMSOVs5Q6I1MgHWKob6kRgdEMFE1s90I4kJQrp";

    @Override
    public void onCreate() {
        super.onCreate();
        // Parse.enableLocalDatastore(this);
        ParseObject.registerSubclass(Message.class);
        Parse.initialize(this, YOUR_APPLICATION_ID, YOUR_CLIENT_KEY);
    }
}
