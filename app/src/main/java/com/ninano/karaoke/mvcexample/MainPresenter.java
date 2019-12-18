package com.ninano.karaoke.mvcexample;

public class MainPresenter implements MainConstants.Presenter {

    MainConstants.View mainView;
    MainModel mainModel;

    public MainPresenter(MainConstants.View view){
        //View 연결
        mainView = view;

        //Model 연결
        mainModel = new MainModel(this);
    }


    @Override
    public void addNums(int input1, int input2) {

    }

    @Override
    public void saveData(int data) {

    }
}
