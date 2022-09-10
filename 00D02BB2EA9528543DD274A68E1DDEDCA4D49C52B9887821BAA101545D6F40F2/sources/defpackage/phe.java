package defpackage;

import android.accounts.Account;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: phe  reason: default package */
/* loaded from: classes7.dex */
public final class phe implements pff, cqyx, crzp {
    public final dxio<ania> a;
    private final dxio<akfa> b;
    private final dxio<pgp> c;
    private final Map<pfa, pha<?>> f;
    private final pfc g;
    private final Map<pfa, pfe<?>> h = new HashMap();
    private final AtomicReference<btlu> d = new AtomicReference<>();
    private final AtomicBoolean e = new AtomicBoolean(false);

    public phe(dxio<akfa> dxioVar, dxio<pgp> dxioVar2, dxio<ania> dxioVar3, Map<pfa, pha<?>> map, pfc pfcVar) {
        this.b = dxioVar;
        this.a = dxioVar3;
        this.c = dxioVar2;
        this.f = map;
        this.g = pfcVar;
    }

    private final synchronized <V> pfe<V> h(pfa pfaVar, pha<V> phaVar) {
        if (this.h.get(pfaVar) != null) {
            return (pfe<V>) this.h.get(pfaVar);
        }
        pim<V> a = phaVar.a();
        dbsk.s(a);
        phc phcVar = new phc(a, new dbty(this) { // from class: phd
            private final phe a;

            {
                this.a = this;
            }

            @Override // defpackage.dbty
            public final Object a() {
                return Boolean.valueOf(this.a.a.a().a());
            }
        }, phaVar.d());
        this.h.put(pfaVar, phcVar);
        return phcVar;
    }

    private final <V> pha<V> i(pfb<V> pfbVar) {
        return j(pfbVar.c, pfbVar.d);
    }

    private final <V> pha<V> j(pfa pfaVar, Class<V> cls) {
        pha<V> phaVar = (pha<V>) this.f.get(pfaVar);
        if (phaVar == null) {
            String valueOf = String.valueOf(pfaVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 25);
            sb.append("Signal ");
            sb.append(valueOf);
            sb.append("is not provisioned");
            throw new UnsupportedOperationException(sb.toString());
        }
        dbsk.m(cls.isAssignableFrom(phaVar.c()), "Invalid value type");
        return phaVar;
    }

    @Override // defpackage.crzp
    public final synchronized void On(crzm<btlu> crzmVar) {
        btlu l = crzmVar.l();
        if (!dbsd.a(l, this.d.getAndSet(l))) {
            crzmVar.l();
            pgp a = this.c.a();
            try {
                if (a.b.getGellerParameters().a) {
                    a.c.c("GellerPeriodicSync");
                    a.c.c("GellerOnDemandSync");
                }
            } catch (RuntimeException e) {
                a.d.a(7, e);
            }
            final pgp a2 = this.c.a();
            try {
                if (!a2.b.getGellerParameters().a) {
                    deha.c();
                } else {
                    bbo bboVar = new bbo();
                    bboVar.e("worker_name_key", "GellerSyncWorker");
                    pgv bZ = pgw.e.bZ();
                    bZ.a(a2.a());
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    pgw pgwVar = (pgw) bZ.b;
                    pgwVar.d = 1;
                    pgwVar.a = 1 | pgwVar.a;
                    bboVar.c("GellerSyncWorkerParams", bZ.bK().bS());
                    final bci f = new bch(GmmWorkerWrapper.class, a2.b.getGellerParameters().d, TimeUnit.SECONDS).d("GellerPeriodicSync").c(bboVar.a()).b(pgp.a).f();
                    deew.h(a2.c.f("GellerPeriodicSync", 2, f).a(), new dbrn(a2, f) { // from class: pgn
                        private final pgp a;
                        private final bci b;

                        {
                            this.a = a2;
                            this.b = f;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            pgp pgpVar = this.a;
                            try {
                                return this.b.a;
                            } catch (RuntimeException e2) {
                                pgpVar.d.c(7, e2);
                                return bbx.c();
                            }
                        }
                    }, dege.a);
                }
            } catch (RuntimeException e2) {
                a2.d.c(7, e2);
                deha.a(bbx.c());
            }
            for (pfe<?> pfeVar : this.h.values()) {
                pfeVar.d(new pfo(null, pfn.CORPUS_INVALIDATED));
            }
        }
    }

    @Override // defpackage.pff
    public final synchronized void b() {
        if (!this.e.compareAndSet(false, true)) {
            return;
        }
        if (this.g.b()) {
            this.b.a().C().d(this, dege.a);
            if (this.g.a.getGellerParameters().c && this.d.get() != null) {
                this.c.a().b();
            }
            final pgp a = this.c.a();
            try {
                if (!a.b.getGellerParameters().a) {
                    deha.c();
                } else {
                    bbo bboVar = new bbo();
                    bboVar.e("worker_name_key", "GellerCleanupWorker");
                    bbp a2 = bboVar.a();
                    bbk bbkVar = new bbk();
                    bbkVar.c = 1;
                    bbkVar.a = false;
                    final bci f = new bch(GmmWorkerWrapper.class, a.b.getGellerParameters().f, TimeUnit.SECONDS).d("GellerCleanup").c(a2).b(bbkVar.a()).f();
                    deew.h(a.c.f("GellerCleanup", 2, f).a(), new dbrn(a, f) { // from class: pgo
                        private final pgp a;
                        private final bci b;

                        {
                            this.a = a;
                            this.b = f;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            pgp pgpVar = this.a;
                            try {
                                return this.b.a;
                            } catch (RuntimeException e) {
                                pgpVar.d.c(6, e);
                                return bbx.c();
                            }
                        }
                    }, dege.a);
                }
            } catch (RuntimeException e) {
                a.d.c(6, e);
                deha.a(bbx.c());
            }
        }
        if (this.g.c()) {
            for (pfa pfaVar : ((dcdn) this.f).keySet()) {
                pha j = j(pfaVar, this.f.get(pfaVar).c());
                phu b = j.b();
                if (b != null) {
                    b.a(h(pfaVar, j));
                }
            }
        }
    }

    @Override // defpackage.pff
    public final synchronized void c() {
        if (!this.e.compareAndSet(true, false)) {
            return;
        }
        if (this.g.b()) {
            this.b.a().C().c(this);
        }
        if (this.g.c()) {
            for (pha phaVar : ((dcdn) this.f).values()) {
                phu b = phaVar.b();
                if (b != null) {
                    b.b();
                }
            }
            for (pfe<?> pfeVar : this.h.values()) {
                pfeVar.b();
            }
        }
    }

    @Override // defpackage.pff
    public final <V> pfi<pfm<V>> d(pfb<V> pfbVar, long j) {
        pim<V> a = i(pfbVar).a();
        dbsk.s(a);
        return new phn(a, j);
    }

    @Override // defpackage.pff
    public final synchronized <V> pfe<V> e(pfb<V> pfbVar) {
        return h(pfbVar.c, i(pfbVar));
    }

    @Override // defpackage.cqyx
    public final synchronized void f(dsyl dsylVar, Account account, cqyw cqywVar) {
        String str = account.name;
        cqywVar.a().size();
        cqywVar.b().size();
        if (!account.name.equals(this.b.a().j().t())) {
            return;
        }
        if (dcnm.p(cqywVar.a(), cqywVar.b()).isEmpty()) {
            return;
        }
        for (pfa pfaVar : this.h.keySet()) {
            pim<?> a = this.f.get(pfaVar).a();
            if ((a instanceof pie) && ((pie) a).a.equals(dsylVar)) {
                this.h.get(pfaVar).d(new pfo(null, pfn.CORPUS_INVALIDATED));
            }
        }
    }

    @Override // defpackage.cqyx
    public final void g() {
    }
}
