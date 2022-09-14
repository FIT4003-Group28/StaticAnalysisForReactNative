package com.facebook.react.flat;

import android.view.View;
/* loaded from: classes.dex */
public final class RCTRawTextManager extends VirtualViewManager<y> {
    static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTRawText";
    }

    @Override // com.facebook.react.flat.VirtualViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        super.updateExtraData(view, obj);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public y mo168createShadowNodeInstance() {
        return new y();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<y> getShadowNodeClass() {
        return y.class;
    }
}
