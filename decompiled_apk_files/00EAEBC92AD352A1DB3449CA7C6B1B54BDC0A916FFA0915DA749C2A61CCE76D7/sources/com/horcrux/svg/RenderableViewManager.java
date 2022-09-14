package com.horcrux.svg;

import android.graphics.Matrix;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.j;
import java.lang.reflect.Array;
import java.util.Locale;
/* loaded from: classes.dex */
class RenderableViewManager extends ViewGroupManager<VirtualView> {
    private static final float CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER = 5.0f;
    private static final double EPSILON = 1.0E-5d;
    private static final int PERSPECTIVE_ARRAY_INVERTED_CAMERA_DISTANCE_INDEX = 2;
    private final String mClassName;
    private final e svgClass;
    private static final c sMatrixDecompositionContext = new c();
    private static final double[] sTransformDecompositionArray = new double[16];
    private static final SparseArray<RenderableView> mTagToRenderableView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* loaded from: classes.dex */
    static class CircleViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public CircleViewManager() {
            super(e.RNSVGCircle, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "cx")
        public void setCx(com.horcrux.svg.b bVar, Dynamic dynamic) {
            bVar.setCx(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "cy")
        public void setCy(com.horcrux.svg.b bVar, Dynamic dynamic) {
            bVar.setCy(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "r")
        public void setR(com.horcrux.svg.b bVar, Dynamic dynamic) {
            bVar.setR(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class ClipPathViewManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ClipPathViewManager() {
            super(e.RNSVGClipPath);
        }
    }

    /* loaded from: classes.dex */
    static class DefsViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public DefsViewManager() {
            super(e.RNSVGDefs, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }
    }

    /* loaded from: classes.dex */
    static class EllipseViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public EllipseViewManager() {
            super(e.RNSVGEllipse, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "cx")
        public void setCx(g gVar, Dynamic dynamic) {
            gVar.setCx(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "cy")
        public void setCy(g gVar, Dynamic dynamic) {
            gVar.setCy(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "rx")
        public void setRx(g gVar, Dynamic dynamic) {
            gVar.setRx(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "ry")
        public void setRy(g gVar, Dynamic dynamic) {
            gVar.setRy(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class ForeignObjectManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ForeignObjectManager() {
            super(e.RNSVGForeignObject);
        }

        @com.facebook.react.uimanager.e1.a(name = "height")
        public void setHeight(i iVar, Dynamic dynamic) {
            iVar.setHeight(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "width")
        public void setWidth(i iVar, Dynamic dynamic) {
            iVar.setWidth(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x")
        public void setX(i iVar, Dynamic dynamic) {
            iVar.setX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y")
        public void setY(i iVar, Dynamic dynamic) {
            iVar.setY(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class GroupViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public GroupViewManager() {
            super(e.RNSVGGroup, null);
        }

        GroupViewManager(e eVar) {
            super(eVar, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "font")
        public void setFont(l lVar, ReadableMap readableMap) {
            lVar.setFont(readableMap);
        }

        @com.facebook.react.uimanager.e1.a(name = "fontSize")
        public void setFontSize(l lVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = b.f9513a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontSize", dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontSize", dynamic.asString());
            }
            lVar.setFont(javaOnlyMap);
        }

        @com.facebook.react.uimanager.e1.a(name = "fontWeight")
        public void setFontWeight(l lVar, Dynamic dynamic) {
            JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
            int i = b.f9513a[dynamic.getType().ordinal()];
            if (i == 1) {
                javaOnlyMap.putDouble("fontWeight", dynamic.asDouble());
            } else if (i != 2) {
                return;
            } else {
                javaOnlyMap.putString("fontWeight", dynamic.asString());
            }
            lVar.setFont(javaOnlyMap);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }
    }

    /* loaded from: classes.dex */
    static class ImageViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public ImageViewManager() {
            super(e.RNSVGImage, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "align")
        public void setAlign(m mVar, String str) {
            mVar.setAlign(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "height")
        public void setHeight(m mVar, Dynamic dynamic) {
            mVar.setHeight(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
        public void setMeetOrSlice(m mVar, int i) {
            mVar.setMeetOrSlice(i);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "src")
        public void setSrc(m mVar, ReadableMap readableMap) {
            mVar.setSrc(readableMap);
        }

        @com.facebook.react.uimanager.e1.a(name = "width")
        public void setWidth(m mVar, Dynamic dynamic) {
            mVar.setWidth(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x")
        public void setX(m mVar, Dynamic dynamic) {
            mVar.setX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y")
        public void setY(m mVar, Dynamic dynamic) {
            mVar.setY(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class LineViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public LineViewManager() {
            super(e.RNSVGLine, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "x1")
        public void setX1(n nVar, Dynamic dynamic) {
            nVar.setX1(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x2")
        public void setX2(n nVar, Dynamic dynamic) {
            nVar.setX2(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y1")
        public void setY1(n nVar, Dynamic dynamic) {
            nVar.setY1(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y2")
        public void setY2(n nVar, Dynamic dynamic) {
            nVar.setY2(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class LinearGradientManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public LinearGradientManager() {
            super(e.RNSVGLinearGradient, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "gradient")
        public void setGradient(o oVar, ReadableArray readableArray) {
            oVar.setGradient(readableArray);
        }

        @com.facebook.react.uimanager.e1.a(name = "gradientTransform")
        public void setGradientTransform(o oVar, ReadableArray readableArray) {
            oVar.setGradientTransform(readableArray);
        }

        @com.facebook.react.uimanager.e1.a(name = "gradientUnits")
        public void setGradientUnits(o oVar, int i) {
            oVar.setGradientUnits(i);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "x1")
        public void setX1(o oVar, Dynamic dynamic) {
            oVar.setX1(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x2")
        public void setX2(o oVar, Dynamic dynamic) {
            oVar.setX2(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y1")
        public void setY1(o oVar, Dynamic dynamic) {
            oVar.setY1(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y2")
        public void setY2(o oVar, Dynamic dynamic) {
            oVar.setY2(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class MarkerManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public MarkerManager() {
            super(e.RNSVGMarker);
        }

        @com.facebook.react.uimanager.e1.a(name = "align")
        public void setAlign(p pVar, String str) {
            pVar.setAlign(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "markerHeight")
        public void setMarkerHeight(p pVar, Dynamic dynamic) {
            pVar.setMarkerHeight(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "markerUnits")
        public void setMarkerUnits(p pVar, String str) {
            pVar.setMarkerUnits(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "markerWidth")
        public void setMarkerWidth(p pVar, Dynamic dynamic) {
            pVar.setMarkerWidth(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
        public void setMeetOrSlice(p pVar, int i) {
            pVar.setMeetOrSlice(i);
        }

        @com.facebook.react.uimanager.e1.a(name = "minX")
        public void setMinX(p pVar, float f2) {
            pVar.setMinX(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "minY")
        public void setMinY(p pVar, float f2) {
            pVar.setMinY(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "orient")
        public void setOrient(p pVar, String str) {
            pVar.setOrient(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "refX")
        public void setRefX(p pVar, Dynamic dynamic) {
            pVar.setRefX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "refY")
        public void setRefY(p pVar, Dynamic dynamic) {
            pVar.setRefY(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "vbHeight")
        public void setVbHeight(p pVar, float f2) {
            pVar.setVbHeight(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "vbWidth")
        public void setVbWidth(p pVar, float f2) {
            pVar.setVbWidth(f2);
        }
    }

    /* loaded from: classes.dex */
    static class MaskManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public MaskManager() {
            super(e.RNSVGMask);
        }

        @com.facebook.react.uimanager.e1.a(name = "height")
        public void setHeight(q qVar, Dynamic dynamic) {
            qVar.setHeight(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "maskContentUnits")
        public void setMaskContentUnits(q qVar, int i) {
            qVar.setMaskContentUnits(i);
        }

        @com.facebook.react.uimanager.e1.a(name = "maskTransform")
        public void setMaskTransform(q qVar, ReadableArray readableArray) {
            qVar.setMaskTransform(readableArray);
        }

        @com.facebook.react.uimanager.e1.a(name = "maskUnits")
        public void setMaskUnits(q qVar, int i) {
            qVar.setMaskUnits(i);
        }

        @com.facebook.react.uimanager.e1.a(name = "width")
        public void setWidth(q qVar, Dynamic dynamic) {
            qVar.setWidth(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x")
        public void setX(q qVar, Dynamic dynamic) {
            qVar.setX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y")
        public void setY(q qVar, Dynamic dynamic) {
            qVar.setY(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class PathViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public PathViewManager() {
            super(e.RNSVGPath, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "d")
        public void setD(t tVar, String str) {
            tVar.setD(str);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }
    }

    /* loaded from: classes.dex */
    static class PatternManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public PatternManager() {
            super(e.RNSVGPattern);
        }

        @com.facebook.react.uimanager.e1.a(name = "align")
        public void setAlign(u uVar, String str) {
            uVar.setAlign(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "height")
        public void setHeight(u uVar, Dynamic dynamic) {
            uVar.setHeight(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
        public void setMeetOrSlice(u uVar, int i) {
            uVar.setMeetOrSlice(i);
        }

        @com.facebook.react.uimanager.e1.a(name = "minX")
        public void setMinX(u uVar, float f2) {
            uVar.setMinX(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "minY")
        public void setMinY(u uVar, float f2) {
            uVar.setMinY(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "patternContentUnits")
        public void setPatternContentUnits(u uVar, int i) {
            uVar.setPatternContentUnits(i);
        }

        @com.facebook.react.uimanager.e1.a(name = "patternTransform")
        public void setPatternTransform(u uVar, ReadableArray readableArray) {
            uVar.setPatternTransform(readableArray);
        }

        @com.facebook.react.uimanager.e1.a(name = "patternUnits")
        public void setPatternUnits(u uVar, int i) {
            uVar.setPatternUnits(i);
        }

        @com.facebook.react.uimanager.e1.a(name = "vbHeight")
        public void setVbHeight(u uVar, float f2) {
            uVar.setVbHeight(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "vbWidth")
        public void setVbWidth(u uVar, float f2) {
            uVar.setVbWidth(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "width")
        public void setWidth(u uVar, Dynamic dynamic) {
            uVar.setWidth(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x")
        public void setX(u uVar, Dynamic dynamic) {
            uVar.setX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y")
        public void setY(u uVar, Dynamic dynamic) {
            uVar.setY(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class RadialGradientManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public RadialGradientManager() {
            super(e.RNSVGRadialGradient, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "cx")
        public void setCx(z zVar, Dynamic dynamic) {
            zVar.setCx(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "cy")
        public void setCy(z zVar, Dynamic dynamic) {
            zVar.setCy(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "fx")
        public void setFx(z zVar, Dynamic dynamic) {
            zVar.setFx(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "fy")
        public void setFy(z zVar, Dynamic dynamic) {
            zVar.setFy(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "gradient")
        public void setGradient(z zVar, ReadableArray readableArray) {
            zVar.setGradient(readableArray);
        }

        @com.facebook.react.uimanager.e1.a(name = "gradientTransform")
        public void setGradientTransform(z zVar, ReadableArray readableArray) {
            zVar.setGradientTransform(readableArray);
        }

        @com.facebook.react.uimanager.e1.a(name = "gradientUnits")
        public void setGradientUnits(z zVar, int i) {
            zVar.setGradientUnits(i);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "rx")
        public void setRx(z zVar, Dynamic dynamic) {
            zVar.setRx(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "ry")
        public void setRy(z zVar, Dynamic dynamic) {
            zVar.setRy(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class RectViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public RectViewManager() {
            super(e.RNSVGRect, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "height")
        public void setHeight(a0 a0Var, Dynamic dynamic) {
            a0Var.setHeight(dynamic);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "rx")
        public void setRx(a0 a0Var, Dynamic dynamic) {
            a0Var.setRx(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "ry")
        public void setRy(a0 a0Var, Dynamic dynamic) {
            a0Var.setRy(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "width")
        public void setWidth(a0 a0Var, Dynamic dynamic) {
            a0Var.setWidth(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x")
        public void setX(a0 a0Var, Dynamic dynamic) {
            a0Var.setX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y")
        public void setY(a0 a0Var, Dynamic dynamic) {
            a0Var.setY(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class SymbolManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public SymbolManager() {
            super(e.RNSVGSymbol);
        }

        @com.facebook.react.uimanager.e1.a(name = "align")
        public void setAlign(c0 c0Var, String str) {
            c0Var.setAlign(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "meetOrSlice")
        public void setMeetOrSlice(c0 c0Var, int i) {
            c0Var.setMeetOrSlice(i);
        }

        @com.facebook.react.uimanager.e1.a(name = "minX")
        public void setMinX(c0 c0Var, float f2) {
            c0Var.setMinX(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "minY")
        public void setMinY(c0 c0Var, float f2) {
            c0Var.setMinY(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "vbHeight")
        public void setVbHeight(c0 c0Var, float f2) {
            c0Var.setVbHeight(f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "vbWidth")
        public void setVbWidth(c0 c0Var, float f2) {
            c0Var.setVbWidth(f2);
        }
    }

    /* loaded from: classes.dex */
    static class TSpanViewManager extends TextViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TSpanViewManager() {
            super(e.RNSVGTSpan);
        }

        @com.facebook.react.uimanager.e1.a(name = "content")
        public void setContent(d0 d0Var, String str) {
            d0Var.setContent(str);
        }
    }

    /* loaded from: classes.dex */
    static class TextPathViewManager extends TextViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TextPathViewManager() {
            super(e.RNSVGTextPath);
        }

        @com.facebook.react.uimanager.e1.a(name = "href")
        public void setHref(e0 e0Var, String str) {
            e0Var.setHref(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "method")
        public void setMethod(e0 e0Var, String str) {
            e0Var.setMethod(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "midLine")
        public void setSharp(e0 e0Var, String str) {
            e0Var.setSharp(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "side")
        public void setSide(e0 e0Var, String str) {
            e0Var.setSide(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "spacing")
        public void setSpacing(e0 e0Var, String str) {
            e0Var.setSpacing(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "startOffset")
        public void setStartOffset(e0 e0Var, Dynamic dynamic) {
            e0Var.setStartOffset(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class TextViewManager extends GroupViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public TextViewManager() {
            super(e.RNSVGText);
        }

        TextViewManager(e eVar) {
            super(eVar);
        }

        @com.facebook.react.uimanager.e1.a(name = "baselineShift")
        public void setBaselineShift(q0 q0Var, Dynamic dynamic) {
            q0Var.setBaselineShift(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "dx")
        public void setDeltaX(q0 q0Var, Dynamic dynamic) {
            q0Var.setDeltaX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "dy")
        public void setDeltaY(q0 q0Var, Dynamic dynamic) {
            q0Var.setDeltaY(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "font")
        public void setFont(q0 q0Var, ReadableMap readableMap) {
            q0Var.setFont(readableMap);
        }

        @com.facebook.react.uimanager.e1.a(name = "inlineSize")
        public void setInlineSize(q0 q0Var, Dynamic dynamic) {
            q0Var.setInlineSize(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "lengthAdjust")
        public void setLengthAdjust(q0 q0Var, String str) {
            q0Var.setLengthAdjust(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "alignmentBaseline")
        public void setMethod(q0 q0Var, String str) {
            q0Var.setMethod(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "rotate")
        public void setRotate(q0 q0Var, Dynamic dynamic) {
            q0Var.setRotate(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "textLength")
        public void setTextLength(q0 q0Var, Dynamic dynamic) {
            q0Var.setTextLength(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "verticalAlign")
        public void setVerticalAlign(q0 q0Var, String str) {
            q0Var.setVerticalAlign(str);
        }

        @com.facebook.react.uimanager.e1.a(name = "x")
        public void setX(q0 q0Var, Dynamic dynamic) {
            q0Var.setPositionX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y")
        public void setY(q0 q0Var, Dynamic dynamic) {
            q0Var.setPositionY(dynamic);
        }
    }

    /* loaded from: classes.dex */
    static class UseViewManager extends RenderableViewManager {
        /* JADX INFO: Access modifiers changed from: package-private */
        public UseViewManager() {
            super(e.RNSVGUse, null);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, View view) {
            super.addEventEmitters(k0Var, (VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createShadowNodeInstance */
        public /* bridge */ /* synthetic */ com.facebook.react.uimanager.a0 mo328createShadowNodeInstance() {
            return super.mo328createShadowNodeInstance();
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        /* renamed from: createViewInstance */
        protected /* bridge */ /* synthetic */ View mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
            return super.mo345createViewInstance(k0Var);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
        protected /* bridge */ /* synthetic */ void onAfterUpdateTransaction(View view) {
            super.onAfterUpdateTransaction((VirtualView) view);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.ViewManager
        public /* bridge */ /* synthetic */ void onDropViewInstance(View view) {
            super.onDropViewInstance((VirtualView) view);
        }

        @com.facebook.react.uimanager.e1.a(name = "height")
        public void setHeight(r0 r0Var, Dynamic dynamic) {
            r0Var.setHeight(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "href")
        public void setHref(r0 r0Var, String str) {
            r0Var.setHref(str);
        }

        @Override // com.horcrux.svg.RenderableViewManager, com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
        @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
        public /* bridge */ /* synthetic */ void setOpacity(View view, float f2) {
            super.setOpacity((VirtualView) view, f2);
        }

        @com.facebook.react.uimanager.e1.a(name = "width")
        public void setWidth(r0 r0Var, Dynamic dynamic) {
            r0Var.setWidth(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "x")
        public void setX(r0 r0Var, Dynamic dynamic) {
            r0Var.setX(dynamic);
        }

        @com.facebook.react.uimanager.e1.a(name = "y")
        public void setY(r0 r0Var, Dynamic dynamic) {
            r0Var.setY(dynamic);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements ViewGroup.OnHierarchyChangeListener {
        a() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            if (view instanceof VirtualView) {
                RenderableViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            if (view instanceof VirtualView) {
                RenderableViewManager.this.invalidateSvgView((VirtualView) view);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class b {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f9513a;

        /* renamed from: b  reason: collision with root package name */
        static final /* synthetic */ int[] f9514b = new int[e.values().length];

        static {
            try {
                f9514b[e.RNSVGGroup.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9514b[e.RNSVGPath.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9514b[e.RNSVGCircle.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9514b[e.RNSVGEllipse.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9514b[e.RNSVGLine.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9514b[e.RNSVGRect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9514b[e.RNSVGText.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f9514b[e.RNSVGTSpan.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9514b[e.RNSVGTextPath.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9514b[e.RNSVGImage.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9514b[e.RNSVGClipPath.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9514b[e.RNSVGDefs.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f9514b[e.RNSVGUse.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f9514b[e.RNSVGSymbol.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f9514b[e.RNSVGLinearGradient.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f9514b[e.RNSVGRadialGradient.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f9514b[e.RNSVGPattern.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f9514b[e.RNSVGMask.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f9514b[e.RNSVGMarker.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f9514b[e.RNSVGForeignObject.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            f9513a = new int[ReadableType.values().length];
            try {
                f9513a[ReadableType.Number.ordinal()] = 1;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f9513a[ReadableType.String.ordinal()] = 2;
            } catch (NoSuchFieldError unused22) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c extends j.a {

        /* renamed from: f  reason: collision with root package name */
        final double[] f9515f = new double[4];

        /* renamed from: g  reason: collision with root package name */
        final double[] f9516g = new double[3];

        /* renamed from: h  reason: collision with root package name */
        final double[] f9517h = new double[3];
        final double[] i = new double[3];
        final double[] j = new double[3];

        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class d extends com.facebook.react.uimanager.i {
        d(RenderableViewManager renderableViewManager) {
        }

        @com.facebook.react.uimanager.e1.b(names = {"alignSelf", "alignItems", "collapsable", "flex", "flexBasis", "flexDirection", "flexGrow", "flexShrink", "flexWrap", "justifyContent", "overflow", "alignContent", "display", "position", "right", "top", "bottom", "left", "start", "end", "width", "height", "minWidth", "maxWidth", "minHeight", "maxHeight", "margin", "marginVertical", "marginHorizontal", "marginLeft", "marginRight", "marginTop", "marginBottom", "marginStart", "marginEnd", "padding", "paddingVertical", "paddingHorizontal", "paddingLeft", "paddingRight", "paddingTop", "paddingBottom", "paddingStart", "paddingEnd", "borderWidth", "borderStartWidth", "borderEndWidth", "borderTopWidth", "borderBottomWidth", "borderLeftWidth", "borderRightWidth"})
        public void ignoreLayoutProps(int i, Dynamic dynamic) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public enum e {
        RNSVGGroup,
        RNSVGPath,
        RNSVGText,
        RNSVGTSpan,
        RNSVGTextPath,
        RNSVGImage,
        RNSVGCircle,
        RNSVGEllipse,
        RNSVGLine,
        RNSVGRect,
        RNSVGClipPath,
        RNSVGDefs,
        RNSVGUse,
        RNSVGSymbol,
        RNSVGLinearGradient,
        RNSVGRadialGradient,
        RNSVGPattern,
        RNSVGMask,
        RNSVGMarker,
        RNSVGForeignObject
    }

    private RenderableViewManager(e eVar) {
        this.svgClass = eVar;
        this.mClassName = eVar.toString();
    }

    /* synthetic */ RenderableViewManager(e eVar, a aVar) {
        this(eVar);
    }

    private static void decomposeMatrix() {
        c cVar = sMatrixDecompositionContext;
        double[] dArr = cVar.f9515f;
        double[] dArr2 = cVar.f9516g;
        double[] dArr3 = cVar.f9517h;
        double[] dArr4 = cVar.i;
        double[] dArr5 = cVar.j;
        if (isZero(sTransformDecompositionArray[15])) {
            return;
        }
        double[][] dArr6 = (double[][]) Array.newInstance(double.class, 4, 4);
        double[] dArr7 = new double[16];
        for (int i = 0; i < 4; i++) {
            for (int i2 = 0; i2 < 4; i2++) {
                double[] dArr8 = sTransformDecompositionArray;
                int i3 = (i * 4) + i2;
                double d2 = dArr8[i3] / dArr8[15];
                dArr6[i][i2] = d2;
                if (i2 == 3) {
                    d2 = 0.0d;
                }
                dArr7[i3] = d2;
            }
        }
        dArr7[15] = 1.0d;
        if (isZero(com.facebook.react.uimanager.j.a(dArr7))) {
            return;
        }
        if (!isZero(dArr6[0][3]) || !isZero(dArr6[1][3]) || !isZero(dArr6[2][3])) {
            com.facebook.react.uimanager.j.b(new double[]{dArr6[0][3], dArr6[1][3], dArr6[2][3], dArr6[3][3]}, com.facebook.react.uimanager.j.d(com.facebook.react.uimanager.j.b(dArr7)), dArr);
        } else {
            dArr[2] = 0.0d;
            dArr[1] = 0.0d;
            dArr[0] = 0.0d;
            dArr[3] = 1.0d;
        }
        System.arraycopy(dArr6[3], 0, dArr4, 0, 3);
        double[][] dArr9 = (double[][]) Array.newInstance(double.class, 3, 3);
        for (int i4 = 0; i4 < 3; i4++) {
            dArr9[i4][0] = dArr6[i4][0];
            dArr9[i4][1] = dArr6[i4][1];
            dArr9[i4][2] = dArr6[i4][2];
        }
        dArr2[0] = com.facebook.react.uimanager.j.e(dArr9[0]);
        dArr9[0] = com.facebook.react.uimanager.j.i(dArr9[0], dArr2[0]);
        dArr3[0] = com.facebook.react.uimanager.j.b(dArr9[0], dArr9[1]);
        dArr9[1] = com.facebook.react.uimanager.j.a(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
        dArr3[0] = com.facebook.react.uimanager.j.b(dArr9[0], dArr9[1]);
        dArr9[1] = com.facebook.react.uimanager.j.a(dArr9[1], dArr9[0], 1.0d, -dArr3[0]);
        dArr2[1] = com.facebook.react.uimanager.j.e(dArr9[1]);
        dArr9[1] = com.facebook.react.uimanager.j.i(dArr9[1], dArr2[1]);
        dArr3[0] = dArr3[0] / dArr2[1];
        dArr3[1] = com.facebook.react.uimanager.j.b(dArr9[0], dArr9[2]);
        dArr9[2] = com.facebook.react.uimanager.j.a(dArr9[2], dArr9[0], 1.0d, -dArr3[1]);
        dArr3[2] = com.facebook.react.uimanager.j.b(dArr9[1], dArr9[2]);
        dArr9[2] = com.facebook.react.uimanager.j.a(dArr9[2], dArr9[1], 1.0d, -dArr3[2]);
        dArr2[2] = com.facebook.react.uimanager.j.e(dArr9[2]);
        dArr9[2] = com.facebook.react.uimanager.j.i(dArr9[2], dArr2[2]);
        dArr3[1] = dArr3[1] / dArr2[2];
        dArr3[2] = dArr3[2] / dArr2[2];
        if (com.facebook.react.uimanager.j.b(dArr9[0], com.facebook.react.uimanager.j.a(dArr9[1], dArr9[2])) < 0.0d) {
            for (int i5 = 0; i5 < 3; i5++) {
                dArr2[i5] = dArr2[i5] * (-1.0d);
                double[] dArr10 = dArr9[i5];
                dArr10[0] = dArr10[0] * (-1.0d);
                double[] dArr11 = dArr9[i5];
                dArr11[1] = dArr11[1] * (-1.0d);
                double[] dArr12 = dArr9[i5];
                dArr12[2] = dArr12[2] * (-1.0d);
            }
        }
        dArr5[0] = com.facebook.react.uimanager.j.c((-Math.atan2(dArr9[2][1], dArr9[2][2])) * 57.29577951308232d);
        dArr5[1] = com.facebook.react.uimanager.j.c((-Math.atan2(-dArr9[2][0], Math.sqrt((dArr9[2][1] * dArr9[2][1]) + (dArr9[2][2] * dArr9[2][2])))) * 57.29577951308232d);
        dArr5[2] = com.facebook.react.uimanager.j.c((-Math.atan2(dArr9[1][0], dArr9[0][0])) * 57.29577951308232d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static RenderableView getRenderableViewByTag(int i) {
        return mTagToRenderableView.get(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void invalidateSvgView(VirtualView virtualView) {
        SvgView svgView = virtualView.getSvgView();
        if (svgView != null) {
            svgView.invalidate();
        }
        if (virtualView instanceof q0) {
            ((q0) virtualView).h().clearChildCache();
        }
    }

    private static boolean isZero(double d2) {
        return !Double.isNaN(d2) && Math.abs(d2) < EPSILON;
    }

    private static void resetTransformProperty(View view) {
        view.setTranslationX(0.0f);
        view.setTranslationY(0.0f);
        view.setRotation(0.0f);
        view.setRotationX(0.0f);
        view.setRotationY(0.0f);
        view.setScaleX(1.0f);
        view.setScaleY(1.0f);
        view.setCameraDistance(0.0f);
    }

    static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setRenderableView(int i, RenderableView renderableView) {
        mTagToRenderableView.put(i, renderableView);
        Runnable runnable = mTagToRunnable.get(i);
        if (runnable != null) {
            runnable.run();
            mTagToRunnable.delete(i);
        }
    }

    private static void setTransformProperty(View view, ReadableArray readableArray) {
        com.facebook.react.uimanager.m0.a(readableArray, sTransformDecompositionArray);
        decomposeMatrix();
        view.setTranslationX(com.facebook.react.uimanager.q.b((float) sMatrixDecompositionContext.i[0]));
        view.setTranslationY(com.facebook.react.uimanager.q.b((float) sMatrixDecompositionContext.i[1]));
        view.setRotation((float) sMatrixDecompositionContext.j[2]);
        view.setRotationX((float) sMatrixDecompositionContext.j[0]);
        view.setRotationY((float) sMatrixDecompositionContext.j[1]);
        view.setScaleX((float) sMatrixDecompositionContext.f9516g[0]);
        view.setScaleY((float) sMatrixDecompositionContext.f9516g[1]);
        double[] dArr = sMatrixDecompositionContext.f9515f;
        if (dArr.length > 2) {
            float f2 = (float) dArr[2];
            if (f2 == 0.0f) {
                f2 = 7.8125E-4f;
            }
            float f3 = (-1.0f) / f2;
            float f4 = com.facebook.react.uimanager.c.a().density;
            view.setCameraDistance(f4 * f4 * f3 * CAMERA_DISTANCE_NORMALIZATION_MULTIPLIER);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(com.facebook.react.uimanager.k0 k0Var, VirtualView virtualView) {
        super.addEventEmitters(k0Var, (com.facebook.react.uimanager.k0) virtualView);
        virtualView.setOnHierarchyChangeListener(new a());
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    /* renamed from: createShadowNodeInstance  reason: collision with other method in class */
    public com.facebook.react.uimanager.i mo328createShadowNodeInstance() {
        return new d(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    /* renamed from: createViewInstance  reason: collision with other method in class */
    public VirtualView mo345createViewInstance(com.facebook.react.uimanager.k0 k0Var) {
        switch (b.f9514b[this.svgClass.ordinal()]) {
            case 1:
                return new l(k0Var);
            case 2:
                return new t(k0Var);
            case 3:
                return new com.horcrux.svg.b(k0Var);
            case 4:
                return new g(k0Var);
            case 5:
                return new n(k0Var);
            case 6:
                return new a0(k0Var);
            case 7:
                return new q0(k0Var);
            case 8:
                return new d0(k0Var);
            case 9:
                return new e0(k0Var);
            case 10:
                return new m(k0Var);
            case 11:
                return new com.horcrux.svg.c(k0Var);
            case 12:
                return new com.horcrux.svg.e(k0Var);
            case 13:
                return new r0(k0Var);
            case 14:
                return new c0(k0Var);
            case 15:
                return new o(k0Var);
            case 16:
                return new z(k0Var);
            case 17:
                return new u(k0Var);
            case 18:
                return new q(k0Var);
            case 19:
                return new p(k0Var);
            case 20:
                return new i(k0Var);
            default:
                throw new IllegalStateException("Unexpected type " + this.svgClass.toString());
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return this.mClassName;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public Class<d> getShadowNodeClass() {
        return d.class;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(VirtualView virtualView) {
        super.onAfterUpdateTransaction((RenderableViewManager) virtualView);
        invalidateSvgView(virtualView);
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(VirtualView virtualView) {
        super.onDropViewInstance((RenderableViewManager) virtualView);
        mTagToRenderableView.remove(virtualView.getId());
    }

    @com.facebook.react.uimanager.e1.a(name = "clipPath")
    public void setClipPath(VirtualView virtualView, String str) {
        virtualView.setClipPath(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "clipRule")
    public void setClipRule(VirtualView virtualView, int i) {
        virtualView.setClipRule(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "display")
    public void setDisplay(VirtualView virtualView, String str) {
        virtualView.setDisplay(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "fill")
    public void setFill(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setFill(dynamic);
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "fillOpacity")
    public void setFillOpacity(RenderableView renderableView, float f2) {
        renderableView.setFillOpacity(f2);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "fillRule")
    public void setFillRule(RenderableView renderableView, int i) {
        renderableView.setFillRule(i);
    }

    @com.facebook.react.uimanager.e1.a(name = "markerEnd")
    public void setMarkerEnd(VirtualView virtualView, String str) {
        virtualView.setMarkerEnd(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "markerMid")
    public void setMarkerMid(VirtualView virtualView, String str) {
        virtualView.setMarkerMid(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "markerStart")
    public void setMarkerStart(VirtualView virtualView, String str) {
        virtualView.setMarkerStart(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "mask")
    public void setMask(VirtualView virtualView, String str) {
        virtualView.setMask(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "matrix")
    public void setMatrix(VirtualView virtualView, Dynamic dynamic) {
        virtualView.setMatrix(dynamic);
    }

    @com.facebook.react.uimanager.e1.a(name = "name")
    public void setName(VirtualView virtualView, String str) {
        virtualView.setName(str);
    }

    @com.facebook.react.uimanager.e1.a(name = "onLayout")
    public void setOnLayout(VirtualView virtualView, boolean z) {
        virtualView.setOnLayout(z);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "opacity")
    public void setOpacity(VirtualView virtualView, float f2) {
        virtualView.setOpacity(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "pointerEvents")
    public void setPointerEvents(VirtualView virtualView, String str) {
        virtualView.setPointerEvents(str == null ? com.facebook.react.uimanager.r.AUTO : com.facebook.react.uimanager.r.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
    }

    @com.facebook.react.uimanager.e1.a(name = "propList")
    public void setPropList(RenderableView renderableView, ReadableArray readableArray) {
        renderableView.setPropList(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = "responsible")
    public void setResponsible(VirtualView virtualView, boolean z) {
        virtualView.setResponsible(z);
    }

    @com.facebook.react.uimanager.e1.a(name = "stroke")
    public void setStroke(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setStroke(dynamic);
    }

    @com.facebook.react.uimanager.e1.a(name = "strokeDasharray")
    public void setStrokeDasharray(RenderableView renderableView, ReadableArray readableArray) {
        renderableView.setStrokeDasharray(readableArray);
    }

    @com.facebook.react.uimanager.e1.a(name = "strokeDashoffset")
    public void setStrokeDashoffset(RenderableView renderableView, float f2) {
        renderableView.setStrokeDashoffset(f2);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinecap")
    public void setStrokeLinecap(RenderableView renderableView, int i) {
        renderableView.setStrokeLinecap(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultInt = 1, name = "strokeLinejoin")
    public void setStrokeLinejoin(RenderableView renderableView, int i) {
        renderableView.setStrokeLinejoin(i);
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 4.0f, name = "strokeMiterlimit")
    public void setStrokeMiterlimit(RenderableView renderableView, float f2) {
        renderableView.setStrokeMiterlimit(f2);
    }

    @com.facebook.react.uimanager.e1.a(defaultFloat = 1.0f, name = "strokeOpacity")
    public void setStrokeOpacity(RenderableView renderableView, float f2) {
        renderableView.setStrokeOpacity(f2);
    }

    @com.facebook.react.uimanager.e1.a(name = "strokeWidth")
    public void setStrokeWidth(RenderableView renderableView, Dynamic dynamic) {
        renderableView.setStrokeWidth(dynamic);
    }

    @com.facebook.react.uimanager.e1.a(name = "transform")
    public void setTransform(VirtualView virtualView, Dynamic dynamic) {
        if (dynamic.getType() != ReadableType.Array) {
            return;
        }
        ReadableArray asArray = dynamic.asArray();
        if (asArray == null) {
            resetTransformProperty(virtualView);
        } else {
            setTransformProperty(virtualView, asArray);
        }
        Matrix matrix = virtualView.getMatrix();
        virtualView.mTransform = matrix;
        virtualView.mTransformInvertible = matrix.invert(virtualView.mInvTransform);
    }

    @com.facebook.react.uimanager.e1.a(name = "vectorEffect")
    public void setVectorEffect(RenderableView renderableView, int i) {
        renderableView.setVectorEffect(i);
    }
}
