package defpackage;

import android.graphics.PointF;
import android.view.View;
/* compiled from: PG */
/* renamed from: aai  reason: default package */
/* loaded from: classes2.dex */
public class aai extends adz {
    private aax c;
    private aax d;

    private final int h(abs absVar, aax aaxVar, int i, int i2) {
        int max;
        this.b.fling(0, 0, i, i2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
        int[] iArr = {this.b.getFinalX(), this.b.getFinalY()};
        int aJ = absVar.aJ();
        float f = 1.0f;
        if (aJ != 0) {
            int i3 = Integer.MAX_VALUE;
            int i4 = Integer.MIN_VALUE;
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < aJ; i5++) {
                View aK = absVar.aK(i5);
                int bm = abs.bm(aK);
                if (bm != -1) {
                    int i6 = bm < i3 ? bm : i3;
                    if (bm < i3) {
                        view = aK;
                    }
                    if (bm > i4) {
                        view2 = aK;
                        i4 = bm;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null && (max = Math.max(aaxVar.g(view), aaxVar.g(view2)) - Math.min(aaxVar.h(view), aaxVar.h(view2))) != 0) {
                f = max / ((i4 - i3) + 1);
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(iArr[0]) > Math.abs(iArr[1]) ? iArr[0] : iArr[1]) / f);
    }

    private final aax i(abs absVar) {
        aax aaxVar = this.c;
        if (aaxVar == null || aaxVar.a != absVar) {
            this.c = aax.s(absVar);
        }
        return this.c;
    }

    private final aax j(abs absVar) {
        aax aaxVar = this.d;
        if (aaxVar == null || aaxVar.a != absVar) {
            this.d = aax.r(absVar);
        }
        return this.d;
    }

    private static final int k(View view, aax aaxVar) {
        return (aaxVar.h(view) + (aaxVar.e(view) / 2)) - (aaxVar.d() + (aaxVar.k() / 2));
    }

    private static final View l(abs absVar, aax aaxVar) {
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
    public int[] a(abs absVar, View view) {
        int[] iArr = new int[2];
        if (absVar.D()) {
            iArr[0] = k(view, j(absVar));
        } else {
            iArr[0] = 0;
        }
        if (absVar.E()) {
            iArr[1] = k(view, i(absVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.adz
    public int b(abs absVar, int i, int i2) {
        int aN;
        View c;
        int bm;
        int i3;
        PointF L;
        int i4;
        int i5;
        if (!(absVar instanceof acg) || (aN = absVar.aN()) == 0 || (c = c(absVar)) == null || (bm = abs.bm(c)) == -1 || (L = ((acg) absVar).L(aN - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (absVar.D()) {
            i4 = h(absVar, j(absVar), i, 0);
            if (L.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (absVar.E()) {
            i5 = h(absVar, i(absVar), 0, i2);
            if (L.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (true == absVar.E()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = bm + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= aN ? i3 : i6;
    }

    @Override // defpackage.adz
    public View c(abs absVar) {
        if (absVar.E()) {
            return l(absVar, i(absVar));
        }
        if (!absVar.D()) {
            return null;
        }
        return l(absVar, j(absVar));
    }
}
