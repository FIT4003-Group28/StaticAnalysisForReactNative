package defpackage;
/* compiled from: PG */
/* renamed from: dezm  reason: default package */
/* loaded from: classes6.dex */
public final class dezm implements dfbd {
    static final dyhs<String> a = dyhs.d("X-Goog-Api-Key", dyhw.b);

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        dyet dyetVar = dfazVar.b;
        if (dyetVar.e(dezk.a) != null) {
            return dfcg.a;
        }
        dewd dewdVar = (dewd) dyetVar.e(dewd.a);
        boolean z = false;
        if (dewdVar != null) {
            dbsk.m(dyetVar.e(dexa.a) == null, "Must set exactly one of ApiKeyOption or AuthContext if AuthContextManager is provided.");
        }
        dews dewsVar = (dews) dyetVar.e(dews.a);
        String c = dewsVar.b().c();
        String a2 = dewdVar != null ? dewdVar.a() : null;
        if (dewdVar != null && dewdVar.a() == null) {
            if (c != null) {
                z = true;
            }
            dbsk.m(z, "ApiKeyOption defaultApiKey was used, but no default exists");
        }
        if (a2 != null) {
            c = a2;
        }
        if (dewsVar.d() && c != null) {
            dyhw dyhwVar = dfazVar.a;
            dyhs<String> dyhsVar = a;
            dbsk.m(!dyhwVar.g(dyhsVar), "API key was already attached to the request");
            dfazVar.a.i(dyhsVar, c);
        }
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
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfcg g() {
        return dfcg.a;
    }
}
