

package com.pxl.android.cemeo.ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.pxl.android.cemeo.R;

/**
 * Pager adapter
 */
public class CreateMeetingPagerAdapter extends FragmentPagerAdapter {

    private final Resources resources;

    /**
     * Create pager adapter
     *
     * @param resources
     * @param fragmentManager
     */
    public CreateMeetingPagerAdapter(Resources resources, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.resources = resources;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Override
    public Fragment getItem(int position) {
        Bundle bundle = new Bundle();
        switch (position) {
            case 0:
                ContactListFragment contactListFragment = new ContactListFragment();
                contactListFragment.setArguments(bundle);
                return contactListFragment;
            case 1:
                TimeFrameFragment timeFrameFragment = new TimeFrameFragment();
                timeFrameFragment.setArguments(bundle);
                return timeFrameFragment;
            case 2:
                CheckInsListFragment checkInsFragment = new CheckInsListFragment();
                checkInsFragment.setArguments(bundle);
                return checkInsFragment;
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return resources.getString(R.string.page_contacts);
            case 1:
                return resources.getString(R.string.page_timeframe);
            case 2:
                return resources.getString(R.string.page_checkins);
            default:
                return null;
        }
    }
}
