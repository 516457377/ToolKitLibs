package com.libs.liaohuan.toolbarlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.libs.liaohuan.toolkit.ToolBar.StateBar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_main);
        StateBar.setToolBar(this, StateBar.SYSTEM_UI_FLAG_STABLE_SURE_FULLSCREEN);
        super.onCreate(savedInstanceState);
    }
}
