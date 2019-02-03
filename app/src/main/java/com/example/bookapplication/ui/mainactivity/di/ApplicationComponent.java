package com.example.bookapplication.ui.mainactivity.di;

import com.example.bookapplication.ui.mainactivity.data.AppDataManager;

import dagger.Component;

@ApplicationScope
@Component(modules = {ApplicationModule.class})
public interface ApplicationComponent {
        AppDataManager getManager();
}
