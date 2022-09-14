package com.facebook.react.views.scroll;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class ReactHorizontalScrollContainerViewManager extends ViewGroupManager<c> {
    protected static final String REACT_CLASS = "AndroidHorizontalScrollContentView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public c mo170createViewInstance(af afVar) {
        return new c(afVar);
    }
}
