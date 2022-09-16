package defpackage;

import android.graphics.PointF;
import android.view.View;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: xf  reason: default package */
/* loaded from: classes4.dex */
public class xf extends xz {
    private xd b;
    private xd c;

    public xf() {
        super(null);
    }

    private final xd i(xw xwVar) {
        xd xdVar = this.c;
        if (xdVar == null || xdVar.a != xwVar) {
            this.c = xd.p(xwVar);
        }
        return this.c;
    }

    private final xd j(xw xwVar) {
        xd xdVar = this.b;
        if (xdVar == null || xdVar.a != xwVar) {
            this.b = xd.r(xwVar);
        }
        return this.b;
    }

    private static final int k(View view, xd xdVar) {
        return (xdVar.d(view) + (xdVar.b(view) / 2)) - (xdVar.j() + (xdVar.k() / 2));
    }

    private static final View l(xw xwVar, xd xdVar) {
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
        xd i3;
        PointF O;
        int at = xwVar.at();
        if (at != 0) {
            View view = null;
            if (xwVar.ae()) {
                i3 = j(xwVar);
            } else {
                i3 = xwVar.ad() ? i(xwVar) : null;
            }
            if (i3 == null) {
                return -1;
            }
            int aq = xwVar.aq();
            boolean z = false;
            View view2 = null;
            int i4 = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < aq; i6++) {
                View az = xwVar.az(i6);
                if (az != null) {
                    int k = k(az, i3);
                    if (k <= 0 && k > i4) {
                        view2 = az;
                        i4 = k;
                    }
                    if (k >= 0 && k < i5) {
                        view = az;
                        i5 = k;
                    }
                }
            }
            int i7 = 1;
            boolean z2 = !xwVar.ad() ? i2 > 0 : i > 0;
            if (z2 && view != null) {
                return xw.bm(view);
            }
            if (!z2 && view2 != null) {
                return xw.bm(view2);
            }
            if (true == z2) {
                view = view2;
            }
            if (view == null) {
                return -1;
            }
            int bm = xw.bm(view);
            int at2 = xwVar.at();
            if ((xwVar instanceof yj) && (O = ((yj) xwVar).O(at2 - 1)) != null && (O.x < 0.0f || O.y < 0.0f)) {
                z = true;
            }
            if (z == z2) {
                i7 = -1;
            }
            int i8 = bm + i7;
            if (i8 >= 0 && i8 < at) {
                return i8;
            }
        }
        return -1;
    }

    @Override // defpackage.xz
    public View b(xw xwVar) {
        if (xwVar.ae()) {
            return l(xwVar, j(xwVar));
        }
        if (!xwVar.ad()) {
            return null;
        }
        return l(xwVar, i(xwVar));
    }

    @Override // defpackage.xz
    public int[] c(xw xwVar, View view) {
        int[] iArr = new int[2];
        if (xwVar.ad()) {
            iArr[0] = k(view, i(xwVar));
        } else {
            iArr[0] = 0;
        }
        if (xwVar.ae()) {
            iArr[1] = k(view, j(xwVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.xz
    public final yk d(xw xwVar) {
        if (!(xwVar instanceof yj)) {
            return null;
        }
        return new xe(this, this.a.getContext());
    }
}
