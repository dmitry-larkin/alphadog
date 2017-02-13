package com.polar.android.alphadog.presentation.base;

import com.polar.android.alphadog.presentation.utils.BaseSingleSubscriber;
import com.polar.android.alphadog.presentation.utils.BaseSubscriber;
import com.polar.android.alphadog.presentation.utils.RxTransformer;

import javax.inject.Inject;

import rx.Observable;
import rx.Single;
import rx.subscriptions.CompositeSubscription;

/**
 * @author Valentin Postnov
 */
public class BaseMvpPresenter<V extends BaseMvpView> {

    @Inject
    RxTransformer rxTransformer;

    private final CompositeSubscription compositeSubscription;

    private V view;

    public BaseMvpPresenter() {
        compositeSubscription = new CompositeSubscription();
    }

    public void attachView(V view) {
        this.view = view;
    }

    public void detachView() {
        compositeSubscription.clear();
        view = null;
    }

    protected <T> void subscribe(Observable<T> observable, BaseSubscriber<T> subscriber) {
        compositeSubscription.add(observable.compose(rxTransformer.chainSchedulers()).subscribe(subscriber));
    }

    protected <T> void subscribe(Single<T> single, BaseSingleSubscriber<T> subscriber) {
        compositeSubscription.add(single.compose(rxTransformer.singleChainSchedulers()).subscribe(subscriber));
    }

    protected V getView() {
        return view;
    }
}
