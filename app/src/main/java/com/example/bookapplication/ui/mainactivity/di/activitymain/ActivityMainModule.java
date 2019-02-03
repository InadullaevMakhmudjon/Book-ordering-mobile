package com.example.bookapplication.ui.mainactivity.di.activitymain;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

import com.example.bookapplication.ui.mainactivity.ui.activitylogin.ActivityLogin;
import com.example.bookapplication.ui.mainactivity.ui.activitymain.ActivityMain;
import com.example.bookapplication.ui.mainactivity.ui.activitymain.MainActivityRepository;
import com.example.bookapplication.ui.mainactivity.ui.activityregistration.ActivityReg;

import javax.inject.Named;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityMainModule {

    Context context;
    ActivityMain mainActivity;

    public ActivityMainModule(ActivityMain context) {
        this.context = context;
        mainActivity = context;
    }

    @Provides
    @ActivityMainScope
    @ActivityMainContext
    public Context getContext(){
        return context;
    }

    @Provides
    @ActivityMainScope
    public ActivityMain getActivity(){
        return mainActivity;
    }

    @Provides
    @ActivityMainScope
    public MainActivityRepository getRepository(){return new MainActivityRepository();}

    @Provides
    @ActivityMainScope
    @Named("Login")
    public Intent getLoginActivity(){
        return new Intent(context, ActivityLogin.class);
    }

    @Provides
    @ActivityMainScope
    @Named("Registration")
    public Intent getRegistrationActivity(){
        return new Intent(context, ActivityReg.class);
    }



}
