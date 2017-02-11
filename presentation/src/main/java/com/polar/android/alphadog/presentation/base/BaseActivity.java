package com.polar.android.alphadog.presentation.base;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.polar.android.alphadog.presentation.App;
import com.polar.android.alphadog.presentation.di.components.ActivityComponent;
import com.polar.android.alphadog.presentation.di.modules.ActivityModule;

import butterknife.ButterKnife;

/**
 * @author Valentin Postnov
 */
public abstract class BaseActivity extends AppCompatActivity {

    private ActivityComponent activityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayout());
        ButterKnife.bind(this);
        activityComponent = App.from(this).getApplicationComponent().plus(new ActivityModule(this));
        initInjection();
    }

    protected abstract void initInjection();

    protected ActivityComponent getActivityComponent() {
        return activityComponent;
    }

    @LayoutRes
    protected abstract int getLayout();
}
