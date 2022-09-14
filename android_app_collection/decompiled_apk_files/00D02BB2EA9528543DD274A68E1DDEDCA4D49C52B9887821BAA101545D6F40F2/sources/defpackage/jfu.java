package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: jfu  reason: default package */
/* loaded from: classes7.dex */
public class jfu extends abs {
    public int a = 0;
    public aax b = aax.r(this);
    private int e = 0;
    public int c = 0;
    public boolean d = false;

    private final void l(aca acaVar) {
        View view;
        if (aJ() != 0) {
            View aK = aK(0);
            View aK2 = aK(aJ() - 1);
            int h = this.b.h(aK);
            p(acaVar, bm(aK2) + 1, this.b.g(aK2), false);
            p(acaVar, bm(aK) - 1, h, true);
        } else if (this.d) {
            int b = this.b.b();
            int i = this.c;
            View d = acaVar.d(this.e);
            aB(d);
            bt(d);
            o(d, ((b / 2) + i) - (this.b.e(d) / 2), false);
            p(acaVar, this.e + 1, this.b.g(d), false);
            p(acaVar, this.e - 1, this.b.h(d), true);
        } else {
            p(acaVar, this.e, this.c, false);
            p(acaVar, this.e - 1, this.c, true);
            View aK3 = aK(0);
            int a = this.b.a() - this.b.g(aK(aJ() - 1));
            if (a > 0) {
                int h2 = this.b.h(aK3);
                int i2 = 0;
                for (int bm = bm(aK(0)) - 1; bm >= 0 && a > i2; bm--) {
                    View d2 = acaVar.d(bm);
                    aC(d2, 0);
                    bt(d2);
                    int e = this.b.e(d2);
                    h2 -= e;
                    o(d2, h2, false);
                    i2 += e;
                }
                this.b.c(Math.min(a, i2));
            }
        }
        int b2 = this.b.b();
        int aJ = aJ();
        while (true) {
            aJ--;
            if (aJ < 0) {
                break;
            }
            View aK4 = aK(aJ);
            int h3 = this.b.h(aK4);
            int g = this.b.g(aK4);
            if (h3 >= b2 || g <= 0) {
                aG(aJ);
                acaVar.e(aK4);
            }
        }
        if (aJ() == 0) {
            this.e = 0;
            this.c = 0;
        } else if (this.d) {
            int b3 = this.b.b() / 2;
            int i3 = 0;
            while (true) {
                if (i3 >= aJ()) {
                    view = null;
                    break;
                }
                view = aK(i3);
                if (this.b.g(view) > b3) {
                    break;
                }
                i3++;
            }
            if (view != null) {
                this.e = bm(view);
                this.c = ((this.b.g(view) + this.b.h(view)) / 2) - b3;
                return;
            }
            this.e = 0;
            this.c = 0;
        } else {
            this.e = bm(aK(0));
            this.c = this.b.h(aK(0));
        }
    }

    private final int o(View view, int i, boolean z) {
        int i2;
        abt abtVar = (abt) view.getLayoutParams();
        int bk = bk(view) + abtVar.leftMargin + abtVar.rightMargin;
        abt abtVar2 = (abt) view.getLayoutParams();
        int bj = bj(view) + abtVar2.topMargin + abtVar2.bottomMargin;
        int i3 = 0;
        if (this.a != 0) {
            i3 = ((((this.D - getPaddingLeft()) - getPaddingRight()) - bk) / 2) + getPaddingLeft();
            i2 = 0;
        } else {
            i2 = ((((this.E - getPaddingTop()) - getPaddingBottom()) - bj) / 2) + getPaddingTop();
        }
        int e = this.b.e(view);
        bs(view, i3, i2, bk + i3, bj + i2);
        if (z) {
            int i4 = i - e;
            this.b.l(view, i4);
            return i4;
        }
        this.b.l(view, i);
        return i + e;
    }

    private final void p(aca acaVar, int i, int i2, boolean z) {
        int b = this.b.b();
        while (i >= 0 && i < aN()) {
            if (z && i2 <= 0) {
                return;
            }
            if (!z && i2 >= b) {
                return;
            }
            View d = acaVar.d(i);
            bt(d);
            if (z) {
                aC(d, 0);
            } else {
                aB(d);
            }
            i2 = o(d, i2, z);
            i = z ? i - 1 : i + 1;
        }
    }

    private final void q() {
        int i;
        int aN = aN();
        if (aN <= 1) {
            i = 0;
        } else if (this.e < aN) {
            return;
        } else {
            i = aN - 1;
        }
        this.e = i;
    }

    private final int t(int i, aca acaVar) {
        if (aJ() == 0) {
            return 0;
        }
        int i2 = this.c;
        int i3 = i2 - i;
        if (i >= 0) {
            View aK = aK(aJ() - 1);
            if (bm(aK) == aN() - 1) {
                if (this.d) {
                    int d = (this.b.d() + this.b.a()) / 2;
                    int h = (this.b.h(aK) + this.b.g(aK)) / 2;
                    int i4 = h - i;
                    if (h > d) {
                        if (i4 <= d) {
                            i = h - d;
                        }
                    }
                    i = 0;
                } else {
                    int g = this.b.g(aK);
                    int i5 = g - i;
                    int b = this.b.b();
                    if (g > b) {
                        if (i5 <= b) {
                            i = g - b;
                        }
                    }
                    i = 0;
                }
            }
        } else if (this.e == 0 && i3 >= 0) {
            i = i2;
        }
        this.b.c(-i);
        this.c -= i;
        l(acaVar);
        return i;
    }

    @Override // defpackage.abs
    public final boolean D() {
        return this.a == 0;
    }

    @Override // defpackage.abs
    public final boolean E() {
        return this.a == 1;
    }

    @Override // defpackage.abs
    public final void O(int i) {
        if (i < 0 || i >= aN()) {
            aN();
            return;
        }
        this.e = i;
        this.c = 0;
        as();
    }

    @Override // defpackage.abs
    public final boolean RZ() {
        return false;
    }

    @Override // defpackage.abs
    public final void aX(abg abgVar, abg abgVar2) {
        aE();
    }

    @Override // defpackage.abs
    public final void bt(View view) {
        abt abtVar = (abt) view.getLayoutParams();
        view.measure(aU(this.D, 1073741824, abtVar.leftMargin + abtVar.rightMargin + getPaddingLeft() + getPaddingRight(), abtVar.width, false), aU(this.E, 1073741824, abtVar.topMargin + abtVar.bottomMargin + getPaddingTop() + getPaddingBottom(), abtVar.height, false));
    }

    @Override // defpackage.abs
    public void d(aca acaVar, aci aciVar) {
        q();
        if (aN() == 0) {
            aQ(acaVar);
            return;
        }
        aQ(acaVar);
        l(acaVar);
    }

    @Override // defpackage.abs
    public final abt f() {
        return new abt(-2, -2);
    }

    public final int k() {
        q();
        return this.e;
    }

    @Override // defpackage.abs
    public int m(int i, aca acaVar, aci aciVar) {
        if (!D()) {
            return 0;
        }
        return t(i, acaVar);
    }

    @Override // defpackage.abs
    public final int n(int i, aca acaVar, aci aciVar) {
        if (!E()) {
            return 0;
        }
        return t(i, acaVar);
    }
}
