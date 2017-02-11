package com.polar.android.alphadog.presentation.utils;

import rx.Observable;
import rx.Single;
import rx.schedulers.Schedulers;

/**
 * @author Valentin Postnov
 */
public class TestRxTransformer implements RxTransformer {

    @Override
    public <T> Observable.Transformer<T, T> subscribeOn() {
        return tObservable -> tObservable.subscribeOn(Schedulers.immediate());
    }

    @Override
    public <T> Observable.Transformer<T, T> observeOn() {
        return tObservable -> tObservable.observeOn(Schedulers.immediate());
    }

    @Override
    public <T> Observable.Transformer<T, T> chainSchedulers() {
        return tObservable -> tObservable.subscribeOn(Schedulers.immediate())
                .observeOn(Schedulers.immediate());
    }

    @Override
    public <T> Single.Transformer<T, T> singleSubscribeOn() {
        return single -> single.subscribeOn(Schedulers.immediate());
    }

    @Override
    public <T> Single.Transformer<T, T> singleObserveOn() {
        return single -> single.observeOn(Schedulers.immediate());
    }

    @Override
    public <T> Single.Transformer<T, T> singleChainSchedulers() {
        return single -> single.subscribeOn(Schedulers.immediate())
                .observeOn(Schedulers.immediate());
    }
}
