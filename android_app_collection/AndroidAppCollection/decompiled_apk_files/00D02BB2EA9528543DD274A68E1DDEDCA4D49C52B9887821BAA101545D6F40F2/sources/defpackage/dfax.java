package defpackage;
/* compiled from: PG */
/* renamed from: dfax  reason: default package */
/* loaded from: classes6.dex */
public final class dfax implements dfbd {
    private final dewu a;

    public dfax(dewu dewuVar) {
        this.a = dewuVar;
    }

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        dyet dyetVar = dfazVar.b;
        dbsk.m(true, "Cronet does not support CallOptions.withAuthority(). See https://github.com/grpc/grpc-java/issues/1767");
        dews<?, ?> dewsVar = (dews) dyetVar.e(dews.a);
        if (dewsVar == null) {
            String str = dfazVar.a().b;
            dewsVar = this.a.b(str);
            dbsk.w(dewsVar, "Could not find RpcId for method %s.Is portable_proto_filter set in your android_rpc_service?", str);
            dyetVar = dyetVar.d(dews.a, dewsVar);
        }
        return dfcg.a(dyetVar.d(csad.a, dewsVar.a()));
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
