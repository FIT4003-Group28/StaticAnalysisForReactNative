package defpackage;

import android.graphics.PointF;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: wq  reason: default package */
/* loaded from: classes4.dex */
public class wq extends xz {
    private xd b;
    private xd c;

    public wq() {
        super(null);
    }

    private int i(xw xwVar, xd xdVar, int i, int i2) {
        int[] g = g(i, i2);
        int aq = xwVar.aq();
        float f = 1.0f;
        if (aq != 0) {
            int i3 = Integer.MAX_VALUE;
            int i4 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            View view = null;
            View view2 = null;
            for (int i5 = 0; i5 < aq; i5++) {
                View az = xwVar.az(i5);
                int bm = xw.bm(az);
                if (bm != -1) {
                    int i6 = bm < i3 ? bm : i3;
                    if (bm < i3) {
                        view = az;
                    }
                    if (bm > i4) {
                        view2 = az;
                        i4 = bm;
                    }
                    i3 = i6;
                }
            }
            if (view != null && view2 != null) {
                int max = Math.max(xdVar.a(view), xdVar.a(view2)) - Math.min(xdVar.d(view), xdVar.d(view2));
                if (max != 0) {
                    f = max / ((i4 - i3) + 1);
                }
            }
        }
        if (f <= 0.0f) {
            return 0;
        }
        return Math.round((Math.abs(g[0]) > Math.abs(g[1]) ? g[0] : g[1]) / f);
    }

    private final xd j(xw xwVar) {
        xd xdVar = this.c;
        if (xdVar == null || xdVar.a != xwVar) {
            this.c = xd.p(xwVar);
        }
        return this.c;
    }

    private final xd k(xw xwVar) {
        xd xdVar = this.b;
        if (xdVar == null || xdVar.a != xwVar) {
            this.b = xd.r(xwVar);
        }
        return this.b;
    }

    private static final int l(View view, xd xdVar) {
        return (xdVar.d(view) + (xdVar.b(view) / 2)) - (xdVar.j() + (xdVar.k() / 2));
    }

    private static final View m(xw xwVar, xd xdVar) {
        int aq = xwVar.aq();
        View view = null;
        if (aq == 0) {
            return null;
        }
        int j = xdVar.j() + (xdVar.k() / 2);
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < aq) {
            View az = xwVar.az(i2);
            int abs = Math.abs((xdVar.d(az) + (xdVar.b(az) / 2)) - j);
            int i3 = abs < i ? abs : i;
            if (abs < i) {
                view = az;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    @Override // defpackage.xz
    public int a(xw xwVar, int i, int i2) {
        int at;
        View b;
        int bm;
        int i3;
        PointF O;
        int i4;
        int i5;
        if (!(xwVar instanceof yj) || (at = xwVar.at()) == 0 || (b = b(xwVar)) == null || (bm = xw.bm(b)) == -1 || (O = ((yj) xwVar).O(at - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (xwVar.ad()) {
            i4 = i(xwVar, j(xwVar), i, 0);
            if (O.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (xwVar.ae()) {
            i5 = i(xwVar, k(xwVar), 0, i2);
            if (O.y < 0.0f) {
                i5 = -i5;
            }
        } else {
            i5 = 0;
        }
        if (true == xwVar.ae()) {
            i4 = i5;
        }
        if (i4 == 0) {
            return -1;
        }
        int i7 = bm + i4;
        if (i7 >= 0) {
            i6 = i7;
        }
        return i6 >= at ? i3 : i6;
    }

    @Override // defpackage.xz
    public final View b(xw xwVar) {
        if (xwVar.ae()) {
            return m(xwVar, k(xwVar));
        }
        if (!xwVar.ad()) {
            return null;
        }
        return m(xwVar, j(xwVar));
    }

    @Override // defpackage.xz
    public final int[] c(xw xwVar, View view) {
        int[] iArr = new int[2];
        if (xwVar.ad()) {
            iArr[0] = l(view, j(xwVar));
        } else {
            iArr[0] = 0;
        }
        if (xwVar.ae()) {
            iArr[1] = l(view, k(xwVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }
}
