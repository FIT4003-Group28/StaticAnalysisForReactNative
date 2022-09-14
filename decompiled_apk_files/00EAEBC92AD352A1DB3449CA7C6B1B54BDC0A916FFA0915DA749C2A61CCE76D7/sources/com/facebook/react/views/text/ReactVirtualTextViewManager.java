package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.k0;
@com.facebook.react.d0.a.a(name = ReactVirtualTextViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactVirtualTextViewManager extends BaseViewManager<View, u> {
    public static final String REACT_CLASS = "RCTVirtualText";

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public u mo328createShadowNodeInstance() {
        return new u();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance */
    public View mo345createViewInstance(k0 k0Var) {
        throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<u> getShadowNodeClass() {
        return u.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }
}
