package com.special.ResideMenuDemo;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.special.ResideMenu.ResideMenu;

// @A001 定义需要打开的 Fragment
public class Chapter2Fragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
    	// @A001 还需要定义 res/layout
        return inflater.inflate(R.layout.chapter2, container, false);
    }

}
