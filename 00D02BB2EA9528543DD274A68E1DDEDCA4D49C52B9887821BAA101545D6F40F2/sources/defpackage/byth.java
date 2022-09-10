package defpackage;

import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byth  reason: default package */
/* loaded from: classes4.dex */
public final class byth {
    private final bwqv a;
    private final cqat b;
    private final btvo c;
    private final bysw d;
    private bzjq e;

    public byth(bwqv bwqvVar, cqat cqatVar, btvo btvoVar, bysw byswVar) {
        this.a = bwqvVar;
        this.b = cqatVar;
        this.c = btvoVar;
        this.d = byswVar;
    }

    private final synchronized void c() {
        bvrj.UI_THREAD.d();
        if (this.e == null) {
            bzjq bzjqVar = (bzjq) this.a.k(bwrj.TRANSIT_DISMISS_TRACKER, "3", (dssr) bzjq.b.cu(7));
            if (bzjqVar == null) {
                bzjqVar = bzjq.b;
            }
            dbsk.s(bzjqVar);
            this.e = bzjqVar;
        }
    }

    public final synchronized long a() {
        c();
        int size = this.e.a.size();
        if (size == 0) {
            return -1L;
        }
        return this.e.a.get(size - 1).longValue();
    }

    public final synchronized boolean b() {
        long b = this.b.b();
        c();
        if (this.e.a.size() < this.d.e().v) {
            bzjq bzjqVar = this.e;
            dsqp dsqpVar = (dsqp) bzjqVar.cu(5);
            dsqpVar.bC(bzjqVar);
            bzjp bzjpVar = (bzjp) dsqpVar;
            bzjpVar.a(b);
            this.e = bzjpVar.bK();
            this.a.h(bwrj.TRANSIT_DISMISS_TRACKER, "3", this.e);
            return false;
        }
        dsri dsriVar = this.e.a;
        long longValue = b - dsriVar.get(0).longValue();
        TimeUnit timeUnit = TimeUnit.DAYS;
        dkqz dkqzVar = this.c.getNotificationsParameters().m;
        if (dkqzVar == null) {
            dkqzVar = dkqz.ap;
        }
        if (longValue < timeUnit.toMillis(dkqzVar.w)) {
            return true;
        }
        bzjq bzjqVar2 = this.e;
        dsqp dsqpVar2 = (dsqp) bzjqVar2.cu(5);
        dsqpVar2.bC(bzjqVar2);
        bzjp bzjpVar2 = (bzjp) dsqpVar2;
        if (bzjpVar2.c) {
            bzjpVar2.bF();
            bzjpVar2.c = false;
        }
        ((bzjq) bzjpVar2.b).a = bzjq.ch();
        List<Long> subList = dsriVar.subList(1, dsriVar.size());
        if (bzjpVar2.c) {
            bzjpVar2.bF();
            bzjpVar2.c = false;
        }
        bzjq bzjqVar3 = (bzjq) bzjpVar2.b;
        bzjqVar3.b();
        dsod.bv(subList, bzjqVar3.a);
        bzjpVar2.a(b);
        this.e = bzjpVar2.bK();
        this.a.h(bwrj.TRANSIT_DISMISS_TRACKER, "3", this.e);
        return false;
    }
}
