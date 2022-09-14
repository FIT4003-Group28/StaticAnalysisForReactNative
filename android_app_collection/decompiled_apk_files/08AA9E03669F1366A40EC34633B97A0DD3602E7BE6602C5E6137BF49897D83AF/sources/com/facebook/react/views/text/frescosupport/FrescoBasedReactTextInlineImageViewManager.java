package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.f.a.a.c;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, a> {
    protected static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final com.facebook.f.c.b mDraweeControllerBuilder;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    public FrescoBasedReactTextInlineImageViewManager(com.facebook.f.c.b bVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance */
    public View mo170createViewInstance(af afVar) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public a mo168createShadowNodeInstance() {
        return new a(this.mDraweeControllerBuilder != null ? this.mDraweeControllerBuilder : c.a(), this.mCallerContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends a> getShadowNodeClass() {
        return a.class;
    }
}
