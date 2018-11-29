package net.capsulestudio.mvpmindorkspractice.ui.base;

import net.capsulestudio.mvpmindorkspractice.data.DataManager;

public class BasePresenter <V extends MvpView> implements MvpPresenter<V> {

    private DataManager mDataManager;
    private V mMvpView;

    public BasePresenter(DataManager dataManager){
        this.mDataManager = dataManager;
    }

    @Override
    public void onAttachView(V mvpView) {
        this.mMvpView = mvpView;
    }

    public DataManager getDataManager(){
        return  mDataManager;
    }

    public V getMvpView(){
        return  mMvpView;
    }

}
