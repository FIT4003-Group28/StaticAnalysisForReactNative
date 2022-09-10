package defpackage;

import android.app.Application;
import android.content.Intent;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bywx  reason: default package */
/* loaded from: classes4.dex */
public final class bywx {
    public static final long a = TimeUnit.MINUTES.toSeconds(8);
    public static final dcdn<auhh, cken> b;
    public static final dcdn<auhh, cken> c;
    public final byxc d;
    public final Application e;
    public final bywv f;
    public final auhi g;
    public final btvo h;
    public final bysv i;
    public final qjp j;
    public final bywu k;
    public final cqat l;
    private final dxio<akfa> m;
    private final dxio<byqc> n;
    @dzsi
    private final qjl o;

    static {
        dcdg p = dcdn.p();
        p.f(auhh.SHOWN, cken.INFO_COMMUTE_DEPARTURE_NOTIFICATION_SHOWN);
        p.f(auhh.SUPPRESSED, cken.INFO_COMMUTE_DEPARTURE_NOTIFICATION_NOT_SHOWN_SUPPRESSED);
        p.f(auhh.SUPPRESSED_FOR_OPTOUT, cken.INFO_COMMUTE_DEPARTURE_NOTIFICATION_NOT_SHOWN_OPTOUT);
        p.f(auhh.SUPPRESSED_FOR_COUNTERFACTUAL, cken.INFO_COMMUTE_DEPARTURE_NOTIFICATION_NOT_SHOWN_COUNTERFACTUAL);
        b = p.b();
        dcdg p2 = dcdn.p();
        p2.f(auhh.SHOWN, cken.INFO_COMMUTE_DISRUPTION_NOTIFICATION_SHOWN);
        p2.f(auhh.SUPPRESSED, cken.INFO_COMMUTE_DISRUPTION_NOTIFICATION_NOT_SHOWN_SUPPRESSED);
        p2.f(auhh.SUPPRESSED_FOR_OPTOUT, cken.INFO_COMMUTE_DISRUPTION_NOTIFICATION_NOT_SHOWN_OPTOUT);
        p2.f(auhh.SUPPRESSED_FOR_COUNTERFACTUAL, cken.INFO_COMMUTE_DISRUPTION_NOTIFICATION_NOT_SHOWN_COUNTERFACTUAL);
        c = p2.b();
    }

    public bywx(byxc byxcVar, Application application, bywv bywvVar, auhi auhiVar, btvo btvoVar, bysv bysvVar, qjp qjpVar, bywu bywuVar, dxio<akfa> dxioVar, dxio<byqc> dxioVar2, cqat cqatVar, @dzsi qjl qjlVar) {
        this.d = byxcVar;
        this.e = application;
        this.f = bywvVar;
        this.g = auhiVar;
        this.h = btvoVar;
        this.i = bysvVar;
        this.j = qjpVar;
        this.k = bywuVar;
        this.m = dxioVar;
        this.n = dxioVar2;
        this.l = cqatVar;
        this.o = qjlVar;
    }

    public final int a(String str) {
        qjl qjlVar = this.o;
        if (qjlVar != null) {
            return qjlVar.b(qjj.TRANSIT_TO_PLACE, str);
        }
        return 0;
    }

    public final boolean b() {
        dkqr dkqrVar = this.h.getNotificationsParameters().o;
        if (dkqrVar == null) {
            dkqrVar = dkqr.d;
        }
        dkqq dkqqVar = dkqrVar.c;
        if (dkqqVar == null) {
            dkqqVar = dkqq.b;
        }
        if (!dkqqVar.a) {
            this.i.d(byqb.SMARTSPACE_PARAMETERS_TRANSIT_NOT_ENABLED);
            return false;
        }
        return true;
    }

    public final void c() {
        this.g.m(dpyv.TRANSIT_TO_PLACE.dm);
        d();
        if (b()) {
            f(dbsg.i(byqe.i()));
        }
    }

    public final void d() {
        this.g.m(dpyv.TRANSIT_TO_PLACE_DISRUPTION.dm);
    }

    public final Intent e(bzhj bzhjVar) {
        dlkv dlkvVar = bzhjVar.d;
        if (dlkvVar == null) {
            dlkvVar = dlkv.s;
        }
        dbsk.a((dlkvVar.a & 8) != 0);
        dlkv dlkvVar2 = bzhjVar.d;
        if (dlkvVar2 == null) {
            dlkvVar2 = dlkv.s;
        }
        dqdk dqdkVar = dlkvVar2.e;
        if (dqdkVar == null) {
            dqdkVar = dqdk.e;
        }
        dplx dplxVar = dqdkVar.b;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        dlkv dlkvVar3 = bzhjVar.d;
        if (dlkvVar3 == null) {
            dlkvVar3 = dlkv.s;
        }
        Intent a2 = auhz.a(dplxVar, dlkvVar3.f);
        return (bzhjVar.a & 8) != 0 ? afja.e(this.e, bzhjVar.e, a2) : a2;
    }

    public final void f(dbsg<byqe> dbsgVar) {
        if (!dbsgVar.a()) {
            return;
        }
        btlu j = this.m.a().j();
        byqc a2 = this.n.a();
        if (j == null) {
            this.i.d(byqb.GMM_ACCOUNT_NULL);
        } else if (!a2.b(j)) {
            this.i.d(byqb.NOT_ENABLED);
        } else if (!a2.a()) {
            this.i.d(byqb.NO_CLIENT_CAPABILITY);
        } else {
            a2.d(dbsgVar.b(), j);
        }
    }
}
