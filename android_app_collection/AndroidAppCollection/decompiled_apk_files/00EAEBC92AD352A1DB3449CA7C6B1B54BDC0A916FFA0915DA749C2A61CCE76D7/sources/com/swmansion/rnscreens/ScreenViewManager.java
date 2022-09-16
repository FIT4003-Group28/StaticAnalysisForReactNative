package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.modules.appstate.AppStateModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import com.swmansion.rnscreens.b;
import java.util.Map;
@com.facebook.react.d0.a.a(name = ScreenViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ScreenViewManager extends ViewGroupManager<b> {
    protected static final String REACT_CLASS = "RNSScreen";

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public b mo345createViewInstance(k0 k0Var) {
        return new b(k0Var);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return com.facebook.react.common.f.a("topDismissed", com.facebook.react.common.f.a("registrationName", "onDismissed"), "topAppear", com.facebook.react.common.f.a("registrationName", "onAppear"), "topFinishTransitioning", com.facebook.react.common.f.a("registrationName", "onFinishTransitioning"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 0.0f, name = AppStateModule.APP_STATE_ACTIVE)
    public void setActive(b bVar, float f2) {
        bVar.setActive(f2 != 0.0f);
    }

    @com.facebook.react.uimanager.e1.a(defaultBoolean = true, name = "gestureEnabled")
    public void setGestureEnabled(b bVar, boolean z) {
        bVar.setGestureEnabled(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "stackAnimation")
    public void setStackAnimation(b bVar, String str) {
        b.c cVar;
        if (str == null || "default".equals(str)) {
            cVar = b.c.DEFAULT;
        } else if ("none".equals(str)) {
            cVar = b.c.NONE;
        } else if (!"fade".equals(str)) {
            return;
        } else {
            cVar = b.c.FADE;
        }
        bVar.setStackAnimation(cVar);
    }

    @com.facebook.react.uimanager.e1.a(name = "stackPresentation")
    public void setStackPresentation(b bVar, String str) {
        b.d dVar;
        if ("push".equals(str)) {
            dVar = b.d.PUSH;
        } else if ("modal".equals(str) || "containedModal".equals(str) || "fullScreenModal".equals(str) || "formSheet".equals(str)) {
            dVar = b.d.MODAL;
        } else if (!"transparentModal".equals(str) && !"containedTransparentModal".equals(str)) {
            throw new JSApplicationIllegalArgumentException("Unknown presentation type " + str);
        } else {
            dVar = b.d.TRANSPARENT_MODAL;
        }
        bVar.setStackPresentation(dVar);
    }
}
