package com.hs.assistant.adapter;

import java.util.List;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.View;
import android.view.ViewGroup;

public class GuidePagerAdapter extends PagerAdapter {

	List<View> views = null;
	ViewPager page = null;

	public GuidePagerAdapter(List<View> views, ViewPager page) {
		this.views = views;
		this.page = page;
	}

	@Override
	public int getCount() {
		return views.size();
	}

	@Override
	public boolean isViewFromObject(View arg0, Object arg1) {
		return arg0 == arg1;
	}

	@Override
	public void destroyItem(ViewGroup container, int position, Object object) {
		container.removeView((View) object);
	}

	@Override
	public Object instantiateItem(ViewGroup container, int position) {
		View view = views.get(position);
		view.setId(position);
		container.addView(view);
		return view;
	}

}
