package net.capsulestudio.mvpmindorkspractice.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import net.capsulestudio.mvpmindorkspractice.CustomApplication;
import net.capsulestudio.mvpmindorkspractice.R;
import net.capsulestudio.mvpmindorkspractice.data.DataManager;
import net.capsulestudio.mvpmindorkspractice.ui.login.LoginActivity;
import net.capsulestudio.mvpmindorkspractice.ui.main.MainActivity;

public class SplashActivity extends AppCompatActivity implements SplashMvpView {

    SplashPresenter mSplashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        DataManager dataManager = ((CustomApplication) getApplication()).getDataManager();
        mSplashPresenter = new SplashPresenter(dataManager);
        mSplashPresenter.onAttachView(this);

        mSplashPresenter.decideNextActivity();

    }

    @Override
    public void openMainActivity() {
      startActivity(new Intent(getApplicationContext(), MainActivity.class));
      finish();

    }


    @Override
    public void openLoginActivity() {
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
        finish();
    }


}
