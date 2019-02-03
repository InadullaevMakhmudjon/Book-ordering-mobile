package com.example.bookapplication.ui.mainactivity.di.activitymain;

import android.app.Application;

import com.example.bookapplication.ui.mainactivity.di.ApplicationComponent;
import com.example.bookapplication.ui.mainactivity.ui.activitymain.ActivityMain;
import com.example.bookapplication.ui.mainactivity.ui.activitymain.MainViewModel;

import dagger.Component;

@ActivityMainScope
@Component(modules = {ActivityMainModule.class}, dependencies = ApplicationComponent.class)
public interface ActivityMainComponent {
    void inject(ActivityMain mainActivity);
    void injectViewModel(MainViewModel viewModel);
}
