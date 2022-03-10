package com.example.partagram2;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        //ParseObject.registerSubclass(Posts.class);
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("2sYLSgNZMHjwSrrSBqIpsvco0m38ct5gSfzmHKPr")
                .clientKey("TxN4ggX7KyaqULR0lpnuEiNQUAv8efDB3At0pmql")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
