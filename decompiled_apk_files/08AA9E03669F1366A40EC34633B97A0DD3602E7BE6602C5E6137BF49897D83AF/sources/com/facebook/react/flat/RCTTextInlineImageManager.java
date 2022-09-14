package com.facebook.react.flat;

import android.view.View;
/* loaded from: classes.dex */
public final class RCTTextInlineImageManager extends VirtualViewManager<aa> {
    static final String REACT_CLASS = "RCTTextInlineImage";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.flat.VirtualViewManager, com.facebook.react.uimanager.ViewManager
    public /* bridge */ /* synthetic */ void updateExtraData(View view, Object obj) {
        super.updateExtraData(view, obj);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public aa mo168createShadowNodeInstance() {
        return new aa();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<aa> getShadowNodeClass() {
        return aa.class;
    }
}
