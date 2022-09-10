package defpackage;
/* compiled from: PG */
/* renamed from: dezy  reason: default package */
/* loaded from: classes6.dex */
public final class dezy implements dfbd {
    private final dewj a;

    public dezy(dewj dewjVar) {
        this.a = dewjVar;
    }

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        dyet dyetVar = dfazVar.b;
        dbsk.m(dyetVar.e(dewk.a) == null, "ChannelConfig provided twice");
        return dfcg.a(dyetVar.d(dewk.a, this.a));
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
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfcg g() {
        return dfcg.a;
    }
}
