package com.facebook.react.views.text;

import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class ReactTextViewManager extends ReactTextAnchorViewManager<k, i> {
    public static final String REACT_CLASS = "RCTText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public k mo170createViewInstance(af afVar) {
        return new k(afVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(k kVar, Object obj) {
        j jVar = (j) obj;
        if (jVar.c()) {
            n.a(jVar.a(), kVar);
        }
        kVar.setText(jVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public i mo168createShadowNodeInstance() {
        return new i();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<i> getShadowNodeClass() {
        return i.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(k kVar) {
        super.onAfterUpdateTransaction((ReactTextViewManager) kVar);
        kVar.a();
    }
}
