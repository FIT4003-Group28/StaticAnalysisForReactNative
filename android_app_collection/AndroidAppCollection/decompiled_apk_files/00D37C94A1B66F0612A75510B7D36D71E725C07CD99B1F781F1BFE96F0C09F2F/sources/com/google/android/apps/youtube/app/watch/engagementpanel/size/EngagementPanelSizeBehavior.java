package com.google.android.apps.youtube.app.watch.engagementpanel.size;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class EngagementPanelSizeBehavior extends ajc implements nte {
    private final int a;
    private final nrl b;
    private final nqk c;
    private final nsk d;
    private nsj e;
    private final azpd f = azpd.ar();
    private final azpa g;
    private final aynx h;
    private final azpd i;
    private boolean j;
    private View k;

    public EngagementPanelSizeBehavior(Context context, nqk nqkVar, nrl nrlVar, nsk nskVar) {
        this.b = nrlVar;
        this.c = nqkVar;
        this.d = nskVar;
        azpa as = azpa.as(false);
        this.g = as;
        this.i = azpd.ar();
        this.a = ViewConfiguration.get(context).getScaledMinimumFlingVelocity() * 32;
        this.h = as.n().q(new npy(4)).h(nps.e);
    }

    private final boolean z() {
        Boolean bool = (Boolean) this.g.at();
        return bool != null && bool.booleanValue();
    }

    @Override // defpackage.ajc
    public final void c(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int[] iArr, int i3) {
        if (!this.j) {
            return;
        }
        nsj nsjVar = this.e;
        if (i2 <= 0 || !z() || nsjVar == null) {
            return;
        }
        int i4 = nsjVar.n;
        this.f.c(Integer.valueOf(-i2));
        int max = Math.max(0, Math.min(i2, -(nsjVar.n - i4)));
        if (max <= 0) {
            return;
        }
        iArr[1] = iArr[1] + max;
    }

    @Override // defpackage.ajc
    public final void d(CoordinatorLayout coordinatorLayout, View view, View view2, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (!this.j) {
            return;
        }
        if (i4 < 0) {
            this.g.c(true);
            this.f.c(Integer.valueOf(-i4));
            iArr[1] = iArr[1] + i4;
            nsj nsjVar = this.e;
            nsjVar.getClass();
            if (nsjVar.n <= this.d.b().bottom) {
                return;
            }
            y();
        } else if (i4 != 0 || z()) {
        } else {
            this.j = false;
        }
    }

    @Override // defpackage.ajc
    public final void e(CoordinatorLayout coordinatorLayout, View view, View view2, int i) {
        y();
    }

    @Override // defpackage.ajc
    public final boolean i(CoordinatorLayout coordinatorLayout, View view, View view2, float f, float f2, boolean z) {
        if (!this.j) {
            return false;
        }
        float abs = Math.abs(f2);
        if (f2 > 0.0f || abs < this.a || !z()) {
            return false;
        }
        this.i.c(ntd.FLING_DOWN);
        this.g.c(false);
        return true;
    }

    @Override // defpackage.ajc
    public final boolean l(CoordinatorLayout coordinatorLayout, View view, View view2, View view3, int i, int i2) {
        nmc nmcVar = this.c.d;
        boolean z = false;
        if (nmcVar != null) {
            View view4 = this.k;
            boolean z2 = view4 == null || view4 == view2;
            nsj nsjVar = this.e;
            if (nsjVar != null && nsjVar.o != nsr.HIDDEN && this.b.e() && !nmcVar.r() && z2) {
                if (i == 2) {
                    z = true;
                }
                this.j = z;
            }
        }
        return z;
    }

    @Override // defpackage.nte
    public final ntc t() {
        return ntc.DOWN_ONLY;
    }

    @Override // defpackage.nte
    public final aynx u() {
        return this.h;
    }

    @Override // defpackage.nte
    public final aynx v() {
        return this.i;
    }

    @Override // defpackage.nte
    public final aynx w() {
        return this.f;
    }

    public final void x(nsj nsjVar, View view) {
        this.e = nsjVar;
        this.k = view;
    }

    public final void y() {
        if (z()) {
            this.i.c(ntd.NO_FLING);
            this.g.c(false);
        }
        this.j = false;
    }
}
