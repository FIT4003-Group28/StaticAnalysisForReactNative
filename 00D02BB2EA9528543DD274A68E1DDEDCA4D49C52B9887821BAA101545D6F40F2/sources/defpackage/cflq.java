package defpackage;

import java.util.concurrent.ConcurrentHashMap;
/* compiled from: PG */
/* renamed from: cflq  reason: default package */
/* loaded from: classes4.dex */
public final class cflq {
    public final ConcurrentHashMap<Long, cflw> a = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<Long, cflx> b = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Long, cflp> c = new ConcurrentHashMap<>();

    public final dcdc<cflx> a(long j) {
        cflp cflpVar = this.c.get(Long.valueOf(j));
        if (cflpVar == null) {
            return dcdc.e();
        }
        return dcdc.r(cflpVar.a.values());
    }

    public final dbsg<cflx> b(long j) {
        return dbsg.j(this.b.get(Long.valueOf(j & (-2))));
    }

    public final dbsg<cflw> c(long j) {
        return dbsg.j(this.a.get(Long.valueOf(j)));
    }

    public final void d(long j, cflx cflxVar) {
        ConcurrentHashMap<Long, cflp> concurrentHashMap = this.c;
        Long valueOf = Long.valueOf(j);
        concurrentHashMap.putIfAbsent(valueOf, new cflp());
        cflp cflpVar = this.c.get(valueOf);
        dbsk.s(cflpVar);
        cflpVar.a.putIfAbsent(Long.valueOf(((cflu) cflxVar).a), cflxVar);
    }

    public final dcdc<cflx> e() {
        return dcdc.r(this.b.values());
    }

    public final dbsg<cflv> f(akra akraVar) {
        double r = akraVar.r() * 3.0d;
        dbsg<cflv> dbsgVar = dbpy.a;
        double d = Double.POSITIVE_INFINITY;
        for (cflx cflxVar : this.b.values()) {
            akrn b = cflxVar.c().b(akraVar, r);
            if (b != null) {
                double d2 = b.c;
                if (d2 < d) {
                    dbsgVar = dbsg.i(new cfls(b.a, cflxVar));
                    d = d2;
                }
            }
        }
        return dbsgVar;
    }
}
