package com.hegazy.mushafy;

import androidx.fragment.app.Fragment;


public abstract class BaseFragment extends Fragment {
public BaseActivity baseActivity;
public void SETupACTIVITY()
{
    baseActivity = (BaseActivity) getActivity();
    baseActivity.baseFragment=this;
}
public void onback()
{
    baseActivity.superBackPressed();
}

    public abstract void onBack();
}
