package com.hs.assistant.activity;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.WindowManager;
import com.hjm.bottomtabbar.BottomTabBar;
import com.hs.assistant.R;
import com.hs.assistant.activity.fragment.CommonFragment;
import com.hs.assistant.activity.fragment.MainFragment;
import com.hs.assistant.activity.fragment.MeFragment;
import com.hs.assistant.util.DensityUtil;

public class MainActivity extends AppCompatActivity {

    private BottomTabBar bottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);//去掉信息栏
        setContentView(R.layout.activity_main);

        float imgSize= DensityUtil.dip2px(MainActivity.this,23);//适应不同分辨率的屏幕
        bottomBar = (BottomTabBar) findViewById(R.id.bottom_bar);
        bottomBar.init(getSupportFragmentManager())
                .setImgSize(imgSize, imgSize)
                .setFontSize(12)
                .setTabPadding(15, 6, 15)
                .setChangeColor(Color.parseColor("#458fea"), Color.parseColor("#000000"))
                .addTabItem("主页", R.mipmap.tab_main_select, R.mipmap.tab_main_unselect, MainFragment.class)
                .addTabItem("常用", R.mipmap.tab_common_select, R.mipmap.tab_common_unselect, CommonFragment.class)
                .addTabItem("我的", R.mipmap.tab_me_select,R.mipmap.tab_me_unselect, MeFragment.class)
                .setTabBarBackgroundResource(R.drawable.tab_background)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {
                        //Log.i("TGA", "位置：" + position + "      选项卡：" + name);
                    }
                });
    }

}
