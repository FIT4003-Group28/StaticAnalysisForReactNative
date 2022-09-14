package com.facebook.react.flat;

import com.facebook.react.uimanager.ViewGroupManager;
/* loaded from: classes.dex */
abstract class FlatViewManager extends ViewGroupManager<s> {
    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(s sVar, int i) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public s mo170createViewInstance(com.facebook.react.uimanager.af afVar) {
        return new s(afVar);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(s sVar) {
        sVar.removeAllViewsInLayout();
    }
}
