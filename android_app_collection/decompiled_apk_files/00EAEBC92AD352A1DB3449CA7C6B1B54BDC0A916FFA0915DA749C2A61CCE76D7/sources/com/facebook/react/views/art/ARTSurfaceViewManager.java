package com.facebook.react.views.art;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.k0;
import com.facebook.yoga.m;
import com.facebook.yoga.n;
import com.facebook.yoga.p;
@com.facebook.react.d0.a.a(name = ARTSurfaceViewManager.REACT_CLASS)
/* loaded from: classes.dex */
public class ARTSurfaceViewManager extends BaseViewManager<c, d> {
    private static final m MEASURE_FUNCTION = new a();
    public static final String REACT_CLASS = "ARTSurfaceView";

    /* loaded from: classes.dex */
    static class a implements m {
        a() {
        }

        @Override // com.facebook.yoga.m
        public long a(p pVar, float f2, n nVar, float f3, n nVar2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public d mo328createShadowNodeInstance() {
        d dVar = new d();
        dVar.a(MEASURE_FUNCTION);
        return dVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public c mo345createViewInstance(k0 k0Var) {
        return new c(k0Var);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    public void setBackgroundColor(c cVar, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(c cVar, Object obj) {
        ((d) obj).a(cVar);
    }
}
