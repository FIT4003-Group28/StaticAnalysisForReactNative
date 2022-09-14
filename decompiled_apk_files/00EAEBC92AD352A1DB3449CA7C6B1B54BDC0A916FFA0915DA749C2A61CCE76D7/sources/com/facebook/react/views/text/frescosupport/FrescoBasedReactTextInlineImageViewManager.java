package com.facebook.react.views.text.frescosupport;

import android.view.View;
import c.d.h.a.a.c;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.k0;
@com.facebook.react.d0.a.a(name = FrescoBasedReactTextInlineImageViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, a> {
    public static final String REACT_CLASS = "RCTTextInlineImage";
    private final Object mCallerContext;
    private final c.d.h.c.b mDraweeControllerBuilder;

    public FrescoBasedReactTextInlineImageViewManager() {
        this(null, null);
    }

    public FrescoBasedReactTextInlineImageViewManager(c.d.h.c.b bVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public a mo328createShadowNodeInstance() {
        c.d.h.c.b bVar = this.mDraweeControllerBuilder;
        if (bVar == null) {
            bVar = c.d();
        }
        return new a(bVar, this.mCallerContext);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance */
    public View mo345createViewInstance(k0 k0Var) {
        throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends a> getShadowNodeClass() {
        return a.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }
}
