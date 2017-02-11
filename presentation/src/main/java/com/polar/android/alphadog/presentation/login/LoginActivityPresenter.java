package com.polar.android.alphadog.presentation.login;

import com.digits.sdk.android.AuthCallback;
import com.digits.sdk.android.DigitsAuthButton;
import com.digits.sdk.android.DigitsException;
import com.digits.sdk.android.DigitsSession;
import com.polar.android.alphadog.presentation.base.BaseMvpPresenter;
import com.polar.android.alphadog.presentation.utils.BaseSubscriber;

import javax.inject.Inject;

import rx.Observable;
import rx.Subscriber;

/**
 * @author Valentin Postnov
 */
public class LoginActivityPresenter extends BaseMvpPresenter<LoginActivityView> {

    @Inject
    LoginActivityPresenter() {
    }

    public void login(DigitsAuthButton digitsAuthButton) {
        subscribe(createDigitsSessionObservable(digitsAuthButton), new BaseSubscriber<DigitsSession>() {
            @Override
            public void onError(Throwable e) {
                getView().loginFailure(e.getMessage());
            }

            @Override
            public void onNext(DigitsSession digitsSession) {
                getView().loginSuccess(digitsSession, null);
            }
        });
    }

    //временное решение
    private Observable<DigitsSession> createDigitsSessionObservable(DigitsAuthButton digitsAuthButton) {
        return Observable.create(new Observable.OnSubscribe<DigitsSession>() {
            @Override
            public void call(Subscriber<? super DigitsSession> subscriber) {
                AuthCallback authCallback = new AuthCallback() {
                    @Override
                    public void success(DigitsSession session, String phoneNumber) {
                        if (subscriber.isUnsubscribed()) {
                            digitsAuthButton.setCallback(null);
                        } else {
                            subscriber.onNext(session);
                        }
                    }

                    @Override
                    public void failure(DigitsException error) {
                        subscriber.onError(error);
                    }
                };
                digitsAuthButton.setCallback(authCallback);
            }
        });
    }
}
