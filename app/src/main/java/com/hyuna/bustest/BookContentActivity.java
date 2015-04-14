package com.hyuna.bustest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;

/**
 * Created by Iurii on 3/16/2015.
 */
public class BookContentActivity extends ActionBarActivity {

    public static final String CHAPTERS = "Chapters";
    public static final String BOOKMARKS = "Bookmarks";
    private ActionBar actionBar;
    private ViewPager pager;
    private TabAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landskape);

        actionBar = getSupportActionBar();
        Log.i(this.getClass().getSimpleName(), "is action " + (actionBar == null));
        pager = (ViewPager) findViewById(R.id.bookContentPager);
        adapter = new TabAdapter(getSupportFragmentManager());
        pager.setAdapter(adapter);
        initPager();
        initTabe();

    }

    private void initPager() {

        actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);
        actionBar.setDisplayOptions(0, ActionBar.DISPLAY_SHOW_TITLE);

        pager.setAdapter(adapter);

    }

    private void initTabe() {
        final ActionBar.Tab tabChapter = actionBar.newTab().setText(CHAPTERS);
        final ActionBar.Tab tabBookMark = actionBar.newTab().setText(BOOKMARKS);
        adapter.addTabListener(tabChapter);
        adapter.addTabListener(tabBookMark);

        actionBar.addTab(tabChapter);
        actionBar.addTab(tabBookMark);


    }


    private class TabAdapter extends FragmentPagerAdapter implements ActionBar.TabListener, ViewPager.OnPageChangeListener {
        private volatile int count = 0;

        public TabAdapter(FragmentManager fm) {
            super(fm);
            pager.setOnPageChangeListener(this);
        }

        public void addTabListener(ActionBar.Tab tab) {
            ++count;
            tab.setTabListener(this);
        }

        @Override
        public Fragment getItem(int position) {

            return new BookContentFragmentChapters();
        }

        @Override
        public int getCount() {
            return 2;
        }






        @Override
        public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

        }

        @Override
        public void onPageSelected(int position) {

            actionBar.setSelectedNavigationItem(position);
        }

        @Override
        public void onPageScrollStateChanged(int state) {

        }

        @Override
        public void onTabSelected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {
            pager.setCurrentItem(tab.getPosition(),true);
        }

        @Override
        public void onTabUnselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }

        @Override
        public void onTabReselected(ActionBar.Tab tab, FragmentTransaction fragmentTransaction) {

        }
    }
}
