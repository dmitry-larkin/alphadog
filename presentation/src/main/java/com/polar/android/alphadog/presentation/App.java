package com.polar.android.alphadog.presentation;

import android.app.Application;

import com.crashlytics.android.Crashlytics;
import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.fabric.sdk.android.Fabric;

/**
 * @author Valentin Postnov
 */
public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TwitterAuthConfig authConfig = new TwitterAuthConfig(getString(R.string.twitter_key), getString(R.string.twitter_secret));
        Fabric.with(this, new Crashlytics(), new TwitterCore(authConfig), new Digits.Builder().build());
    }
}
