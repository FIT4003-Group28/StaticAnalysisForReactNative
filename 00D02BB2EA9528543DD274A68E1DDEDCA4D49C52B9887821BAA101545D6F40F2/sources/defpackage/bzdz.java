package defpackage;

import java.util.Map;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzdz  reason: default package */
/* loaded from: classes4.dex */
public final class bzdz {
    public final qdx a;
    public final bzfg b;
    public final byzk c;
    public final bzdy d;
    private final dehq e;
    private final btvo f;
    private final zar g;

    public bzdz(bzfg bzfgVar, qdx qdxVar, dehq dehqVar, byzk byzkVar, btvo btvoVar, zar zarVar, zag zagVar) {
        this.b = bzfgVar;
        this.a = qdxVar;
        this.e = dehqVar;
        this.c = byzkVar;
        this.f = btvoVar;
        this.g = zarVar;
        this.d = new bzdy(bzfgVar);
    }

    public final void a() {
        long millis;
        if (this.b.p == bzdj.STARTED) {
            if (this.b.v) {
                millis = this.f.getTransitPagesParameters().s;
            } else {
                millis = TimeUnit.SECONDS.toMillis(this.f.getTransitTrackingParameters().m);
            }
            bvqd.a(this.e.d(new Runnable(this) { // from class: bzdw
                private final bzdz a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            }, millis, TimeUnit.MILLISECONDS), this.e);
        }
    }

    public final void b() {
        dcdc f;
        if (this.b.p != bzdj.STARTED) {
            return;
        }
        amte amteVar = this.b.d;
        dbsk.s(amteVar);
        if (this.b.r.p()) {
            f = dcdc.e();
        } else {
            bzdh n = this.b.n();
            bzdg b = n.b();
            if (n instanceof bzcz) {
                b = b.B();
            }
            dccx F = dcdc.F();
            while (!b.D()) {
                if (b.c() == dqvj.TRANSIT) {
                    F.g(qdv.g(b.d(), this.f));
                }
                b = b.B();
            }
            f = F.f();
        }
        boolean z = false;
        if (f.isEmpty()) {
            a();
            if (!(this.b.n() instanceof bzcz)) {
                return;
            }
            c(amteVar, dcmn.a, false);
            return;
        }
        bzdy bzdyVar = this.d;
        if (bzdyVar.a.v && (bzdyVar.c || !bzdyVar.b)) {
            z = true;
        }
        this.c.m++;
        deha.q(this.a.b(f, z), new bzdx(this, amteVar, z), this.e);
    }

    public final void c(amte amteVar, Map<qdv, dopk> map, boolean z) {
        if (this.b.p != bzdj.STARTED || !amteVar.equals(this.b.d) || this.b.r.p()) {
            return;
        }
        boolean z2 = false;
        amte b = this.g.b(amteVar, map, this.b.n(), false);
        bzdy bzdyVar = this.d;
        bzdyVar.b |= z;
        if (bzdyVar.a.v && !z && zag.a(b, amteVar)) {
            z2 = true;
        }
        bzdyVar.c = z2;
        this.b.f(b);
    }
}
