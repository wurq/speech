package com.wurq.module.isv.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.wurq.base.basemodule.activity.BaseActivity;
import com.wurq.module.isv.presenter.IsvPresenter;
import com.wurq.module.speech.R;

public class IsvActivity extends BaseActivity<IsvPresenter> {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ise);
    }

    @Override
    protected void initPresenter() {

    }

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, IsvActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

}
