package com.example.instagram;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("0hbyM3A6Jv3gMJXOP7uHzY5cjkNin4zfpNXDUmmW")
                .clientKey("d5lKMbZCrqXlH62G5IJZ9wUDaQRUW50pQXjDKL7d")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
