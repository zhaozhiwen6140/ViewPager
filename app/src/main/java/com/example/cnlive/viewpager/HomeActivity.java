package com.example.cnlive.viewpager;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by CNLive on 2016/2/1.
 */
public class HomeActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private List<View> list;
    private ViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.item_home);
        initView();
    }


    private void initView() {
        list=new ArrayList<>();
        LayoutInflater inflater=LayoutInflater.from(this);
        View one=inflater.inflate(R.layout.item_one, null);
        View two=inflater.inflate(R.layout.item_two, null);
        View three=inflater.inflate(R.layout.item_three,null);
        list.add(one);
        list.add(two);
        list.add(three);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        adapter=new ViewPagerAdapter(list);
        viewPager.setAdapter(adapter);
    }
}
