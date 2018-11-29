package net.capsulestudio.mvpmindorkspractice.ui.main;

import net.capsulestudio.mvpmindorkspractice.ui.base.MvpView;

public interface MainMvpView extends MvpView {

    void showEmailAndPassword(String email, String password);

    void openSplashActivity();
}
