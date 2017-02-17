package com.example.qyoungde.myapplication1;

import android.app.Activity;
import android.os.Bundle;

import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

/**
 * Created by QYoungde on 2017/2/16.
 */

public class StickyActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sticky);

        StickyListHeadersListView stickyList = (StickyListHeadersListView) findViewById(R.id.list);
        MyAdapter adapter = new MyAdapter(this);
        stickyList.setAdapter(adapter);






    }
}
