package defpackage;
/* compiled from: PG */
/* renamed from: dfcv  reason: default package */
/* loaded from: classes6.dex */
public final class dfcv implements dfbd {
    private cqat a;
    private dyhz b;
    private long c;
    private dfcq d;

    static {
        dcrc.b("xRPC");
    }

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        this.b = dfazVar.a().a;
        dfcq dfcqVar = (dfcq) dfazVar.b.e(dfcq.b);
        dbsk.w(dfcqVar, "%s missing from CallOptions.", dfcq.b);
        this.d = dfcqVar;
        cqat b = ((dewj) dfazVar.b.e(dewk.a)).b();
        this.a = b;
        this.c = b.e();
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfcg b(dfaz dfazVar) {
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfcg c(dfba dfbaVar) {
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfch d(dfbb dfbbVar) {
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfch e(dfbc dfbcVar) {
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfch f(dfay dfayVar) {
        try {
            if (dfayVar.a.i()) {
                long e = this.a.e() - this.c;
                boolean z = true;
                if (!this.b.equals(dyhz.UNARY)) {
                    dfcq dfcqVar = this.d;
                    dbsk.b(e >= 0, "Cannot record negative stream duration.");
                    if (dfcqVar.l.getAndSet(e) != -1) {
                        z = false;
                    }
                    dbsk.m(z, "Already recorded stream duration.");
                } else if (e <= 2147483647L) {
                    dfcq dfcqVar2 = this.d;
                    int i = (int) e;
                    dbsk.b(i >= 0, "Cannot record negative latency.");
                    if (dfcqVar2.i.getAndSet(i) != -1) {
                        z = false;
                    }
                    dbsk.m(z, "Already recorded latency.");
                }
            }
            this.d.f.incrementAndGet();
        } catch (Throwable unused) {
        }
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfcg g() {
        return dfcg.a;
    }
}
