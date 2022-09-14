package org.reactnative.maskedview;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
/* loaded from: classes.dex */
public class RNCMaskedViewManager extends ViewGroupManager<a> {
    private static final String REACT_CLASS = "RNCMaskedView";

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
}
