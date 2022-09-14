package com.teslamotors.plugins.colorblending;

import com.facebook.react.bridge.an;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class ColorBlendingImageViewManager extends SimpleViewManager<a> {
    public static final String REACT_CLASS = "TMColorBlendingImageView";
    private static final String TAG = b.class.getSimpleName();
    private final Object mCallerContext;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    public ColorBlendingImageViewManager() {
        this.mCallerContext = null;
    }

    public ColorBlendingImageViewManager(Object obj) {
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public a mo170createViewInstance(af afVar) {
        return new a(afVar, com.facebook.f.a.a.c.a(), this.mCallerContext);
    }

    @com.facebook.react.uimanager.a.a(a = "blendingSpecification")
    public void setBlendingSpecification(a aVar, an anVar) {
        aVar.setBlendingSpecification(anVar);
    }

    @com.facebook.react.uimanager.a.a(a = "shouldNotifyLoadEvents")
    public void setLoadHandlersRegistered(a aVar, boolean z) {
        aVar.setShouldNotifyLoadEvents(z);
    }

    @com.facebook.react.uimanager.a.a(a = "fadeDuration")
    public void setFadeDuration(a aVar, int i) {
        aVar.setFadeDuration(i);
    }

    @com.facebook.react.uimanager.a.a(a = "loadingIndicatorSrc")
    public void setLoadingIndicatorSource(a aVar, String str) {
        aVar.setLoadingIndicatorSource(str);
    }
}
