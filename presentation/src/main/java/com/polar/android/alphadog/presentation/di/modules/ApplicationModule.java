package com.polar.android.alphadog.presentation.di.modules;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;

import com.polar.android.alphadog.presentation.App;
import com.polar.android.alphadog.presentation.utils.BaseRxTransformer;
import com.polar.android.alphadog.presentation.utils.RxTransformer;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * @author Valentin Postnov
 */
@Module
public class ApplicationModule {

    private static final String GLOBAL_PREFS_NAME = "global_prefs";

    private final App app;

    public ApplicationModule(App app) {
        this.app = app;
    }

    @Provides
    @Singleton
    SharedPreferences provideGlobalSharedPrefs(Context context) {
        return context.getSharedPreferences(GLOBAL_PREFS_NAME, Context.MODE_PRIVATE);
    }

    @Provides
    @Singleton
    Resources provideResources(Context context) {
        return context.getResources();
    }

    @Provides
    @Singleton
    Context provideApplicationContext() {
        return app;
    }

    @Provides
    @Singleton
    RxTransformer provideBaseRxTransformer() {
        return new BaseRxTransformer();
    }
}
