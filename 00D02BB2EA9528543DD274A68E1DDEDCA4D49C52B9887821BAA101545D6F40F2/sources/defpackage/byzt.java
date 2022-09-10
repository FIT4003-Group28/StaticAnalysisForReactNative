package defpackage;

import android.app.Application;
import android.text.Spannable;
import com.google.android.apps.maps.R;
import java.util.Random;
/* compiled from: PG */
/* renamed from: byzt  reason: default package */
/* loaded from: classes4.dex */
public final class byzt {
    static final cqrp a = cqrp.d(17.0d);
    static final cqrp b = cqrp.d(25.0d);
    private final vyl c;
    private final Application d;
    private final btvo e;
    private final vxw f;
    private final bvjj g;

    public byzt(vyl vylVar, Application application, btvo btvoVar, vxw vxwVar, bvjj bvjjVar) {
        this.c = vylVar;
        this.d = application;
        this.e = btvoVar;
        this.f = vxwVar;
        this.g = bvjjVar;
    }

    @dzsi
    private final vyk c(bzdg bzdgVar) {
        bvsu bvsuVar;
        vxu t = bzdgVar.t();
        Application application = this.d;
        dgas g = t.g();
        if (g == null || (g.a & 2) == 0) {
            bvsuVar = null;
        } else {
            bvsuVar = new bvsx(application.getResources()).c(R.string.TRANSIT_PERIODICITY_IN_NOTIFICATION);
            bvsuVar.a(g.c);
        }
        if (bvsuVar == null) {
            return null;
        }
        return this.c.a(bvsuVar.c());
    }

    private final boolean d() {
        return this.e.getTransitTrackingParameters().r || e();
    }

    private final boolean e() {
        return this.g.m(bvjk.dm, false);
    }

    @dzsi
    public final vyk a(bzdg bzdgVar, boolean z) {
        vyk a2;
        String e;
        if (!d()) {
            vxu t = bzdgVar.t();
            if (t.c().isEmpty()) {
                a2 = c(bzdgVar);
            } else {
                bvsv a3 = this.f.a(t.c(), this.d);
                a2 = a3 != null ? this.c.a(a3.c()) : null;
            }
        } else {
            vxu t2 = bzdgVar.t();
            if (t2.c().isEmpty()) {
                a2 = c(bzdgVar);
            } else {
                int e2 = a.e(this.d);
                int e3 = b.e(this.d);
                doyp doypVar = t2.c().get(0);
                vyk b2 = b(doypVar, this.f.c(doypVar, this.d), e3, e2);
                if (t2.c().size() > 1) {
                    doyp doypVar2 = t2.c().get(1);
                    bvsv c = this.f.c(doypVar2, this.d);
                    vyl vylVar = this.c;
                    a2 = vylVar.c(b2, vylVar.a(this.d.getResources().getString(R.string.TRANSIT_LINE_DEPARTURE_CONJUNCTION)), b(doypVar2, c, e3, e2));
                } else {
                    a2 = b2;
                }
            }
        }
        if (a2 != null && z) {
            String h = bzdgVar.h();
            if (!dbsj.d(h)) {
                e = this.d.getResources().getString(R.string.TRANSIT_DEPARTURE_PLATFORM_AND_STATION, h, bzdgVar.e());
            } else {
                e = bzdgVar.e();
            }
            if (e != null) {
                bvsx bvsxVar = new bvsx(this.d.getResources());
                vyl vylVar2 = this.c;
                bvsv a4 = bvsxVar.a(" · ");
                a4.g(this.d.getResources().getString(R.string.TRANSIT_GUIDANCE_NOTIFICATION_FROM, e));
                return vylVar2.c(a2, vylVar2.a(a4.c()));
            }
        }
        return a2;
    }

    final vyk b(doyp doypVar, bvsv bvsvVar, int i, int i2) {
        dpyy dpyyVar;
        Spannable c = bvsvVar.c();
        dpjb dpjbVar = doypVar.g;
        if (dpjbVar == null) {
            dpjbVar = dpjb.e;
        }
        dpzb dpzbVar = dpjbVar.c;
        if (dpzbVar == null) {
            dpzbVar = dpzb.d;
        }
        int a2 = dpza.a(dpzbVar.b);
        if (a2 == 0 || a2 == 1) {
            if (e()) {
                dpyy[] values = dpyy.values();
                dpyyVar = values[new Random().nextInt(values.length)];
            } else {
                dpyyVar = null;
            }
        } else {
            dpyyVar = dpyy.b(dpzbVar.c);
            if (dpyyVar == null) {
                dpyyVar = dpyy.OCCUPANCY_RATE_UNKNOWN;
            }
        }
        if (!d() || dpyyVar == null || dpyyVar == dpyy.OCCUPANCY_RATE_UNKNOWN || !xkn.e(dpyyVar)) {
            return this.c.a(c.subSequence(0, c.length()));
        }
        byzs byzsVar = new byzs(this.d, dpzbVar, i, i2);
        vyl vylVar = this.c;
        return vylVar.c(vylVar.a(c.subSequence(0, c.length())), this.c.b(byzsVar, xkn.d(byzsVar.b, byzsVar.a)));
    }
}
