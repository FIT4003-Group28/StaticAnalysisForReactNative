package com.google.android.apps.youtube.embeddedplayer.service.ui.overlays.adoverlay.shared;

import android.net.Uri;
import android.os.Handler;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class i implements xfk {
    public final g a;
    private final ajmy b;
    private final Handler c;
    private yiy d;
    private xgu e;

    public i(g gVar, Handler handler, ajmy ajmyVar) {
        gVar.getClass();
        this.a = gVar;
        handler.getClass();
        this.c = handler;
        ajmyVar.getClass();
        this.b = ajmyVar;
        this.e = xgu.a().a();
    }

    @Override // defpackage.xfk
    public final void nR(xig xigVar) {
        this.a.t(xigVar);
    }

    @Override // defpackage.xfk
    public final void qV(xgu xguVar) {
        boolean z = xguVar.a;
        if (z != this.e.a) {
            this.a.x(z);
        }
        xha xhaVar = xguVar.g;
        if (!xhaVar.a.equals(this.e.g.a)) {
            xgs xgsVar = xhaVar.a;
            avhn avhnVar = xgsVar.d;
            this.a.o(xgsVar.b);
            if (avhnVar == null) {
                yiy yiyVar = this.d;
                if (yiyVar != null) {
                    yiyVar.d();
                    this.d = null;
                }
                this.a.p(null);
            } else {
                Uri q = akel.q(avhnVar);
                if (q != null) {
                    yiy c = yiy.c(new h(this));
                    this.d = c;
                    this.b.l(q, yje.c(this.c, c));
                }
            }
        }
        xgw xgwVar = xguVar.e;
        int i = xgwVar.a;
        xgw xgwVar2 = this.e.e;
        int i2 = xgwVar2.a;
        boolean z2 = !xgwVar.c.equals(xgwVar2.c);
        if (i != i2 || z2) {
            g gVar = this.a;
            int i3 = xgwVar.a;
            wzr wzrVar = xgwVar.c;
            gVar.l(i3, wzrVar.b, wzrVar.c);
        }
        boolean z3 = xgwVar.b;
        if (z3 != this.e.e.b) {
            this.a.u(z3);
        }
        xhe xheVar = xguVar.f;
        if (!xheVar.c.toString().contentEquals(this.e.f.c) && !xheVar.c.toString().contentEquals("<NONE>")) {
            this.a.z(xheVar.c);
        }
        xhi xhiVar = xguVar.c;
        int i4 = xhiVar.d;
        if (i4 != this.e.c.d) {
            if (i4 == 0) {
                this.a.w(true);
                this.a.v(false);
            } else if (i4 == 1) {
                this.a.w(true);
                this.a.v(true);
            } else if (i4 == 2 || i4 == 3) {
                this.a.w(false);
                this.a.v(false);
            }
        }
        boolean z4 = xhiVar.e;
        if (z4 != this.e.c.e) {
            this.a.r(z4);
        }
        int i5 = xhiVar.g;
        if (i5 != this.e.c.g && xhiVar.d == 0) {
            this.a.m(i5);
        }
        this.e = xguVar;
    }
}
