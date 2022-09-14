package com.facebook.react.views.unimplementedview;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
@com.facebook.react.d0.a.a(name = ReactUnimplementedViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ReactUnimplementedViewManager extends ViewGroupManager<a> {
    public static final String REACT_CLASS = "UnimplementedNativeView";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo345createViewInstance(k0 k0Var) {
        return new a(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @com.facebook.react.uimanager.e1.a(name = "name")
    public void setName(a aVar, String str) {
        aVar.setName(str);
    }
}
