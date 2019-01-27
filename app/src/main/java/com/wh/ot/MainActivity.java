package com.wh.ot;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.wh.ot.base.BaseActivity;
import com.wh.ot.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        initView();
    }

    private void initView() {
        mBinding.btnGlTest1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, GLTestActivity.class);
                startActivity(intent);
            }
        });
    }
}
