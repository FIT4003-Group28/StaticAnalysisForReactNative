package com.facebook.react.flat;

import android.view.View;
/* loaded from: classes.dex */
public final class RCTVirtualTextManager extends VirtualViewManager<ad> {
    static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTVirtualText";
    }

    @Override // com.facebook.react.flat.VirtualViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        super.updateExtraData(view, obj);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public ad mo168createShadowNodeInstance() {
        return new ad();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<ad> getShadowNodeClass() {
        return ad.class;
    }
}
