package com.libs.liaohuan.toolbarlibs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.libs.liaohuan.toolkit.ToolBar.StateBar;
import com.libs.liaohuan.toolkit.http.CallBackUtil;
import com.libs.liaohuan.toolkit.http.OkhttpUtil;
import com.libs.liaohuan.toolkit.utils.GsonFactory;
import com.libs.liaohuan.toolkit.utils.LogUtils;

import java.io.IOException;
import java.util.List;

import okhttp3.Call;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.layout_main);
        StateBar.setToolBar(this, StateBar.SYSTEM_UI_FLAG_STABLE_SURE_FULLSCREEN);
        super.onCreate(savedInstanceState);

        OkhttpUtil.okHttpGet("http://expand.video.iqiyi.com/api/video/info.json?apiKey=71c300df4a7f4e89a43d8e19e5458e6f&qipuId=523856600",
                new CallBackUtil() {
            @Override
            public Object onParseResponse(Call call, Response response) {
                try {
                    return response.body().string();
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }

            @Override
            public void onFailure(Call call, Exception e) {
                LogUtils.e("err");
            }

            @Override
            public void onResponse(Object response) {
                LogUtils.d(response.toString());
            }
        });

//        String json = "{\"name\":\"n1\"}";
        String json = "[{\"name\":\"n1\"},{\"name\":\"n2\"}]";
        List<TBean> tBean = GsonFactory.jsonToArrayList(json,TBean.class);
//        TBean tBean = (TBean) GsonFactory.getInstanceByJson(json,TBean.class);
        LogUtils.i(tBean.get(1).getName());
    }

    class TBean{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
