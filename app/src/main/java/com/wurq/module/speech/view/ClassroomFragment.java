package com.wurq.module.speech.view;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.wurq.base.basemodule.activity.BaseFragment;
import com.wurq.module.speech.R;
import com.wurq.module.speech.presenter.ClassroomPresenter;

/**
 * Created by wurongqiu on 2017/4/25.
 */

public class ClassroomFragment extends BaseFragment<ClassroomPresenter> {
    private static final String TAG = "ClassroomFragment";
    @Override
    protected void initPresenter() {
        presenter = new ClassroomPresenter(this);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        Log.e(TAG,"onCreateView");
        View view = inflater.inflate(R.layout.fragment_classroom, null);

        Button btn = (Button)view.findViewById(R.id.start_isv);
        btn.setOnClickListener(presenter);
        return view;
    }


}
