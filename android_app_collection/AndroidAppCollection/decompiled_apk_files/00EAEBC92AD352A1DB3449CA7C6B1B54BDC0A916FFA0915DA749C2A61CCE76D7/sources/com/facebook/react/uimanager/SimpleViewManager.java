package com.facebook.react.uimanager;

import android.view.View;
/* loaded from: classes.dex */
public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, i> {
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public i mo328createShadowNodeInstance() {
        return new i();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<i> getShadowNodeClass() {
        return i.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(T t, Object obj) {
    }
}
