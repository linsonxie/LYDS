package com.lyds.lyds.view.fragment.base;

import android.app.Fragment;
import android.view.View;

import butterknife.ButterKnife;

public class BaseFragment extends Fragment {
    protected void bindView(View view) {
        ButterKnife.bind(BaseFragment.this, view);
    }
}
