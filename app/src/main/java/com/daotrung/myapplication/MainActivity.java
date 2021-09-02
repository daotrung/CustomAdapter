package com.daotrung.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Food> arrayList;
    ListView lvFood ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvFood = findViewById(R.id.lvFood);
        arrayList = new ArrayList<Food>();
        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.img1));
        arrayList.add(new Food("Ăn để lăn","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.img2));
        arrayList.add(new Food("Chia sẻ kiến thức tài liệu Montessori","1,7K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.img3));
        arrayList.add(new Food("Thực đơn Eat-Clean giảm cân khỏe đẹp","11K Fan ","+20 bài viết mới nhất","NHÓM MỞ",R.drawable.img4));
        arrayList.add(new Food("Easy Kento for busy People","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.img5));
        arrayList.add(new Food("OFFB","8K Fan ","+10 bài viết mới nhất","NHÓM MỞ",R.drawable.img6));
        arrayList.add(new Food("Mua bán có tâm","8K Fan ","+10 bài viết mới nhất","NHÓM ĐÓNG",R.drawable.img1));
        arrayList.add(new Food("Thực đơn Eat-Clean giảm cân khỏe đẹp","11K Fan ","+20 bài viết mới nhất","NHÓM MỞ",R.drawable.img4));
        arrayList.add(new Food("Easy Kento for busy People","8K Fan ","+10 bài viết mới nhất","NHÓM KÍN",R.drawable.img5));

        FoodAdapter adapter = new FoodAdapter(MainActivity.this,R.layout.item_dong,arrayList);
        lvFood.setAdapter(adapter);


    }
}