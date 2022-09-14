package com.swmansion.gesturehandler.react;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import java.util.Map;
@com.facebook.react.d0.a.a(name = RNGestureHandlerRootViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class RNGestureHandlerRootViewManager extends ViewGroupManager<h> {
    public static final String REACT_CLASS = "GestureHandlerRootView";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public h mo345createViewInstance(k0 k0Var) {
        return new h(k0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.f.a("onGestureHandlerEvent", com.facebook.react.common.f.a("registrationName", "onGestureHandlerEvent"), "onGestureHandlerStateChange", com.facebook.react.common.f.a("registrationName", "onGestureHandlerStateChange"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(h hVar) {
        hVar.a();
    }
}
