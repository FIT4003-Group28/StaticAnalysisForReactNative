package com.facebook.react.flat;

import android.view.View;
import com.facebook.react.flat.q;
import com.facebook.react.uimanager.ViewManager;
/* loaded from: classes.dex */
abstract class VirtualViewManager<C extends q> extends ViewManager<View, C> {
    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance */
    protected View mo170createViewInstance(com.facebook.react.uimanager.af afVar) {
        throw new RuntimeException(getName() + " doesn't map to a View");
    }
}
