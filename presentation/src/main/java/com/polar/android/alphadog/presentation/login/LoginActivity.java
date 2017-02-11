package com.polar.android.alphadog.presentation.login;

import android.util.Log;

import com.digits.sdk.android.DigitsAuthButton;
import com.digits.sdk.android.DigitsSession;
import com.polar.android.alphadog.presentation.R;
import com.polar.android.alphadog.presentation.base.BaseActivity;

import javax.inject.Inject;

import butterknife.BindView;

/**
 * @author Valentin Postnov
 */
public class LoginActivity extends BaseActivity implements LoginActivityView {

    @BindView(R.id.auth_button)
    DigitsAuthButton authButton;

    @Inject
    LoginActivityPresenter presenter;

    @Override
    public void loginSuccess(DigitsSession session, String phoneNumber) {
        Log.d("LoginActivity", "success");
    }

    @Override
    public void loginFailure(String error) {
        Log.e("LoginActivity", error);
    }

    @Override
    protected void onResume() {
        super.onResume();
        presenter.attachView(this);
        presenter.login(authButton);
    }

    @Override
    protected void initInjection() {
        getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return R.layout.activity_login;
    }

    @Override
    protected void onStop() {
        super.onStop();
        presenter.detachView();
    }
}
