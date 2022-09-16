package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.af;
/* loaded from: classes.dex */
public class ReactRawTextManager extends ViewManager<View, f> {
    public static final String REACT_CLASS = "RCTRawText";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(View view, Object obj) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public View mo170createViewInstance(af afVar) {
        throw new IllegalStateException("Attempt to create a native view for RCTRawText");
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<? extends f> getShadowNodeClass() {
        return f.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public f mo168createShadowNodeInstance() {
        return new f();
    }
}
