package com.polar.android.alphadog.presentation.di.components;

import com.polar.android.alphadog.presentation.MainActivity;
import com.polar.android.alphadog.presentation.di.modules.ActivityModule;
import com.polar.android.alphadog.presentation.di.scope.ActivityScope;
import com.polar.android.alphadog.presentation.feed.FeedFragment;
import com.polar.android.alphadog.presentation.login.LoginActivity;

import dagger.Subcomponent;

/**
 * @author Valentin Postnov
 */
@ActivityScope
@Subcomponent(modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(LoginActivity activity);

    void inject(MainActivity activity);

    void inject(FeedFragment feedFragment);
}
