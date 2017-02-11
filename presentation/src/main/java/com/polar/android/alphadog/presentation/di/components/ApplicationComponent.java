package com.polar.android.alphadog.presentation.di.components;

import com.polar.android.alphadog.presentation.di.modules.ActivityModule;
import com.polar.android.alphadog.presentation.di.modules.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * @author Valentin Postnov
 */
@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    ActivityComponent plus(ActivityModule module);
}
