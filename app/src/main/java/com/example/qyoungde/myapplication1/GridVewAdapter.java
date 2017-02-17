package com.example.qyoungde.myapplication1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class GridVewAdapter extends BaseAdapter {
	private Context mContext;
	private List<GridViewItem> mList;
	
	public GridVewAdapter(Context mContext , List<GridViewItem> mList){
		this.mContext = mContext;
		this.mList = mList;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return mList.size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return mList.get(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		 ViewHolder holder;
	        if(convertView == null || convertView.getTag() == null){
	            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_choosen_cp,null);
	            holder = new ViewHolder();
	            holder.imageView = (ImageView)convertView.findViewById(R.id.iv_brand);
	            holder.textView = (TextView)convertView.findViewById(R.id.tv_brand);
	            convertView.setTag(holder);
	        }else{
	            holder = (ViewHolder)convertView.getTag();
	        }
	        GridViewItem mGridViewItem = mList.get(position);
	        holder.textView.setText(mGridViewItem.getCp_name());
	        return convertView;
	}

	public class ViewHolder{
        ImageView imageView;
        TextView textView;
    }
}
