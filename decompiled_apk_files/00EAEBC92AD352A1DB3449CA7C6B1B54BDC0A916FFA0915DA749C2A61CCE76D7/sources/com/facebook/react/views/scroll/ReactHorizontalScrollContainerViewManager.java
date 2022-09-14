package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.k0;
import com.facebook.react.views.view.ReactClippingViewManager;
@com.facebook.react.d0.a.a(name = ReactHorizontalScrollContainerViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<c> {
    public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public c mo345createViewInstance(k0 k0Var) {
        return new c(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }
}
