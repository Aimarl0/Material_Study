package com.example.aimar.materialstudy;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    private TabLayout mTabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTabLayout = (TabLayout) findViewById(R.id.tab);
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab1"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab2"));

        mTabLayout.addTab(mTabLayout.newTab().setText("Tab3"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab4"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab5"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab6"));
        mTabLayout.addTab(mTabLayout.newTab().setText("Tab7"));
        mTabLayout.setTabGravity(TabLayout.GRAVITY_CENTER);
        mTabLayout.setTabMode(TabLayout.MODE_SCROLLABLE);

//        mTabLayout.setOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//                Log.d(TAG, "onTabSelected() called with: " + tab.getText());
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//                Log.d(TAG, "onTabUnselected() called with: " + tab.getText());
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//                Log.d(TAG, "onTabReselected() called with: " + tab.getText());
//            }
//        });

//        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
//        fab.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
//            }
//        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
