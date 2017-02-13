package com.polar.android.alphadog.presentation;

import com.polar.android.alphadog.presentation.base.BaseActivity;

/**
 * @author Valentin Postnov
 */
public class MainActivity extends BaseActivity {

    @Override
    protected void initInjection() {
        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_main;
    }
}
