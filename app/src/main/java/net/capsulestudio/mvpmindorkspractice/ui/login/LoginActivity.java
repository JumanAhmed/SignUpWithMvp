package net.capsulestudio.mvpmindorkspractice.ui.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import net.capsulestudio.mvpmindorkspractice.CustomApplication;
import net.capsulestudio.mvpmindorkspractice.R;
import net.capsulestudio.mvpmindorkspractice.data.DataManager;
import net.capsulestudio.mvpmindorkspractice.ui.main.MainActivity;
import net.capsulestudio.mvpmindorkspractice.utils.CommonUtils;

import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity implements LoginMvpView{

    EditText etEmail, etPassword;
    Button btnLogin;

    LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etEmail = findViewById(R.id.editTextEmail);
        etPassword = findViewById(R.id.editTextPassword);
        btnLogin = findViewById(R.id.btnLogin);

        DataManager manager = ((CustomApplication)getApplication()).getDataManager();
        mLoginPresenter = new LoginPresenter(manager);
        mLoginPresenter.onAttachView(this);


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                logInButtonClick();
            }
        });


    }

    @Override
    public void openMainActivity() {
        Toasty.success(this, "Login Successful", Toast.LENGTH_LONG).show();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
        finish();
    }

    @Override
    public void logInButtonClick() {

        String email = etEmail.getText().toString();
        String password = etPassword.getText().toString();

        if (!CommonUtils.isEmailValid(email)) {
            Toasty.error(this, "Enter correct Email", Toast.LENGTH_LONG).show();
            return;
         }

         if (password.length()<=6){
             Toasty.error(this, "Password Length Must be greater than 6", Toast.LENGTH_LONG).show();
             return;
         }

        if (TextUtils.isEmpty(email)){
            Toasty.error(this, "Email Must Not Be Empty !", Toast.LENGTH_LONG).show();
            return;
        }

        if (TextUtils.isEmpty(password)){
            Toasty.error(this, "Password Must Not Be Empty !", Toast.LENGTH_LONG).show();
            return;
        }


            mLoginPresenter.setUserLoginMode(email, password);
    }


}
