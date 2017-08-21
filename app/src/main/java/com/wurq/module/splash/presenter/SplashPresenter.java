package com.wurq.module.splash.presenter;

import com.wurq.base.basemodule.presenter.BasePresenter;
import com.wurq.base.util.HandleUtil;
import com.wurq.module.speech.view.MainActivity;
import com.wurq.module.splash.activity.SplashActivity;

/**
 * Created by wurongqiu on 2017/6/19.
 */

public class SplashPresenter extends BasePresenter<SplashActivity> {
    private static final int WAIT_TIME = 2000;

    public SplashPresenter(SplashActivity target) {
        super(target);
    }

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public void onStart() {
        super.onStart();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    public void init() {
        doDelay();
    }

    private void doDelay() {
        // 2秒后强行关闭闪屏
        HandleUtil.doDelay(new Runnable() {
            @Override
            public void run() {
                MainActivity.start(target);
                target.finish();
            }
        }, WAIT_TIME);
    }

}
