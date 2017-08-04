package com.hs.assistant.activity;

import com.hs.assistant.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class WelcomeActivity extends Activity{
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_welcome);
		init();
    }
	
    private void init(){
		new Thread(){
			@Override
	   		public void run(){
	   			try{
	   				Thread.sleep(2000);
	   			}catch(InterruptedException e){
	   				e.printStackTrace();
	   			}
	   			Intent intent=new Intent();
	   			/*SharePrefHelper sp=new SharePrefHelper(WelcomeActivity.this, SPConstant.SYSTEM, Activity.MODE_WORLD_READABLE);
	   			if(sp.getBoolean(SPItemConstant.IS_FIRST_LAUCH,true)){
	   				intent.setClass(WelcomeActivity.this, GuideActivity.class);
	   				sp.saveBoolean(SPItemConstant.IS_FIRST_LAUCH,false);
	   			}
	   			else{
	   				intent.setClass(WelcomeActivity.this, MainActivity.class);
	   			}*/
				intent.setClass(WelcomeActivity.this, MainActivity.class);
	   			startActivity(intent);
	   			WelcomeActivity.this.finish();
	   		}
	   	}.start();
    }

}
