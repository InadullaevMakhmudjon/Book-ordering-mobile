package com.example.bookapplication.ui.mainactivity.ui.activitymain;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.example.bookapplication.ui.mainactivity.data.AppDataManager;
import com.example.bookapplication.ui.mainactivity.di.activitymain.ActivityMainContext;

import javax.inject.Inject;
import javax.inject.Named;

public class MainViewModel extends AndroidViewModel{


    @Inject
    @ActivityMainContext
    Context context;

    @Inject
    ActivityMain activity;

    @Inject
    MainActivityRepository repository;

    @Inject
    @Named("Login")
    Intent loginActivity;

    @Inject
    @Named("Registration")
    Intent regActivity;

    @Inject
    AppDataManager manager;


    public MainViewModel(@NonNull Application application) {
        super(application);
    }

    public void finishClick(){
        activity.finish();
    }

    public void loginClick(){
         activity.startActivity(loginActivity);
    }

    public void registrationClick(){
        activity.startActivity(regActivity);
   }

}
