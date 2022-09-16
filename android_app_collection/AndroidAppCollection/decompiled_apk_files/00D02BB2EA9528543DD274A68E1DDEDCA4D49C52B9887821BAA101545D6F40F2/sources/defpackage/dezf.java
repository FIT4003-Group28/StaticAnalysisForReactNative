package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dezf  reason: default package */
/* loaded from: classes6.dex */
public final class dezf implements dfbd {
    static final dyhs<byte[]> a;
    static final byte[] b;
    public static final dyes<dewc> c;
    private static final dyhs<byte[]> k;
    public final dezh<dssj, dssj> d;
    public dyhw e;
    public dyhw f;
    public dfcq g;
    public dewc h;
    public long i = -1;
    public List<String> j = dcdc.e();
    private final Executor l;
    private deho<dbsg<? extends dezg<? extends dssj>>> m;

    static {
        dcrc.b("xRPC");
        k = dfcw.a(devz.e);
        a = dfcw.a(dewb.b);
        b = dewb.a.bS();
        c = dyes.b("ClientInterceptorCacheDirective", dewc.DEFAULT_CACHE_OK_IF_VALID);
    }

    public dezf(deze dezeVar) {
        this.d = dezeVar.a;
        this.l = dezeVar.b;
    }

    public static deze h() {
        return new deze();
    }

    @Override // defpackage.dfbd
    public final dfcg a(dfaz dfazVar) {
        dbsk.m(dfazVar.a().a.equals(dyhz.UNARY), "Caching interceptor only supports unary RPCs");
        dfcq dfcqVar = (dfcq) dfazVar.b.e(dfcq.b);
        dbsk.t(dfcqVar, "Using CachingClientInterceptor without MutableMetricsContext");
        this.g = dfcqVar;
        dewc dewcVar = (dewc) dfazVar.b.e(c);
        dbsk.t(dewcVar, "Using CachingClientInterceptor without CacheDirective");
        this.h = dewcVar;
        dyhw dyhwVar = new dyhw();
        this.e = dyhwVar;
        dyhwVar.k(dfazVar.a);
        return dfcg.b;
    }

    @Override // defpackage.dfbd
    public final dfcg b(dfaz dfazVar) {
        return dfcg.a;
    }

    @Override // defpackage.dfbd
    public final dfcg c(dfba dfbaVar) {
        deho<dbsg<? extends dezg<? extends dssj>>> b2 = deho.b(new Callable(this) { // from class: dezc
            private final dezf a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                dezf dezfVar = this.a;
                dewc dewcVar = dewc.DEFAULT_CACHE_OK_IF_VALID;
                int ordinal = dezfVar.h.ordinal();
                if (ordinal != 0) {
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            return dbpy.a;
                        }
                        if (ordinal != 3) {
                            if (ordinal != 4) {
                                throw new IllegalStateException("Unrecognized directive");
                            }
                        }
                    }
                    dezfVar.g.d();
                    return dezfVar.d.a();
                }
                dezfVar.g.d();
                return dezfVar.d.b();
            }
        });
        this.m = b2;
        this.l.execute(b2);
        return dfcg.c(this.m);
    }

    @Override // defpackage.dfbd
    public final dfch d(dfbb dfbbVar) {
        dyhr dyhrVar;
        dyhw dyhwVar = new dyhw();
        this.f = dyhwVar;
        dyhwVar.k(dfbbVar.a);
        dyhw dyhwVar2 = this.f;
        dyhs<byte[]> dyhsVar = k;
        if (dyhwVar2.g(dyhsVar)) {
            dyhw dyhwVar3 = this.f;
            int i = 0;
            while (true) {
                if (i >= dyhwVar3.e) {
                    dyhrVar = null;
                    break;
                } else if (Arrays.equals(dyhsVar.b, dyhwVar3.a(i))) {
                    dyhrVar = new dyhr(dyhwVar3, dyhsVar, i);
                    break;
                } else {
                    i++;
                }
            }
            if (dyhrVar != null) {
                dcdc q = dcdc.q(dyhrVar);
                if (q.size() == 1) {
                    try {
                        devz bK = ((devy) devz.d.bZ().bx((byte[]) q.get(0), dsqa.c())).bK();
                        if ((bK.a & 1) != 0) {
                            long j = bK.b;
                            if (j > 0) {
                                this.i = TimeUnit.SECONDS.toMillis(j);
                                dsrj<String> dsrjVar = bK.c;
                                dccx F = dcdc.F();
                                for (String str : dsrjVar) {
                                    F.g(str.toLowerCase(Locale.ROOT));
                                }
                                this.j = F.f();
                                return dfch.a;
                            }
                        }
                    } catch (dsrm unused) {
                    }
                } else {
                    q.size();
                }
            }
        }
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfch e(dfbc dfbcVar) {
        if (this.i != -1) {
            this.l.execute(new Runnable(this) { // from class: dezd
                private final dezf a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    Set<String> unmodifiableSet;
                    dezf dezfVar = this.a;
                    try {
                        dyhw dyhwVar = dezfVar.e;
                        if (dyhwVar.f()) {
                            unmodifiableSet = Collections.emptySet();
                        } else {
                            HashSet hashSet = new HashSet(dyhwVar.e);
                            for (int i = 0; i < dyhwVar.e; i++) {
                                hashSet.add(new String(dyhwVar.a(i), 0));
                            }
                            unmodifiableSet = Collections.unmodifiableSet(hashSet);
                        }
                        for (String str : unmodifiableSet) {
                            if (!dezfVar.j.contains(str)) {
                                if (str.endsWith("-bin")) {
                                    dezfVar.e.l(dyhs.c(str, dyhw.a));
                                } else {
                                    dezfVar.e.l(dyhs.d(str, dyhw.b));
                                }
                            }
                        }
                        dezfVar.d.c();
                    } catch (Throwable unused) {
                    }
                }
            });
            return dfch.a;
        }
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfch f(dfay dfayVar) {
        return dfch.a;
    }

    @Override // defpackage.dfbd
    public final dfcg g() {
        try {
            dbsg dbsgVar = (dbsg) deha.r(this.m);
            if (dbsgVar == null) {
                return dfcg.a;
            }
            if (dbsgVar.a()) {
                dezg dezgVar = (dezg) dbsgVar.b();
                throw null;
            }
            if (!this.h.equals(dewc.CACHE_ONLY) && !this.h.equals(dewc.VALID_CACHE_ONLY)) {
                return dfcg.a;
            }
            dyjb g = dyjb.b(dyiy.FAILED_PRECONDITION).g("Required value come from cache, but no cached value was found");
            dyhw dyhwVar = new dyhw();
            dyhwVar.i(a, b);
            return dfcg.b(g, dyhwVar);
        } catch (ExecutionException e) {
            e.getCause();
            if (e.getCause() instanceof ClassCastException) {
                return dfcg.b(dyjb.l, new dyhw());
            }
            return dfcg.a;
        }
    }
}
