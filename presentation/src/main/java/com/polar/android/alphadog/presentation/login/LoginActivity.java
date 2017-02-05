package com.polar.android.alphadog.presentation.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.digits.sdk.android.AuthCallback;
import com.digits.sdk.android.DigitsAuthButton;
import com.digits.sdk.android.DigitsException;
import com.digits.sdk.android.DigitsSession;
import com.polar.android.alphadog.presentation.R;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author Valentin Postnov
 */
public class LoginActivity extends AppCompatActivity {

    @BindView(R.id.auth_button)
    DigitsAuthButton authButton;

    private AuthCallback authCallback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        authCallback = new AuthCallback() {
            @Override
            public void success(DigitsSession session, String phoneNumber) {

            }

            @Override
            public void failure(DigitsException exception) {
            }
        };

        authButton.setCallback(authCallback);
    }
}
