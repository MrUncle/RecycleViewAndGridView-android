package com.example.qyoungde.myapplication1;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by QYoungde on 2017/2/16.
 */

public class RecycleAdapter extends RecyclerView.Adapter<RecycleAdapter.ViewHolder> {

    private Context context;

    public RecycleAdapter(Context context) {

        this.context = context;

    }

    @Override
    public int getItemCount() {

        return 100;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int arg1) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.recycler_item, null);
        ViewHolder vh = new ViewHolder(view);

        vh.recycler_item_title = (TextView) view.findViewById(R.id.recycler_item_title);
        vh.recycler_item_grid = (GridView) view.findViewById(R.id.recycler_item_grid);
        return vh;
    }

    /**
     * 设置值
     */
    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int i) {

        List<GridViewItem> mList = new ArrayList();

        for (int m = 0; m < i+1; m++) {
            GridViewItem mGridViewItem = new GridViewItem();
            mGridViewItem.setCp_pic(R.drawable.image_1);
            mGridViewItem.setCp_name(""+m);
            mList.add(mGridViewItem);
        }
        viewHolder.recycler_item_title.setText("第"+i+"组");
        viewHolder.recycler_item_grid.setAdapter(new GridVewAdapter(context, mList));


        int n = i + 1;
        LinearLayout.LayoutParams params= (LinearLayout.LayoutParams) viewHolder.recycler_item_grid.getLayoutParams();
//获取当前控件的布局对象
        params.height=(n/4+(n%4==0?0:1))*105;//设置当前控件布局的高度
        viewHolder.recycler_item_grid.setLayoutParams(params);//将设置好的布局参数应用到控件中
        viewHolder.recycler_item_grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {
//                // TODO Auto-generated method stub
//                Intent mIntent = new Intent();
//                mIntent.putExtra("cpName", mList.get(position).getCp_name());
//                setResult(CPRESULT , mIntent);
//                ChooseCpActivity.this.finish();

                Toast.makeText(context,"点击了第"+position+"个",Toast.LENGTH_SHORT).show();

            }
        });




    }

    static class ViewHolder extends RecyclerView.ViewHolder {

        private TextView recycler_item_title;
        private GridView recycler_item_grid;

        public ViewHolder(View itemView) {
            super(itemView);
        }
    }
}
