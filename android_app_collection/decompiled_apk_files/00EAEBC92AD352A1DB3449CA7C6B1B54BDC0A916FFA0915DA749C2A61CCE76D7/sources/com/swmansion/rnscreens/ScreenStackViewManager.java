package com.swmansion.rnscreens;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
@com.facebook.react.d0.a.a(name = ScreenStackViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ScreenStackViewManager extends ViewGroupManager<f> {
    protected static final String REACT_CLASS = "RNSScreenStack";

    private void prepareOutTransition(b bVar) {
        startTransitionRecursive(bVar);
    }

    private void startTransitionRecursive(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            viewGroup.startViewTransition(childAt);
            if (childAt instanceof ViewGroup) {
                startTransitionRecursive((ViewGroup) childAt);
            }
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(f fVar, View view, int i) {
        if (view instanceof b) {
            fVar.a((b) view, i);
            return;
        }
        throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public f mo345createViewInstance(k0 k0Var) {
        return new f(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(f fVar, int i) {
        return fVar.a(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(f fVar) {
        return fVar.getScreenCount();
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
    public void removeViewAt(f fVar, int i) {
        prepareOutTransition(fVar.a(i));
        fVar.b(i);
    }
}
