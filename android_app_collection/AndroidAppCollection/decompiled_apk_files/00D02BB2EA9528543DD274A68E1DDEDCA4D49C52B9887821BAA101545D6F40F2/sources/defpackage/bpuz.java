package defpackage;
/* compiled from: PG */
/* renamed from: bpuz  reason: default package */
/* loaded from: classes4.dex */
public abstract class bpuz {
    public static bpuy e() {
        return new bpul();
    }

    public static dcep<bpuz> f(bpuk bpukVar, dbsg<akqi> dbsgVar) {
        if (!dbsgVar.a()) {
            return dcbg.b(bpukVar.a).s(bpux.a).B();
        }
        bpuy e = e();
        e.b(dbsgVar.b());
        dpum dpumVar = bpukVar.a.get(0).e;
        if (dpumVar == null) {
            dpumVar = dpum.d;
        }
        e.c(akqq.f(dpumVar));
        ((bpul) e).a = 1;
        final long j = dbsgVar.b().c;
        dbsg m = dcft.m(bpukVar.a.get(0).g, new dbsl(j) { // from class: bpuv
            private final long a;

            {
                this.a = j;
            }

            @Override // defpackage.dbsl
            public final boolean a(Object obj) {
                long j2 = this.a;
                dpsn dpsnVar = ((drkz) obj).b;
                if (dpsnVar == null) {
                    dpsnVar = dpsn.d;
                }
                return dpsnVar.c == j2;
            }
        });
        if (!m.a() || (((drkz) m.b()).a & 4) == 0) {
            dbsg m2 = dcft.m(bpukVar.a, new dbsl(j) { // from class: bpuw
                private final long a;

                {
                    this.a = j;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    long j2 = this.a;
                    dpsn dpsnVar = ((digh) obj).b;
                    if (dpsnVar == null) {
                        dpsnVar = dpsn.d;
                    }
                    return dpsnVar.c == j2;
                }
            });
            if (m2.a() && (((digh) m2.b()).a & 32) != 0) {
                dpuq dpuqVar = ((digh) m2.b()).i;
                if (dpuqVar == null) {
                    dpuqVar = dpuq.d;
                }
                e.d(new akqs(dpuqVar));
            }
        } else {
            dpuq dpuqVar2 = ((drkz) m.b()).d;
            if (dpuqVar2 == null) {
                dpuqVar2 = dpuq.d;
            }
            e.d(new akqs(dpuqVar2));
        }
        return dcep.B(e.a());
    }

    public abstract akqi a();

    public abstract dbsg<akqq> b();

    public abstract dbsg<akqs> c();

    public abstract int d();
}
