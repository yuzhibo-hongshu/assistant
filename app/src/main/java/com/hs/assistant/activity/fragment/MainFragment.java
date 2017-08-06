package com.hs.assistant.activity.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;
import com.hs.assistant.R;
import com.leon.lib.settingview.LSettingItem;
import com.suke.widget.SwitchButton;

public class MainFragment extends Fragment {

    public MainFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_main, container, false);
        SwitchButton AdSwitchButton=(SwitchButton)view.findViewById(R.id.ad_switch_button);
        AdSwitchButton.setEnableEffect(false);
        AdSwitchButton.setOnCheckedChangeListener(new SwitchButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SwitchButton view, boolean isChecked) {
                Toast.makeText(getActivity(), "我的消息", Toast.LENGTH_SHORT).show();
            }
        });
        ImageView assistantImg=(ImageView)view.findViewById(R.id.assistant_img);
        assistantImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "我的消息", Toast.LENGTH_SHORT).show();
            }
        });
        return view;
    }

}
