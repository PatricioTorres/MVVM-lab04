package com.lab02.mvvmlab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.lab02.mvvmlab04.databinding.ActivityMainBinding;
import com.lab02.mvvmlab04.viewmodels.MainModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setMainmodel(new MainModel(this));
        activityMainBinding.executePendingBindings();

    }


}