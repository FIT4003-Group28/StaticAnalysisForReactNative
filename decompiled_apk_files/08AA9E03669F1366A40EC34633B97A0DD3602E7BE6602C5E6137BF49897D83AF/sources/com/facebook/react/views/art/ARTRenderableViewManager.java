package com.facebook.react.views.art;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.af;
import com.facebook.react.uimanager.w;
/* loaded from: classes.dex */
public class ARTRenderableViewManager extends ViewManager<View, w> {
    static final String CLASS_GROUP = "ARTGroup";
    static final String CLASS_SHAPE = "ARTShape";
    static final String CLASS_TEXT = "ARTText";
    private final String mClassName;

    public static ARTRenderableViewManager createARTGroupViewManager() {
        return new ARTGroupViewManager();
    }

    public static ARTRenderableViewManager createARTShapeViewManager() {
        return new ARTShapeViewManager();
    }

    public static ARTRenderableViewManager createARTTextViewManager() {
        return new ARTTextViewManager();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ARTRenderableViewManager(String str) {
        this.mClassName = str;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public w mo168createShadowNodeInstance() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return new a();
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return new b();
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return new e();
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends w> getShadowNodeClass() {
        if (CLASS_GROUP.equals(this.mClassName)) {
            return a.class;
        }
        if (CLASS_SHAPE.equals(this.mClassName)) {
            return b.class;
        }
        if (CLASS_TEXT.equals(this.mClassName)) {
            return e.class;
        }
        throw new IllegalStateException("Unexpected type " + this.mClassName);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance */
    protected View mo170createViewInstance(af afVar) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
        throw new IllegalStateException("ARTShape does not map into a native view");
    }
}
