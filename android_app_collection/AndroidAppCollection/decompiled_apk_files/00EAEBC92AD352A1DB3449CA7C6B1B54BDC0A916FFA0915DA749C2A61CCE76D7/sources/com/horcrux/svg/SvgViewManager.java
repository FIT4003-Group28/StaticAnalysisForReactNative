package com.horcrux.svg;

import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.views.view.ReactViewManager;
/* loaded from: classes.dex */
class SvgViewManager extends ReactViewManager {
    private static final String REACT_CLASS = "RNSVGSvgView";
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSvgView(int i, SvgView svgView) {
        mTagToSvgView.put(i, svgView);
        Runnable runnable = mTagToRunnable.get(i);
        if (runnable != null) {
            runnable.run();
            mTagToRunnable.delete(i);
        }
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance */
    public SvgView mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
        return new SvgView(k0Var);
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.f
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(com.facebook.react.views.view.f fVar) {
        super.onDropViewInstance((SvgViewManager) fVar);
        mTagToSvgView.remove(fVar.getId());
    }

    @com.facebook.react.uimanager.e1.a(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @com.facebook.react.uimanager.e1.a(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    @com.facebook.react.uimanager.e1.a(name = "color")
    public void setColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i) {
        svgView.setMeetOrSlice(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "minX")
    public void setMinX(SvgView svgView, float f2) {
        svgView.setMinX(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "minY")
    public void setMinY(SvgView svgView, float f2) {
        svgView.setMinY(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "tintColor")
    public void setTintColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @com.facebook.react.uimanager.e1.a(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f2) {
        svgView.setVbHeight(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f2) {
        svgView.setVbWidth(f2);
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(com.facebook.react.views.view.f fVar, Object obj) {
        super.updateExtraData((SvgViewManager) fVar, obj);
        fVar.invalidate();
    }
}
