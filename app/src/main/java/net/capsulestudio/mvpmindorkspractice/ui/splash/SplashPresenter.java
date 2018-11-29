package net.capsulestudio.mvpmindorkspractice.ui.splash;

import net.capsulestudio.mvpmindorkspractice.data.DataManager;
import net.capsulestudio.mvpmindorkspractice.ui.base.BasePresenter;

public class SplashPresenter <V extends SplashMvpView> extends BasePresenter<V> implements SplashMvpPresenter<V>{


    public SplashPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void decideNextActivity() {
        if (getDataManager().getLoggedInMode()){
            getMvpView().openMainActivity();
        }else {
            getMvpView().openLoginActivity();
        }
    }
}
