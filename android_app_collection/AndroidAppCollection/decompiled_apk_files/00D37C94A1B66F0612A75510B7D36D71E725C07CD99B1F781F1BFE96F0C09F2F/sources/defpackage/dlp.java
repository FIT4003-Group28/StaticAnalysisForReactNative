package defpackage;

import android.graphics.PointF;
import android.support.v7.widget.RecyclerView;
import android.view.View;
/* compiled from: PG */
/* renamed from: dlp  reason: default package */
/* loaded from: classes3.dex */
public final class dlp extends xz {
    public RecyclerView b;
    private xd c;
    private xd d;
    private xw e;
    private xw f;
    private final int g;

    public dlp(int i) {
        super(null);
        this.g = i;
    }

    private final xd i(xw xwVar) {
        if (this.d == null || this.f != xwVar) {
            this.d = xd.p(xwVar);
            this.f = xwVar;
        }
        return this.d;
    }

    private final xd j(xw xwVar) {
        if (this.c == null || this.e != xwVar) {
            this.c = xd.r(xwVar);
            this.e = xwVar;
        }
        return this.c;
    }

    private static View k(xw xwVar, xd xdVar) {
        int aq = xwVar.aq();
        View view = null;
        if (aq == 0) {
            return null;
        }
        int j = xdVar.j();
        int i = Integer.MAX_VALUE;
        int i2 = 0;
        while (i2 < aq) {
            View az = xwVar.az(i2);
            int abs = Math.abs(xdVar.d(az) - j);
            int i3 = abs < i ? abs : i;
            if (abs < i) {
                view = az;
            }
            i2++;
            i = i3;
        }
        return view;
    }

    private static final int l(View view, xd xdVar) {
        return xdVar.d(view) - xdVar.j();
    }

    @Override // defpackage.xz
    public final int a(xw xwVar, int i, int i2) {
        int bm;
        PointF O;
        int at = xwVar.at();
        if (at == 0) {
            return -1;
        }
        boolean ad = xwVar.ad();
        xd i3 = ad ? i(xwVar) : j(xwVar);
        int aq = xwVar.aq();
        View view = null;
        int i4 = 0;
        if (aq != 0) {
            int j = i3.j();
            int i5 = Integer.MAX_VALUE;
            for (int i6 = 0; i6 < aq; i6++) {
                View az = xwVar.az(i6);
                int d = i3.d(az);
                int abs = Math.abs(d - j);
                if (d < j && abs < i5) {
                    view = az;
                    i5 = abs;
                }
            }
        }
        if (view == null || (bm = xw.bm(view)) == -1) {
            return -1;
        }
        boolean z = true;
        boolean z2 = !ad ? i2 > 0 : i > 0;
        if (!(xwVar instanceof yj) || (O = ((yj) xwVar).O(at - 1)) == null || (O.x >= 0.0f && O.y >= 0.0f)) {
            z = false;
        }
        if (z2) {
            int i7 = this.g;
            bm = z ? bm - i7 : bm + i7;
        }
        if (bm >= 0) {
            i4 = bm;
        }
        return i4 >= at ? at - 1 : i4;
    }

    @Override // defpackage.xz
    public final View b(xw xwVar) {
        if (xwVar.ae()) {
            return k(xwVar, j(xwVar));
        }
        if (!xwVar.ad()) {
            return null;
        }
        return k(xwVar, i(xwVar));
    }

    @Override // defpackage.xz
    public final int[] c(xw xwVar, View view) {
        int[] iArr = new int[2];
        if (xwVar.ad()) {
            iArr[0] = l(view, i(xwVar));
        } else {
            iArr[0] = 0;
        }
        if (xwVar.ae()) {
            iArr[1] = l(view, j(xwVar));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // defpackage.xz
    public final void e(RecyclerView recyclerView) {
        this.b = recyclerView;
        super.e(recyclerView);
    }

    @Override // defpackage.xz
    protected final yk h(xw xwVar) {
        if (!(xwVar instanceof yj)) {
            return null;
        }
        return new dlo(this, this.b.getContext());
    }
}
