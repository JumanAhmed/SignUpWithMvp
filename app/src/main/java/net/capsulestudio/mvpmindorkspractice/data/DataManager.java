package net.capsulestudio.mvpmindorkspractice.data;

public class DataManager {

    SharedPrefsHelper mSharedPrefsHelper;

    public DataManager(SharedPrefsHelper mSharedPrefsHelper) {
        this.mSharedPrefsHelper = mSharedPrefsHelper;
    }

    public void clear() {
        mSharedPrefsHelper.clear();
    }

    public void saveEmail(String email) {
        mSharedPrefsHelper.putEmail(email);
    }
    public String getEmail() {
        return mSharedPrefsHelper.getEmail();
    }
    public void savePassword(String password){
        mSharedPrefsHelper.setPassword(password);
    }
    public String getPassword(){
        return mSharedPrefsHelper.getPassword();
    }
    public void setLoggedInMode() {
        mSharedPrefsHelper.setLoggedInMode(true);
    }
    public Boolean getLoggedInMode() {
        return mSharedPrefsHelper.getLoggedInMode();
    }

}
