package com.example.bookapplication.ui.mainactivity.ui.activityregistration;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

import com.example.bookapplication.R;
import com.example.bookapplication.databinding.ActivityRegistrationBinding;

public class ActivityReg extends AppCompatActivity {

    RegistrationViewModel viewModel;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        ActivityRegistrationBinding binding = DataBindingUtil.setContentView(this,R.layout.activity_registration);
        viewModel = ViewModelProviders.of(this).get(RegistrationViewModel.class);
        binding.setViewmodelobject(viewModel);
    }
}
