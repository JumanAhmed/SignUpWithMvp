package net.capsulestudio.mvpmindorkspractice.ui.login;

import net.capsulestudio.mvpmindorkspractice.ui.base.MvpPresenter;

public interface LoginMvpPresenter <V extends LoginMvpView>  extends MvpPresenter<V> {
    void setUserLoginMode(String email, String password);
}
