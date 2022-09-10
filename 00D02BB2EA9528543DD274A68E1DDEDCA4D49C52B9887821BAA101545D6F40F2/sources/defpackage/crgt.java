package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import com.google.android.libraries.geo.navcore.service.base.NavigationService;
/* compiled from: PG */
/* renamed from: crgt  reason: default package */
/* loaded from: classes.dex */
public final class crgt implements crfm, crgy {
    public final btrm a;
    @dzsi
    public volatile arym b;
    private final Application c;
    private final bwqv d;
    private final bvrb e;
    private long f = 0;

    public crgt(Application application, bwqv bwqvVar, btrm btrmVar, bvrb bvrbVar) {
        this.c = application;
        this.d = bwqvVar;
        this.a = btrmVar;
        this.e = bvrbVar;
    }

    private final void g(final crhq crhqVar) {
        this.e.b(new Runnable(this, crhqVar) { // from class: crgs
            private final crgt a;
            private final crhq b;

            {
                this.a = this;
                this.b = crhqVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crgt crgtVar = this.a;
                crgtVar.a.b(this.b);
            }
        }, bvrj.UI_THREAD);
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        arym arymVar = crgzVar.a;
        this.b = arymVar;
        crfo crfoVar = crgzVar.c;
        if (crfoVar != null) {
            this.f = crfoVar.b;
        } else {
            this.f = 0L;
        }
        g(crhq.c(arymVar, true));
    }

    @Override // defpackage.crgy
    public final void b(boolean z) {
        arym arymVar = this.b;
        dbsk.s(arymVar);
        this.b = null;
        this.f = 0L;
        g(crhq.c(arymVar, false));
    }

    @Override // defpackage.crfm
    public final void c(crfo crfoVar) {
        bwqv bwqvVar = this.d;
        bvmn bvmnVar = bvmo.a;
        dbsk.t(crfoVar.a, "mode");
        Uri.Builder buildUpon = Uri.parse("nav://params").buildUpon();
        buildUpon.appendQueryParameter("m", crfoVar.a.c);
        long j = crfoVar.b;
        StringBuilder sb = new StringBuilder(20);
        sb.append(j);
        buildUpon.appendQueryParameter("t", sb.toString());
        if (crfoVar.a == arym.GUIDED_NAV) {
            buildUpon.appendQueryParameter("d", bwqvVar.m(crfoVar.c));
            int i = crfoVar.d;
            StringBuilder sb2 = new StringBuilder(11);
            sb2.append(i);
            buildUpon.appendQueryParameter("idx", sb2.toString());
            boolean z = crfoVar.e;
            StringBuilder sb3 = new StringBuilder(5);
            sb3.append(z);
            buildUpon.appendQueryParameter("hdp", sb3.toString());
            boolean z2 = crfoVar.f;
            StringBuilder sb4 = new StringBuilder(5);
            sb4.append(z2);
            buildUpon.appendQueryParameter("dtu", sb4.toString());
            boolean z3 = crfoVar.g;
            StringBuilder sb5 = new StringBuilder(5);
            sb5.append(z3);
            buildUpon.appendQueryParameter("dr", sb5.toString());
            boolean z4 = crfoVar.h;
            StringBuilder sb6 = new StringBuilder(5);
            sb6.append(z4);
            buildUpon.appendQueryParameter("fdan", sb6.toString());
            buildUpon.appendQueryParameter("rn", crfoVar.i);
            dspd dspdVar = crfoVar.k;
            if (dspdVar != null) {
                buildUpon.appendQueryParameter("trht", Base64.encodeToString(dspdVar.G(), 8));
            }
            buildUpon.appendQueryParameter("ipr", Boolean.toString(crfoVar.l));
        } else if (crfoVar.a == arym.FREE_NAV) {
            buildUpon.appendQueryParameter("fn", bwqvVar.m(crfoVar.j));
        }
        this.c.startService(new Intent("android.intent.action.VIEW", buildUpon.build(), this.c, NavigationService.class));
    }

    @Override // defpackage.crfm
    public final void d(boolean z) {
        dcqe.b.v(dcqz.FULL);
        NavigationService.a(this.c, z);
    }

    @Override // defpackage.crfm
    @dzsi
    public final arym e() {
        return this.b;
    }

    @Override // defpackage.crfm
    public final long f() {
        return this.f;
    }
}
