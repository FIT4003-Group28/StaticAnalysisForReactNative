package defpackage;

import android.graphics.PointF;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: dja  reason: default package */
/* loaded from: classes3.dex */
public final class dja extends wq {
    private static int b = Integer.MAX_VALUE;

    public dja(int i) {
        b = i;
    }

    private final int i(xw xwVar, xd xdVar, int i, int i2) {
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

    @Override // defpackage.wq, defpackage.xz
    public final int a(xw xwVar, int i, int i2) {
        int at;
        View b2;
        int bm;
        int i3;
        PointF O;
        int i4;
        int i5;
        if (!(xwVar instanceof yj) || (at = xwVar.at()) == 0 || (b2 = b(xwVar)) == null || (bm = xw.bm(b2)) == -1 || (O = ((yj) xwVar).O(at - 1)) == null) {
            return -1;
        }
        int i6 = 0;
        if (xwVar.ad()) {
            i4 = i(xwVar, xd.p(xwVar), i, 0);
            int i7 = b;
            if (i4 > i7) {
                i4 = i7;
            }
            if (i4 < (-i7)) {
                i4 = -i7;
            }
            if (O.x < 0.0f) {
                i4 = -i4;
            }
        } else {
            i4 = 0;
        }
        if (xwVar.ae()) {
            i5 = i(xwVar, xd.r(xwVar), 0, i2);
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
        int i8 = bm + i4;
        if (i8 >= 0) {
            i6 = i8;
        }
        return i6 >= at ? i3 : i6;
    }
}
