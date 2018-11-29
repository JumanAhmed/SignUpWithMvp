package net.capsulestudio.mvpmindorkspractice.ui.main;

import net.capsulestudio.mvpmindorkspractice.ui.base.MvpPresenter;

public interface MainMvpPresenter <V extends MainMvpView> extends MvpPresenter<V> {
    void setEmailAndPassword();
    void setLogOut();
}
