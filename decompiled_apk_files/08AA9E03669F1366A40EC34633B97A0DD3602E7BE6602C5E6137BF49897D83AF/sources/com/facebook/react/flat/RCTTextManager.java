package com.facebook.react.flat;
/* loaded from: classes.dex */
public final class RCTTextManager extends FlatViewManager {
    static final String REACT_CLASS = "RCTText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RCTText";
    }

    @Override // com.facebook.react.flat.FlatViewManager
    public /* bridge */ /* synthetic */ void removeAllViews(s sVar) {
        super.removeAllViews(sVar);
    }

    @Override // com.facebook.react.flat.FlatViewManager
    public /* bridge */ /* synthetic */ void setBackgroundColor(s sVar, int i) {
        super.setBackgroundColor(sVar, i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public z mo168createShadowNodeInstance() {
        return new z();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<z> getShadowNodeClass() {
        return z.class;
    }
}
