package com.wurq.module.speech.view;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;

import com.wurq.base.basemodule.activity.BaseActivity;
import com.wurq.base.util.ResourcesUtil;
import com.wurq.base.view.FragmentAdapter;
import com.wurq.base.view.fragmenttabhost.FragmentTabHost;
import com.wurq.module.speech.R;
import com.wurq.module.speech.presenter.MainPresenter;

import java.util.ArrayList;
import java.util.List;

//import android.support.v4.app.FragmentTabHost;

public class MainActivity extends BaseActivity<MainPresenter>
        implements
        ViewPager.OnPageChangeListener, TabHost.OnTabChangeListener{

    private static final String TAG = "MainActivity";

    private ViewPager mViewPager;
//    @ViewInject(R.id.pager)
//    private ViewPager mViewPager;

    private List<Fragment> list = new ArrayList<Fragment>();
    private FragmentTabHost mFragmentTabHost;

    private Class mFragmentClasses[] = {
            RecommendFragment.class,
            ClassroomFragment.class,
    };

    private final String[] sTabTexts = new String[]{
            ResourcesUtil.getString(R.string.fragment_recommend),
            ResourcesUtil.getString(R.string.fragment_classname)
    };

    private final int mTabIcons[] = {
            R.drawable.tab_home_btn,
            R.drawable.tab_view_btn
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.e(TAG,"onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initPage();
    }

    @Override
    protected void initPresenter() {
        presenter = new MainPresenter(this);
    }

    public static void start(Context context) {
        Intent intent = new Intent();
        intent.setClass(context, MainActivity.class);
//        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        context.startActivity(intent);
    }

    //    控件初始化控件
    private void initView() {
        Log.e(TAG,"initView");
        mViewPager = (ViewPager) findViewById(R.id.pager);

        mViewPager.addOnPageChangeListener(this);
        Log.e(TAG,"pre mFragmentTabHost");
        mFragmentTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mFragmentTabHost.setup(this, getSupportFragmentManager(), R.id.pager);
        mFragmentTabHost.setOnTabChangedListener(this);

        Log.e(TAG,"init mFragmentTabHost");
        int count = sTabTexts.length;
        for (int i = 0; i < count; i++) {
            TabHost.TabSpec tabSpec = mFragmentTabHost.newTabSpec(sTabTexts[i])
                    .setIndicator(getTabItemView(i));
            mFragmentTabHost.addTab(tabSpec, mFragmentClasses[i], null);
            mFragmentTabHost.setTag(i);
            mFragmentTabHost.getTabWidget()
                    .getChildAt(i)
                    .setBackgroundResource(R.drawable.selector_tab_background);
        }
    }

    private void initPage() {
        Log.e(TAG,"initPage");
//        RecommendFragment recommendFragment = new RecommendFragment();
//        ClassroomFragment classroomFragment = new ClassroomFragment();

        list.add(new RecommendFragment());
        list.add(new ClassroomFragment());

        Log.e(TAG,"initPage setAdapter");
        mViewPager.setAdapter(new FragmentAdapter(getSupportFragmentManager(), list));
        mFragmentTabHost.getTabWidget().setDividerDrawable(null);
    }

    /*
     * 单个tab单元的View展示
     *
     * @param index Tab序号
     * @return 单元Tab的View
     */
    private View getTabItemView(int index) {
        //将xml布局转换为view对象
        View view = layoutInflater.inflate(R.layout.tab_content, null);

        ImageView mImageView = (ImageView) view.findViewById(R.id.tab_imageview);
        TextView mTextView = (TextView) view.findViewById(R.id.tab_textview);
        mImageView.setBackgroundResource(mTabIcons[index]);
        mTextView.setText(sTabTexts[index]);
        return view;
    }

    @Override
    public void onPageScrollStateChanged(int arg0) {

    }

    @Override
    public void onPageScrolled(int arg0, float arg1, int arg2) {

    }

    @Override
    public void onPageSelected(int arg0) {
        TabWidget widget = mFragmentTabHost.getTabWidget();
        int oldFocusability = widget.getDescendantFocusability();
        widget.setDescendantFocusability(ViewGroup.FOCUS_BLOCK_DESCENDANTS);
        mFragmentTabHost.setCurrentTab(arg0);
        widget.setDescendantFocusability(oldFocusability);

    }

    @Override
    public void onTabChanged(String tabId) {
        int position = mFragmentTabHost.getCurrentTab();
        mViewPager.setCurrentItem(position);
    }
}
