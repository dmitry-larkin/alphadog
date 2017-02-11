package com.polar.android.alphadog.presentation.di.modules;

import android.support.v7.app.AppCompatActivity;

import com.polar.android.alphadog.presentation.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

/**
 * @author Valentin Postnov
 */
@Module
public class ActivityModule {

    private final AppCompatActivity activity;

    public ActivityModule(AppCompatActivity activity) {
        this.activity = activity;
    }

    @Provides
    @ActivityScope
    AppCompatActivity provideActivity() {
        return activity;
    }
}
