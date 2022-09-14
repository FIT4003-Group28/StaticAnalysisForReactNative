package com.facebook.react.flat;

import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
/* loaded from: classes.dex */
public class FlatARTSurfaceViewManager extends BaseViewManager<com.facebook.react.views.art.c, o> {
    private static final YogaMeasureFunction MEASURE_FUNCTION = new YogaMeasureFunction() { // from class: com.facebook.react.flat.FlatARTSurfaceViewManager.1
        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    };
    static final String REACT_CLASS = "ARTSurfaceView";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance */
    public o mo168createShadowNodeInstance() {
        o oVar = new o();
        oVar.setMeasureFunction(MEASURE_FUNCTION);
        return oVar;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<o> getShadowNodeClass() {
        return o.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public com.facebook.react.views.art.c mo170createViewInstance(com.facebook.react.uimanager.af afVar) {
        return new com.facebook.react.views.art.c(afVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(com.facebook.react.views.art.c cVar, Object obj) {
        cVar.setSurfaceTextureListener((o) obj);
    }
}
