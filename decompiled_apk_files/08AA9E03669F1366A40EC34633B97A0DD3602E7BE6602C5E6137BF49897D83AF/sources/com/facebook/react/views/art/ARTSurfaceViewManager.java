package com.facebook.react.views.art;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.af;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
/* loaded from: classes.dex */
public class ARTSurfaceViewManager extends BaseViewManager<c, d> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new YogaMeasureFunction() { // from class: com.facebook.react.views.art.ARTSurfaceViewManager.1
        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    };
    protected static final String REACT_CLASS = "ARTSurfaceView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.BaseViewManager
    public void setBackgroundColor(c cVar, int i) {
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public d mo168createShadowNodeInstance() {
        d dVar = new d();
        dVar.setMeasureFunction(MEASURE_FUNCTION);
        return dVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public c mo170createViewInstance(af afVar) {
        return new c(afVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(c cVar, Object obj) {
        cVar.setSurfaceTextureListener((d) obj);
    }
}
