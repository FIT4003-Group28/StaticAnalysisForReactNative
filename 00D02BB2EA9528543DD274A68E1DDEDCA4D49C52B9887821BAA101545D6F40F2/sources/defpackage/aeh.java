package defpackage;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import android.support.v7.widget.StaggeredGridLayoutManager$SavedState;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Arrays;
import java.util.BitSet;
/* compiled from: PG */
/* renamed from: aeh  reason: default package */
/* loaded from: classes2.dex */
public class aeh extends abs implements acg {
    private boolean F;
    private StaggeredGridLayoutManager$SavedState G;
    private int H;
    private int[] M;
    public int a;
    public aeg[] b;
    aax c;
    aax d;
    private int k;
    private final zz l;
    private BitSet m;
    private boolean o;
    public boolean e = false;
    boolean f = false;
    int g = -1;
    int h = Integer.MIN_VALUE;
    aee i = new aee();
    private int n = 2;
    private final Rect I = new Rect();
    private final aeb J = new aeb(this);
    private boolean K = false;
    private boolean L = true;
    private final Runnable N = new aea(this);
    private int j = 1;

    public aeh(int i) {
        this.a = -1;
        Y(null);
        if (i != this.a) {
            this.i.b();
            as();
            this.a = i;
            this.m = new BitSet(i);
            this.b = new aeg[this.a];
            for (int i2 = 0; i2 < this.a; i2++) {
                this.b[i2] = new aeg(this, i2);
            }
            as();
        }
        this.l = new zz();
        this.c = aax.q(this, this.j);
        this.d = aax.q(this, 1 - this.j);
    }

    private final void N() {
        this.f = (this.j == 1 || !o()) ? this.e : !this.e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:244:0x03f9, code lost:
        if (k() != false) goto L259;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void P(defpackage.aca r12, defpackage.aci r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 1058
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.P(aca, aci, boolean):void");
    }

    private final int W(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        return acy.b(aciVar, this.c, F(!this.L), G(!this.L), this, this.L);
    }

    private final void X(aca acaVar, aci aciVar, boolean z) {
        int a;
        int al = al(Integer.MIN_VALUE);
        if (al != Integer.MIN_VALUE && (a = this.c.a() - al) > 0) {
            int i = a - (-J(-a, acaVar, aciVar));
            if (!z || i <= 0) {
                return;
            }
            this.c.c(i);
        }
    }

    private final void Z(aca acaVar, aci aciVar, boolean z) {
        int d;
        int ak = ak(Integer.MAX_VALUE);
        if (ak != Integer.MAX_VALUE && (d = ak - this.c.d()) > 0) {
            int J = d - J(d, acaVar, aciVar);
            if (!z || J <= 0) {
                return;
            }
            this.c.c(-J);
        }
    }

    private final void ab(int i, aci aciVar) {
        int i2;
        int i3;
        RecyclerView recyclerView;
        int i4;
        zz zzVar = this.l;
        boolean z = false;
        zzVar.b = 0;
        zzVar.c = i;
        if (!ax() || (i4 = aciVar.a) == -1) {
            i2 = 0;
        } else {
            if (this.f == (i4 < i)) {
                i2 = this.c.k();
            } else {
                i3 = this.c.k();
                i2 = 0;
                recyclerView = this.q;
                if (recyclerView != null || !recyclerView.g) {
                    this.l.g = this.c.b() + i2;
                    this.l.f = -i3;
                } else {
                    this.l.f = this.c.d() - i3;
                    this.l.g = this.c.a() + i2;
                }
                zz zzVar2 = this.l;
                zzVar2.h = false;
                zzVar2.a = true;
                if (this.c.n() == 0 && this.c.b() == 0) {
                    z = true;
                }
                zzVar2.i = z;
            }
        }
        i3 = 0;
        recyclerView = this.q;
        if (recyclerView != null) {
        }
        this.l.g = this.c.b() + i2;
        this.l.f = -i3;
        zz zzVar22 = this.l;
        zzVar22.h = false;
        zzVar22.a = true;
        if (this.c.n() == 0) {
            z = true;
        }
        zzVar22.i = z;
    }

    private final void ac(int i) {
        zz zzVar = this.l;
        zzVar.e = i;
        int i2 = 1;
        if (this.f != (i == -1)) {
            i2 = -1;
        }
        zzVar.d = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0043 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void ad(int r7, int r8, int r9) {
        /*
            r6 = this;
            boolean r0 = r6.f
            if (r0 == 0) goto L9
            int r0 = r6.K()
            goto Ld
        L9:
            int r0 = r6.M()
        Ld:
            r1 = 8
            if (r9 != r1) goto L1a
            if (r7 >= r8) goto L16
            int r2 = r8 + 1
            goto L1c
        L16:
            int r2 = r7 + 1
            r3 = r8
            goto L1d
        L1a:
            int r2 = r7 + r8
        L1c:
            r3 = r7
        L1d:
            aee r4 = r6.i
            r4.i(r3)
            r4 = 1
            if (r9 == r4) goto L3c
            r5 = 2
            if (r9 == r5) goto L36
            if (r9 == r1) goto L2b
            goto L41
        L2b:
            aee r9 = r6.i
            r9.c(r7, r4)
            aee r7 = r6.i
            r7.d(r8, r4)
            goto L41
        L36:
            aee r9 = r6.i
            r9.c(r7, r8)
            goto L41
        L3c:
            aee r9 = r6.i
            r9.d(r7, r8)
        L41:
            if (r2 > r0) goto L44
            return
        L44:
            boolean r7 = r6.f
            if (r7 == 0) goto L4d
            int r7 = r6.M()
            goto L51
        L4d:
            int r7 = r6.K()
        L51:
            if (r3 > r7) goto L56
            r6.as()
        L56:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.ad(int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02f8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x031d  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0324  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x034e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int ae(defpackage.aca r20, defpackage.zz r21, defpackage.aci r22) {
        /*
            Method dump skipped, instructions count: 920
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.ae(aca, zz, aci):int");
    }

    private final void af(aca acaVar, zz zzVar) {
        int min;
        int min2;
        if (!zzVar.a || zzVar.i) {
            return;
        }
        if (zzVar.b == 0) {
            if (zzVar.e == -1) {
                bE(acaVar, zzVar.g);
                return;
            } else {
                an(acaVar, zzVar.f);
                return;
            }
        }
        int i = 1;
        if (zzVar.e == -1) {
            int i2 = zzVar.f;
            int a = this.b[0].a(i2);
            while (i < this.a) {
                int a2 = this.b[i].a(i2);
                if (a2 > a) {
                    a = a2;
                }
                i++;
            }
            int i3 = i2 - a;
            if (i3 < 0) {
                min2 = zzVar.g;
            } else {
                min2 = zzVar.g - Math.min(i3, zzVar.b);
            }
            bE(acaVar, min2);
            return;
        }
        int i4 = zzVar.g;
        int d = this.b[0].d(i4);
        while (i < this.a) {
            int d2 = this.b[i].d(i4);
            if (d2 < d) {
                d = d2;
            }
            i++;
        }
        int i5 = d - zzVar.g;
        if (i5 < 0) {
            min = zzVar.f;
        } else {
            min = Math.min(i5, zzVar.b) + zzVar.f;
        }
        an(acaVar, min);
    }

    private final void ag(int i, int i2) {
        for (int i3 = 0; i3 < this.a; i3++) {
            if (!this.b[i3].a.isEmpty()) {
                ah(this.b[i3], i, i2);
            }
        }
    }

    private final void ah(aeg aegVar, int i, int i2) {
        int i3 = aegVar.d;
        if (i == -1) {
            if (aegVar.c() + i3 > i2) {
                return;
            }
            this.m.set(aegVar.e, false);
        } else if (aegVar.f() - i3 < i2) {
        } else {
            this.m.set(aegVar.e, false);
        }
    }

    private final int ak(int i) {
        int a = this.b[0].a(i);
        for (int i2 = 1; i2 < this.a; i2++) {
            int a2 = this.b[i2].a(i);
            if (a2 < a) {
                a = a2;
            }
        }
        return a;
    }

    private final int al(int i) {
        int d = this.b[0].d(i);
        for (int i2 = 1; i2 < this.a; i2++) {
            int d2 = this.b[i2].d(i);
            if (d2 > d) {
                d = d2;
            }
        }
        return d;
    }

    private final void an(aca acaVar, int i) {
        while (aJ() > 0) {
            View aK = aK(0);
            if (this.c.g(aK) > i || this.c.i(aK) > i) {
                return;
            }
            aec aecVar = (aec) aK.getLayoutParams();
            if (aecVar.b) {
                for (int i2 = 0; i2 < this.a; i2++) {
                    if (this.b[i2].a.size() == 1) {
                        return;
                    }
                }
                for (int i3 = 0; i3 < this.a; i3++) {
                    this.b[i3].l();
                }
            } else if (aecVar.a.a.size() == 1) {
                return;
            } else {
                aecVar.a.l();
            }
            aH(aK, acaVar);
        }
    }

    private final void bE(aca acaVar, int i) {
        int aJ = aJ();
        while (true) {
            aJ--;
            if (aJ >= 0) {
                View aK = aK(aJ);
                if (this.c.h(aK) < i || this.c.j(aK) < i) {
                    return;
                }
                aec aecVar = (aec) aK.getLayoutParams();
                if (aecVar.b) {
                    for (int i2 = 0; i2 < this.a; i2++) {
                        if (this.b[i2].a.size() == 1) {
                            return;
                        }
                    }
                    for (int i3 = 0; i3 < this.a; i3++) {
                        this.b[i3].k();
                    }
                } else if (aecVar.a.a.size() == 1) {
                    return;
                } else {
                    aecVar.a.k();
                }
                aH(aK, acaVar);
            } else {
                return;
            }
        }
    }

    private final boolean bF(int i) {
        if (this.j == 0) {
            return (i == -1) != this.f;
        }
        return ((i == -1) == this.f) == o();
    }

    private final int bG(int i) {
        if (aJ() == 0) {
            return this.f ? 1 : -1;
        }
        return (i < M()) != this.f ? -1 : 1;
    }

    private final void bH(View view, int i, int i2) {
        aV(view, this.I);
        aec aecVar = (aec) view.getLayoutParams();
        int bI = bI(i, aecVar.leftMargin + this.I.left, aecVar.rightMargin + this.I.right);
        int bI2 = bI(i2, aecVar.topMargin + this.I.top, aecVar.bottomMargin + this.I.bottom);
        if (aS(view, bI, bI2, aecVar)) {
            view.measure(bI, bI2);
        }
    }

    private static final int bI(int i, int i2, int i3) {
        if (i2 == 0) {
            if (i3 == 0) {
                return i;
            }
            i2 = 0;
        }
        int mode = View.MeasureSpec.getMode(i);
        return (mode == Integer.MIN_VALUE || mode == 1073741824) ? View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i) - i2) - i3), mode) : i;
    }

    @Override // defpackage.abs
    public final Parcelable B() {
        int M;
        View F;
        int a;
        int d;
        int[] iArr;
        StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = this.G;
        if (staggeredGridLayoutManager$SavedState != null) {
            return new StaggeredGridLayoutManager$SavedState(staggeredGridLayoutManager$SavedState);
        }
        StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState2 = new StaggeredGridLayoutManager$SavedState();
        staggeredGridLayoutManager$SavedState2.h = this.e;
        staggeredGridLayoutManager$SavedState2.i = this.o;
        staggeredGridLayoutManager$SavedState2.j = this.F;
        aee aeeVar = this.i;
        if (aeeVar != null && (iArr = aeeVar.a) != null) {
            staggeredGridLayoutManager$SavedState2.f = iArr;
            staggeredGridLayoutManager$SavedState2.e = staggeredGridLayoutManager$SavedState2.f.length;
            staggeredGridLayoutManager$SavedState2.g = aeeVar.b;
        } else {
            staggeredGridLayoutManager$SavedState2.e = 0;
        }
        int i = -1;
        if (aJ() > 0) {
            if (this.o) {
                M = K();
            } else {
                M = M();
            }
            staggeredGridLayoutManager$SavedState2.a = M;
            if (this.f) {
                F = G(true);
            } else {
                F = F(true);
            }
            if (F != null) {
                i = bm(F);
            }
            staggeredGridLayoutManager$SavedState2.b = i;
            int i2 = this.a;
            staggeredGridLayoutManager$SavedState2.c = i2;
            staggeredGridLayoutManager$SavedState2.d = new int[i2];
            for (int i3 = 0; i3 < this.a; i3++) {
                if (this.o) {
                    a = this.b[i3].d(Integer.MIN_VALUE);
                    if (a != Integer.MIN_VALUE) {
                        d = this.c.a();
                        a -= d;
                        staggeredGridLayoutManager$SavedState2.d[i3] = a;
                    } else {
                        staggeredGridLayoutManager$SavedState2.d[i3] = a;
                    }
                } else {
                    a = this.b[i3].a(Integer.MIN_VALUE);
                    if (a != Integer.MIN_VALUE) {
                        d = this.c.d();
                        a -= d;
                        staggeredGridLayoutManager$SavedState2.d[i3] = a;
                    } else {
                        staggeredGridLayoutManager$SavedState2.d[i3] = a;
                    }
                }
            }
        } else {
            staggeredGridLayoutManager$SavedState2.a = -1;
            staggeredGridLayoutManager$SavedState2.b = -1;
            staggeredGridLayoutManager$SavedState2.c = 0;
        }
        return staggeredGridLayoutManager$SavedState2;
    }

    @Override // defpackage.abs
    public final void C(Parcelable parcelable) {
        if (parcelable instanceof StaggeredGridLayoutManager$SavedState) {
            StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = (StaggeredGridLayoutManager$SavedState) parcelable;
            this.G = staggeredGridLayoutManager$SavedState;
            if (this.g != -1) {
                staggeredGridLayoutManager$SavedState.b();
                this.G.a();
            }
            as();
        }
    }

    @Override // defpackage.abs
    public final boolean D() {
        return this.j == 0;
    }

    @Override // defpackage.abs
    public final boolean E() {
        return this.j == 1;
    }

    final View F(boolean z) {
        int d = this.c.d();
        int a = this.c.a();
        int aJ = aJ();
        View view = null;
        for (int i = 0; i < aJ; i++) {
            View aK = aK(i);
            int h = this.c.h(aK);
            if (this.c.g(aK) > d && h < a) {
                if (h >= d || !z) {
                    return aK;
                }
                if (view == null) {
                    view = aK;
                }
            }
        }
        return view;
    }

    final View G(boolean z) {
        int d = this.c.d();
        int a = this.c.a();
        View view = null;
        for (int aJ = aJ() - 1; aJ >= 0; aJ--) {
            View aK = aK(aJ);
            int h = this.c.h(aK);
            int g = this.c.g(aK);
            if (g > d && h < a) {
                if (g <= a || !z) {
                    return aK;
                }
                if (view == null) {
                    view = aK;
                }
            }
        }
        return view;
    }

    final void H(int i, aci aciVar) {
        int M;
        int i2;
        if (i > 0) {
            M = K();
            i2 = 1;
        } else {
            M = M();
            i2 = -1;
        }
        this.l.a = true;
        ab(M, aciVar);
        ac(i2);
        zz zzVar = this.l;
        zzVar.c = M + zzVar.d;
        zzVar.b = Math.abs(i);
    }

    public final int J(int i, aca acaVar, aci aciVar) {
        if (aJ() == 0 || i == 0) {
            return 0;
        }
        H(i, aciVar);
        int ae = ae(acaVar, this.l, aciVar);
        if (this.l.b >= ae) {
            i = i < 0 ? -ae : ae;
        }
        this.c.c(-i);
        this.o = this.f;
        zz zzVar = this.l;
        zzVar.b = 0;
        af(acaVar, zzVar);
        return i;
    }

    final int K() {
        int aJ = aJ();
        if (aJ == 0) {
            return 0;
        }
        return bm(aK(aJ - 1));
    }

    @Override // defpackage.acg
    public final PointF L(int i) {
        int bG = bG(i);
        PointF pointF = new PointF();
        if (bG == 0) {
            return null;
        }
        if (this.j == 0) {
            pointF.x = bG;
            pointF.y = 0.0f;
        } else {
            pointF.x = 0.0f;
            pointF.y = bG;
        }
        return pointF;
    }

    final int M() {
        if (aJ() == 0) {
            return 0;
        }
        return bm(aK(0));
    }

    @Override // defpackage.abs
    public final void O(int i) {
        StaggeredGridLayoutManager$SavedState staggeredGridLayoutManager$SavedState = this.G;
        if (staggeredGridLayoutManager$SavedState != null && staggeredGridLayoutManager$SavedState.a != i) {
            staggeredGridLayoutManager$SavedState.b();
        }
        this.g = i;
        this.h = Integer.MIN_VALUE;
        as();
    }

    @Override // defpackage.abs
    public final int Q(aci aciVar) {
        return q(aciVar);
    }

    @Override // defpackage.abs
    public int R(aci aciVar) {
        return q(aciVar);
    }

    @Override // defpackage.abs
    public final void RX(Rect rect, int i, int i2) {
        int at;
        int at2;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (this.j == 1) {
            at2 = at(i2, rect.height() + paddingTop, ba());
            at = at(i, (this.k * this.a) + paddingLeft, aZ());
        } else {
            at = at(i, rect.width() + paddingLeft, aZ());
            at2 = at(i2, (this.k * this.a) + paddingTop, ba());
        }
        aY(at, at2);
    }

    @Override // defpackage.abs
    public final boolean RY() {
        return this.n != 0;
    }

    @Override // defpackage.abs
    public final boolean RZ() {
        return this.G == null;
    }

    @Override // defpackage.abs
    public final int S(aci aciVar) {
        return W(aciVar);
    }

    @Override // defpackage.abs
    public final abt Sa(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new aec((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new aec(layoutParams);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x003a, code lost:
        if (r9.j == 1) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x003f, code lost:
        if (r9.j == 0) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x004c, code lost:
        if (o() == false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0059, code lost:
        if (o() == false) goto L110;
     */
    @Override // defpackage.abs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View Sb(android.view.View r10, int r11, defpackage.aca r12, defpackage.aci r13) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.Sb(android.view.View, int, aca, aci):android.view.View");
    }

    @Override // defpackage.abs
    public final void Sc(AccessibilityEvent accessibilityEvent) {
        super.Sc(accessibilityEvent);
        if (aJ() > 0) {
            View F = F(false);
            View G = G(false);
            if (F == null || G == null) {
                return;
            }
            int bm = bm(F);
            int bm2 = bm(G);
            if (bm < bm2) {
                accessibilityEvent.setFromIndex(bm);
                accessibilityEvent.setToIndex(bm2);
                return;
            }
            accessibilityEvent.setFromIndex(bm2);
            accessibilityEvent.setToIndex(bm);
        }
    }

    @Override // defpackage.abs
    public final void Sg() {
        this.i.b();
        as();
    }

    @Override // defpackage.abs
    public final int T(aci aciVar) {
        return W(aciVar);
    }

    @Override // defpackage.abs
    public final int U(aci aciVar) {
        return t(aciVar);
    }

    @Override // defpackage.abs
    public int V(aci aciVar) {
        return t(aciVar);
    }

    @Override // defpackage.abs
    public final void Y(String str) {
        if (this.G == null) {
            super.Y(str);
        }
    }

    @Override // defpackage.abs
    public final void aO(int i) {
        super.aO(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            this.b[i2].m(i);
        }
    }

    @Override // defpackage.abs
    public final void aP(int i) {
        super.aP(i);
        for (int i2 = 0; i2 < this.a; i2++) {
            this.b[i2].m(i);
        }
    }

    @Override // defpackage.abs
    public final void aX(abg abgVar, abg abgVar2) {
        this.i.b();
        for (int i = 0; i < this.a; i++) {
            this.b[i].i();
        }
    }

    @Override // defpackage.abs
    public final void aj(int i, int i2, aci aciVar, zs zsVar) {
        int d;
        int i3;
        if (1 == this.j) {
            i = i2;
        }
        if (aJ() == 0 || i == 0) {
            return;
        }
        H(i, aciVar);
        int[] iArr = this.M;
        if (iArr == null || iArr.length < this.a) {
            this.M = new int[this.a];
        }
        int i4 = 0;
        for (int i5 = 0; i5 < this.a; i5++) {
            zz zzVar = this.l;
            if (zzVar.d == -1) {
                d = zzVar.f;
                i3 = this.b[i5].a(d);
            } else {
                d = this.b[i5].d(zzVar.g);
                i3 = this.l.g;
            }
            int i6 = d - i3;
            if (i6 >= 0) {
                this.M[i4] = i6;
                i4++;
            }
        }
        Arrays.sort(this.M, 0, i4);
        for (int i7 = 0; i7 < i4 && this.l.a(aciVar); i7++) {
            zsVar.b(this.l.c, this.M[i7]);
            zz zzVar2 = this.l;
            zzVar2.c += zzVar2.d;
        }
    }

    @Override // defpackage.abs
    public final void am(RecyclerView recyclerView) {
        by(this.N);
        for (int i = 0; i < this.a; i++) {
            this.b[i].i();
        }
        recyclerView.requestLayout();
    }

    @Override // defpackage.abs
    public final void ao(RecyclerView recyclerView, int i) {
        aah aahVar = new aah(recyclerView.getContext());
        aahVar.g = i;
        aw(aahVar);
    }

    @Override // defpackage.abs
    public final void bb(int i) {
        if (i == 0) {
            k();
        }
    }

    @Override // defpackage.abs
    public final void d(aca acaVar, aci aciVar) {
        P(acaVar, aciVar, true);
    }

    @Override // defpackage.abs
    public final void e(aci aciVar) {
        this.g = -1;
        this.h = Integer.MIN_VALUE;
        this.G = null;
        this.J.a();
    }

    @Override // defpackage.abs
    public final abt f() {
        if (this.j == 0) {
            return new aec(-2, -1);
        }
        return new aec(-1, -2);
    }

    @Override // defpackage.abs
    public final abt g(Context context, AttributeSet attributeSet) {
        return new aec(context, attributeSet);
    }

    @Override // defpackage.abs
    public final boolean i(abt abtVar) {
        return abtVar instanceof aec;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean k() {
        int M;
        int K;
        if (aJ() == 0 || this.n == 0 || !this.v) {
            return false;
        }
        if (this.f) {
            M = K();
            K = M();
        } else {
            M = M();
            K = K();
        }
        if (M == 0) {
            if (l() != null) {
                this.i.b();
                bg();
                as();
                return true;
            }
            M = 0;
        }
        if (!this.K) {
            return false;
        }
        int i = true != this.f ? 1 : -1;
        int i2 = K + 1;
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem h = this.i.h(M, i2, i);
        if (h == null) {
            this.K = false;
            this.i.g(i2);
            return false;
        }
        StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem h2 = this.i.h(M, h.a, -i);
        if (h2 == null) {
            this.i.g(h.a);
        } else {
            this.i.g(h2.a + 1);
        }
        bg();
        as();
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:49:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00e2 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final android.view.View l() {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.l():android.view.View");
    }

    @Override // defpackage.abs
    public final int m(int i, aca acaVar, aci aciVar) {
        return J(i, acaVar, aciVar);
    }

    @Override // defpackage.abs
    public int n(int i, aca acaVar, aci aciVar) {
        return J(i, acaVar, aciVar);
    }

    final boolean o() {
        return ay() == 1;
    }

    final void p(int i) {
        this.k = i / this.a;
        this.H = View.MeasureSpec.makeMeasureSpec(i, this.d.n());
    }

    public final int q(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        return acy.a(aciVar, this.c, F(!this.L), G(!this.L), this, this.L, this.f);
    }

    public final int t(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        return acy.c(aciVar, this.c, F(!this.L), G(!this.L), this, this.L);
    }

    @Override // defpackage.abs
    public final void u(int i, int i2) {
        ad(i, i2, 1);
    }

    @Override // defpackage.abs
    public final void w(int i, int i2) {
        ad(i, i2, 8);
    }

    @Override // defpackage.abs
    public final void x(int i, int i2) {
        ad(i, i2, 2);
    }

    @Override // defpackage.abs
    public final void y(int i, int i2) {
        ad(i, i2, 4);
    }
}
