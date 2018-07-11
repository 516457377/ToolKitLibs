package com.libs.liaohuan.toolkit.ToolBar;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.View;

public class StateBar {

    /**  设置状态栏和导航栏中的图标变小，变模糊或者弱化其效果。这个标志一般用于游戏，电子书，视频，或者不需要去分散用户注意力的应用软件.
     *  <p>状态栏和导航栏中相应的图标都变成了一个小点，同时，点击状态栏和导航栏相应的位置，这些图标的效果会还原成正常的状态。*/
     public static final int SYSTEM_UI_FLAG_LOW_PROFILE = View.SYSTEM_UI_FLAG_LOW_PROFILE;

    /**隐藏导航栏，点击屏幕任意区域，导航栏将重新出现，并且不会自动消失。
     * */
    public static final int SYSTEM_UI_FLAG_HIDE_NAVIGATION = View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

    /**隐藏状态栏，点击屏幕区域不会出现，需要从状态栏位置下拉才会出现。
     * */
    public static final int SYSTEM_UI_FLAG_FULLSCREEN = View.SYSTEM_UI_FLAG_FULLSCREEN;

    /**将布局内容拓展到导航栏和状态栏的后面。*/
    public static final int SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION = View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION;

    /**将布局内容拓展到状态的后面。*/
    public static final int SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;

    /**正常状态*/
    public static  final int SYSTEM_UI_FLAG_VISIBLE = View.SYSTEM_UI_FLAG_VISIBLE;

    /**全屏状态android:fitsSystemWindows无效<p>上拉可显示状态栏*/
    public static final int SYSTEM_UI_FLAG_SURE_FULLSCREEN = View.SYSTEM_UI_FLAG_LOW_PROFILE
            | View.SYSTEM_UI_FLAG_FULLSCREEN
            | View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

    /**
     *  稳定全屏，全屏UI位置不变和android:fitsSystemWindows配合使用生效<p>上拉显示状态栏会自动隐藏*/
    public static  final  int SYSTEM_UI_FLAG_STABLE_SURE_FULLSCREEN = View.SYSTEM_UI_FLAG_LOW_PROFILE
            | View.SYSTEM_UI_FLAG_FULLSCREEN
            | View.SYSTEM_UI_FLAG_LAYOUT_STABLE
            | View.SYSTEM_UI_FLAG_IMMERSIVE
            | View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;

    public static void setToolBar(@NonNull Activity activity, int stateCode){
//        int stateCode = 0;
//        switch (index){
//            case NO_STATE_BAR:
//                stateCode = View.INVISIBLE;
//                break;
//            case NO_NAVIGATION_BAR:
//
//                break;
//            case SYSTEM_UI_FLAG_LOW_PROFILE:
//                stateCode = SYSTEM_UI_FLAG_LOW_PROFILE;
//                break;
//        }

        activity.getWindow().getDecorView().setSystemUiVisibility(stateCode);
    }
}
