package com.hs.assistant.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SharePrefHelper {
     
	private SharedPreferences sp;
	
	public SharePrefHelper(Context context,String name,int mode){
		sp=context.getSharedPreferences(name, mode);
	}
	
	public void saveString(String key,String value){
		SharedPreferences.Editor spEdit=sp.edit();
		spEdit.putString(key, value);
		spEdit.commit();
	}
	
	public void saveInt(String key,int value){
		SharedPreferences.Editor spEdit=sp.edit();
		spEdit.putInt(key, value);
		spEdit.commit();
	}
	
	public void saveLong(String key,long value){
		SharedPreferences.Editor spEdit=sp.edit();
		spEdit.putLong(key, value);
		spEdit.commit();
	}
	
	public void saveFloat(String key,float value){
		SharedPreferences.Editor spEdit=sp.edit();
		spEdit.putFloat(key, value);
		spEdit.commit();
	}
	
	public void saveBoolean(String key,boolean value){
		SharedPreferences.Editor spEdit=sp.edit();
		spEdit.putBoolean(key, value);
		spEdit.commit();
	}
	
	public String getString(String key,String defValue){
		return sp.getString(key, defValue);
	}
	
	public int getInt(String key,int defValue){
		return sp.getInt(key, defValue);
	}
	
	public float getFloat(String key,float defValue){
		return sp.getFloat(key, defValue);
	}
	
	public long getLong(String key,long defValue){
		return sp.getLong(key,defValue);
	}
	
	public boolean getBoolean(String key,boolean defValue){
		return sp.getBoolean(key, defValue);
	}
}
