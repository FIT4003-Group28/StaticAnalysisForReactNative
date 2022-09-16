package defpackage;

import android.app.Service;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: bzcg  reason: default package */
/* loaded from: classes4.dex */
public final class bzcg implements bzch {
    public static final String a = String.valueOf(bzcg.class.getCanonicalName()).concat(".ACTION_RESUME_DIRECTIONS");
    public static final String b = String.valueOf(bzcg.class.getCanonicalName()).concat(".ACTION_SHARE_TRIP_DIRECTIONS");
    private final Service c;
    private final byyp d;
    private final vxv e;

    public bzcg(Service service, byyp byypVar, vxv vxvVar) {
        this.c = service;
        this.d = byypVar;
        this.e = vxvVar;
    }

    @Override // defpackage.bzch
    public final void a(Intent intent) {
        Intent e;
        bzdk c = this.d.c();
        bzdj h = c.h();
        boolean b2 = c.b();
        if (h.a()) {
            return;
        }
        amte k = c.k();
        dbsk.s(k);
        if (intent.getAction().equals(b)) {
            if (b2) {
                int e2 = this.d.e();
                e = afft.a(this.c);
                e.putExtra(unc.a, e2);
            } else {
                e = umz.e(this.c, k, true, c.m(), true, c.g().q(), null);
            }
            e.addFlags(268435456);
            this.c.startActivity(e);
        } else if (b2) {
            Intent a2 = afft.a(this.c);
            a2.addFlags(268435456);
            this.c.startActivity(a2);
            return;
        } else {
            int parseInt = Integer.parseInt(intent.getData().getQueryParameter("transitStageNumber"));
            byzg a3 = byzg.a(intent.getData().getQueryParameter("transitGuidanceType"));
            amub l = c.l(this.c);
            dbsk.s(l);
            bzdg b3 = bzdg.b(l, parseInt, new bzda(l), this.e);
            if (!b3.E() && !a3.g) {
                b3 = b3.B();
            }
            Intent e3 = umz.e(this.c, k, false, c.m(), true, b3.J(), null);
            e3.addFlags(268435456);
            this.c.startActivity(e3);
        }
        bzdh g = c.g();
        if (h == bzdj.STARTED && !g.p()) {
            return;
        }
        bzcf.c(this.c);
    }

    @Override // defpackage.bzch
    public final boolean b(Intent intent) {
        return a.equals(intent.getAction()) || b.equals(intent.getAction());
    }
}
