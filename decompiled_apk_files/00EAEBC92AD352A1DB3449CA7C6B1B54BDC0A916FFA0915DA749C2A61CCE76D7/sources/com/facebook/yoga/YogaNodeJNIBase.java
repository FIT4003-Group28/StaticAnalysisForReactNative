package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;
@c.d.l.a.a
/* loaded from: classes.dex */
public abstract class YogaNodeJNIBase extends p implements Cloneable {
    @c.d.l.a.a
    private float[] arr;

    /* renamed from: b  reason: collision with root package name */
    private YogaNodeJNIBase f6511b;

    /* renamed from: c  reason: collision with root package name */
    private List<YogaNodeJNIBase> f6512c;

    /* renamed from: d  reason: collision with root package name */
    private m f6513d;

    /* renamed from: e  reason: collision with root package name */
    private b f6514e;

    /* renamed from: f  reason: collision with root package name */
    protected long f6515f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f6516g;
    @c.d.l.a.a
    private int mLayoutDirection;

    /* loaded from: classes.dex */
    static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f6517a = new int[j.values().length];

        static {
            try {
                f6517a[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f6517a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f6517a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f6517a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f6517a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f6517a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    private YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f6516g = true;
        if (j != 0) {
            this.f6515f = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f6525a));
    }

    private static v a(long j) {
        return new v(Float.intBitsToFloat((int) j), (int) (j >> 32));
    }

    @c.d.l.a.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List<YogaNodeJNIBase> list = this.f6512c;
        if (list != null) {
            list.remove(i);
            this.f6512c.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f6511b = this;
            return yogaNodeJNIBase.f6515f;
        }
        throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
    }

    @Override // com.facebook.yoga.p
    public float a(j jVar) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            if ((((int) fArr[0]) & 2) != 2) {
                return 0.0f;
            }
            if ((((int) fArr[0]) & 1) != 1) {
                i = 4;
            }
            int i2 = 10 - i;
            switch (a.f6517a[jVar.ordinal()]) {
                case 1:
                    return this.arr[i2];
                case 2:
                    return this.arr[i2 + 1];
                case 3:
                    return this.arr[i2 + 2];
                case 4:
                    return this.arr[i2 + 3];
                case 5:
                    return c() == h.RTL ? this.arr[i2 + 2] : this.arr[i2];
                case 6:
                    return c() == h.RTL ? this.arr[i2] : this.arr[i2 + 2];
                default:
                    throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
            }
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    /* renamed from: a */
    public YogaNodeJNIBase mo250a(int i) {
        List<YogaNodeJNIBase> list = this.f6512c;
        if (list != null) {
            YogaNodeJNIBase remove = list.remove(i);
            remove.f6511b = null;
            YogaNative.jni_YGNodeRemoveChildJNI(this.f6515f, remove.f6515f);
            return remove;
        }
        throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
    }

    @Override // com.facebook.yoga.p
    public void a() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f6515f);
    }

    @Override // com.facebook.yoga.p
    public void a(float f2) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void a(float f2, float f3) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List<YogaNodeJNIBase> list = ((YogaNodeJNIBase) arrayList.get(i)).f6512c;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].f6515f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f6515f, f2, f3, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.p
    public void a(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f6515f, aVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f6515f, hVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f6515f, iVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f6515f, jVar.a(), f2);
    }

    @Override // com.facebook.yoga.p
    public void a(k kVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f6515f, kVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(l lVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f6515f, lVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(m mVar) {
        this.f6513d = mVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f6515f, mVar != null);
    }

    @Override // com.facebook.yoga.p
    public void a(p pVar, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) pVar;
        if (yogaNodeJNIBase.f6511b == null) {
            if (this.f6512c == null) {
                this.f6512c = new ArrayList(4);
            }
            this.f6512c.add(i, yogaNodeJNIBase);
            yogaNodeJNIBase.f6511b = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f6515f, yogaNodeJNIBase.f6515f, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    @Override // com.facebook.yoga.p
    public void a(s sVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f6515f, sVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(t tVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f6515f, tVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(w wVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f6515f, wVar.a());
    }

    @Override // com.facebook.yoga.p
    public void a(Object obj) {
    }

    @Override // com.facebook.yoga.p
    public v b() {
        return a(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f6515f));
    }

    @Override // com.facebook.yoga.p
    public void b(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void b(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f6515f, aVar.a());
    }

    @Override // com.facebook.yoga.p
    public void b(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f6515f, jVar.a());
    }

    @Override // com.facebook.yoga.p
    public void b(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f6515f, jVar.a(), f2);
    }

    @c.d.l.a.a
    public final float baseline(float f2, float f3) {
        return this.f6514e.a(this, f2, f3);
    }

    @Override // com.facebook.yoga.p
    public h c() {
        float[] fArr = this.arr;
        return h.a(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.p
    public void c(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void c(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f6515f, aVar.a());
    }

    @Override // com.facebook.yoga.p
    public void c(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f6515f, jVar.a(), f2);
    }

    @Override // com.facebook.yoga.p
    public float d() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void d(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void d(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f6515f, jVar.a(), f2);
    }

    @Override // com.facebook.yoga.p
    public float e() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void e(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void e(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f6515f, jVar.a(), f2);
    }

    @Override // com.facebook.yoga.p
    public float f() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void f(float f2) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void f(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f6515f, jVar.a(), f2);
    }

    @Override // com.facebook.yoga.p
    public float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.p
    public void g(float f2) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void g(j jVar, float f2) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f6515f, jVar.a(), f2);
    }

    @Override // com.facebook.yoga.p
    public v h() {
        return a(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f6515f));
    }

    @Override // com.facebook.yoga.p
    public void h(float f2) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void i(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public boolean i() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f6516g;
    }

    @Override // com.facebook.yoga.p
    public void j(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public boolean j() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f6515f);
    }

    @Override // com.facebook.yoga.p
    public void k(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public boolean k() {
        return this.f6513d != null;
    }

    @Override // com.facebook.yoga.p
    public void l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f6516g = false;
    }

    @Override // com.facebook.yoga.p
    public void l(float f2) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void m() {
        this.f6513d = null;
        this.f6514e = null;
        this.arr = null;
        this.f6516g = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f6515f);
    }

    @Override // com.facebook.yoga.p
    public void m(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f6515f, f2);
    }

    @c.d.l.a.a
    public final long measure(float f2, int i, float f3, int i2) {
        if (k()) {
            return this.f6513d.a(this, f2, n.a(i), f3, n.a(i2));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.p
    public void n() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f6515f);
    }

    @Override // com.facebook.yoga.p
    public void n(float f2) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void o() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f6515f);
    }

    @Override // com.facebook.yoga.p
    public void o(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void p() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f6515f);
    }

    @Override // com.facebook.yoga.p
    public void p(float f2) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void q(float f2) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f6515f, f2);
    }

    @Override // com.facebook.yoga.p
    public void r(float f2) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f6515f, f2);
    }
}
