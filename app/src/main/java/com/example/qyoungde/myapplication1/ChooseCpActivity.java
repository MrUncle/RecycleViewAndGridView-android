package com.example.qyoungde.myapplication1;

import android.app.Activity;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by QYoungde on 2017/2/16.
 */

public class ChooseCpActivity extends Activity {
    /**
     * RecyclerView 所需
     */
    private RecyclerView recyclerView;
    private RecycleAdapter adapter;
    private LinearLayoutManager manager;
    public static Map<String, Bitmap> gridviewBitmapCaches = new HashMap<String, Bitmap>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choosecp);
        initView();
        initData();
    }

    /**
     * 初始化控件
     */
    private void initView() {

    }


//
//    // 释放图片的函数
//    private void recycleBitmapCaches(int fromPosition, int toPosition) {
//        Bitmap delBitmap = null;
//        for (int del = fromPosition; del < toPosition; del++) {
//            delBitmap = gridviewBitmapCaches.get(mList.get(del));
//            if (delBitmap != null) {
//                // 如果非空则表示有缓存的bitmap，需要清理
//                gridviewBitmapCaches.remove(mList.get(del));
//                delBitmap.recycle();
//                delBitmap = null;
//            }
//        }
//    }

    /**
     * 初始化数据
     */
    private void initData() {


        // 2.设置布局管理器
        manager = new LinearLayoutManager(this);
        manager.setOrientation(LinearLayoutManager.VERTICAL);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        recyclerView.setLayoutManager(manager);

        // 3.设置适配器
        adapter = new RecycleAdapter(this);
        recyclerView.setAdapter(adapter);
        adapter.notifyDataSetChanged();

    }

//    // 释放图片的函数
//    private void recycleBitmapCaches(int fromPosition, int toPosition) {
//        Bitmap delBitmap = null;
//        for (int del = fromPosition; del < toPosition; del++) {
//            delBitmap = gridviewBitmapCaches.get(mList.get(del));
//            if (delBitmap != null) {
//                // 如果非空则表示有缓存的bitmap，需要清理
//                gridviewBitmapCaches.remove(mList.get(del));
//                delBitmap.recycle();
//                delBitmap = null;
//            }
//        }
//    }
}
