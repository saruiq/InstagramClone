package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("F7pL2Di18H34fweI8WqsC59tymqdu5ijeEdQOt1H")
                .clientKey("WFOnFims0OPAArQgJ2thUCbgVa2Cp15AZyJ21FmM")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
