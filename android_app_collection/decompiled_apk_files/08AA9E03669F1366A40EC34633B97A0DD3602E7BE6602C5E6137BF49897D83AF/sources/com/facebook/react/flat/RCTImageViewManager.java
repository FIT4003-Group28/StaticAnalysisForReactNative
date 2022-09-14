package com.facebook.react.flat;
/* loaded from: classes.dex */
public final class RCTImageViewManager extends FlatViewManager {
    static final String REACT_CLASS = "RCTImageView";
    private final Object mCallerContext;
    private com.facebook.f.c.b mDraweeControllerBuilder;
    private com.facebook.react.views.image.a mGlobalImageLoadListener;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.flat.FlatViewManager
    public /* bridge */ /* synthetic */ void removeAllViews(s sVar) {
        super.removeAllViews(sVar);
    }

    @Override // com.facebook.react.flat.FlatViewManager
    public /* bridge */ /* synthetic */ void setBackgroundColor(s sVar, int i) {
        super.setBackgroundColor(sVar, i);
    }

    public RCTImageViewManager() {
        this(null, null);
    }

    public RCTImageViewManager(com.facebook.f.c.b bVar, Object obj) {
        this(bVar, null, obj);
    }

    public RCTImageViewManager(com.facebook.f.c.b bVar, com.facebook.react.views.image.a aVar, Object obj) {
        this.mDraweeControllerBuilder = bVar;
        this.mGlobalImageLoadListener = aVar;
        this.mCallerContext = obj;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public x mo168createShadowNodeInstance() {
        return new x(new k(this.mGlobalImageLoadListener));
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<x> getShadowNodeClass() {
        return x.class;
    }

    public com.facebook.f.c.b getDraweeControllerBuilder() {
        if (this.mDraweeControllerBuilder == null) {
            this.mDraweeControllerBuilder = com.facebook.f.a.a.c.a();
        }
        return this.mDraweeControllerBuilder;
    }

    public Object getCallerContext() {
        return this.mCallerContext;
    }
}
