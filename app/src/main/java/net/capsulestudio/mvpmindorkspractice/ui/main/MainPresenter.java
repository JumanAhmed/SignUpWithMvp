package net.capsulestudio.mvpmindorkspractice.ui.main;

import net.capsulestudio.mvpmindorkspractice.data.DataManager;
import net.capsulestudio.mvpmindorkspractice.ui.base.BasePresenter;

public class MainPresenter <V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V>{

    public MainPresenter(DataManager dataManager) {
        super(dataManager);
    }

    @Override
    public void setEmailAndPassword() {
        String email = getDataManager().getEmail();
        String password = getDataManager().getPassword();
        getMvpView().showEmailAndPassword(email, password);
    }

    @Override
    public void setLogOut() {
        getDataManager().clear();
        getMvpView().openSplashActivity();
    }
}
