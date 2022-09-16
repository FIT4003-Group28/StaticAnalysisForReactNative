package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class YogaNodeJNIBase extends dna implements Cloneable {
    protected long a;
    private float[] arr;
    public Object b;
    private YogaNodeJNIBase c;
    private List d;
    private YogaMeasureFunction e;
    private boolean f;
    private int mLayoutDirection;

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNew());
    }

    private static dnc ae(long j) {
        return new dnc(Float.intBitsToFloat((int) j), YogaUnit.a((int) (j >> 32)));
    }

    @Override // defpackage.dna
    public final void A(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasis(this.a, f);
    }

    @Override // defpackage.dna
    public final void B(float f) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercent(this.a, f);
    }

    @Override // defpackage.dna
    public final void C(YogaFlexDirection yogaFlexDirection) {
        YogaNative.jni_YGNodeStyleSetFlexDirection(this.a, yogaFlexDirection.e);
    }

    @Override // defpackage.dna
    public final void D(float f) {
        YogaNative.jni_YGNodeStyleSetFlexGrow(this.a, f);
    }

    @Override // defpackage.dna
    public final void E(float f) {
        YogaNative.jni_YGNodeStyleSetFlexShrink(this.a, f);
    }

    @Override // defpackage.dna
    public final void F(float f) {
        YogaNative.jni_YGNodeStyleSetHeight(this.a, f);
    }

    @Override // defpackage.dna
    public final void G(float f) {
        YogaNative.jni_YGNodeStyleSetHeightPercent(this.a, f);
    }

    @Override // defpackage.dna
    public final void H(YogaJustify yogaJustify) {
        YogaNative.jni_YGNodeStyleSetJustifyContent(this.a, yogaJustify.g);
    }

    @Override // defpackage.dna
    public final void I(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMargin(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dna
    public final void J(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetMarginPercent(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dna
    public final void K(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeight(this.a, f);
    }

    @Override // defpackage.dna
    public final void L(float f) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercent(this.a, f);
    }

    @Override // defpackage.dna
    public final void M(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidth(this.a, f);
    }

    @Override // defpackage.dna
    public final void N(float f) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercent(this.a, f);
    }

    @Override // defpackage.dna
    public final void O(YogaMeasureFunction yogaMeasureFunction) {
        this.e = yogaMeasureFunction;
        YogaNative.jni_YGNodeSetHasMeasureFunc(this.a, true);
    }

    @Override // defpackage.dna
    public final void P(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeight(this.a, f);
    }

    @Override // defpackage.dna
    public final void Q(float f) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercent(this.a, f);
    }

    @Override // defpackage.dna
    public final void R(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidth(this.a, f);
    }

    @Override // defpackage.dna
    public final void S(float f) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercent(this.a, f);
    }

    @Override // defpackage.dna
    public final void T(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPadding(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dna
    public final void U(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPaddingPercent(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dna
    public final void V(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPosition(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dna
    public final void W(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetPositionPercent(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dna
    public final void X(YogaPositionType yogaPositionType) {
        YogaNative.jni_YGNodeStyleSetPositionType(this.a, yogaPositionType.c);
    }

    @Override // defpackage.dna
    public final void Y(float f) {
        YogaNative.jni_YGNodeStyleSetWidth(this.a, f);
    }

    @Override // defpackage.dna
    public final void Z(float f) {
        YogaNative.jni_YGNodeStyleSetWidthPercent(this.a, f);
    }

    @Override // defpackage.dna
    public final float a(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            int i2 = (int) fArr[0];
            if ((i2 & 4) != 4) {
                return 0.0f;
            }
            int i3 = 14 - (1 != (i2 & 1) ? 4 : 0);
            if ((i2 & 2) != 2) {
                i = 4;
            }
            int i4 = i3 - i;
            YogaEdge yogaEdge2 = YogaEdge.LEFT;
            int ordinal = yogaEdge.ordinal();
            if (ordinal == 0) {
                return this.arr[i4];
            }
            if (ordinal == 1) {
                return this.arr[i4 + 1];
            }
            if (ordinal == 2) {
                return this.arr[i4 + 2];
            }
            if (ordinal == 3) {
                return this.arr[i4 + 3];
            }
            if (ordinal == 4) {
                return i() == YogaDirection.RTL ? this.arr[i4 + 2] : this.arr[i4];
            } else if (ordinal != 5) {
                throw new IllegalArgumentException("Cannot get layout border of multi-edge shorthands");
            } else {
                return i() == YogaDirection.RTL ? this.arr[i4] : this.arr[i4 + 2];
            }
        }
        return 0.0f;
    }

    @Override // defpackage.dna
    public final void aa(YogaWrap yogaWrap) {
        YogaNative.jni_YGNodeStyleSetFlexWrap(this.a, yogaWrap.d);
    }

    @Override // defpackage.dna
    public final boolean ab() {
        float[] fArr = this.arr;
        return fArr != null ? (((int) fArr[0]) & 16) == 16 : this.f;
    }

    @Override // defpackage.dna
    public final void ac() {
        YogaNative.jni_YGNodeStyleSetFlex(this.a, 0.0f);
    }

    @Override // defpackage.dna
    /* renamed from: ad */
    public final YogaNodeJNIBase k() {
        try {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) super.clone();
            long jni_YGNodeClone = YogaNative.jni_YGNodeClone(this.a);
            yogaNodeJNIBase.c = null;
            yogaNodeJNIBase.a = jni_YGNodeClone;
            yogaNodeJNIBase.d = null;
            YogaNative.jni_YGNodeClearChildren(jni_YGNodeClone);
            return yogaNodeJNIBase;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // defpackage.dna
    public final float b() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    public final float baseline(float f, float f2) {
        throw null;
    }

    @Override // defpackage.dna
    public final float c(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr == null || (((int) fArr[0]) & 1) != 1) {
            return 0.0f;
        }
        YogaEdge yogaEdge2 = YogaEdge.LEFT;
        int ordinal = yogaEdge.ordinal();
        if (ordinal == 0) {
            return this.arr[6];
        }
        if (ordinal == 1) {
            return this.arr[7];
        }
        if (ordinal == 2) {
            return this.arr[8];
        }
        if (ordinal == 3) {
            return this.arr[9];
        }
        if (ordinal == 4) {
            return i() == YogaDirection.RTL ? this.arr[8] : this.arr[6];
        } else if (ordinal != 5) {
            throw new IllegalArgumentException("Cannot get layout margins of multi-edge shorthands");
        } else {
            return i() == YogaDirection.RTL ? this.arr[6] : this.arr[8];
        }
    }

    @Override // defpackage.dna
    public final float d(YogaEdge yogaEdge) {
        float[] fArr = this.arr;
        if (fArr != null) {
            int i = 0;
            int i2 = (int) fArr[0];
            if ((i2 & 2) != 2) {
                return 0.0f;
            }
            if (1 != (i2 & 1)) {
                i = 4;
            }
            int i3 = 10 - i;
            YogaEdge yogaEdge2 = YogaEdge.LEFT;
            int ordinal = yogaEdge.ordinal();
            if (ordinal == 0) {
                return this.arr[i3];
            }
            if (ordinal == 1) {
                return this.arr[i3 + 1];
            }
            if (ordinal == 2) {
                return this.arr[i3 + 2];
            }
            if (ordinal == 3) {
                return this.arr[i3 + 3];
            }
            if (ordinal == 4) {
                return i() == YogaDirection.RTL ? this.arr[i3 + 2] : this.arr[i3];
            } else if (ordinal != 5) {
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
            } else {
                return i() == YogaDirection.RTL ? this.arr[i3] : this.arr[i3 + 2];
            }
        }
        return 0.0f;
    }

    @Override // defpackage.dna
    public final float e() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // defpackage.dna
    public final float f() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // defpackage.dna
    public final float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // defpackage.dna
    public final int h() {
        List list = this.d;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    @Override // defpackage.dna
    public final YogaDirection i() {
        float[] fArr = this.arr;
        return YogaDirection.a(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // defpackage.dna
    public final YogaDirection j() {
        return YogaDirection.a(YogaNative.jni_YGNodeStyleGetDirection(this.a));
    }

    @Override // defpackage.dna
    public final /* bridge */ /* synthetic */ dna m() {
        return this.c;
    }

    @Override // defpackage.dna
    public final dnc n() {
        return ae(YogaNative.jni_YGNodeStyleGetHeight(this.a));
    }

    @Override // defpackage.dna
    public final dnc o() {
        return ae(YogaNative.jni_YGNodeStyleGetWidth(this.a));
    }

    @Override // defpackage.dna
    public final Object p() {
        return this.b;
    }

    @Override // defpackage.dna
    public final void q(dna dnaVar, int i) {
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) dnaVar;
        if (yogaNodeJNIBase.c == null) {
            if (this.d == null) {
                this.d = new ArrayList(4);
            }
            this.d.add(i, dnaVar);
            yogaNodeJNIBase.c = this;
            YogaNative.jni_YGNodeInsertChild(this.a, yogaNodeJNIBase.a, i);
            return;
        }
        throw new IllegalStateException("Child already has a parent, it must be removed first.");
    }

    @Override // defpackage.dna
    public final void r(float f, float f2) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i = 0; i < arrayList.size(); i++) {
            List list = ((YogaNodeJNIBase) arrayList.get(i)).d;
            if (list != null) {
                arrayList.addAll(list);
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i2 = 0; i2 < yogaNodeJNIBaseArr.length; i2++) {
            jArr[i2] = yogaNodeJNIBaseArr[i2].a;
        }
        YogaNative.jni_YGNodeCalculateLayout(this.a, f, f2, jArr, yogaNodeJNIBaseArr);
    }

    @Override // defpackage.dna
    public final void s() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f = false;
    }

    @Override // defpackage.dna
    public final void t(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignContent(this.a, yogaAlign.i);
    }

    @Override // defpackage.dna
    public final void u(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignItems(this.a, yogaAlign.i);
    }

    @Override // defpackage.dna
    public final void v(YogaAlign yogaAlign) {
        YogaNative.jni_YGNodeStyleSetAlignSelf(this.a, yogaAlign.i);
    }

    @Override // defpackage.dna
    public final void w(float f) {
        YogaNative.jni_YGNodeStyleSetAspectRatio(this.a, f);
    }

    @Override // defpackage.dna
    public final void x(YogaEdge yogaEdge, float f) {
        YogaNative.jni_YGNodeStyleSetBorder(this.a, yogaEdge.j, f);
    }

    @Override // defpackage.dna
    public final void y(Object obj) {
        this.b = obj;
    }

    @Override // defpackage.dna
    public final void z(YogaDirection yogaDirection) {
        YogaNative.jni_YGNodeStyleSetDirection(this.a, yogaDirection.d);
    }

    public YogaNodeJNIBase(long j) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f = true;
        if (j != 0) {
            this.a = j;
            return;
        }
        throw new IllegalStateException("Failed to allocate native memory");
    }

    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i) {
        List list = this.d;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i);
        this.d.add(i, yogaNodeJNIBase);
        yogaNodeJNIBase.c = this;
        return yogaNodeJNIBase.a;
    }

    @Override // defpackage.dna
    public final /* bridge */ /* synthetic */ dna l(int i) {
        List list = this.d;
        if (list == null) {
            throw new IllegalStateException("YogaNode does not have children");
        }
        return (YogaNodeJNIBase) list.get(i);
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [cyz, java.lang.Object, dbk] */
    public final long measure(float f, int i, float f2, int i2) {
        int C;
        int i3;
        float f3;
        float f4;
        int i4;
        if (this.e == null) {
            throw new RuntimeException("Measure function isn't defined!");
        }
        YogaMeasureMode a = YogaMeasureMode.a(i);
        YogaMeasureMode a2 = YogaMeasureMode.a(i2);
        ?? p = p();
        cyr W = p.W();
        cyv cyvVar = W.q;
        if (cyvVar != null && cyvVar.k()) {
            return 0L;
        }
        czz czzVar = (czz) p;
        cyr cyrVar = null;
        dae daeVar = czzVar.d ? czzVar.c : null;
        int z = czu.z(f, a);
        int z2 = czu.z(f2, a2);
        czzVar.e = z;
        czzVar.f = z2;
        cyv cyvVar2 = czzVar.a;
        if (cyr.A(cyvVar2, W) || p.aM()) {
            cyr V = p.V();
            if (W != V) {
                cyrVar = V;
            } else if (p.al() != null) {
                cyrVar = p.al().W();
            }
            if (cyrVar != null) {
                cyvVar2 = cyrVar.q;
            }
            dbk e = dbm.e(cyvVar2, p, z, z2);
            int H = e.H();
            C = e.C();
            i3 = H;
        } else if (daeVar == null || daeVar.e() != z || daeVar.d() != z2) {
            ddj ddjVar = new ddj(CellularSignalStrengthError.ERROR_NOT_SUPPORTED, CellularSignalStrengthError.ERROR_NOT_SUPPORTED);
            W.R(cyvVar, p, z, z2, ddjVar);
            int i5 = ddjVar.a;
            if (i5 < 0 || (i4 = ddjVar.b) < 0) {
                String valueOf = String.valueOf(W);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46);
                sb.append("MeasureOutput not set, ComponentLifecycle is: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
            dae daeVar2 = czzVar.c;
            if (daeVar2 != null) {
                daeVar2.kn(z);
                czzVar.c.kk(z2);
                czzVar.c.km(i5);
                czzVar.c.kl(i4);
            }
            C = i4;
            i3 = i5;
        } else {
            W.ao();
            i3 = (int) daeVar.b();
            C = (int) daeVar.a();
        }
        czzVar.g = i3;
        czzVar.h = C;
        return Float.floatToRawIntBits(f4) | (Float.floatToRawIntBits(f3) << 32);
    }
}
