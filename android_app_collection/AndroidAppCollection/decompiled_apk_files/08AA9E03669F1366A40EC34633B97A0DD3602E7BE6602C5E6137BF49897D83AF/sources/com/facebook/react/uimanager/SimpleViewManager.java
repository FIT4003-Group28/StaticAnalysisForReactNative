package com.facebook.react.uimanager;

import android.view.View;
/* loaded from: classes.dex */
public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, g> {
    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public g mo168createShadowNodeInstance() {
        return new g();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<g> getShadowNodeClass() {
        return g.class;
    }
}
