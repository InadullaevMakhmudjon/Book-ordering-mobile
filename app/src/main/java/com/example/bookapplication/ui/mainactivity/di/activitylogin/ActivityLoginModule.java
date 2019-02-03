package com.example.bookapplication.ui.mainactivity.di.activitylogin;

import android.content.Context;

import com.example.bookapplication.ui.mainactivity.di.activitymain.ActivityMainContext;
import com.example.bookapplication.ui.mainactivity.di.activitymain.ActivityMainScope;
import com.example.bookapplication.ui.mainactivity.ui.activitylogin.ActivityLogin;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityLoginModule {

    Context context;
    ActivityLogin login;

    public ActivityLoginModule(ActivityLogin context) {
        this.context = context;
        this.login = context;
    }

    @Provides
    @ActivityMainScope
    @ActivityMainContext
    public Context getContext(){
        return context;
    }

    @Provides
    @ActivityLoginContext
    public ActivityLogin getActivity(){
        return login;
    }


}
