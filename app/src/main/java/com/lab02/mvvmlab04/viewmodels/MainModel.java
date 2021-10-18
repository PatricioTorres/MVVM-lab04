package com.lab02.mvvmlab04.viewmodels;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import android.util.Patterns;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;
import com.lab02.mvvmlab04.MainActivity;
import com.lab02.mvvmlab04.PacienteActivity;


public class MainModel extends BaseObservable {
    private Context context;
    public MainModel(Context context) {
        this.context=context;
    }

    public void onPacienteActivity() {
        Intent intent = new Intent(context, PacienteActivity.class);
        context.startActivity(intent);
    }
}
