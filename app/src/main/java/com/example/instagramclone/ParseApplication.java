package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("TyFHwKTmgHg7RHmprrMEbzFBa1UdGGcDFSRILIfS")
                .clientKey("WrZpGMf98smCJMoC3E4whfJ91mygne308nWf2MdS")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}