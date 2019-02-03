package com.example.bookapplication.ui.mainactivity.di;

import android.content.Context;
import android.content.Intent;

import com.example.bookapplication.ui.mainactivity.data.AppDataManager;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    Context applicationContext;
    public ApplicationModule(Context context) {
            applicationContext=context.getApplicationContext();
    }

    @Provides
    @ApplicationContex
    @ApplicationScope
    public Context getApplicationContext(){
        return applicationContext;
    }

    @Provides
    @ApplicationScope
    public AppDataManager getDatamanager(){
        return new AppDataManager(applicationContext);
    }

}
