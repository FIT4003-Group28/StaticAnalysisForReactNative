package defpackage;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: dexc  reason: default package */
/* loaded from: classes6.dex */
public final class dexc implements dfbd {
    public static final dyes<Boolean> a = dyes.b("com.google.frameworks.client.data.android.auth.AuthContextInterceptor", false);
    private static final dyhs<String> b = dyhs.d("Authorization", dyhw.b);
    private static final dyhs<String> c = dyhs.d("X-Auth-Time", dyhw.b);
    private final dbsg<? extends Set<String>> d;
    private final dbsg<String> e;
    private final dcep<String> f;
    private dehn<dexf> g;
    private dfbd h;

    public dexc(dbsg<? extends Set<String>> dbsgVar, dbsg<String> dbsgVar2, dcep<String> dcepVar) {
        this.d = dbsgVar;
        this.e = dbsgVar2;
        this.f = dcepVar;
    }

    @Override // defpackage.dfbd
    public final dfcg a(final dfaz dfazVar) {
        final Set<String> c2 = ((dews) dfazVar.b.e(dews.a)).c();
        final dexa dexaVar = (dexa) dfazVar.b.e(dexa.a);
        dbsk.t(dexaVar, "Using AuthContextStrategy, but did not set AuthContext");
        if (this.f.contains(dexaVar.b())) {
            dbsk.m(((dews) dfazVar.b.e(dews.a)).d(), "Falling back on API Key, method is not allowed without credentials");
            int i = dezj.d;
            dfbd a2 = new dezj(null).a();
            this.h = a2;
            return a2.a(dfazVar);
        }
        boolean z = false;
        if (!dexaVar.b().equals("incognito") && !dexaVar.b().equals("pseudonymous")) {
            z = true;
        }
        dbsk.m(z, "Used non-google account without enabling API Key fallback");
        final dexd h = ((dewj) dfazVar.b.e(dewk.a)).h();
        deho b2 = deho.b(new Callable(dfazVar, h, dexaVar, c2) { // from class: dexb
            private final dfaz a;
            private final dexd b;
            private final dexa c;
            private final Set d;

            {
                this.a = dfazVar;
                this.b = h;
                this.c = dexaVar;
                this.d = c2;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dfaz dfazVar2 = this.a;
                dexd dexdVar = this.b;
                dexa dexaVar2 = this.c;
                Set<String> set = this.d;
                dyes<Boolean> dyesVar = dexc.a;
                if (((Boolean) dfazVar2.b.e(dexc.a)).booleanValue()) {
                    return dexdVar.b(dexaVar2, set);
                }
                return dexdVar.a(dexaVar2, set);
            }
        });
        ((dewj) dfazVar.b.e(dewk.a)).f().execute(b2);
        this.g = b2;
        return dfcg.c(b2);
    }

    @Override // defpackage.dfbd
    public final dfcg b(dfaz dfazVar) {
        dfbd dfbdVar = this.h;
        if (dfbdVar != null) {
            return dfbdVar.b(dfazVar);
        }
        try {
            dexf dexfVar = (dexf) deha.r(this.g);
            dyhw dyhwVar = dfazVar.a;
            dyhs<String> dyhsVar = b;
            dbsk.m(!dyhwVar.g(dyhsVar), "Already attached auth token");
            dyhw dyhwVar2 = dfazVar.a;
            String valueOf = String.valueOf(dexfVar.a);
            dyhwVar2.i(dyhsVar, valueOf.length() != 0 ? "Bearer ".concat(valueOf) : new String("Bearer "));
            dfazVar.a.i(c, Long.toString(dexfVar.b));
            return dfcg.a;
        } catch (ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof dexe) {
                return dfcg.b(dyjb.b(dyiy.UNAUTHENTICATED).f(cause.getCause()), new dyhw());
            }
            return dfcg.b(dyjb.c(cause), new dyhw());
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
