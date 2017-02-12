package com.polar.android.alphadog.presentation.feed;

import com.polar.android.alphadog.presentation.MainActivity;
import com.polar.android.alphadog.presentation.base.BaseFragment;

/**
 * @author Valentin Postnov
 */
public class FeedFragment extends BaseFragment implements FeedFragmentView {

    @Override
    protected void initInjection() {
        ((MainActivity) getActivity()).getActivityComponent().inject(this);
    }

    @Override
    protected int getLayout() {
        return 0;
    }
}
