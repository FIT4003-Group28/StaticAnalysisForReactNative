package defpackage;

import android.graphics.PointF;
import android.view.View;
/* compiled from: PG */
/* renamed from: aaz  reason: default package */
/* loaded from: classes2.dex */
public final class aaz extends adz {
    private aax c;
    private aax d;

    private final aax h(abs absVar) {
        aax aaxVar = this.c;
        if (aaxVar == null || aaxVar.a != absVar) {
            this.c = aax.s(absVar);
        }
        return this.c;
    }

    private final aax i(abs absVar) {
        aax aaxVar = this.d;
        if (aaxVar == null || aaxVar.a != absVar) {
            this.d = aax.r(absVar);
        }
        return this.d;
    }

    private static final int j(View view, aax aaxVar) {
        return (aaxVar.h(view) + (aaxVar.e(view) / 2)) - (aaxVar.d() + (aaxVar.k() / 2));
    }

    private static final View k(abs absVar, aax aaxVar) {
        int aJ = absVar.aJ();
        View view = null;
        if (aJ == 0) {
            return null;
        }
        int d = aaxVar.d() + (aaxVar.k() / 2);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < aJ) {
            View aK = absVar.aK(i2);
            int abs = Math.abs((aaxVar.h(aK) + (aaxVar.e(aK) / 2)) - d);
            int i3 = abs < i ? abs : i;
            if (abs < i) {
                view = aK;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    @Override // defpackage.adz
    public final int[] a(abs absVar, View view) {
        int[] iArr = new int[2];
        if (absVar.D()) {
            iArr[0] = j(view, i(absVar));
        } else {
            iArr[0] = 0;
        }
        if (absVar.E()) {
            iArr[1] = j(view, h(absVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.adz
    public final int b(abs absVar, int i, int i2) {
        aax i3;
        PointF L;
        int aN = absVar.aN();
        if (aN != 0) {
            View view = null;
            if (absVar.E()) {
                i3 = h(absVar);
            } else {
                i3 = absVar.D() ? i(absVar) : null;
            }
            if (i3 == null) {
                return -1;
            }
            int aJ = absVar.aJ();
            boolean z = false;
            View view2 = null;
            int i4 = Integer.MIN_VALUE;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < aJ; i6++) {
                View aK = absVar.aK(i6);
                if (aK != null) {
                    int j = j(aK, i3);
                    if (j <= 0 && j > i4) {
                        view2 = aK;
                        i4 = j;
                    }
                    if (j >= 0 && j < i5) {
                        view = aK;
                        i5 = j;
                    }
                }
            }
            int i7 = 1;
            boolean z2 = !absVar.D() ? i2 > 0 : i > 0;
            if (z2 && view != null) {
                return abs.bm(view);
            }
            if (!z2 && view2 != null) {
                return abs.bm(view2);
            }
            if (true == z2) {
                view = view2;
            }
            if (view == null) {
                return -1;
            }
            int bm = abs.bm(view);
            int aN2 = absVar.aN();
            if ((absVar instanceof acg) && (L = ((acg) absVar).L(aN2 - 1)) != null && (L.x < 0.0f || L.y < 0.0f)) {
                z = true;
            }
            if (z == z2) {
                i7 = -1;
            }
            int i8 = bm + i7;
            if (i8 >= 0 && i8 < aN) {
                return i8;
            }
        }
        return -1;
    }

    @Override // defpackage.adz
    public final View c(abs absVar) {
        if (absVar.E()) {
            return k(absVar, h(absVar));
        }
        if (!absVar.D()) {
            return null;
        }
        return k(absVar, i(absVar));
    }

    @Override // defpackage.adz
    protected final ach d(abs absVar) {
        if (!(absVar instanceof acg)) {
            return null;
        }
        return new aay(this, this.a.getContext());
    }
}
