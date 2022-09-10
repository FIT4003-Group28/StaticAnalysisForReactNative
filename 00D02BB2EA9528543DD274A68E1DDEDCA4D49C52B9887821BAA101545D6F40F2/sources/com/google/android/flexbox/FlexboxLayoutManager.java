package com.google.android.flexbox;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FlexboxLayoutManager extends abs implements cmpb, acg {
    private static final Rect e = new Rect();
    private final Context I;
    private View J;
    public int a;
    public aax d;
    private int f;
    private boolean h;
    private aca i;
    private aci j;
    private cmpj k;
    private aax m;
    private SavedState n;
    private int g = -1;
    public List<cmpc> b = new ArrayList();
    public final cmpf c = new cmpf(this);
    private cmph l = new cmph(this);
    private int o = -1;
    private int F = Integer.MIN_VALUE;
    private int G = Integer.MIN_VALUE;
    private SparseArray<View> H = new SparseArray<>();
    private int K = -1;
    private cmpd L = new cmpd();

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class LayoutParams extends abt implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new cmpi();
        private float a;
        private float b;
        private int g;
        private float h;
        private int i;
        private int j;
        private int k;
        private int l;
        private boolean m;

        public LayoutParams() {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int a() {
            return this.width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int b() {
            return this.height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int c() {
            return 1;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float d() {
            return this.a;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float e() {
            return this.b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int f() {
            return this.g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int g() {
            return this.i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int h() {
            return this.j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int i() {
            return this.k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int j() {
            return this.l;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final boolean k() {
            return this.m;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final float l() {
            return this.h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int m() {
            return this.leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int n() {
            return this.topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int o() {
            return this.rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public final int p() {
            return this.bottomMargin;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeFloat(this.a);
            parcel.writeFloat(this.b);
            parcel.writeInt(this.g);
            parcel.writeFloat(this.h);
            parcel.writeInt(this.i);
            parcel.writeInt(this.j);
            parcel.writeInt(this.k);
            parcel.writeInt(this.l);
            parcel.writeByte(this.m ? (byte) 1 : (byte) 0);
            parcel.writeInt(this.bottomMargin);
            parcel.writeInt(this.leftMargin);
            parcel.writeInt(this.rightMargin);
            parcel.writeInt(this.topMargin);
            parcel.writeInt(this.height);
            parcel.writeInt(this.width);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
        }

        public LayoutParams(Parcel parcel) {
            super(-2, -2);
            this.a = 0.0f;
            this.b = 1.0f;
            this.g = -1;
            this.h = -1.0f;
            this.k = 16777215;
            this.l = 16777215;
            this.a = parcel.readFloat();
            this.b = parcel.readFloat();
            this.g = parcel.readInt();
            this.h = parcel.readFloat();
            this.i = parcel.readInt();
            this.j = parcel.readInt();
            this.k = parcel.readInt();
            this.l = parcel.readInt();
            this.m = parcel.readByte() != 0;
            this.bottomMargin = parcel.readInt();
            this.leftMargin = parcel.readInt();
            this.rightMargin = parcel.readInt();
            this.topMargin = parcel.readInt();
            this.height = parcel.readInt();
            this.width = parcel.readInt();
        }
    }

    /* compiled from: PG */
    /* loaded from: classes5.dex */
    public class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new cmpk();
        public int a;
        public int b;

        public SavedState() {
        }

        public SavedState(Parcel parcel) {
            this.a = parcel.readInt();
            this.b = parcel.readInt();
        }

        public SavedState(SavedState savedState) {
            this.a = savedState.a;
            this.b = savedState.b;
        }

        public final void a() {
            this.a = -1;
        }

        public final boolean b(int i) {
            int i2 = this.a;
            return i2 >= 0 && i2 < i;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "SavedState{mAnchorPosition=" + this.a + ", mAnchorOffset=" + this.b + '}';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.a);
            parcel.writeInt(this.b);
        }
    }

    public FlexboxLayoutManager(Context context) {
        if (this.a != 1) {
            aE();
            bK();
            this.a = 1;
            this.d = null;
            this.m = null;
            as();
        }
        if (this.f != 4) {
            aE();
            bK();
            this.f = 4;
            as();
        }
        this.w = true;
        this.I = context;
    }

    private final void M(int i) {
        int J = J();
        int K = K();
        if (i >= K) {
            return;
        }
        int aJ = aJ();
        this.c.l(aJ);
        this.c.k(aJ);
        this.c.m(aJ);
        if (i >= this.c.b.length) {
            return;
        }
        this.K = i;
        View ab = ab();
        if (ab == null) {
            return;
        }
        if (J <= i && i <= K) {
            return;
        }
        this.o = bm(ab);
        this.F = this.d.h(ab) - this.d.d();
    }

    private final int N(int i, aca acaVar, aci aciVar, boolean z) {
        int d;
        int d2 = i - this.d.d();
        if (d2 > 0) {
            int i2 = -an(d2, acaVar, aciVar);
            int i3 = i + i2;
            if (!z || (d = i3 - this.d.d()) <= 0) {
                return i2;
            }
            this.d.c(-d);
            return i2 - d;
        }
        return 0;
    }

    private final int P(int i, aca acaVar, aci aciVar, boolean z) {
        int a;
        int a2 = this.d.a() - i;
        if (a2 > 0) {
            int i2 = -an(-a2, acaVar, aciVar);
            int i3 = i + i2;
            if (!z || (a = this.d.a() - i3) <= 0) {
                return i2;
            }
            this.d.c(a);
            return a + i2;
        }
        return 0;
    }

    private final View W(int i) {
        View Z = Z(0, aJ(), i);
        if (Z == null) {
            return null;
        }
        int i2 = this.c.b[bm(Z)];
        if (i2 != -1) {
            return bE(Z, this.b.get(i2));
        }
        return null;
    }

    private final View X(int i) {
        View Z = Z(aJ() - 1, -1, i);
        if (Z == null) {
            return null;
        }
        return bF(Z, this.b.get(this.c.b[bm(Z)]));
    }

    private final View Z(int i, int i2, int i3) {
        ak();
        al();
        int d = this.d.d();
        int a = this.d.a();
        int i4 = i2 > i ? 1 : -1;
        View view = null;
        View view2 = null;
        while (i != i2) {
            View aK = aK(i);
            int bm = bm(aK);
            if (bm >= 0 && bm < i3) {
                if (((abt) aK.getLayoutParams()).RU()) {
                    if (view2 == null) {
                        view2 = aK;
                    }
                } else if (this.d.h(aK) >= d && this.d.g(aK) <= a) {
                    return aK;
                } else {
                    if (view == null) {
                        view = aK;
                    }
                }
            }
            i += i4;
        }
        return view != null ? view : view2;
    }

    private final View ab() {
        return aK(0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c9, code lost:
        if (bJ(r12.getHeight(), r4, ((defpackage.abt) r5).height) != false) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int ac(defpackage.aca r26, defpackage.aci r27, defpackage.cmpj r28) {
        /*
            Method dump skipped, instructions count: 406
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.ac(aca, aci, cmpj):int");
    }

    private final void ad(aca acaVar, cmpj cmpjVar) {
        int aJ;
        if (cmpjVar.j) {
            if (cmpjVar.i != -1) {
                if (cmpjVar.f < 0 || (aJ = aJ()) == 0) {
                    return;
                }
                int i = this.c.b[bm(aK(0))];
                if (i == -1) {
                    return;
                }
                cmpc cmpcVar = this.b.get(i);
                int i2 = 0;
                int i3 = -1;
                while (i2 < aJ) {
                    View aK = aK(i2);
                    if (this.d.g(aK) > cmpjVar.f) {
                        break;
                    }
                    if (cmpcVar.p == bm(aK)) {
                        if (i >= this.b.size() - 1) {
                            break;
                        }
                        i += cmpjVar.i;
                        cmpcVar = this.b.get(i);
                        i3 = i2;
                    }
                    i2++;
                }
                i2 = i3;
                ae(acaVar, 0, i2);
            } else if (cmpjVar.f < 0) {
            } else {
                this.d.b();
                int i4 = cmpjVar.f;
                int aJ2 = aJ();
                if (aJ2 == 0) {
                    return;
                }
                int i5 = aJ2 - 1;
                int i6 = this.c.b[bm(aK(i5))];
                if (i6 == -1) {
                    return;
                }
                cmpc cmpcVar2 = this.b.get(i6);
                int i7 = i5;
                while (true) {
                    if (i7 < 0) {
                        break;
                    }
                    View aK2 = aK(i7);
                    if (this.d.h(aK2) < this.d.b() - cmpjVar.f) {
                        break;
                    }
                    if (cmpcVar2.o == bm(aK2)) {
                        if (i6 <= 0) {
                            aJ2 = i7;
                            break;
                        }
                        i6 += cmpjVar.i;
                        cmpcVar2 = this.b.get(i6);
                        aJ2 = i7;
                    }
                    i7--;
                }
                ae(acaVar, aJ2, i5);
            }
        }
    }

    private final void ae(aca acaVar, int i, int i2) {
        while (i2 >= i) {
            aI(i2, acaVar);
            i2--;
        }
    }

    private final void af(cmph cmphVar, boolean z, boolean z2) {
        int i;
        if (z2) {
            ah();
        } else {
            this.k.b = false;
        }
        this.k.a = this.d.a() - cmphVar.c;
        cmpj cmpjVar = this.k;
        cmpjVar.d = cmphVar.a;
        cmpjVar.h = 1;
        cmpj cmpjVar2 = this.k;
        cmpjVar2.i = 1;
        cmpjVar2.e = cmphVar.c;
        cmpjVar2.f = Integer.MIN_VALUE;
        cmpjVar2.c = cmphVar.b;
        if (!z || this.b.size() <= 1 || (i = cmphVar.b) < 0 || i >= this.b.size() - 1) {
            return;
        }
        cmpj cmpjVar3 = this.k;
        cmpjVar3.c++;
        cmpjVar3.d += this.b.get(cmphVar.b).h;
    }

    private final void ag(cmph cmphVar, boolean z, boolean z2) {
        cmpj cmpjVar;
        if (z2) {
            ah();
        } else {
            this.k.b = false;
        }
        this.k.a = cmphVar.c - this.d.d();
        cmpj cmpjVar2 = this.k;
        cmpjVar2.d = cmphVar.a;
        cmpjVar2.h = 1;
        cmpj cmpjVar3 = this.k;
        cmpjVar3.i = -1;
        cmpjVar3.e = cmphVar.c;
        cmpjVar3.f = Integer.MIN_VALUE;
        cmpjVar3.c = cmphVar.b;
        if (!z || cmphVar.b <= 0) {
            return;
        }
        int size = this.b.size();
        int i = cmphVar.b;
        if (size <= i) {
            return;
        }
        cmpjVar.c--;
        this.k.d -= this.b.get(i).h;
    }

    private final void ah() {
        int i = this.C;
        cmpj cmpjVar = this.k;
        boolean z = true;
        if (i != 0 && i != Integer.MIN_VALUE) {
            z = false;
        }
        cmpjVar.b = z;
    }

    private final void ak() {
        if (this.d == null) {
            if (this.a == 0) {
                this.d = aax.r(this);
                this.m = aax.s(this);
                return;
            }
            this.d = aax.s(this);
            this.m = aax.r(this);
        }
    }

    private final void al() {
        if (this.k == null) {
            this.k = new cmpj();
        }
    }

    private final int an(int i, aca acaVar, aci aciVar) {
        if (aJ() == 0 || i == 0) {
            return 0;
        }
        ak();
        this.k.j = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        this.k.i = i2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.D, this.B);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(this.E, this.C);
        if (i2 == 1) {
            View aK = aK(aJ() - 1);
            this.k.e = this.d.g(aK);
            int bm = bm(aK);
            View bF = bF(aK, this.b.get(this.c.b[bm]));
            this.k.h = 1;
            cmpj cmpjVar = this.k;
            int i3 = bm + cmpjVar.h;
            cmpjVar.d = i3;
            int[] iArr = this.c.b;
            if (iArr.length <= i3) {
                cmpjVar.c = -1;
            } else {
                cmpjVar.c = iArr[i3];
            }
            cmpjVar.e = this.d.g(bF);
            this.k.f = this.d.g(bF) - this.d.a();
            int i4 = this.k.c;
            if ((i4 == -1 || i4 > this.b.size() - 1) && this.k.d <= a()) {
                int i5 = abs - this.k.f;
                this.L.a();
                if (i5 > 0) {
                    this.c.b(this.L, makeMeasureSpec, makeMeasureSpec2, i5, this.k.d, this.b);
                    this.c.e(makeMeasureSpec, makeMeasureSpec2, this.k.d);
                    this.c.h(this.k.d);
                }
            }
        } else {
            View aK2 = aK(0);
            this.k.e = this.d.h(aK2);
            int bm2 = bm(aK2);
            View bE = bE(aK2, this.b.get(this.c.b[bm2]));
            this.k.h = 1;
            int i6 = this.c.b[bm2];
            if (i6 == -1) {
                i6 = 0;
            }
            if (i6 > 0) {
                this.k.d = bm2 - this.b.get(i6 - 1).h;
            } else {
                this.k.d = -1;
            }
            cmpj cmpjVar2 = this.k;
            cmpjVar2.c = i6 > 0 ? i6 - 1 : 0;
            cmpjVar2.e = this.d.h(bE);
            this.k.f = (-this.d.h(bE)) + this.d.d();
        }
        cmpj cmpjVar3 = this.k;
        int i7 = cmpjVar3.f;
        cmpjVar3.a = abs - i7;
        int ac = i7 + ac(acaVar, aciVar, cmpjVar3);
        if (ac < 0) {
            return 0;
        }
        int i8 = abs > ac ? i2 * ac : i;
        this.d.c(-i8);
        this.k.g = i8;
        return i8;
    }

    private final View bE(View view, cmpc cmpcVar) {
        int i = cmpcVar.h;
        for (int i2 = 1; i2 < i; i2++) {
            View aK = aK(i2);
            if (aK != null && aK.getVisibility() != 8 && this.d.h(view) > this.d.h(aK)) {
                view = aK;
            }
        }
        return view;
    }

    private final View bF(View view, cmpc cmpcVar) {
        int aJ = (aJ() - cmpcVar.h) - 1;
        for (int aJ2 = aJ() - 2; aJ2 > aJ; aJ2--) {
            View aK = aK(aJ2);
            if (aK != null && aK.getVisibility() != 8 && this.d.g(view) < this.d.g(aK)) {
                view = aK;
            }
        }
        return view;
    }

    private final int bG(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        int b = aciVar.b();
        ak();
        View W = W(b);
        View X = X(b);
        if (aciVar.b() == 0 || W == null || X == null) {
            return 0;
        }
        return Math.min(this.d.k(), this.d.g(X) - this.d.h(W));
    }

    private final int bH(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        int b = aciVar.b();
        View W = W(b);
        View X = X(b);
        if (aciVar.b() != 0 && W != null && X != null) {
            int bm = bm(W);
            int bm2 = bm(X);
            int abs = Math.abs(this.d.g(X) - this.d.h(W));
            int[] iArr = this.c.b;
            int i = iArr[bm];
            if (i != 0 && i != -1) {
                return Math.round((i * (abs / ((iArr[bm2] - i) + 1))) + (this.d.d() - this.d.h(W)));
            }
        }
        return 0;
    }

    private final int bI(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        int b = aciVar.b();
        View W = W(b);
        View X = X(b);
        if (aciVar.b() == 0 || W == null || X == null) {
            return 0;
        }
        int J = J();
        return (int) ((Math.abs(this.d.g(X) - this.d.h(W)) / ((K() - J) + 1)) * aciVar.b());
    }

    private static boolean bJ(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 <= 0 || i == i3) {
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            } else if (mode == 0) {
                return true;
            } else {
                return mode == 1073741824 && size == i;
            }
        }
        return false;
    }

    private final void bK() {
        this.b.clear();
        this.l.a();
        this.l.d = 0;
    }

    private final View bL(int i, int i2) {
        int i3 = i;
        int i4 = i2 > i3 ? 1 : -1;
        while (i3 != i2) {
            View aK = aK(i3);
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int i5 = this.D;
            int paddingRight = getPaddingRight();
            int paddingBottom = this.E - getPaddingBottom();
            int bB = bB(aK);
            int i6 = ((abt) aK.getLayoutParams()).leftMargin;
            int bD = bD(aK) - ((abt) aK.getLayoutParams()).topMargin;
            int bC = bC(aK) + ((abt) aK.getLayoutParams()).rightMargin;
            int bA = bA(aK) + ((abt) aK.getLayoutParams()).bottomMargin;
            int i7 = i5 - paddingRight;
            boolean z = false;
            boolean z2 = bB - i6 >= i7 || bC >= paddingLeft;
            if (bD >= paddingBottom || bA >= paddingTop) {
                z = true;
            }
            if (z2 && z) {
                return aK;
            }
            i3 += i4;
        }
        return null;
    }

    @Override // defpackage.cmpb
    public final void A(cmpc cmpcVar) {
    }

    @Override // defpackage.abs
    public final Parcelable B() {
        SavedState savedState = this.n;
        if (savedState != null) {
            return new SavedState(savedState);
        }
        SavedState savedState2 = new SavedState();
        if (aJ() <= 0) {
            savedState2.a();
        } else {
            View ab = ab();
            savedState2.a = bm(ab);
            savedState2.b = this.d.h(ab) - this.d.d();
        }
        return savedState2;
    }

    @Override // defpackage.abs
    public final void C(Parcelable parcelable) {
        if (parcelable instanceof SavedState) {
            this.n = (SavedState) parcelable;
            as();
        }
    }

    @Override // defpackage.abs
    public final boolean D() {
        return this.D > this.J.getWidth();
    }

    @Override // defpackage.abs
    public final boolean E() {
        return true;
    }

    @Override // defpackage.cmpb
    public final int F() {
        return this.g;
    }

    @Override // defpackage.cmpb
    public final List<cmpc> G() {
        return this.b;
    }

    @Override // defpackage.cmpb
    public final void H(int i, View view) {
        this.H.put(i, view);
    }

    public final int J() {
        View bL = bL(0, aJ());
        if (bL == null) {
            return -1;
        }
        return bm(bL);
    }

    public final int K() {
        View bL = bL(aJ() - 1, -1);
        if (bL == null) {
            return -1;
        }
        return bm(bL);
    }

    @Override // defpackage.acg
    public final PointF L(int i) {
        if (aJ() == 0) {
            return null;
        }
        return new PointF(0.0f, i < bm(aK(0)) ? -1 : 1);
    }

    @Override // defpackage.abs
    public final void O(int i) {
        this.o = i;
        this.F = Integer.MIN_VALUE;
        SavedState savedState = this.n;
        if (savedState != null) {
            savedState.a();
        }
        as();
    }

    @Override // defpackage.abs
    public final int Q(aci aciVar) {
        bH(aciVar);
        return bH(aciVar);
    }

    @Override // defpackage.abs
    public final int R(aci aciVar) {
        return bH(aciVar);
    }

    @Override // defpackage.abs
    public final int S(aci aciVar) {
        return bG(aciVar);
    }

    @Override // defpackage.abs
    public final int T(aci aciVar) {
        return bG(aciVar);
    }

    @Override // defpackage.abs
    public final int U(aci aciVar) {
        return bI(aciVar);
    }

    @Override // defpackage.abs
    public final int V(aci aciVar) {
        return bI(aciVar);
    }

    @Override // defpackage.cmpb
    public final int a() {
        return this.j.b();
    }

    @Override // defpackage.abs
    public final void aX(abg abgVar, abg abgVar2) {
        aE();
    }

    @Override // defpackage.abs
    public final void am(RecyclerView recyclerView) {
    }

    @Override // defpackage.abs
    public final void ao(RecyclerView recyclerView, int i) {
        aah aahVar = new aah(recyclerView.getContext());
        aahVar.g = i;
        aw(aahVar);
    }

    @Override // defpackage.abs
    public final void av(RecyclerView recyclerView) {
        this.J = (View) recyclerView.getParent();
    }

    @Override // defpackage.cmpb
    public final View b(int i) {
        View view = this.H.get(i);
        return view != null ? view : this.i.d(i);
    }

    @Override // defpackage.abs
    public final void bv(int i) {
        M(i);
    }

    @Override // defpackage.cmpb
    public final View c(int i) {
        return b(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x031c  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x0334  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.abs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(defpackage.aca r19, defpackage.aci r20) {
        /*
            Method dump skipped, instructions count: 873
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.d(aca, aci):void");
    }

    @Override // defpackage.abs
    public final void e(aci aciVar) {
        this.n = null;
        this.o = -1;
        this.F = Integer.MIN_VALUE;
        this.K = -1;
        this.l.a();
        this.H.clear();
    }

    @Override // defpackage.abs
    public final abt f() {
        return new LayoutParams();
    }

    @Override // defpackage.abs
    public final abt g(Context context, AttributeSet attributeSet) {
        return new LayoutParams(context, attributeSet);
    }

    @Override // defpackage.cmpb
    public final int h() {
        return 0;
    }

    @Override // defpackage.abs
    public final boolean i(abt abtVar) {
        return abtVar instanceof LayoutParams;
    }

    @Override // defpackage.cmpb
    public final int j() {
        return this.a;
    }

    @Override // defpackage.cmpb
    public final int k() {
        return 5;
    }

    @Override // defpackage.cmpb
    public final int l() {
        return this.f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0034, code lost:
        if ((r4 + r3) > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        if ((r4 + r3) < 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
        r3 = -r4;
     */
    @Override // defpackage.abs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int m(int r3, defpackage.aca r4, defpackage.aci r5) {
        /*
            r2 = this;
            int r4 = r2.aJ()
            r5 = 0
            if (r4 == 0) goto L4e
            if (r3 != 0) goto La
            goto L4e
        La:
            r2.ak()
            android.view.View r4 = r2.J
            int r4 = r4.getWidth()
            int r5 = r2.D
            int r0 = r2.ay()
            r1 = 1
            if (r0 != r1) goto L37
            int r0 = java.lang.Math.abs(r3)
            if (r3 >= 0) goto L2e
            cmph r3 = r2.l
            int r3 = r3.d
            int r5 = r5 + r3
            int r5 = r5 - r4
            int r3 = java.lang.Math.min(r5, r0)
            int r3 = -r3
            goto L4f
        L2e:
            cmph r4 = r2.l
            int r4 = r4.d
            int r5 = r4 + r3
            if (r5 <= 0) goto L4f
            goto L4c
        L37:
            if (r3 <= 0) goto L44
            cmph r0 = r2.l
            int r0 = r0.d
            int r5 = r5 - r0
            int r5 = r5 - r4
            int r3 = java.lang.Math.min(r5, r3)
            goto L4f
        L44:
            cmph r4 = r2.l
            int r4 = r4.d
            int r5 = r4 + r3
            if (r5 >= 0) goto L4f
        L4c:
            int r3 = -r4
            goto L4f
        L4e:
            r3 = 0
        L4f:
            cmph r4 = r2.l
            int r5 = r4.d
            int r5 = r5 + r3
            r4.d = r5
            aax r4 = r2.m
            int r5 = -r3
            r4.c(r5)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.flexbox.FlexboxLayoutManager.m(int, aca, aci):int");
    }

    @Override // defpackage.abs
    public final int n(int i, aca acaVar, aci aciVar) {
        int an = an(i, acaVar, aciVar);
        this.H.clear();
        return an;
    }

    @Override // defpackage.cmpb
    public final boolean o() {
        return true;
    }

    @Override // defpackage.cmpb
    public final int p(View view, int i, int i2) {
        return bl(view) + bn(view);
    }

    @Override // defpackage.cmpb
    public final int q(View view) {
        return bo(view) + bi(view);
    }

    @Override // defpackage.cmpb
    public final int r(int i, int i2, int i3) {
        return aU(this.D, this.B, i2, i3, D());
    }

    @Override // defpackage.cmpb
    public final int s(int i, int i2, int i3) {
        return aU(this.E, this.C, i2, i3, true);
    }

    @Override // defpackage.cmpb
    public final void setFlexLines(List<cmpc> list) {
        this.b = list;
    }

    @Override // defpackage.cmpb
    public final int t() {
        if (this.b.size() == 0) {
            return 0;
        }
        int size = this.b.size();
        int i = Integer.MIN_VALUE;
        for (int i2 = 0; i2 < size; i2++) {
            i = Math.max(i, this.b.get(i2).e);
        }
        return i;
    }

    @Override // defpackage.abs
    public final void u(int i, int i2) {
        M(i);
    }

    @Override // defpackage.cmpb
    public final int v() {
        int size = this.b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.b.get(i2).g;
        }
        return i;
    }

    @Override // defpackage.abs
    public final void w(int i, int i2) {
        M(Math.min(i, i2));
    }

    @Override // defpackage.abs
    public final void x(int i, int i2) {
        M(i);
    }

    @Override // defpackage.abs
    public final void y(int i, int i2) {
        bv(i);
        M(i);
    }

    @Override // defpackage.cmpb
    public final void z(View view, int i, int i2, cmpc cmpcVar) {
        aV(view, e);
        int bl = bl(view) + bn(view);
        cmpcVar.e += bl;
        cmpcVar.f += bl;
    }
}
