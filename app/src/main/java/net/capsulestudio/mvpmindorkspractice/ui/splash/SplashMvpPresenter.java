package net.capsulestudio.mvpmindorkspractice.ui.splash;

import net.capsulestudio.mvpmindorkspractice.ui.base.MvpPresenter;

public interface SplashMvpPresenter <V extends SplashMvpView> extends MvpPresenter<V> {

    void decideNextActivity();
}
