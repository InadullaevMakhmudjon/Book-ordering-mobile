package com.example.bookapplication.ui.mainactivity.ui.activitymain;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import com.example.bookapplication.R;
import com.example.bookapplication.databinding.ActivityMainBinding;
import com.example.bookapplication.ui.mainactivity.BookApplication;
import com.example.bookapplication.ui.mainactivity.di.activitymain.ActivityMainComponent;
import com.example.bookapplication.ui.mainactivity.di.activitymain.ActivityMainModule;
import com.example.bookapplication.ui.mainactivity.di.activitymain.DaggerActivityMainComponent;

public class ActivityMain extends AppCompatActivity {

    MainViewModel viewModel;
    ActivityMainComponent component;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ActivityMainBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        viewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        binding.setViewmodelobj(viewModel);
        component = DaggerActivityMainComponent.builder()
                .activityMainModule(new ActivityMainModule(this)).
                        applicationComponent(((BookApplication)getApplication()).getComponent()).build();
        component.inject(this);
        component.injectViewModel(viewModel);
    }

}
