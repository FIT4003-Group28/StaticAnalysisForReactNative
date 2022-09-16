package defpackage;

import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dezi  reason: default package */
/* loaded from: classes6.dex */
public final class dezi implements dfbd {
    final /* synthetic */ dezj a;

    public dezi(dezj dezjVar) {
        this.a = dezjVar;
    }

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        dyet dyetVar = dfazVar.b;
        dews dewsVar = (dews) dyetVar.e(dews.a);
        String c = dewsVar.b().c();
        ((dewj) dyetVar.e(dewk.a)).a().getPackageManager();
        dbsk.m(c != null, "ApiKeyOption defaultApiKey was used, but no default exists");
        dbsk.m(dewsVar.d(), "Using ApiKeyStrategy for method that is not allowed without credentials");
        dbsk.m(true ^ dfazVar.a.g(dezj.a), "API key was already attached to the request");
        dfazVar.a.i(dezj.a, c);
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfcg b(dfaz dfazVar) {
        try {
            dfazVar.a.i(dezj.b, (String) deha.r(null));
            return dfcg.a;
        } catch (ExecutionException e) {
            return dfcg.b(dyjb.c(e).g("Failed to get API Key cert"), new dyhw());
        }
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
