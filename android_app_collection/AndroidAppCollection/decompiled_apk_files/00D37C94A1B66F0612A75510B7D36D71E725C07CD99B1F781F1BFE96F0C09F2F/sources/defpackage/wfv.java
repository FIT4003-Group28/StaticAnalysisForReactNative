package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import j$.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: wfv */
/* loaded from: classes4.dex */
public final class wfv implements wge, afvr {
    public final axnm a;
    public final Executor b;
    public final yni c;
    public final Set d = new HashSet();
    public final acrq e;
    private final boolean f;
    private final axnm g;
    private final axnm h;
    private final axnm i;
    private final Executor j;
    private final snc k;
    private final abfh l;

    public wfv(axnm axnmVar, axnm axnmVar2, axnm axnmVar3, axnm axnmVar4, Executor executor, Executor executor2, aacz aaczVar, acrq acrqVar, snc sncVar, yni yniVar, abfh abfhVar) {
        this.a = axnmVar;
        this.g = axnmVar2;
        this.h = axnmVar3;
        this.b = executor;
        this.j = executor2;
        this.i = axnmVar4;
        this.e = acrqVar;
        this.k = sncVar;
        this.c = yniVar;
        this.f = vzx.a(aaczVar);
        this.l = abfhVar;
    }

    public static /* synthetic */ void c(Throwable th) {
        zep.d("Failed to clear the store.", th);
    }

    private final void o(afwa afwaVar) {
        if (!this.d.isEmpty()) {
            e(new IllegalStateException("Only one concurrent post-auth sign-in allowed."));
            zep.b("Only one concurrent post-auth sign-in allowed.");
        }
        if (afwaVar != null) {
            this.d.add(afwaVar);
        }
    }

    private final void p(String str, boolean z, boolean z2) {
        if (str.length() != 0) {
            "Signing out because: ".concat(str);
        }
        if (this.f && !z2) {
            aopa createBuilder = aows.a.createBuilder();
            createBuilder.copyOnWrite();
            aows aowsVar = (aows) createBuilder.instance;
            aowsVar.c = 2;
            aowsVar.b |= 1;
            arrf a = arrh.a();
            a.copyOnWrite();
            ((arrh) a.instance).bT((aows) createBuilder.mo39build());
            this.e.b((arrh) a.mo39build(), a());
            aopa createBuilder2 = aowt.a.createBuilder();
            createBuilder2.copyOnWrite();
            aowt aowtVar = (aowt) createBuilder2.instance;
            aowtVar.c = 2;
            aowtVar.b |= 1;
            arrf a2 = arrh.a();
            a2.copyOnWrite();
            ((arrh) a2.instance).bU((aowt) createBuilder2.mo39build());
            this.e.c((arrh) a2.mo39build(), afvl.a);
        }
        f(z);
        this.c.f(new afwd(z2, false));
        g(wgg.FINISHED, null);
    }

    public final long a() {
        return TimeUnit.HOURS.toMillis(TimeUnit.MILLISECONDS.toHours(this.k.c()));
    }

    @Override // defpackage.afvr
    public final void b(afvm afvmVar) {
        if (!afvmVar.z()) {
            ylx.i(((wea) this.i.get()).d.b(new wdx(((AccountIdentity) afvmVar).a(), 3), anjk.a), lgj.k);
        }
    }

    public final void d(AccountIdentity accountIdentity, waj wajVar, apzg apzgVar) {
        AccountIdentity accountIdentity2;
        wac wacVar = (wac) this.a.get();
        boolean z = false;
        if (wacVar.t()) {
            accountIdentity2 = (AccountIdentity) wacVar.c();
            if (vwr.c(accountIdentity) && accountIdentity.l() == 3) {
                ylx.i(((wea) this.i.get()).d.b(new wdx(accountIdentity2.d(), 5), anjk.a), lgj.l);
            }
            p("Signed in as new account", false, true);
            z = true;
        } else {
            accountIdentity2 = null;
        }
        wacVar.o(accountIdentity);
        ((wal) this.g.get()).q(wajVar);
        final String a = accountIdentity.a();
        final aorw g = apfb.g(Instant.now());
        ylx.i(((wea) this.i.get()).d.b(new ampg() { // from class: wdz
            @Override // defpackage.ampg
            public final Object apply(Object obj) {
                String str = a;
                aorw aorwVar = g;
                aopa mo52toBuilder = ((awtd) obj).mo52toBuilder();
                aorwVar.getClass();
                mo52toBuilder.copyOnWrite();
                ((awtd) mo52toBuilder.instance).a().put(str, aorwVar);
                return (awtd) mo52toBuilder.mo39build();
            }
        }, anjk.a), lgj.m);
        g(wgg.FINISHED, apzgVar);
        this.c.f(new afwb(accountIdentity));
        this.c.f(new wak());
        this.b.execute(new wft(this, 1));
        if (this.f) {
            if (!z) {
                final aopa createBuilder = aows.a.createBuilder();
                createBuilder.copyOnWrite();
                aows aowsVar = (aows) createBuilder.instance;
                aowsVar.c = 1;
                aowsVar.b |= 1;
                abfg a2 = this.l.a();
                ((abfl) a2).b = new ampg() { // from class: wfo
                    @Override // defpackage.ampg
                    public final Object apply(Object obj) {
                        wfv wfvVar = wfv.this;
                        aopa aopaVar = createBuilder;
                        apij apijVar = (apij) obj;
                        if (!apij.a.equals(apijVar)) {
                            aopaVar.copyOnWrite();
                            aows aowsVar2 = (aows) aopaVar.instance;
                            aows aowsVar3 = aows.a;
                            apijVar.getClass();
                            aowsVar2.e = apijVar;
                            aowsVar2.b |= 8;
                        }
                        arrf a3 = arrh.a();
                        a3.copyOnWrite();
                        ((arrh) a3.instance).bT((aows) aopaVar.mo39build());
                        wfvVar.e.b((arrh) a3.mo39build(), wfvVar.a());
                        aopa createBuilder2 = aowt.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        aowt aowtVar = (aowt) createBuilder2.instance;
                        aowtVar.c = 1;
                        aowtVar.b = 1 | aowtVar.b;
                        arrf a4 = arrh.a();
                        a4.copyOnWrite();
                        ((arrh) a4.instance).bU((aowt) createBuilder2.mo39build());
                        wfvVar.e.c((arrh) a4.mo39build(), afvl.a);
                        return apij.a;
                    }
                };
                ylx.m(a2.a(), ngc.h);
            } else if (accountIdentity2 == null) {
            } else {
                aopa createBuilder2 = aows.a.createBuilder();
                createBuilder2.copyOnWrite();
                aows aowsVar2 = (aows) createBuilder2.instance;
                aowsVar2.c = 4;
                aowsVar2.b |= 1;
                arrf a3 = arrh.a();
                a3.copyOnWrite();
                ((arrh) a3.instance).bT((aows) createBuilder2.mo39build());
                this.e.c((arrh) a3.mo39build(), accountIdentity2);
                aopa createBuilder3 = aows.a.createBuilder();
                createBuilder3.copyOnWrite();
                aows aowsVar3 = (aows) createBuilder3.instance;
                aowsVar3.c = 4;
                aowsVar3.b |= 1;
                arrf a4 = arrh.a();
                a4.copyOnWrite();
                ((arrh) a4.instance).bT((aows) createBuilder3.mo39build());
                arrh arrhVar = (arrh) a4.mo39build();
                afvn afvnVar = (afvn) this.a.get();
                this.e.a.h(arrhVar, afvnVar.c(), a(), new afuq(afvnVar.g(), afvnVar.c().g()));
            }
        }
    }

    public final void e(Exception exc) {
        if (!((wac) this.a.get()).t()) {
            f(false);
        }
        g(wgg.CANCELLED, null);
        this.c.f(new wgf(exc));
        this.b.execute(new wfu(this, exc));
    }

    public final void f(boolean z) {
        ((wac) this.a.get()).r(z);
        ((wal) this.g.get()).i();
    }

    public final void g(wgg wggVar, apzg apzgVar) {
        this.c.d(new wgh(wggVar, wggVar == wgg.FINISHED, apzgVar));
    }

    @Override // defpackage.wge
    public final void h(AccountIdentity accountIdentity, apzg apzgVar, afwa afwaVar) {
        o(afwaVar);
        g(wgg.STARTED, null);
        this.j.execute(new wfq(this, accountIdentity, apzgVar));
    }

    @Override // defpackage.wge
    public final void i(aarw aarwVar, apzg apzgVar, afwa afwaVar) {
        ylr.c();
        o(afwaVar);
        g(wgg.STARTED, null);
        if (aarwVar.l()) {
            m(aarwVar, apzgVar);
        }
    }

    @Override // defpackage.wge
    public final void j(apwe apweVar, avvv avvvVar, apzg apzgVar, afwa afwaVar) {
        waj wajVar;
        o(afwaVar);
        g(wgg.STARTED, null);
        if (avvvVar == null) {
            wajVar = waj.a;
        } else {
            String str = avvvVar.c;
            String str2 = avvvVar.b;
            avhn avhnVar = avvvVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            wajVar = new waj(str, str2, avhnVar);
        }
        this.j.execute(new wfp(this, AccountIdentity.m(apweVar), wajVar, apzgVar));
    }

    @Override // defpackage.wge
    public final void k(String str) {
        p(str, true, false);
    }

    @Override // defpackage.wge
    public final void l(String str, boolean z) {
        p(str, z, false);
    }

    public final void m(aarw aarwVar, apzg apzgVar) {
        AccountIdentity A;
        if (aarwVar.n()) {
            A = AccountIdentity.s(aarwVar.k(), aarwVar.g(), aarwVar.h());
        } else {
            String i = aarwVar.i();
            String g = aarwVar.g();
            String j = aarwVar.j();
            aasf aasfVar = aarwVar.c;
            if (aasfVar.d == null) {
                aasfVar.b();
            }
            Boolean bool = aasfVar.d;
            boolean z = false;
            if (bool != null && bool.booleanValue()) {
                z = true;
            }
            A = AccountIdentity.A(i, g, j, z, aarwVar.h());
        }
        this.j.execute(new wfs(this, A, aarwVar, apzgVar));
    }

    @Override // defpackage.wge
    public final void n(String str, @Deprecated afwa afwaVar) {
        if (afwaVar == null) {
            afwaVar = afwa.g;
        }
        this.d.add(afwaVar);
        g(wgg.STARTED, null);
        wgd.a((aasc) this.h.get(), str, new wfr(this));
    }
}
