package com.example.bookapplication.ui.mainactivity.di.activityregistration;

import android.content.Context;

import com.example.bookapplication.ui.mainactivity.ui.activityregistration.ActivityReg;

import dagger.Module;
import dagger.Provides;

@Module
public class ActivityRegModule {
    Context context;
    ActivityReg reg;

    public ActivityRegModule(ActivityReg reg) {
        this.reg = reg;
        context=reg;
    }

    @Provides
    @ActivityRegScope
    @ActivityRegContext
    public Context getContext(){
        return context;
    }

    @Provides
    @ActivityRegScope
    public ActivityReg getReg(){
        return reg;
    }
}
