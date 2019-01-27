package com.wh.ot;

import android.content.Context;

import com.wh.ot.base.BaseGLSurfaceView;

public class MyGLSurfaceView extends BaseGLSurfaceView {

    private final MyGLRenderer mRenderer;

    public MyGLSurfaceView(Context context) {
        super(context);
        mRenderer = new MyGLRenderer();
        setRenderer(mRenderer);
    }

}


























