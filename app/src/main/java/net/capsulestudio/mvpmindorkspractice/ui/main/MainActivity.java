package net.capsulestudio.mvpmindorkspractice.ui.main;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.capsulestudio.mvpmindorkspractice.CustomApplication;
import net.capsulestudio.mvpmindorkspractice.R;
import net.capsulestudio.mvpmindorkspractice.data.DataManager;
import net.capsulestudio.mvpmindorkspractice.ui.splash.SplashActivity;

public class MainActivity extends AppCompatActivity implements MainMvpView{

    TextView tvEmail, tvPassword;
    Button btnLogout;
    MainPresenter mMainPresenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvEmail = findViewById(R.id.tvEmail);
        tvPassword = findViewById(R.id.tvPassword);
        btnLogout = findViewById(R.id.btnLogout);

        DataManager dataManager = ((CustomApplication)getApplication()).getDataManager();
        mMainPresenter = new MainPresenter(dataManager);
        mMainPresenter.onAttachView(this);

        mMainPresenter.setEmailAndPassword();

        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mMainPresenter.setLogOut();
            }
        });


    }

    @Override
    public void showEmailAndPassword(String email, String password) {
        tvEmail.setText(email);
        tvPassword.setText(password);
    }

    @Override
    public void openSplashActivity() {
        startActivity(new Intent(getApplicationContext(), SplashActivity.class));
        finish();
    }
}
