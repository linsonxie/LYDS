package com.lyds.lyds.view.activity.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;

import com.lyds.lyds.App;

import butterknife.ButterKnife;

/**
 * <a href="http://jakewharton.github.io/butterknife/">ButterKnife 的使用说明</a>
 */
public class BaseActivity extends AppCompatActivity {
    protected App app = (App)getApplication();

    @Override
    public void onCreate(Bundle savedInstanceState, PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        ButterKnife.bind(BaseActivity.this);
    }
}
