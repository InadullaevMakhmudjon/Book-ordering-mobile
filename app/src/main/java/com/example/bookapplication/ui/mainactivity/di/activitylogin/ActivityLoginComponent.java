package com.example.bookapplication.ui.mainactivity.di.activitylogin;

import com.example.bookapplication.ui.mainactivity.di.ApplicationComponent;
import com.example.bookapplication.ui.mainactivity.ui.activitylogin.ActivityLogin;

import dagger.Component;

@ActivityLoginScope
@Component(modules = {ActivityLoginModule.class}, dependencies = ApplicationComponent.class)
public interface ActivityLoginComponent {
    void inject(ActivityLogin login);
    void injectViewModel(ActivityLogin activityLogin);
}
