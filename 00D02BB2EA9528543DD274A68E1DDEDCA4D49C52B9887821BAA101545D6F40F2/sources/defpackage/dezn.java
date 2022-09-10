package defpackage;
/* compiled from: PG */
/* renamed from: dezn  reason: default package */
/* loaded from: classes6.dex */
public final class dezn implements dfbd {
    private dexc a;

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        dyet dyetVar = dfazVar.b;
        if (dyetVar.e(dezk.a) != null) {
            return dfcg.a;
        }
        if (dyetVar.e(dexh.a) != null) {
            return dfcg.a;
        }
        if (dyetVar.e(dewd.a) == null) {
            dexc dexcVar = new dexc(dbpy.a, dbpy.a, dcmr.a);
            this.a = dexcVar;
            return dexcVar.a(dfazVar);
        }
        dbsk.m(dyetVar.e(dexa.a) == null, "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfcg b(dfaz dfazVar) {
        return this.a.b(dfazVar);
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
