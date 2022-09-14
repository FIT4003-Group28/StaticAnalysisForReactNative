package com.swmansion.rnscreens;

import com.facebook.react.uimanager.k0;
import com.facebook.react.views.view.ReactViewManager;
import com.swmansion.rnscreens.h;
@com.facebook.react.d0.a.a(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ScreenStackHeaderSubviewManager extends ReactViewManager {
    protected static final String REACT_CLASS = "RNSScreenStackHeaderSubview";

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.view.f mo345createViewInstance(k0 k0Var) {
        return new h(k0Var);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @com.facebook.react.uimanager.e1.a(name = "type")
    public void setType(h hVar, String str) {
        h.a aVar;
        if ("left".equals(str)) {
            aVar = h.a.LEFT;
        } else if ("center".equals(str)) {
            aVar = h.a.CENTER;
        } else if ("right".equals(str)) {
            aVar = h.a.RIGHT;
        } else if (!"back".equals(str)) {
            return;
        } else {
            aVar = h.a.BACK;
        }
        hVar.setType(aVar);
    }
}
