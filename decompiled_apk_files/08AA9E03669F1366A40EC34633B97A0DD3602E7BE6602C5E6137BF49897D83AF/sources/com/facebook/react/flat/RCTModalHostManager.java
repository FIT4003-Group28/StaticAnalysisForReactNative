package com.facebook.react.flat;

import com.facebook.react.views.modal.ReactModalHostManager;
/* loaded from: classes.dex */
public class RCTModalHostManager extends ReactModalHostManager {
    static final String REACT_CLASS = "RCTModalHostView";

    @Override // com.facebook.react.views.modal.ReactModalHostManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public com.facebook.react.uimanager.g mo168createShadowNodeInstance() {
        return new p();
    }

    @Override // com.facebook.react.views.modal.ReactModalHostManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<? extends com.facebook.react.uimanager.g> getShadowNodeClass() {
        return p.class;
    }
}
