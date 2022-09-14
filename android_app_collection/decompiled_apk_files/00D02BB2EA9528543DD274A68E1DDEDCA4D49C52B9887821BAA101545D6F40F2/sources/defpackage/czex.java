package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.AffinityContext;
import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: czex  reason: default package */
/* loaded from: classes5.dex */
public final class czex implements czfm {
    public final Context a;
    public final cyhd b;
    public final ExecutorService c;
    public final dehp d;
    public final Locale e;
    public final ClientConfigInternal f;
    public final cych g;
    final czdy h;
    public final cyph i;
    public final ClientVersion j;
    public final czec k;
    public final cyfq l;
    public final czev m;
    private final cyxw n;
    private final Random o;
    private final cyug p;
    @dzsi
    private final cxyg q;

    public czex(Context context, ClientVersion clientVersion, cyhd cyhdVar, ExecutorService executorService, cych cychVar, ClientConfigInternal clientConfigInternal, Locale locale, cyug cyugVar, cyxw cyxwVar, cxyg cxygVar, cyph cyphVar) {
        czfj c;
        cyfs cyfsVar = cyfs.b;
        Random random = new Random();
        this.a = context;
        this.f = clientConfigInternal;
        this.c = executorService;
        this.d = dehx.c(executorService);
        this.e = locale;
        this.g = cychVar;
        this.b = cyhdVar;
        if (dyak.a.a().a()) {
            c = czfj.b(new czcn(locale), cyphVar, new czdz(locale));
        } else {
            c = czfj.c();
        }
        czdy czdyVar = new czdy(c);
        this.h = czdyVar;
        this.p = cyugVar;
        this.n = cyxwVar;
        this.q = cxygVar;
        this.i = cyphVar;
        this.j = clientVersion;
        this.k = new czec(cyugVar, context, locale, clientConfigInternal, cyphVar);
        this.l = cyfsVar;
        this.o = random;
        dbtp dbtpVar = null;
        if (cychVar.c != cycg.SUCCESS_LOGGED_IN || cyugVar == null) {
            String str = cychVar.a;
            czdyVar.c(czdx.o(cyes.FAILED_ACCOUNT_NOT_LOGGED_IN), false);
            if (!dybx.a.a().j()) {
                this.m = null;
                return;
            }
            new czei(this, 3);
            this.m = new czei(this, 4);
            return;
        }
        new czev(this, 3);
        this.m = new czev(this, 4);
        boolean d = dybi.a.a().d();
        dbtpVar = d ? cyphVar.b() : dbtpVar;
        boolean z = dybi.a.a().b() && random.nextDouble() <= dybi.a.a().i();
        if (z) {
            try {
                cyfsVar.a(dybi.a.a().h(), dybi.a.a().j());
            } catch (IllegalStateException unused) {
                z = false;
            }
        }
        czdx b = this.k.b();
        if (!b.l()) {
            this.h.c(b, false);
            l();
        }
        if (z) {
            try {
                cyfp b2 = this.l.b();
                if (b2.a != -1) {
                    cypg.b(this.i, 8, b2.a(), b2.b(), cyor.a);
                }
            } catch (IllegalStateException unused2) {
            }
        }
        if (d) {
            cypg.a(this.i, z ? 20 : 21, dbtpVar, cyor.a);
        }
        a(false, czem.a, true);
    }

    public static final long n(@dzsi cylc cylcVar) {
        cylg cylgVar;
        if (cylcVar == null || (cylgVar = cylcVar.c) == null) {
            return 0L;
        }
        return cylgVar.b;
    }

    public static final long o(@dzsi cylc cylcVar) {
        cylg cylgVar;
        if (cylcVar == null || (cylgVar = cylcVar.c) == null) {
            return 0L;
        }
        return cylgVar.c;
    }

    private final void p(czdx czdxVar, String str, boolean z, cyem<czfo> cyemVar, @dzsi cyes cyesVar, dbtp dbtpVar) {
        cyemVar.a(b(czdxVar, str, z, cyesVar, dbtpVar));
    }

    private final dehn<czdx> q() {
        deig d = deig.d();
        g(new czeh(this, d));
        return d;
    }

    private final void r(cygo cygoVar, boolean z) {
        czem czemVar = new czem(cygoVar);
        if (this.g.c == cycg.SUCCESS_LOGGED_IN) {
            a(z, czemVar, false);
            return;
        }
        this.k.e();
        czemVar.a(cygn.b(cyes.FAILED_ACCOUNT_NOT_LOGGED_IN));
    }

    private static void s(cyph cyphVar, cyem<czfo> cyemVar, int i, cyes cyesVar) {
        cypg.c(cyphVar, 3, i, cyor.a);
        czfn i2 = czfo.i();
        i2.g(cyesVar);
        i2.b(AffinityContext.b);
        i2.e(dcdc.e());
        cyemVar.a(i2.a());
    }

    final void a(boolean z, czem czemVar, boolean z2) {
        boolean z3 = false;
        if (z2 && dybi.c() && this.o.nextDouble() <= dybi.e()) {
            try {
                this.l.a(dybi.d(), dybi.f());
                z3 = true;
            } catch (IllegalStateException unused) {
            }
        }
        czel czelVar = new czel(czemVar);
        czdy czdyVar = this.h;
        CountDownLatch countDownLatch = czdyVar.a.get();
        if (countDownLatch.getCount() == 0) {
            czdyVar.a.compareAndSet(countDownLatch, new CountDownLatch(1));
        }
        UUID randomUUID = UUID.randomUUID();
        czelVar.a.a(cygn.b(cyes.SKIPPED));
        final CountDownLatch countDownLatch2 = z3 ? new CountDownLatch(1) : null;
        deha.q(this.m.a(z, randomUUID, countDownLatch2), new czeg(czelVar.b), dege.a);
        if (z3) {
            this.c.submit(new Runnable(this, countDownLatch2) { // from class: czed
                private final czex a;
                private final CountDownLatch b;

                {
                    this.a = this;
                    this.b = countDownLatch2;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    czex czexVar = this.a;
                    try {
                        if (!this.b.await(dybi.f(), TimeUnit.MILLISECONDS)) {
                            return;
                        }
                        cyfp b = czexVar.l.b();
                        if (b.a == -1) {
                            return;
                        }
                        cypg.b(czexVar.i, 2, b.a(), b.b(), cyor.a);
                    } catch (IllegalArgumentException | InterruptedException unused2) {
                    }
                }
            });
        }
    }

    @Override // defpackage.czfm
    public final void c(final String str, final cywa cywaVar, final cyem<czfo> cyemVar) {
        this.c.submit(new Runnable(this, cywaVar, str, cyemVar) { // from class: czee
            private final czex a;
            private final cywa b;
            private final String c;
            private final cyem d;

            {
                this.a = this;
                this.b = cywaVar;
                this.c = str;
                this.d = cyemVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.m(this.b, this.c, this.d);
            }
        });
    }

    @Override // defpackage.czfm
    public final dehn<czfo> d(final String str, cywa cywaVar) {
        czdx a = this.h.a();
        final boolean a2 = cyui.a(this.a);
        final cyes cyesVar = a2 ? null : cyes.FAILED_NETWORK;
        final dbtp b = this.i.b();
        if (a.l() || a.q()) {
            dehn<czdx> q = q();
            cyei cyeiVar = cyei.EMPTY;
            int ordinal = cywaVar.d().ordinal();
            if (ordinal == 0) {
                return deha.a(b(a, str, false, cyes.SUCCESS, b));
            }
            if (ordinal == 1 || ordinal == 2) {
                return deew.h(q, new dbrn(this, str, a2, cyesVar, b) { // from class: czef
                    private final czex a;
                    private final String b;
                    private final boolean c;
                    private final cyes d;
                    private final dbtp e;

                    {
                        this.a = this;
                        this.b = str;
                        this.c = a2;
                        this.d = cyesVar;
                        this.e = b;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        return this.a.b((czdx) obj, this.b, this.c, this.d, this.e);
                    }
                }, this.c);
            }
            throw new AssertionError(cywaVar.d());
        }
        if (!a.p()) {
            q();
        }
        return deha.a(b(a, str, false, null, b));
    }

    @Override // defpackage.czfm
    public final cyei e() {
        czdx a = this.h.a();
        if (a == null || a.l()) {
            return cyei.EMPTY;
        }
        if (a.u() == 3) {
            return cyei.PARTIAL;
        }
        return cyei.FULL;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x002c  */
    @Override // defpackage.czfm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.dcdc<com.google.android.libraries.social.populous.core.InAppNotificationTarget> f(defpackage.cyvi r3) {
        /*
            r2 = this;
            czdy r0 = r2.h     // Catch: java.lang.Exception -> L3d
            czdx r0 = r0.a()     // Catch: java.lang.Exception -> L3d
            boolean r1 = r0.l()     // Catch: java.lang.Exception -> L3d
            if (r1 != 0) goto L17
            boolean r1 = r0.p()     // Catch: java.lang.Exception -> L3d
            if (r1 != 0) goto L13
            goto L17
        L13:
            defpackage.deha.a(r0)     // Catch: java.lang.Exception -> L3d
            goto L1a
        L17:
            r2.q()     // Catch: java.lang.Exception -> L3d
        L1a:
            czdy r0 = r2.h
            czdx r0 = r0.a()
            dcet r1 = r0.d()
            boolean r1 = r1.D()
            if (r1 == 0) goto L2c
            r3 = 0
            return r3
        L2c:
            dcet r0 = r0.d()
            java.lang.String r3 = r3.k()
            dcep r3 = r0.h(r3)
            dcdc r3 = r3.v()
            return r3
        L3d:
            r3 = move-exception
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.czex.f(cyvi):dcdc");
    }

    @Override // defpackage.czfm
    public final void g(cygo cygoVar) {
        r(cygoVar, true);
    }

    @Override // defpackage.czfm
    public final void h(cygo cygoVar) {
        r(cygoVar, false);
    }

    @Override // defpackage.czfm
    public final void i() {
        this.k.e();
        czdy czdyVar = this.h;
        czdyVar.b.set(czdx.o(cyes.FAILED_UNKNOWN));
        czdyVar.c.set(false);
    }

    @Override // defpackage.czfm
    @dzsi
    public final cywi j(cygg cyggVar) {
        return this.h.a().j().get(cyggVar);
    }

    @Override // defpackage.czfm
    public final int k() {
        try {
            return this.h.b(false).c().size();
        } catch (InterruptedException unused) {
            cypg.c(this.i, 3, 4, cyor.a);
            return 0;
        }
    }

    public final void l() {
        cyxw cyxwVar = this.n;
        synchronized (cyxwVar.a) {
            cyxwVar.b.incrementAndGet();
            cyxwVar.c.clear();
        }
        cxyg cxygVar = this.q;
        if (cxygVar != null) {
            cxygVar.b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void m(cywa cywaVar, String str, cyem cyemVar) {
        try {
            czdx a = this.h.a();
            boolean a2 = cyui.a(this.a);
            cyes cyesVar = a2 ? null : cyes.FAILED_NETWORK;
            dbtp b = this.i.b();
            if (!a.l() && !a.q()) {
                if (!a.p()) {
                    q();
                }
                if (a.u() != 3 || cywaVar.d() != cyei.FULL) {
                    p(a, str, false, cyemVar, null, b);
                    return;
                }
                this.m.b(TimeUnit.MILLISECONDS);
                p(this.h.a(), str, a2, cyemVar, cyesVar, b);
                return;
            }
            dehn<czdx> q = q();
            cyei cyeiVar = cyei.EMPTY;
            int ordinal = cywaVar.d().ordinal();
            if (ordinal == 0) {
                p(a, str, false, cyemVar, cyes.SUCCESS, b);
            } else if (ordinal != 1) {
                if (ordinal != 2) {
                    return;
                }
                p(q.get(), str, a2, cyemVar, cyesVar, b);
            } else {
                if (a2) {
                    a = this.h.b(true);
                }
                p(a, str, a2, cyemVar, cyesVar, b);
            }
        } catch (InterruptedException unused) {
            s(this.i, cyemVar, 4, cyes.FAILED_INTERRUPTED);
        } catch (TimeoutException unused2) {
            s(this.i, cyemVar, 5, cyes.FAILED_TIMEOUT);
        } catch (Throwable unused3) {
            s(this.i, cyemVar, 2, cyes.FAILED_UNKNOWN);
        }
    }

    public final czfo b(czdx czdxVar, String str, boolean z, @dzsi cyes cyesVar, dbtp dbtpVar) {
        cyds cydsVar;
        int i = 3;
        if (z) {
            cypg.a(this.i, 6, dbtpVar, cyor.a);
        } else {
            this.i.c(3, cyor.a);
        }
        dcdc<cywi> a = czdxVar.a.a(str);
        a.size();
        czdxVar.c().size();
        czdxVar.u();
        if (cyesVar == null) {
            cyesVar = czdxVar.h();
        }
        czfn i2 = czfo.i();
        i2.b(czdxVar.a());
        i2.f(czdxVar.b());
        i2.e(a);
        i2.g(cyesVar);
        ((czfb) i2).b = !this.h.c.get() ? null : Long.valueOf(czdxVar.e());
        int u = czdxVar.u();
        cydr e = AutocompletionCallbackMetadata.e();
        cybv cybvVar = (cybv) e;
        cybvVar.a = u == 4 ? 1 : u == 3 ? 2 : 3;
        if (z) {
            cydsVar = cyds.WAITED_FOR_RESULTS;
        } else {
            cydsVar = cyds.DID_NOT_WAIT_FOR_RESULTS;
        }
        e.b(cydsVar);
        if (z || cyes.FAILED_NETWORK == cyesVar) {
            i = cyesVar == cyes.FAILED_NETWORK ? 2 : 1;
        }
        cybvVar.b = i;
        i2.c(e.a());
        i2.d(czdxVar.i());
        return i2.a();
    }
}
