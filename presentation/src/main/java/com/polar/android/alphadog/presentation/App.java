package com.polar.android.alphadog.presentation;

import android.app.Application;
import android.content.Context;

import com.crashlytics.android.Crashlytics;
import com.digits.sdk.android.Digits;
import com.polar.android.alphadog.presentation.di.components.ApplicationComponent;
import com.polar.android.alphadog.presentation.di.components.DaggerApplicationComponent;
import com.polar.android.alphadog.presentation.di.modules.ApplicationModule;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.fabric.sdk.android.Fabric;

/**
 * @author Valentin Postnov
 */
public class App extends Application {

    private ApplicationComponent applicationComponent;

    public static App from(Context context) {
        return (App) context.getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        applicationComponent = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

        TwitterAuthConfig authConfig = new TwitterAuthConfig(getString(R.string.twitter_key), getString(R.string.twitter_secret));
        Fabric.with(this, new Crashlytics(), new TwitterCore(authConfig), new Digits.Builder().build());
    }

    public ApplicationComponent getApplicationComponent() {
        return applicationComponent;
    }
}
