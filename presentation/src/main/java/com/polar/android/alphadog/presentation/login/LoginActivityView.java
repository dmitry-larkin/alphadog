package com.polar.android.alphadog.presentation.login;

import com.digits.sdk.android.DigitsSession;
import com.polar.android.alphadog.presentation.base.BaseMvpView;

/**
 * @author Valentin Postnov
 */
public interface LoginActivityView extends BaseMvpView {

    void loginSuccess(DigitsSession session, String phoneNumber);

    void loginFailure(String error);
}
