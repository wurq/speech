package com.wurq.isv.application;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.util.Log;

import com.wurq.base.util.ScreenUtil;

/**
 * Created by wurongqiu on 2017/8/21.
 *
 */

public class SpeechApplication extends Application {
    /**
     * 后台是否准备好了
     */
    public static boolean sIsBackEngineReady = false;

    static Handler sMainThreadHandler;

    @Override
    public void onCreate() {
        super.onCreate();

        Context context = getApplicationContext();
        ScreenUtil.GetInfo(context);
        AppProfile.setContext(context);
//        AppProfile.setStartTime((long) System.currentTimeMillis() + DataConst.RuntimeStatus.CURRENT_TIME);
        sMainThreadHandler = new Handler();

//        sIsBackEngineReady = ProcessUtil.isProcessAlive(CommonConst.AppProcess.BACKGROUND_PROCESS);
        sIsBackEngineReady = true;//ProcessUtil.isProcessAlive(AppProcess.BACKGROUND_PROCESS);
        Log.d("LongBoard", "ForeEngine.sIsBackEngineReady  " + sIsBackEngineReady);
        long foreSt = System.currentTimeMillis();
    }


    @Override
    public void onTerminate() {
        super.onTerminate();
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }

}
