package com.example.ShadiProject.ui.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;

import com.example.ShadiProject.R;
import com.example.ShadiProject.common.fragments.BaseFragment;

public class ExploreFragment extends BaseFragment{

    public ExploreFragment() {}

    public static ExploreFragment newInstance() {
        return new ExploreFragment();
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTextPlaceholder.setText(String.format("%s fragment", getString(R.string.nav_menu_title_explore)));
    }


}
