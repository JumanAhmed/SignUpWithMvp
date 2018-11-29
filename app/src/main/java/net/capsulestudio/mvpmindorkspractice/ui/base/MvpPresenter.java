package net.capsulestudio.mvpmindorkspractice.ui.base;

public interface MvpPresenter <V extends MvpView>{

    public void onAttachView(V mvpView);

}
