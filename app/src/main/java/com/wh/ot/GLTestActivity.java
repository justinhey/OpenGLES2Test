package com.wh.ot;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.wh.ot.base.BaseActivity;
import com.wh.ot.surfaceView.TriangleGLSurfaceView;

public class GLTestActivity extends BaseActivity {


    private TriangleGLSurfaceView mTriangleGLSurfaceView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mTriangleGLSurfaceView = new TriangleGLSurfaceView(this);
        setContentView(mTriangleGLSurfaceView);
    }
}
