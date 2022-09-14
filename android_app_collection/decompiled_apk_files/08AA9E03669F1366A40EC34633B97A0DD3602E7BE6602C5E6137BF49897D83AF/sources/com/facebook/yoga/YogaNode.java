package com.facebook.yoga;

import com.facebook.l.g;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
@com.facebook.k.a.a
/* loaded from: classes.dex */
public class YogaNode {

    /* renamed from: a  reason: collision with root package name */
    private YogaNode f4259a;

    /* renamed from: b  reason: collision with root package name */
    private List<YogaNode> f4260b;

    /* renamed from: c  reason: collision with root package name */
    private YogaMeasureFunction f4261c;

    /* renamed from: d  reason: collision with root package name */
    private YogaBaselineFunction f4262d;
    private long e;
    private Object f;
    private boolean g;
    @com.facebook.k.a.a
    private float mBorderBottom;
    @com.facebook.k.a.a
    private float mBorderLeft;
    @com.facebook.k.a.a
    private float mBorderRight;
    @com.facebook.k.a.a
    private float mBorderTop;
    @com.facebook.k.a.a
    private int mEdgeSetFlag;
    @com.facebook.k.a.a
    private boolean mHasNewLayout;
    @com.facebook.k.a.a
    private float mHeight;
    @com.facebook.k.a.a
    private int mLayoutDirection;
    @com.facebook.k.a.a
    private float mLeft;
    @com.facebook.k.a.a
    private float mMarginBottom;
    @com.facebook.k.a.a
    private float mMarginLeft;
    @com.facebook.k.a.a
    private float mMarginRight;
    @com.facebook.k.a.a
    private float mMarginTop;
    @com.facebook.k.a.a
    private float mPaddingBottom;
    @com.facebook.k.a.a
    private float mPaddingLeft;
    @com.facebook.k.a.a
    private float mPaddingRight;
    @com.facebook.k.a.a
    private float mPaddingTop;
    @com.facebook.k.a.a
    private float mTop;
    @com.facebook.k.a.a
    private float mWidth;

    private native void jni_YGNodeCalculateLayout(long j, float f, float f2);

    private native void jni_YGNodeCopyStyle(long j, long j2);

    private native void jni_YGNodeFree(long j);

    static native int jni_YGNodeGetInstanceCount();

    private native void jni_YGNodeInsertChild(long j, long j2, int i);

    private native boolean jni_YGNodeIsDirty(long j);

    private native void jni_YGNodeMarkDirty(long j);

    private native long jni_YGNodeNew();

    private native long jni_YGNodeNewWithConfig(long j);

    private native void jni_YGNodePrint(long j);

    private native void jni_YGNodeRemoveChild(long j, long j2);

    private native void jni_YGNodeReset(long j);

    private native void jni_YGNodeSetHasBaselineFunc(long j, boolean z);

    private native void jni_YGNodeSetHasMeasureFunc(long j, boolean z);

    private native int jni_YGNodeStyleGetAlignContent(long j);

    private native int jni_YGNodeStyleGetAlignItems(long j);

    private native int jni_YGNodeStyleGetAlignSelf(long j);

    private native float jni_YGNodeStyleGetAspectRatio(long j);

    private native float jni_YGNodeStyleGetBorder(long j, int i);

    private native int jni_YGNodeStyleGetDirection(long j);

    private native int jni_YGNodeStyleGetDisplay(long j);

    private native Object jni_YGNodeStyleGetFlexBasis(long j);

    private native int jni_YGNodeStyleGetFlexDirection(long j);

    private native float jni_YGNodeStyleGetFlexGrow(long j);

    private native float jni_YGNodeStyleGetFlexShrink(long j);

    private native Object jni_YGNodeStyleGetHeight(long j);

    private native int jni_YGNodeStyleGetJustifyContent(long j);

    private native Object jni_YGNodeStyleGetMargin(long j, int i);

    private native Object jni_YGNodeStyleGetMaxHeight(long j);

    private native Object jni_YGNodeStyleGetMaxWidth(long j);

    private native Object jni_YGNodeStyleGetMinHeight(long j);

    private native Object jni_YGNodeStyleGetMinWidth(long j);

    private native int jni_YGNodeStyleGetOverflow(long j);

    private native Object jni_YGNodeStyleGetPadding(long j, int i);

    private native Object jni_YGNodeStyleGetPosition(long j, int i);

    private native int jni_YGNodeStyleGetPositionType(long j);

    private native Object jni_YGNodeStyleGetWidth(long j);

    private native void jni_YGNodeStyleSetAlignContent(long j, int i);

    private native void jni_YGNodeStyleSetAlignItems(long j, int i);

    private native void jni_YGNodeStyleSetAlignSelf(long j, int i);

    private native void jni_YGNodeStyleSetAspectRatio(long j, float f);

    private native void jni_YGNodeStyleSetBorder(long j, int i, float f);

    private native void jni_YGNodeStyleSetDirection(long j, int i);

    private native void jni_YGNodeStyleSetDisplay(long j, int i);

    private native void jni_YGNodeStyleSetFlex(long j, float f);

    private native void jni_YGNodeStyleSetFlexBasis(long j, float f);

    private native void jni_YGNodeStyleSetFlexBasisAuto(long j);

    private native void jni_YGNodeStyleSetFlexBasisPercent(long j, float f);

    private native void jni_YGNodeStyleSetFlexDirection(long j, int i);

    private native void jni_YGNodeStyleSetFlexGrow(long j, float f);

    private native void jni_YGNodeStyleSetFlexShrink(long j, float f);

    private native void jni_YGNodeStyleSetFlexWrap(long j, int i);

    private native void jni_YGNodeStyleSetHeight(long j, float f);

    private native void jni_YGNodeStyleSetHeightAuto(long j);

    private native void jni_YGNodeStyleSetHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetJustifyContent(long j, int i);

    private native void jni_YGNodeStyleSetMargin(long j, int i, float f);

    private native void jni_YGNodeStyleSetMarginAuto(long j, int i);

    private native void jni_YGNodeStyleSetMarginPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetMaxHeight(long j, float f);

    private native void jni_YGNodeStyleSetMaxHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetMaxWidth(long j, float f);

    private native void jni_YGNodeStyleSetMaxWidthPercent(long j, float f);

    private native void jni_YGNodeStyleSetMinHeight(long j, float f);

    private native void jni_YGNodeStyleSetMinHeightPercent(long j, float f);

    private native void jni_YGNodeStyleSetMinWidth(long j, float f);

    private native void jni_YGNodeStyleSetMinWidthPercent(long j, float f);

    private native void jni_YGNodeStyleSetOverflow(long j, int i);

    private native void jni_YGNodeStyleSetPadding(long j, int i, float f);

    private native void jni_YGNodeStyleSetPaddingPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetPosition(long j, int i, float f);

    private native void jni_YGNodeStyleSetPositionPercent(long j, int i, float f);

    private native void jni_YGNodeStyleSetPositionType(long j, int i);

    private native void jni_YGNodeStyleSetWidth(long j, float f);

    private native void jni_YGNodeStyleSetWidthAuto(long j);

    private native void jni_YGNodeStyleSetWidthPercent(long j, float f);

    static {
        g.a("yoga");
    }

    public YogaNode() {
        this.mEdgeSetFlag = 0;
        this.g = false;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = BitmapDescriptorFactory.HUE_RED;
        this.mMarginTop = BitmapDescriptorFactory.HUE_RED;
        this.mMarginRight = BitmapDescriptorFactory.HUE_RED;
        this.mMarginBottom = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingLeft = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingTop = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingRight = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingBottom = BitmapDescriptorFactory.HUE_RED;
        this.mBorderLeft = BitmapDescriptorFactory.HUE_RED;
        this.mBorderTop = BitmapDescriptorFactory.HUE_RED;
        this.mBorderRight = BitmapDescriptorFactory.HUE_RED;
        this.mBorderBottom = BitmapDescriptorFactory.HUE_RED;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.e = jni_YGNodeNew();
        if (this.e == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    public YogaNode(YogaConfig yogaConfig) {
        this.mEdgeSetFlag = 0;
        this.g = false;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = BitmapDescriptorFactory.HUE_RED;
        this.mMarginTop = BitmapDescriptorFactory.HUE_RED;
        this.mMarginRight = BitmapDescriptorFactory.HUE_RED;
        this.mMarginBottom = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingLeft = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingTop = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingRight = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingBottom = BitmapDescriptorFactory.HUE_RED;
        this.mBorderLeft = BitmapDescriptorFactory.HUE_RED;
        this.mBorderTop = BitmapDescriptorFactory.HUE_RED;
        this.mBorderRight = BitmapDescriptorFactory.HUE_RED;
        this.mBorderBottom = BitmapDescriptorFactory.HUE_RED;
        this.mLayoutDirection = 0;
        this.mHasNewLayout = true;
        this.e = jni_YGNodeNewWithConfig(yogaConfig.f4223a);
        if (this.e == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
    }

    protected void finalize() {
        try {
            jni_YGNodeFree(this.e);
        } finally {
            super.finalize();
        }
    }

    public void a() {
        this.mEdgeSetFlag = 0;
        this.g = false;
        this.mHasNewLayout = true;
        this.mWidth = Float.NaN;
        this.mHeight = Float.NaN;
        this.mTop = Float.NaN;
        this.mLeft = Float.NaN;
        this.mMarginLeft = BitmapDescriptorFactory.HUE_RED;
        this.mMarginTop = BitmapDescriptorFactory.HUE_RED;
        this.mMarginRight = BitmapDescriptorFactory.HUE_RED;
        this.mMarginBottom = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingLeft = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingTop = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingRight = BitmapDescriptorFactory.HUE_RED;
        this.mPaddingBottom = BitmapDescriptorFactory.HUE_RED;
        this.mBorderLeft = BitmapDescriptorFactory.HUE_RED;
        this.mBorderTop = BitmapDescriptorFactory.HUE_RED;
        this.mBorderRight = BitmapDescriptorFactory.HUE_RED;
        this.mBorderBottom = BitmapDescriptorFactory.HUE_RED;
        this.mLayoutDirection = 0;
        this.f4261c = null;
        this.f4262d = null;
        this.f = null;
        jni_YGNodeReset(this.e);
    }

    public void a(YogaNode yogaNode, int i) {
        if (yogaNode.f4259a != null) {
            throw new IllegalStateException("Child already has a parent, it must be removed first.");
        }
        if (this.f4260b == null) {
            this.f4260b = new ArrayList(4);
        }
        this.f4260b.add(i, yogaNode);
        yogaNode.f4259a = this;
        jni_YGNodeInsertChild(this.e, yogaNode.e, i);
    }

    public YogaNode a(int i) {
        YogaNode remove = this.f4260b.remove(i);
        remove.f4259a = null;
        jni_YGNodeRemoveChild(this.e, remove.e);
        return remove;
    }

    public void a(float f, float f2) {
        jni_YGNodeCalculateLayout(this.e, f, f2);
    }

    public boolean b() {
        return this.mHasNewLayout;
    }

    public void c() {
        jni_YGNodeMarkDirty(this.e);
    }

    public boolean d() {
        return jni_YGNodeIsDirty(this.e);
    }

    public void e() {
        this.mHasNewLayout = false;
    }

    public void a(YogaDirection yogaDirection) {
        jni_YGNodeStyleSetDirection(this.e, yogaDirection.a());
    }

    public void a(YogaFlexDirection yogaFlexDirection) {
        jni_YGNodeStyleSetFlexDirection(this.e, yogaFlexDirection.a());
    }

    public void a(YogaJustify yogaJustify) {
        jni_YGNodeStyleSetJustifyContent(this.e, yogaJustify.a());
    }

    public void a(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignItems(this.e, yogaAlign.a());
    }

    public void b(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignSelf(this.e, yogaAlign.a());
    }

    public void c(YogaAlign yogaAlign) {
        jni_YGNodeStyleSetAlignContent(this.e, yogaAlign.a());
    }

    public void a(YogaPositionType yogaPositionType) {
        jni_YGNodeStyleSetPositionType(this.e, yogaPositionType.a());
    }

    public void a(YogaWrap yogaWrap) {
        jni_YGNodeStyleSetFlexWrap(this.e, yogaWrap.a());
    }

    public void a(YogaOverflow yogaOverflow) {
        jni_YGNodeStyleSetOverflow(this.e, yogaOverflow.a());
    }

    public void a(YogaDisplay yogaDisplay) {
        jni_YGNodeStyleSetDisplay(this.e, yogaDisplay.a());
    }

    public void a(float f) {
        jni_YGNodeStyleSetFlex(this.e, f);
    }

    public void b(float f) {
        jni_YGNodeStyleSetFlexGrow(this.e, f);
    }

    public void c(float f) {
        jni_YGNodeStyleSetFlexShrink(this.e, f);
    }

    public void d(float f) {
        jni_YGNodeStyleSetFlexBasis(this.e, f);
    }

    public void e(float f) {
        jni_YGNodeStyleSetFlexBasisPercent(this.e, f);
    }

    public void f() {
        jni_YGNodeStyleSetFlexBasisAuto(this.e);
    }

    public void a(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMargin(this.e, yogaEdge.a(), f);
    }

    public void b(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginPercent(this.e, yogaEdge.a(), f);
    }

    public void a(YogaEdge yogaEdge) {
        this.mEdgeSetFlag |= 1;
        jni_YGNodeStyleSetMarginAuto(this.e, yogaEdge.a());
    }

    public YogaValue b(YogaEdge yogaEdge) {
        if ((this.mEdgeSetFlag & 2) != 2) {
            return YogaValue.f4284a;
        }
        return (YogaValue) jni_YGNodeStyleGetPadding(this.e, yogaEdge.a());
    }

    public void c(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPadding(this.e, yogaEdge.a(), f);
    }

    public void d(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 2;
        jni_YGNodeStyleSetPaddingPercent(this.e, yogaEdge.a(), f);
    }

    public void e(YogaEdge yogaEdge, float f) {
        this.mEdgeSetFlag |= 4;
        jni_YGNodeStyleSetBorder(this.e, yogaEdge.a(), f);
    }

    public void f(YogaEdge yogaEdge, float f) {
        this.g = true;
        jni_YGNodeStyleSetPosition(this.e, yogaEdge.a(), f);
    }

    public void g(YogaEdge yogaEdge, float f) {
        this.g = true;
        jni_YGNodeStyleSetPositionPercent(this.e, yogaEdge.a(), f);
    }

    public YogaValue g() {
        return (YogaValue) jni_YGNodeStyleGetWidth(this.e);
    }

    public void f(float f) {
        jni_YGNodeStyleSetWidth(this.e, f);
    }

    public void g(float f) {
        jni_YGNodeStyleSetWidthPercent(this.e, f);
    }

    public void h() {
        jni_YGNodeStyleSetWidthAuto(this.e);
    }

    public YogaValue i() {
        return (YogaValue) jni_YGNodeStyleGetHeight(this.e);
    }

    public void h(float f) {
        jni_YGNodeStyleSetHeight(this.e, f);
    }

    public void i(float f) {
        jni_YGNodeStyleSetHeightPercent(this.e, f);
    }

    public void j() {
        jni_YGNodeStyleSetHeightAuto(this.e);
    }

    public void j(float f) {
        jni_YGNodeStyleSetMinWidth(this.e, f);
    }

    public void k(float f) {
        jni_YGNodeStyleSetMinWidthPercent(this.e, f);
    }

    public void l(float f) {
        jni_YGNodeStyleSetMinHeight(this.e, f);
    }

    public void m(float f) {
        jni_YGNodeStyleSetMinHeightPercent(this.e, f);
    }

    public void n(float f) {
        jni_YGNodeStyleSetMaxWidth(this.e, f);
    }

    public void o(float f) {
        jni_YGNodeStyleSetMaxWidthPercent(this.e, f);
    }

    public void p(float f) {
        jni_YGNodeStyleSetMaxHeight(this.e, f);
    }

    public void q(float f) {
        jni_YGNodeStyleSetMaxHeightPercent(this.e, f);
    }

    public void r(float f) {
        jni_YGNodeStyleSetAspectRatio(this.e, f);
    }

    public float k() {
        return this.mLeft;
    }

    public float l() {
        return this.mTop;
    }

    public float m() {
        return this.mWidth;
    }

    public float n() {
        return this.mHeight;
    }

    public float c(YogaEdge yogaEdge) {
        switch (yogaEdge) {
            case LEFT:
                return this.mPaddingLeft;
            case TOP:
                return this.mPaddingTop;
            case RIGHT:
                return this.mPaddingRight;
            case BOTTOM:
                return this.mPaddingBottom;
            case START:
                return o() == YogaDirection.RTL ? this.mPaddingRight : this.mPaddingLeft;
            case END:
                return o() == YogaDirection.RTL ? this.mPaddingLeft : this.mPaddingRight;
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    public YogaDirection o() {
        return YogaDirection.a(this.mLayoutDirection);
    }

    public void a(YogaMeasureFunction yogaMeasureFunction) {
        this.f4261c = yogaMeasureFunction;
        jni_YGNodeSetHasMeasureFunc(this.e, yogaMeasureFunction != null);
    }

    @com.facebook.k.a.a
    public final long measure(float f, int i, float f2, int i2) {
        if (!p()) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        return this.f4261c.measure(this, f, YogaMeasureMode.a(i), f2, YogaMeasureMode.a(i2));
    }

    public void a(YogaBaselineFunction yogaBaselineFunction) {
        this.f4262d = yogaBaselineFunction;
        jni_YGNodeSetHasBaselineFunc(this.e, yogaBaselineFunction != null);
    }

    @com.facebook.k.a.a
    public final float baseline(float f, float f2) {
        return this.f4262d.baseline(this, f, f2);
    }

    public boolean p() {
        return this.f4261c != null;
    }
}
