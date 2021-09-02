package com.daotrung.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class FoodAdapter extends BaseAdapter {

    Context context ;
    int layout ;
    List<Food> foodList;

    public FoodAdapter(Context context, int layout, List<Food> foodList) {
        this.context = context;
        this.layout = layout;
        this.foodList = foodList;
    }

    @Override
    public int getCount() {
        return foodList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        convertView = inflater.inflate(layout,null);

        TextView txtName = convertView.findViewById(R.id.txtName);
        txtName.setText(foodList.get(position).Name);
        TextView txtFan = convertView.findViewById(R.id.txtFan);
        txtFan.setText(foodList.get(position).Fan);
        TextView txtBaiViet = convertView.findViewById(R.id.txtBaiViet);
        txtBaiViet.setText(foodList.get(position).BaiViet);
        TextView txtNhom = convertView.findViewById(R.id.txtNhom);
        txtNhom.setText(foodList.get(position).Nhom);
        ImageView img = convertView.findViewById(R.id.img);
        img.setImageResource(foodList.get(position).Hinh);

        return convertView;
    }
}
