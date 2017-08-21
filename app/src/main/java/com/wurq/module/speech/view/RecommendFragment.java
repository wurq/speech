package com.wurq.module.speech.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wurq.base.basemodule.activity.BaseFragment;
import com.wurq.module.speech.R;
import com.wurq.module.speech.presenter.RecommendPresenter;

;

/**
 * Created by wurongqiu on 2017/4/25.
 */

public class RecommendFragment  extends BaseFragment<RecommendPresenter> {
    private static final String TAG = "RecommendFragment";
    @Override
    protected void initPresenter() {
        presenter = new RecommendPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Log.e(TAG,"onCreateView");
        View view = inflater.inflate(R.layout.fragment_recommend, null);
        return view;
    }
}
