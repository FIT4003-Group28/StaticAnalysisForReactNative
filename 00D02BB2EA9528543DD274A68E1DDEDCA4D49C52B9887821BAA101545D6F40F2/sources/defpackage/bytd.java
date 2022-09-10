package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bytd  reason: default package */
/* loaded from: classes4.dex */
public final class bytd {
    private final bwqv a;
    private bzhp b;
    private final btvo c;
    private final cqat d;

    public bytd(bwqv bwqvVar, btvo btvoVar, cqat cqatVar) {
        this.a = bwqvVar;
        this.c = btvoVar;
        this.d = cqatVar;
    }

    private final synchronized void g() {
        bvrj.UI_THREAD.d();
        if (this.b == null) {
            bzhp bzhpVar = (bzhp) this.a.j(bwrj.TRANSIT_EVENT_TRACKER, (dssr) bzhp.d.cu(7));
            if (bzhpVar == null) {
                bzhpVar = bzhp.d;
            }
            dbsk.s(bzhpVar);
            this.b = bzhpVar;
        }
    }

    public final synchronized void a(long j) {
        g();
        bzhp bzhpVar = this.b;
        dsqp dsqpVar = (dsqp) bzhpVar.cu(5);
        dsqpVar.bC(bzhpVar);
        bzho bzhoVar = (bzho) dsqpVar;
        if (bzhoVar.c) {
            bzhoVar.bF();
            bzhoVar.c = false;
        }
        bzhp bzhpVar2 = (bzhp) bzhoVar.b;
        bzhp bzhpVar3 = bzhp.d;
        bzhpVar2.a |= 1;
        bzhpVar2.b = j;
        this.b = bzhoVar.bK();
        this.a.h(bwrj.TRANSIT_EVENT_TRACKER, "5", this.b);
    }

    public final synchronized void b(String str, long j) {
        g();
        bzhp bzhpVar = this.b;
        dsqp dsqpVar = (dsqp) bzhpVar.cu(5);
        dsqpVar.bC(bzhpVar);
        bzho bzhoVar = (bzho) dsqpVar;
        bzhw bZ = bzhx.d.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        bzhx bzhxVar = (bzhx) bZ.b;
        int i = bzhxVar.a | 1;
        bzhxVar.a = i;
        bzhxVar.b = j;
        str.getClass();
        bzhxVar.a = i | 2;
        bzhxVar.c = str;
        if (bzhoVar.c) {
            bzhoVar.bF();
            bzhoVar.c = false;
        }
        bzhp bzhpVar2 = (bzhp) bzhoVar.b;
        bzhx bK = bZ.bK();
        bzhp bzhpVar3 = bzhp.d;
        bK.getClass();
        bzhpVar2.c = bK;
        bzhpVar2.a |= 2;
        this.b = bzhoVar.bK();
        this.a.h(bwrj.TRANSIT_EVENT_TRACKER, "5", this.b);
    }

    public final synchronized boolean c(String str) {
        boolean z;
        g();
        bzhp bzhpVar = this.b;
        if ((bzhpVar.a & 2) != 0) {
            bzhx bzhxVar = bzhpVar.c;
            if (bzhxVar == null) {
                bzhxVar = bzhx.d;
            }
            if (bzhxVar.c.equals(str)) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    public final synchronized boolean d() {
        g();
        bzhp bzhpVar = this.b;
        int i = bzhpVar.a;
        if ((i & 2) == 0 || (i & 1) == 0) {
            return false;
        }
        long j = bzhpVar.b;
        bzhx bzhxVar = bzhpVar.c;
        if (bzhxVar == null) {
            bzhxVar = bzhx.d;
        }
        return j > bzhxVar.b;
    }

    public final synchronized void e() {
        g();
        this.a.h(bwrj.TRANSIT_EVENT_TRACKER, "5", bzhp.d);
    }

    public final synchronized boolean f() {
        g();
        bzhp bzhpVar = this.b;
        if ((bzhpVar.a & 2) != 0) {
            bzhx bzhxVar = bzhpVar.c;
            if (bzhxVar == null) {
                bzhxVar = bzhx.d;
            }
            if ((bzhxVar.a & 1) != 0) {
                long e = this.d.e();
                bzhx bzhxVar2 = this.b.c;
                if (bzhxVar2 == null) {
                    bzhxVar2 = bzhx.d;
                }
                long j = e - bzhxVar2.b;
                TimeUnit timeUnit = TimeUnit.MINUTES;
                dkqz dkqzVar = this.c.getNotificationsParameters().m;
                if (dkqzVar == null) {
                    dkqzVar = dkqz.ap;
                }
                if (j <= timeUnit.toMillis(dkqzVar.ac)) {
                    return false;
                }
            }
        }
        return true;
    }
}
