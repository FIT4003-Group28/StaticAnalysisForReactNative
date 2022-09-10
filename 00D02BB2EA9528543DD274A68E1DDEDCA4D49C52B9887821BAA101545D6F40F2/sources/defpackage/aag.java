package defpackage;

import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v7.widget.LinearLayoutManager$SavedState;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;
/* compiled from: PG */
/* renamed from: aag  reason: default package */
/* loaded from: classes.dex */
public class aag extends abs implements afz, acg {
    private aae a;
    private boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private final aad f;
    private int g;
    private int[] h;
    public int i;
    aax j;
    boolean k;
    int l;
    int m;
    LinearLayoutManager$SavedState n;
    final aac o;

    public aag() {
        this(1, false);
    }

    private final int bE(int i, aca acaVar, aci aciVar, boolean z) {
        int d;
        int d2 = i - this.j.d();
        if (d2 > 0) {
            int i2 = -X(d2, acaVar, aciVar);
            int i3 = i + i2;
            if (!z || (d = i3 - this.j.d()) <= 0) {
                return i2;
            }
            this.j.c(-d);
            return i2 - d;
        }
        return 0;
    }

    private final void bF(aac aacVar) {
        bG(aacVar.b, aacVar.c);
    }

    private final void bG(int i, int i2) {
        this.a.c = this.j.a() - i2;
        aae aaeVar = this.a;
        aaeVar.e = true != this.k ? 1 : -1;
        aaeVar.d = i;
        aaeVar.f = 1;
        aaeVar.b = i2;
        aaeVar.g = Integer.MIN_VALUE;
    }

    private final void bH(aac aacVar) {
        bI(aacVar.b, aacVar.c);
    }

    private final void bI(int i, int i2) {
        this.a.c = i2 - this.j.d();
        aae aaeVar = this.a;
        aaeVar.d = i;
        int i3 = 1;
        if (true != this.k) {
            i3 = -1;
        }
        aaeVar.e = i3;
        aaeVar.f = -1;
        aaeVar.b = i2;
        aaeVar.g = Integer.MIN_VALUE;
    }

    private final int bJ(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        N();
        return acy.a(aciVar, this.j, al(!this.e), ak(!this.e), this, this.e, this.k);
    }

    private final int bK(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        N();
        return acy.b(aciVar, this.j, al(!this.e), ak(!this.e), this, this.e);
    }

    private final int bL(aci aciVar) {
        if (aJ() == 0) {
            return 0;
        }
        N();
        return acy.c(aciVar, this.j, al(!this.e), ak(!this.e), this, this.e);
    }

    private final void bM(int i, int i2, boolean z, aci aciVar) {
        int d;
        this.a.m = W();
        this.a.f = i;
        int[] iArr = this.h;
        iArr[0] = 0;
        int i3 = 1;
        iArr[1] = 0;
        K(aciVar, iArr);
        int max = Math.max(0, this.h[0]);
        int max2 = Math.max(0, this.h[1]);
        aae aaeVar = this.a;
        int i4 = i == 1 ? max2 : max;
        aaeVar.h = i4;
        if (i != 1) {
            max = max2;
        }
        aaeVar.i = max;
        if (i == 1) {
            aaeVar.h = i4 + this.j.m();
            View bQ = bQ();
            aae aaeVar2 = this.a;
            if (true == this.k) {
                i3 = -1;
            }
            aaeVar2.e = i3;
            int bm = bm(bQ);
            aae aaeVar3 = this.a;
            aaeVar2.d = bm + aaeVar3.e;
            aaeVar3.b = this.j.g(bQ);
            d = this.j.g(bQ) - this.j.a();
        } else {
            View bP = bP();
            this.a.h += this.j.d();
            aae aaeVar4 = this.a;
            if (true != this.k) {
                i3 = -1;
            }
            aaeVar4.e = i3;
            int bm2 = bm(bP);
            aae aaeVar5 = this.a;
            aaeVar4.d = bm2 + aaeVar5.e;
            aaeVar5.b = this.j.h(bP);
            d = (-this.j.h(bP)) + this.j.d();
        }
        aae aaeVar6 = this.a;
        aaeVar6.c = i2;
        if (z) {
            aaeVar6.c = i2 - d;
        }
        aaeVar6.g = d;
    }

    private final void bO(aca acaVar, aae aaeVar) {
        if (!aaeVar.a || aaeVar.m) {
            return;
        }
        int i = aaeVar.g;
        int i2 = aaeVar.i;
        if (aaeVar.f == -1) {
            int aJ = aJ();
            if (i < 0) {
                return;
            }
            int b = (this.j.b() - i) + i2;
            if (this.k) {
                for (int i3 = 0; i3 < aJ; i3++) {
                    View aK = aK(i3);
                    if (this.j.h(aK) < b || this.j.j(aK) < b) {
                        bN(acaVar, 0, i3);
                        return;
                    }
                }
                return;
            }
            int i4 = aJ - 1;
            for (int i5 = i4; i5 >= 0; i5--) {
                View aK2 = aK(i5);
                if (this.j.h(aK2) < b || this.j.j(aK2) < b) {
                    bN(acaVar, i4, i5);
                    return;
                }
            }
        } else if (i >= 0) {
            int i6 = i - i2;
            int aJ2 = aJ();
            if (!this.k) {
                for (int i7 = 0; i7 < aJ2; i7++) {
                    View aK3 = aK(i7);
                    if (this.j.g(aK3) > i6 || this.j.i(aK3) > i6) {
                        bN(acaVar, 0, i7);
                        return;
                    }
                }
                return;
            }
            int i8 = aJ2 - 1;
            for (int i9 = i8; i9 >= 0; i9--) {
                View aK4 = aK(i9);
                if (this.j.g(aK4) > i6 || this.j.i(aK4) > i6) {
                    bN(acaVar, i8, i9);
                    return;
                }
            }
        }
    }

    private final View bP() {
        return aK(this.k ? aJ() - 1 : 0);
    }

    private final View bQ() {
        return aK(this.k ? 0 : aJ() - 1);
    }

    private final View bR() {
        return ah(0, aJ());
    }

    private final View bS() {
        return ah(aJ() - 1, -1);
    }

    private final void k() {
        this.k = (this.i == 1 || !M()) ? this.c : !this.c;
    }

    private final int q(int i, aca acaVar, aci aciVar, boolean z) {
        int a;
        int a2 = this.j.a() - i;
        if (a2 > 0) {
            int i2 = -X(-a2, acaVar, aciVar);
            int i3 = i + i2;
            if (!z || (a = this.j.a() - i3) <= 0) {
                return i2;
            }
            this.j.c(a);
            return a + i2;
        }
        return 0;
    }

    @Override // defpackage.abs
    public final Parcelable B() {
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.n;
        if (linearLayoutManager$SavedState != null) {
            return new LinearLayoutManager$SavedState(linearLayoutManager$SavedState);
        }
        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = new LinearLayoutManager$SavedState();
        if (aJ() > 0) {
            N();
            boolean z = this.b ^ this.k;
            linearLayoutManager$SavedState2.c = z;
            if (z) {
                View bQ = bQ();
                linearLayoutManager$SavedState2.b = this.j.a() - this.j.g(bQ);
                linearLayoutManager$SavedState2.a = bm(bQ);
            } else {
                View bP = bP();
                linearLayoutManager$SavedState2.a = bm(bP);
                linearLayoutManager$SavedState2.b = this.j.h(bP) - this.j.d();
            }
        } else {
            linearLayoutManager$SavedState2.b();
        }
        return linearLayoutManager$SavedState2;
    }

    @Override // defpackage.abs
    public final void C(Parcelable parcelable) {
        if (parcelable instanceof LinearLayoutManager$SavedState) {
            LinearLayoutManager$SavedState linearLayoutManager$SavedState = (LinearLayoutManager$SavedState) parcelable;
            this.n = linearLayoutManager$SavedState;
            if (this.l != -1) {
                linearLayoutManager$SavedState.b();
            }
            as();
        }
    }

    @Override // defpackage.abs
    public final boolean D() {
        return this.i == 0;
    }

    @Override // defpackage.abs
    public boolean E() {
        return this.i == 1;
    }

    public final void F(boolean z) {
        Y(null);
        if (this.d == z) {
            return;
        }
        this.d = z;
        as();
    }

    public final void H(boolean z) {
        Y(null);
        if (z == this.c) {
            return;
        }
        this.c = z;
        as();
    }

    @Override // defpackage.abs
    public final View I(int i) {
        int aJ = aJ();
        if (aJ == 0) {
            return null;
        }
        int bm = i - bm(aK(0));
        if (bm >= 0 && bm < aJ) {
            View aK = aK(bm);
            if (bm(aK) == i) {
                return aK;
            }
        }
        return super.I(i);
    }

    @Deprecated
    protected int J(aci aciVar) {
        if (aciVar.a != -1) {
            return this.j.k();
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void K(aci aciVar, int[] iArr) {
        int J = J(aciVar);
        int i = this.a.f;
        int i2 = i == -1 ? 0 : J;
        if (i != -1) {
            J = 0;
        }
        iArr[0] = J;
        iArr[1] = i2;
    }

    @Override // defpackage.acg
    public final PointF L(int i) {
        if (aJ() == 0) {
            return null;
        }
        boolean z = false;
        int i2 = 1;
        if (i < bm(aK(0))) {
            z = true;
        }
        if (z != this.k) {
            i2 = -1;
        }
        if (this.i == 0) {
            return new PointF(i2, 0.0f);
        }
        return new PointF(0.0f, i2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean M() {
        return ay() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void N() {
        if (this.a == null) {
            this.a = new aae();
        }
    }

    @Override // defpackage.abs
    public final void O(int i) {
        this.l = i;
        this.m = Integer.MIN_VALUE;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.n;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.b();
        }
        as();
    }

    public final void P(int i, int i2) {
        this.l = i;
        this.m = i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.n;
        if (linearLayoutManager$SavedState != null) {
            linearLayoutManager$SavedState.b();
        }
        as();
    }

    @Override // defpackage.abs
    public final int Q(aci aciVar) {
        return bJ(aciVar);
    }

    @Override // defpackage.abs
    public final int R(aci aciVar) {
        return bJ(aciVar);
    }

    @Override // defpackage.abs
    public final boolean RY() {
        return true;
    }

    @Override // defpackage.abs
    public boolean RZ() {
        return this.n == null && this.b == this.d;
    }

    @Override // defpackage.abs
    public final int S(aci aciVar) {
        return bK(aciVar);
    }

    @Override // defpackage.abs
    public View Sb(View view, int i, aca acaVar, aci aciVar) {
        int ab;
        View bS;
        View bQ;
        View bR;
        k();
        if (aJ() == 0 || (ab = ab(i)) == Integer.MIN_VALUE) {
            return null;
        }
        N();
        bM(ab, (int) (this.j.k() * 0.33333334f), false, aciVar);
        aae aaeVar = this.a;
        aaeVar.g = Integer.MIN_VALUE;
        aaeVar.a = false;
        Z(acaVar, aaeVar, aciVar, true);
        if (ab == -1) {
            if (this.k) {
                bR = bS();
            } else {
                bR = bR();
            }
            bS = bR;
            ab = -1;
        } else if (this.k) {
            bS = bR();
        } else {
            bS = bS();
        }
        if (ab == -1) {
            bQ = bP();
        } else {
            bQ = bQ();
        }
        if (!bQ.hasFocusable()) {
            return bS;
        }
        if (bS != null) {
            return bQ;
        }
        return null;
    }

    @Override // defpackage.abs
    public final void Sc(AccessibilityEvent accessibilityEvent) {
        super.Sc(accessibilityEvent);
        if (aJ() > 0) {
            accessibilityEvent.setFromIndex(ac());
            accessibilityEvent.setToIndex(ae());
        }
    }

    @Override // defpackage.abs
    public final int T(aci aciVar) {
        return bK(aciVar);
    }

    @Override // defpackage.abs
    public final int U(aci aciVar) {
        return bL(aciVar);
    }

    @Override // defpackage.abs
    public final int V(aci aciVar) {
        return bL(aciVar);
    }

    final boolean W() {
        return this.j.n() == 0 && this.j.b() == 0;
    }

    final int X(int i, aca acaVar, aci aciVar) {
        if (aJ() == 0 || i == 0) {
            return 0;
        }
        N();
        this.a.a = true;
        int i2 = i > 0 ? 1 : -1;
        int abs = Math.abs(i);
        bM(i2, abs, true, aciVar);
        aae aaeVar = this.a;
        int Z = aaeVar.g + Z(acaVar, aaeVar, aciVar, false);
        if (Z < 0) {
            return 0;
        }
        if (abs > Z) {
            i = i2 * Z;
        }
        this.j.c(-i);
        this.a.k = i;
        return i;
    }

    @Override // defpackage.abs
    public final void Y(String str) {
        if (this.n == null) {
            super.Y(str);
        }
    }

    final int Z(aca acaVar, aae aaeVar, aci aciVar, boolean z) {
        int i = aaeVar.c;
        int i2 = aaeVar.g;
        if (i2 != Integer.MIN_VALUE) {
            if (i < 0) {
                aaeVar.g = i2 + i;
            }
            bO(acaVar, aaeVar);
        }
        int i3 = aaeVar.c + aaeVar.h;
        aad aadVar = this.f;
        while (true) {
            if ((!aaeVar.m && i3 <= 0) || !aaeVar.a(aciVar)) {
                break;
            }
            aadVar.a = 0;
            aadVar.b = false;
            aadVar.c = false;
            aadVar.d = false;
            p(acaVar, aciVar, aaeVar, aadVar);
            if (!aadVar.b) {
                int i4 = aaeVar.b;
                int i5 = aadVar.a;
                aaeVar.b = i4 + (aaeVar.f * i5);
                if (!aadVar.c || aaeVar.l != null || !aciVar.g) {
                    aaeVar.c -= i5;
                    i3 -= i5;
                }
                int i6 = aaeVar.g;
                if (i6 != Integer.MIN_VALUE) {
                    int i7 = i6 + i5;
                    aaeVar.g = i7;
                    int i8 = aaeVar.c;
                    if (i8 < 0) {
                        aaeVar.g = i7 + i8;
                    }
                    bO(acaVar, aaeVar);
                }
                if (z && aadVar.d) {
                    break;
                }
            } else {
                break;
            }
        }
        return i - aaeVar.c;
    }

    @Override // defpackage.abs
    public final boolean aa() {
        if (this.C != 1073741824 && this.B != 1073741824) {
            int aJ = aJ();
            for (int i = 0; i < aJ; i++) {
                ViewGroup.LayoutParams layoutParams = aK(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int ac() {
        View ag = ag(0, aJ(), false, true);
        if (ag == null) {
            return -1;
        }
        return bm(ag);
    }

    public final int ad() {
        View ag = ag(0, aJ(), true, false);
        if (ag == null) {
            return -1;
        }
        return bm(ag);
    }

    public final int ae() {
        View ag = ag(aJ() - 1, -1, false, true);
        if (ag == null) {
            return -1;
        }
        return bm(ag);
    }

    public final int af() {
        View ag = ag(aJ() - 1, -1, true, false);
        if (ag == null) {
            return -1;
        }
        return bm(ag);
    }

    final View ag(int i, int i2, boolean z, boolean z2) {
        N();
        int i3 = 320;
        int i4 = true != z ? 320 : 24579;
        if (true != z2) {
            i3 = 0;
        }
        if (this.i == 0) {
            return this.r.a(i, i2, i4, i3);
        }
        return this.s.a(i, i2, i4, i3);
    }

    final View ah(int i, int i2) {
        N();
        if (i2 > i || i2 < i) {
            int h = this.j.h(aK(i));
            int d = this.j.d();
            int i3 = h < d ? 16388 : 4097;
            int i4 = h < d ? 16644 : 4161;
            if (this.i == 0) {
                return this.r.a(i, i2, i4, i3);
            }
            return this.s.a(i, i2, i4, i3);
        }
        return aK(i);
    }

    @Override // defpackage.abs
    public final void aj(int i, int i2, aci aciVar, zs zsVar) {
        if (1 == this.i) {
            i = i2;
        }
        if (aJ() == 0 || i == 0) {
            return;
        }
        N();
        bM(i > 0 ? 1 : -1, Math.abs(i), true, aciVar);
        t(aciVar, this.a, zsVar);
    }

    final View ak(boolean z) {
        if (this.k) {
            return ag(0, aJ(), z, true);
        }
        return ag(aJ() - 1, -1, z, true);
    }

    final View al(boolean z) {
        if (this.k) {
            return ag(aJ() - 1, -1, z, true);
        }
        return ag(0, aJ(), z, true);
    }

    @Override // defpackage.abs
    public void am(RecyclerView recyclerView) {
    }

    @Override // defpackage.afz
    public final void an(View view, View view2) {
        Y("Cannot drop a view during a scroll or layout calculation");
        N();
        k();
        int bm = bm(view);
        int bm2 = bm(view2);
        char c = bm < bm2 ? (char) 1 : (char) 65535;
        if (this.k) {
            if (c == 1) {
                P(bm2, this.j.a() - (this.j.h(view2) + this.j.e(view)));
            } else {
                P(bm2, this.j.a() - this.j.g(view2));
            }
        } else if (c == 65535) {
            P(bm2, this.j.h(view2));
        } else {
            P(bm2, this.j.g(view2) - this.j.e(view));
        }
    }

    @Override // defpackage.abs
    public void ao(RecyclerView recyclerView, int i) {
        aah aahVar = new aah(recyclerView.getContext());
        aahVar.g = i;
        aw(aahVar);
    }

    @Override // defpackage.abs
    public void d(aca acaVar, aci aciVar) {
        View o;
        int i;
        int h;
        int i2;
        int i3;
        int i4;
        int q;
        int i5;
        View I;
        int i6 = -1;
        if ((this.n == null && this.l == -1) || aciVar.b() != 0) {
            LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.n;
            if (linearLayoutManager$SavedState != null && linearLayoutManager$SavedState.a()) {
                this.l = this.n.a;
            }
            N();
            this.a.a = false;
            k();
            View aM = aM();
            aac aacVar = this.o;
            if (!aacVar.e || this.l != -1 || this.n != null) {
                aacVar.a();
                aac aacVar2 = this.o;
                aacVar2.d = this.k ^ this.d;
                if (!aciVar.g && (i = this.l) != -1) {
                    if (i < 0 || i >= aciVar.b()) {
                        this.l = -1;
                        this.m = Integer.MIN_VALUE;
                    } else {
                        aacVar2.b = this.l;
                        LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = this.n;
                        if (linearLayoutManager$SavedState2 != null && linearLayoutManager$SavedState2.a()) {
                            boolean z = this.n.c;
                            aacVar2.d = z;
                            if (z) {
                                aacVar2.c = this.j.a() - this.n.b;
                            } else {
                                aacVar2.c = this.j.d() + this.n.b;
                            }
                        } else if (this.m == Integer.MIN_VALUE) {
                            View I2 = I(this.l);
                            if (I2 != null) {
                                if (this.j.e(I2) > this.j.k()) {
                                    aacVar2.b();
                                } else if (this.j.h(I2) - this.j.d() < 0) {
                                    aacVar2.c = this.j.d();
                                    aacVar2.d = false;
                                } else if (this.j.a() - this.j.g(I2) < 0) {
                                    aacVar2.c = this.j.a();
                                    aacVar2.d = true;
                                } else {
                                    if (aacVar2.d) {
                                        h = this.j.g(I2) + this.j.p();
                                    } else {
                                        h = this.j.h(I2);
                                    }
                                    aacVar2.c = h;
                                }
                            } else {
                                if (aJ() > 0) {
                                    aacVar2.d = (this.l < bm(aK(0))) == this.k;
                                }
                                aacVar2.b();
                            }
                        } else {
                            boolean z2 = this.k;
                            aacVar2.d = z2;
                            if (z2) {
                                aacVar2.c = this.j.a() - this.m;
                            } else {
                                aacVar2.c = this.j.d() + this.m;
                            }
                        }
                        this.o.e = true;
                    }
                }
                if (aJ() != 0) {
                    View aM2 = aM();
                    if (aM2 != null) {
                        abt abtVar = (abt) aM2.getLayoutParams();
                        if (!abtVar.RU() && abtVar.RW() >= 0 && abtVar.RW() < aciVar.b()) {
                            aacVar2.c(aM2, bm(aM2));
                            this.o.e = true;
                        }
                    }
                    boolean z3 = this.b;
                    boolean z4 = this.d;
                    if (z3 == z4 && (o = o(acaVar, aciVar, aacVar2.d, z4)) != null) {
                        aacVar2.d(o, bm(o));
                        if (!aciVar.g && RZ()) {
                            int h2 = this.j.h(o);
                            int g = this.j.g(o);
                            int d = this.j.d();
                            int a = this.j.a();
                            boolean z5 = g <= d && h2 < d;
                            boolean z6 = h2 >= a && g > a;
                            if (z5 || z6) {
                                if (true == aacVar2.d) {
                                    d = a;
                                }
                                aacVar2.c = d;
                            }
                        }
                        this.o.e = true;
                    }
                }
                aacVar2.b();
                aacVar2.b = this.d ? aciVar.b() - 1 : 0;
                this.o.e = true;
            } else if (aM != null && (this.j.h(aM) >= this.j.a() || this.j.g(aM) <= this.j.d())) {
                this.o.c(aM, bm(aM));
            }
            aae aaeVar = this.a;
            aaeVar.f = aaeVar.k >= 0 ? 1 : -1;
            int[] iArr = this.h;
            iArr[0] = 0;
            iArr[1] = 0;
            K(aciVar, iArr);
            int max = Math.max(0, this.h[0]) + this.j.d();
            int max2 = Math.max(0, this.h[1]) + this.j.m();
            if (aciVar.g && (i5 = this.l) != -1 && this.m != Integer.MIN_VALUE && (I = I(i5)) != null) {
                int a2 = this.k ? (this.j.a() - this.j.g(I)) - this.m : this.m - (this.j.h(I) - this.j.d());
                if (a2 > 0) {
                    max += a2;
                } else {
                    max2 -= a2;
                }
            }
            aac aacVar3 = this.o;
            if (!aacVar3.d ? true != this.k : true == this.k) {
                i6 = 1;
            }
            l(acaVar, aciVar, aacVar3, i6);
            aQ(acaVar);
            this.a.m = W();
            aae aaeVar2 = this.a;
            aaeVar2.j = aciVar.g;
            aaeVar2.i = 0;
            aac aacVar4 = this.o;
            if (aacVar4.d) {
                bH(aacVar4);
                aae aaeVar3 = this.a;
                aaeVar3.h = max;
                Z(acaVar, aaeVar3, aciVar, false);
                aae aaeVar4 = this.a;
                i3 = aaeVar4.b;
                int i7 = aaeVar4.d;
                int i8 = aaeVar4.c;
                if (i8 > 0) {
                    max2 += i8;
                }
                bF(this.o);
                aae aaeVar5 = this.a;
                aaeVar5.h = max2;
                aaeVar5.d += aaeVar5.e;
                Z(acaVar, aaeVar5, aciVar, false);
                aae aaeVar6 = this.a;
                i2 = aaeVar6.b;
                int i9 = aaeVar6.c;
                if (i9 > 0) {
                    bI(i7, i3);
                    aae aaeVar7 = this.a;
                    aaeVar7.h = i9;
                    Z(acaVar, aaeVar7, aciVar, false);
                    i3 = this.a.b;
                }
            } else {
                bF(aacVar4);
                aae aaeVar8 = this.a;
                aaeVar8.h = max2;
                Z(acaVar, aaeVar8, aciVar, false);
                aae aaeVar9 = this.a;
                i2 = aaeVar9.b;
                int i10 = aaeVar9.d;
                int i11 = aaeVar9.c;
                if (i11 > 0) {
                    max += i11;
                }
                bH(this.o);
                aae aaeVar10 = this.a;
                aaeVar10.h = max;
                aaeVar10.d += aaeVar10.e;
                Z(acaVar, aaeVar10, aciVar, false);
                aae aaeVar11 = this.a;
                i3 = aaeVar11.b;
                int i12 = aaeVar11.c;
                if (i12 > 0) {
                    bG(i10, i2);
                    aae aaeVar12 = this.a;
                    aaeVar12.h = i12;
                    Z(acaVar, aaeVar12, aciVar, false);
                    i2 = this.a.b;
                }
            }
            if (aJ() > 0) {
                if (this.k ^ this.d) {
                    int q2 = q(i2, acaVar, aciVar, true);
                    int i13 = i3 + q2;
                    q = bE(i13, acaVar, aciVar, false);
                    i3 = i13 + q;
                    i4 = i2 + q2;
                } else {
                    int bE = bE(i3, acaVar, aciVar, true);
                    i4 = i2 + bE;
                    q = q(i4, acaVar, aciVar, false);
                    i3 = i3 + bE + q;
                }
                i2 = i4 + q;
            }
            if (aciVar.k && aJ() != 0 && !aciVar.g && RZ()) {
                List<acl> list = acaVar.d;
                int size = list.size();
                int bm = bm(aK(0));
                int i14 = 0;
                int i15 = 0;
                for (int i16 = 0; i16 < size; i16++) {
                    acl aclVar = list.get(i16);
                    if (!aclVar.p()) {
                        if ((aclVar.d() < bm) != this.k) {
                            i14 += this.j.e(aclVar.a);
                        } else {
                            i15 += this.j.e(aclVar.a);
                        }
                    }
                }
                this.a.l = list;
                if (i14 > 0) {
                    bI(bm(bP()), i3);
                    aae aaeVar13 = this.a;
                    aaeVar13.h = i14;
                    aaeVar13.c = 0;
                    aaeVar13.c();
                    Z(acaVar, this.a, aciVar, false);
                }
                if (i15 > 0) {
                    bG(bm(bQ()), i2);
                    aae aaeVar14 = this.a;
                    aaeVar14.h = i15;
                    aaeVar14.c = 0;
                    aaeVar14.c();
                    Z(acaVar, this.a, aciVar, false);
                }
                this.a.l = null;
            }
            if (!aciVar.g) {
                aax aaxVar = this.j;
                aaxVar.b = aaxVar.k();
            } else {
                this.o.a();
            }
            this.b = this.d;
            return;
        }
        bc(acaVar);
    }

    @Override // defpackage.abs
    public void e(aci aciVar) {
        this.n = null;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.o.a();
    }

    @Override // defpackage.abs
    public abt f() {
        return new abt(-2, -2);
    }

    public void l(aca acaVar, aci aciVar, aac aacVar, int i) {
    }

    @Override // defpackage.abs
    public int m(int i, aca acaVar, aci aciVar) {
        if (this.i == 1) {
            return 0;
        }
        return X(i, acaVar, aciVar);
    }

    @Override // defpackage.abs
    public int n(int i, aca acaVar, aci aciVar) {
        if (this.i == 0) {
            return 0;
        }
        return X(i, acaVar, aciVar);
    }

    public View o(aca acaVar, aci aciVar, boolean z, boolean z2) {
        int i;
        int i2;
        N();
        int aJ = aJ();
        int i3 = -1;
        if (z2) {
            i = aJ() - 1;
            i2 = -1;
        } else {
            i3 = aJ;
            i = 0;
            i2 = 1;
        }
        int b = aciVar.b();
        int d = this.j.d();
        int a = this.j.a();
        View view = null;
        View view2 = null;
        View view3 = null;
        while (i != i3) {
            View aK = aK(i);
            int bm = bm(aK);
            int h = this.j.h(aK);
            int g = this.j.g(aK);
            if (bm >= 0 && bm < b) {
                if (!((abt) aK.getLayoutParams()).RU()) {
                    boolean z3 = g <= d && h < d;
                    boolean z4 = h >= a && g > a;
                    if (!z3 && !z4) {
                        return aK;
                    }
                    if (z) {
                        if (!z4) {
                            if (view != null) {
                            }
                            view = aK;
                        }
                        view2 = aK;
                    } else {
                        if (!z3) {
                            if (view != null) {
                            }
                            view = aK;
                        }
                        view2 = aK;
                    }
                } else if (view3 == null) {
                    view3 = aK;
                }
            }
            i += i2;
        }
        return view != null ? view : view2 == null ? view3 : view2;
    }

    public void p(aca acaVar, aci aciVar, aae aaeVar, aad aadVar) {
        int i;
        int i2;
        int i3;
        int i4;
        View b = aaeVar.b(acaVar);
        if (b == null) {
            aadVar.b = true;
            return;
        }
        abt abtVar = (abt) b.getLayoutParams();
        if (aaeVar.l == null) {
            if (this.k == (aaeVar.f == -1)) {
                aB(b);
            } else {
                aC(b, 0);
            }
        } else {
            if (this.k == (aaeVar.f == -1)) {
                az(b);
            } else {
                aA(b, 0);
            }
        }
        bt(b);
        aadVar.a = this.j.e(b);
        if (this.i == 1) {
            if (M()) {
                i4 = this.D - getPaddingRight();
                i = i4 - this.j.f(b);
            } else {
                i = getPaddingLeft();
                i4 = this.j.f(b) + i;
            }
            if (aaeVar.f == -1) {
                i2 = aaeVar.b;
                i3 = i2 - aadVar.a;
            } else {
                i3 = aaeVar.b;
                i2 = aadVar.a + i3;
            }
        } else {
            int paddingTop = getPaddingTop();
            int f = this.j.f(b) + paddingTop;
            if (aaeVar.f == -1) {
                int i5 = aaeVar.b;
                int i6 = i5 - aadVar.a;
                i4 = i5;
                i2 = f;
                i = i6;
                i3 = paddingTop;
            } else {
                int i7 = aaeVar.b;
                int i8 = aadVar.a + i7;
                i = i7;
                i2 = f;
                i3 = paddingTop;
                i4 = i8;
            }
        }
        bs(b, i, i3, i4, i2);
        if (abtVar.RU() || abtVar.RV()) {
            aadVar.c = true;
        }
        aadVar.d = b.hasFocusable();
    }

    public void t(aci aciVar, aae aaeVar, zs zsVar) {
        int i = aaeVar.d;
        if (i < 0 || i >= aciVar.b()) {
            return;
        }
        zsVar.b(i, Math.max(0, aaeVar.g));
    }

    public aag(int i, boolean z) {
        this.i = 1;
        this.c = false;
        this.k = false;
        this.d = false;
        this.e = true;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.n = null;
        this.o = new aac();
        this.f = new aad();
        this.g = 2;
        this.h = new int[2];
        G(i);
        H(z);
    }

    private final void bN(aca acaVar, int i, int i2) {
        if (i == i2) {
            return;
        }
        if (i2 <= i) {
            while (i > i2) {
                aI(i, acaVar);
                i--;
            }
            return;
        }
        while (true) {
            i2--;
            if (i2 < i) {
                return;
            }
            aI(i2, acaVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int ab(int i) {
        return i != 1 ? i != 2 ? i != 17 ? i != 33 ? i != 66 ? (i == 130 && this.i == 1) ? 1 : Integer.MIN_VALUE : this.i == 0 ? 1 : Integer.MIN_VALUE : this.i == 1 ? -1 : Integer.MIN_VALUE : this.i == 0 ? -1 : Integer.MIN_VALUE : (this.i != 1 && M()) ? -1 : 1 : (this.i != 1 && M()) ? 1 : -1;
    }

    @Override // defpackage.abs
    public final void ai(int i, zs zsVar) {
        boolean z;
        int i2;
        LinearLayoutManager$SavedState linearLayoutManager$SavedState = this.n;
        int i3 = -1;
        if (linearLayoutManager$SavedState == null || !linearLayoutManager$SavedState.a()) {
            k();
            z = this.k;
            i2 = this.l;
            if (i2 == -1) {
                i2 = z ? i - 1 : 0;
            }
        } else {
            LinearLayoutManager$SavedState linearLayoutManager$SavedState2 = this.n;
            z = linearLayoutManager$SavedState2.c;
            i2 = linearLayoutManager$SavedState2.a;
        }
        if (true != z) {
            i3 = 1;
        }
        for (int i4 = 0; i4 < this.g && i2 >= 0 && i2 < i; i4++) {
            zsVar.b(i2, 0);
            i2 += i3;
        }
    }

    public final void G(int i) {
        if (i == 0 || i == 1) {
            Y(null);
            if (i == this.i && this.j != null) {
                return;
            }
            aax q = aax.q(this, i);
            this.j = q;
            this.o.a = q;
            this.i = i;
            as();
            return;
        }
        throw new IllegalArgumentException("invalid orientation:" + i);
    }
}
