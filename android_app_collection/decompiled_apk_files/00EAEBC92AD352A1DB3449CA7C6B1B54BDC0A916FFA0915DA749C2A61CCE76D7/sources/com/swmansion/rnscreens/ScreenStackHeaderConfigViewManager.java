package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
@com.facebook.react.d0.a.a(name = ScreenStackHeaderConfigViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ScreenStackHeaderConfigViewManager extends ViewGroupManager<g> {
    protected static final String REACT_CLASS = "RNSScreenStackHeaderConfig";

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void addView(g gVar, View view, int i) {
        if (view instanceof h) {
            gVar.a((h) view, i);
            return;
        }
        throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public g mo345createViewInstance(k0 k0Var) {
        return new g(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public View getChildAt(g gVar, int i) {
        return gVar.a(i);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public int getChildCount(g gVar) {
        return gVar.getConfigSubviewsCount();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(g gVar) {
        super.onAfterUpdateTransaction((ScreenStackHeaderConfigViewManager) gVar);
        gVar.b();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(g gVar) {
        gVar.a();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeAllViews(g gVar) {
        gVar.c();
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void removeViewAt(g gVar, int i) {
        gVar.b(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "backButtonInCustomView")
    public void setBackButtonInCustomView(g gVar, boolean z) {
        gVar.setBackButtonInCustomView(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "backgroundColor")
    public void setBackgroundColor(g gVar, int i) {
        gVar.setBackgroundColor(i);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "color")
    public void setColor(g gVar, int i) {
        gVar.setTintColor(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "hidden")
    public void setHidden(g gVar, boolean z) {
        gVar.setHidden(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "hideBackButton")
    public void setHideBackButton(g gVar, boolean z) {
        gVar.setHideBackButton(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "hideShadow")
    public void setHideShadow(g gVar, boolean z) {
        gVar.setHideShadow(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "title")
    public void setTitle(g gVar, String str) {
        gVar.setTitle(str);
    }

    @com.facebook.react.uimanager.e1.a(customType = "Color", name = "titleColor")
    public void setTitleColor(g gVar, int i) {
        gVar.setTitleColor(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "titleFontFamily")
    public void setTitleFontFamily(g gVar, String str) {
        gVar.setTitleFontFamily(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "titleFontSize")
    public void setTitleFontSize(g gVar, float f2) {
        gVar.setTitleFontSize(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "topInsetEnabled")
    public void setTopInsetEnabled(g gVar, boolean z) {
        gVar.setTopInsetEnabled(z);
    }
}
