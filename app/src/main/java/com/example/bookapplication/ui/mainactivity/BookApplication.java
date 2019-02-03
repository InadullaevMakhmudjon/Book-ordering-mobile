package com.example.bookapplication.ui.mainactivity;
import android.app.Activity;
import android.app.Application;
import com.example.bookapplication.ui.mainactivity.di.ApplicationComponent;
import com.example.bookapplication.ui.mainactivity.di.ApplicationModule;
import com.example.bookapplication.ui.mainactivity.di.DaggerApplicationComponent;

public class BookApplication extends Application {

    ApplicationComponent component;
    @Override
    public void onCreate() {
        super.onCreate();
        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this)).build();
    }

    public ApplicationComponent getComponent() {
        return component;
    }
}
