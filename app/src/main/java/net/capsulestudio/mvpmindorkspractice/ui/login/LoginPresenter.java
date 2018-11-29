package net.capsulestudio.mvpmindorkspractice.ui.login;

import net.capsulestudio.mvpmindorkspractice.data.DataManager;
import net.capsulestudio.mvpmindorkspractice.ui.base.BasePresenter;

public class LoginPresenter <V extends LoginMvpView> extends BasePresenter<V> implements LoginMvpPresenter<V>{

    public LoginPresenter(DataManager dataManager) {
        super(dataManager);
    }


    @Override
    public void setUserLoginMode(String email, String password) {
        getDataManager().saveEmail(email);
        getDataManager().savePassword(password);
        getDataManager().setLoggedInMode();

        getMvpView().openMainActivity();
    }
}
