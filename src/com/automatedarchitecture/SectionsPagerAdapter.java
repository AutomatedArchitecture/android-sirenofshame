package com.automatedarchitecture;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

public class SectionsPagerAdapter extends FragmentPagerAdapter {

	private Context context;

	public SectionsPagerAdapter(FragmentManager fm, Context context) {
		super(fm);
		this.context = context;
	}

	@Override
	public Fragment getItem(int i) {
		if (i == 0) {
			return new MyBuildsFragment();
		}
		if (i == 1) {
			return new LeadersFragment();
		}
		return new NewsFragment();
	}

	@Override
	public int getCount() {
		return 3;
	}

	@Override
	public CharSequence getPageTitle(int position) {
		switch (position) {
		case 0:
			return context.getString(R.string.title_section1).toUpperCase();
		case 1:
			return context.getString(R.string.title_section2).toUpperCase();
		case 2:
			return context.getString(R.string.title_section3).toUpperCase();
		}
		return null;
	}
}
