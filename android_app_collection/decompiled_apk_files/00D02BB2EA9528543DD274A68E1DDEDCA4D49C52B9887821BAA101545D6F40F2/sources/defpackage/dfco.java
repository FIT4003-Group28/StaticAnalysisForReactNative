package defpackage;
/* compiled from: PG */
/* renamed from: dfco  reason: default package */
/* loaded from: classes6.dex */
public final class dfco implements dfbd {
    private dfcq a;
    private dyhz b;
    private dfcp c;

    static {
        dcrc.b("xRPC");
    }

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        this.b = dfazVar.a().a;
        dyet dyetVar = dfazVar.b;
        dewj dewjVar = (dewj) dyetVar.e(dewk.a);
        this.c = new dfcp(dewjVar.l(), dewjVar.o());
        boolean z = true;
        dbsk.g(dyetVar.e(dfcq.b) == null, "Unexpected option %s already set.", dfcq.b);
        if (dyetVar.e(dfcn.a) != null) {
            z = false;
        }
        dbsk.g(z, "Unexpected option %s already set.", dfcn.a);
        this.a = new dfcq((dews) dyetVar.e(dews.a));
        return dfcg.a(dyetVar.d(dfcq.b, this.a).d(dfcn.a, this.a));
    }

    @Override // defpackage.dfbd
    public final dfcg b(dfaz dfazVar) {
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfcg c(dfba dfbaVar) {
        if (this.b.equals(dyhz.CLIENT_STREAMING) || this.b.equals(dyhz.BIDI_STREAMING)) {
            this.a.h.incrementAndGet();
        }
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfch d(dfbb dfbbVar) {
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfch e(dfbc dfbcVar) {
        if (this.b.equals(dyhz.SERVER_STREAMING) || this.b.equals(dyhz.BIDI_STREAMING)) {
            this.a.g.incrementAndGet();
        }
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfch f(dfay dfayVar) {
        dfcp dfcpVar;
        try {
            dbsk.m(this.a.m.getAndSet(dfayVar.a.p) == null, "Already recorded result.");
            dfcpVar = this.c;
            dfcq dfcqVar = this.a;
            if (dfcpVar.a.a().booleanValue() && dfcqVar.e.get()) {
                cwsy b = cwsy.b();
                cxaj a = cxaj.a(null, dfcqVar.c.a());
                boolean z = dfcqVar.d.get();
                dbsk.a(true);
                dbsk.a(true);
                a.r = 1;
                a.s = z ? 1 : 0;
                b.d(a);
            }
        } catch (Throwable unused) {
        }
        if (dfcpVar.b == null) {
            return dfch.a;
        }
        throw null;
    }

    @Override // defpackage.dfbd
    public final dfcg g() {
        return dfcg.a;
    }
}
