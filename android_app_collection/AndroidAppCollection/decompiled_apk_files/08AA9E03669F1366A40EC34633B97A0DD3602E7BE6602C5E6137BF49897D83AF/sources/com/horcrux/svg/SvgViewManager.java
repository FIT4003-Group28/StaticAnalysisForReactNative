package com.horcrux.svg;

import android.graphics.Bitmap;
import android.util.SparseArray;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class SvgViewManager extends BaseViewManager<SvgView, SvgViewShadowNode> {
    private static final String REACT_CLASS = "RNSVGSvgView";
    private static final YogaMeasureFunction MEASURE_FUNCTION = new YogaMeasureFunction() { // from class: com.horcrux.svg.SvgViewManager.1
        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            throw new IllegalStateException("SurfaceView should have explicit width and height set");
        }
    };
    private static final SparseArray<SvgViewShadowNode> mTagToShadowNode = new SparseArray<>();
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setShadowNode(SvgViewShadowNode svgViewShadowNode) {
        mTagToShadowNode.put(svgViewShadowNode.getReactTag(), svgViewShadowNode);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSvgView(SvgView svgView) {
        mTagToSvgView.put(svgView.getId(), svgView);
    }

    static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SvgViewShadowNode getShadowNodeByTag(int i) {
        return mTagToShadowNode.get(i);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public Class<SvgViewShadowNode> getShadowNodeClass() {
        return SvgViewShadowNode.class;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public SvgViewShadowNode mo168createShadowNodeInstance() {
        SvgViewShadowNode svgViewShadowNode = new SvgViewShadowNode();
        svgViewShadowNode.setMeasureFunction(MEASURE_FUNCTION);
        return svgViewShadowNode;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(SvgView svgView) {
        int id = svgView.getId();
        mTagToShadowNode.remove(id);
        mTagToSvgView.remove(id);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public SvgView mo170createViewInstance(com.facebook.react.uimanager.af afVar) {
        return new SvgView(afVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void updateExtraData(SvgView svgView, Object obj) {
        svgView.setBitmap((Bitmap) obj);
    }
}
