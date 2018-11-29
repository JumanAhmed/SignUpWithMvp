package net.capsulestudio.mvpmindorkspractice;

import android.app.Application;

import net.capsulestudio.mvpmindorkspractice.data.DataManager;
import net.capsulestudio.mvpmindorkspractice.data.SharedPrefsHelper;

public class CustomApplication extends Application {

    DataManager dataManager;
    @Override
    public void onCreate() {
        super.onCreate();

        SharedPrefsHelper sharedPrefsHelper = new SharedPrefsHelper(getApplicationContext());
        dataManager = new DataManager(sharedPrefsHelper);
    }

    public  DataManager getDataManager(){
        return  dataManager;
    }
}
