package com.wh.ot;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wh.ot.base.BaseActivity;

public class GLTestActivity extends BaseActivity {

    private MyGLSurfaceView mGLSurfaceView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mGLSurfaceView = new MyGLSurfaceView(this);
        setContentView(mGLSurfaceView);
    }
}
