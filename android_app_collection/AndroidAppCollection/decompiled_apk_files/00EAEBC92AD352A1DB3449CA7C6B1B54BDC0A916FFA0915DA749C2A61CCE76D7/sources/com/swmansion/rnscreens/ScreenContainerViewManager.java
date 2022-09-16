package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
@com.facebook.react.d0.a.a(name = ScreenContainerViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ScreenContainerViewManager extends ViewGroupManager<d> {
    protected static final String REACT_CLASS = "RNSScreenContainer";

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(d dVar, View view, int i) {
        if (view instanceof b) {
            dVar.a((b) view, i);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public d mo345createViewInstance(k0 k0Var) {
        return new d(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(d dVar, int i) {
        return dVar.a(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(d dVar) {
        return dVar.getScreenCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(d dVar) {
        dVar.d();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(d dVar, int i) {
        dVar.b(i);
    }
}
