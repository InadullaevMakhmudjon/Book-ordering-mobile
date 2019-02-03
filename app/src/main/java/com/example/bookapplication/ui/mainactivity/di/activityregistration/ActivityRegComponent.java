package com.example.bookapplication.ui.mainactivity.di.activityregistration;

import com.example.bookapplication.ui.mainactivity.di.ApplicationComponent;
import com.example.bookapplication.ui.mainactivity.ui.activityregistration.ActivityReg;
import com.example.bookapplication.ui.mainactivity.ui.activityregistration.RegistrationViewModel;

import dagger.Component;

@ActivityRegScope
@Component(modules = ActivityRegModule.class, dependencies = ApplicationComponent.class)
public interface ActivityRegComponent {
    void injectView(ActivityReg reg);
    void injectViewModel(RegistrationViewModel model);
}
