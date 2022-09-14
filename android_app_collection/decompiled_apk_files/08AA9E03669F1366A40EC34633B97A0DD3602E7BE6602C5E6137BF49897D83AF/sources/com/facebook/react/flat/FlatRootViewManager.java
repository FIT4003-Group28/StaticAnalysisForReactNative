package com.facebook.react.flat;

import android.view.ViewGroup;
import com.facebook.react.uimanager.RootViewManager;
/* loaded from: classes.dex */
class FlatRootViewManager extends RootViewManager {
    FlatRootViewManager() {
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(ViewGroup viewGroup) {
        viewGroup.removeAllViewsInLayout();
    }
}
