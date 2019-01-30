package com.wh.ot.surfaceView;


import android.content.Context;

import com.wh.ot.base.BaseGLSurfaceView;
import com.wh.ot.render.TriangleRender;

public class TriangleGLSurfaceView extends BaseGLSurfaceView {

    private final TriangleRender mRender;

    public TriangleGLSurfaceView(Context context) {
        super(context);
        mRender = new TriangleRender();
        setRenderer(mRender);
    }
}
