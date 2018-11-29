package net.capsulestudio.mvpmindorkspractice.data;

import android.content.Context;
import android.content.SharedPreferences;

import static android.content.Context.MODE_PRIVATE;

public class SharedPrefsHelper {

    public static final String MY_PREFS = "MY_PREFS";

    public static final String EMAIL = "EMAIL";
    public static final String PASSWORD = "Password";
    public static final String IS_Logged_In = "IS_LOGGED_IN";

    SharedPreferences mSharedPreferences;

    public SharedPrefsHelper(Context context) {
        mSharedPreferences = context.getSharedPreferences(MY_PREFS, MODE_PRIVATE);
    }

    public void clear() {
        mSharedPreferences.edit().clear().apply();
    }

    public void putEmail(String email) {
        mSharedPreferences.edit().putString(EMAIL, email).apply();
    }

    public String getEmail() {
        return mSharedPreferences.getString(EMAIL, null);
    }

    public String getPassword(){
        return  mSharedPreferences.getString(PASSWORD, null);
    }

    public void setPassword(String password){
        mSharedPreferences.edit().putString(PASSWORD, password).apply();
    }

    public boolean getLoggedInMode() {
        return mSharedPreferences.getBoolean(IS_Logged_In, false);
    }

    public void setLoggedInMode(boolean loggedIn) {
        mSharedPreferences.edit().putBoolean(IS_Logged_In, loggedIn).apply();
    }
}
