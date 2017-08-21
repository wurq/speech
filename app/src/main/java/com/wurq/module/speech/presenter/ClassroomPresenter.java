package com.wurq.module.speech.presenter;

import android.view.View;

import com.wurq.base.basemodule.presenter.BaseFragmentPresenter;
import com.wurq.module.isv.view.IsvActivity;
import com.wurq.module.speech.view.ClassroomFragment;

/**
 * Created by wurongqiu on 2017/4/25.
 */

public class ClassroomPresenter extends BaseFragmentPresenter<ClassroomFragment> implements View.OnClickListener {
    public ClassroomPresenter(ClassroomFragment target) {
        super(target);
    }

    @Override
    public void onClick(View v) {
        IsvActivity.start(target.getContext());
    }
}

