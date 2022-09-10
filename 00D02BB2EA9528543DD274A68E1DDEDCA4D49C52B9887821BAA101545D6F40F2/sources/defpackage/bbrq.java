package defpackage;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.net.Uri;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bbrq  reason: default package */
/* loaded from: classes3.dex */
public final class bbrq implements bbul {
    public BroadcastReceiver c;
    public apt d;
    public final dbty<bbqf> e;
    public final Executor g;
    public final crzb h;
    public final bztp i;
    public final bbqb j;
    public final bbuh k;
    public final boolean l;
    private final Executor m;
    private final Application n;
    public final CopyOnWriteArraySet<WeakReference<ccrt>> a = new CopyOnWriteArraySet<>();
    public boolean b = false;
    public final Map<String, bbrk> f = new ConcurrentHashMap();

    public bbrq(crzb crzbVar, Executor executor, Executor executor2, Application application, bvjj bvjjVar, bztp bztpVar, bbqo bbqoVar, bbqb bbqbVar, bbuh bbuhVar) {
        this.n = application;
        this.e = dbud.a(bbqoVar);
        this.m = executor;
        this.g = executor2;
        this.h = crzbVar;
        this.j = bbqbVar;
        this.i = bztpVar;
        this.k = bbuhVar;
        this.l = bvjjVar.m(bvjk.fZ, true);
    }

    public static <T extends bbqp, P> dcdc<T> i(dced<bbvh, P> dcedVar, dbsg<Iterator<String>> dbsgVar, bbqa bbqaVar, bbrm<T, P> bbrmVar) {
        dccx F = dcdc.F();
        dcpd<bbvh> it = dcedVar.J().iterator();
        while (it.hasNext()) {
            bbvh next = it.next();
            dccr<P> h = dcedVar.h(next);
            dcpd<P> it2 = h.iterator();
            while (it2.hasNext()) {
                F.g(bbrmVar.a(it2.next(), next, dbsgVar.h(bbqz.a)));
            }
            int size = h.size();
            if (next.a().ai().equals(akqi.a)) {
                bbqaVar.g += size;
            }
        }
        return F.f();
    }

    @Override // defpackage.bbul
    public final boolean a() {
        return this.e.a().c();
    }

    @Override // defpackage.bbul
    public final void b(boolean z) {
        this.e.a().d(z);
    }

    @Override // defpackage.bbul
    @Deprecated
    public final void c(String str, dwyd dwydVar, bbvh bbvhVar, List<bbtj> list, cjqm cjqmVar, bbuk bbukVar) {
        bbui k = bbuj.k();
        k.g(str);
        k.h(dwydVar);
        k.l(bbukVar);
        k.i(cjqmVar);
        for (bbtj bbtjVar : list) {
            k.n(bbtjVar, bbvhVar);
        }
        d(k.m());
    }

    @Override // defpackage.bbul
    public final void d(final bbuj bbujVar) {
        this.h.a();
        if (bbujVar.d().a() || bbujVar.e().a()) {
            if (this.c == null) {
                this.c = new bbro(this);
            }
            if (!this.b) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("geo.uploader.upload_progress_broadcast_action");
                if (this.d == null) {
                    this.d = apt.a(this.n);
                }
                this.d.b(this.c, intentFilter);
                this.b = true;
            }
        }
        this.m.execute(new Runnable(this, bbujVar) { // from class: bbqy
            private final bbrq a;
            private final bbuj b;

            {
                this.a = this;
                this.b = bbujVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final bbrq bbrqVar = this.a;
                final bbuj bbujVar2 = this.b;
                bbrqVar.h.b();
                bbqb bbqbVar = bbrqVar.j;
                boolean a = bbrqVar.a();
                ckcw a2 = bbqbVar.a.a();
                bbqb.a(a2, 1);
                cjqy a3 = bbqbVar.b.a();
                bbqb.a(a3, 2);
                bbqb.a(bbujVar2, 3);
                bbqa bbqaVar = new bbqa(a2, a3, bbujVar2, a);
                dbsg<V> h = bbujVar2.f().h(bbrb.a);
                dcen N = dcep.N();
                N.i(bbujVar2.i().J());
                N.i(bbujVar2.j().J());
                dcep f = N.f();
                dbsg<bbvh> j = dbsg.j(f.size() == 1 ? (bbvh) f.iterator().next() : null);
                if (!bbujVar2.i().D()) {
                    final boolean z = bbrqVar.l && bbujVar2.h().c(true).booleanValue();
                    dcdc<bbpw> i = bbrq.i(bbujVar2.i(), h, bbqaVar, new bbrm(bbujVar2, z) { // from class: bbrc
                        private final bbuj a;
                        private final boolean b;

                        {
                            this.a = bbujVar2;
                            this.b = z;
                        }

                        @Override // defpackage.bbrm
                        public final bbqp a(Object obj, bbvh bbvhVar, dbsg dbsgVar) {
                            bbuj bbujVar3 = this.a;
                            return new bbpw((bbtj) obj, bbvhVar, dbsgVar, bbujVar3.g(), this.b);
                        }
                    });
                    final dbsg<bbuk> d = bbujVar2.d();
                    bbqf.i(bbrqVar.e.a().a(bbujVar2.a(), bbujVar2.b(), j, i), i, bbqaVar, new bbqe(bbrqVar, d) { // from class: bbrd
                        private final bbrq a;
                        private final dbsg b;

                        {
                            this.a = bbrqVar;
                            this.b = d;
                        }

                        @Override // defpackage.bbqe
                        public final void a(String str) {
                            bbrq bbrqVar2 = this.a;
                            dbsg dbsgVar = this.b;
                            if (dbsgVar.a()) {
                                bbrqVar2.f.put(str, new bbrp((bbuk) dbsgVar.b()));
                            }
                        }
                    }, new bbqd(bbrqVar, d) { // from class: bbre
                        private final bbrq a;
                        private final dbsg b;

                        {
                            this.a = bbrqVar;
                            this.b = d;
                        }

                        @Override // defpackage.bbqd
                        public final void a(cruf crufVar) {
                            bbrq bbrqVar2 = this.a;
                            dbsg dbsgVar = this.b;
                            if (dbsgVar.a()) {
                                bbrqVar2.g.execute(new Runnable(dbsgVar, crufVar) { // from class: bbra
                                    private final dbsg a;
                                    private final cruf b;

                                    {
                                        this.a = dbsgVar;
                                        this.b = crufVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        ((bbuk) this.a.b()).b(dbsg.i(this.b), dbpy.a);
                                    }
                                });
                            }
                        }
                    });
                    bbrqVar.g.execute(new Runnable(bbrqVar, bbujVar2) { // from class: bbrf
                        private final bbrq a;
                        private final bbuj b;

                        {
                            this.a = bbrqVar;
                            this.b = bbujVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bbrq bbrqVar2 = this.a;
                            dccr<bbtj> K = this.b.i().K();
                            bbrqVar2.h.a();
                            if (bbrqVar2.i.a().booleanValue()) {
                                bztp bztpVar = bbrqVar2.i;
                                List<Uri> k = dchl.k(K.v(), bbrj.a);
                                bbrqVar2.i.k();
                                deha.s(bztpVar.e(k, bzsy.b("was_uploaded"), new bzto[0]));
                            }
                        }
                    });
                    Iterator<WeakReference<ccrt>> it = bbrqVar.a.iterator();
                    while (it.hasNext()) {
                        WeakReference<ccrt> next = it.next();
                        ccrt ccrtVar = next.get();
                        if (ccrtVar == null) {
                            bbrqVar.a.remove(next);
                        } else {
                            ccrtVar.a.NU(dbpy.a);
                        }
                    }
                }
                if (!bbujVar2.j().D()) {
                    dcdc<bbpy> i2 = bbrq.i(bbujVar2.j(), h, bbqaVar, bbrg.a);
                    final dbsg<cdfp> e = bbujVar2.e();
                    bbqf.i(bbrqVar.e.a().b(bbujVar2.a(), bbujVar2.b(), j, i2), i2, bbqaVar, new bbqc(new bbqe(bbrqVar, e) { // from class: bbrh
                        private final bbrq a;
                        private final dbsg b;

                        {
                            this.a = bbrqVar;
                            this.b = e;
                        }

                        @Override // defpackage.bbqe
                        public final void a(String str) {
                            bbrq bbrqVar2 = this.a;
                            dbsg dbsgVar = this.b;
                            if (dbsgVar.a()) {
                                bbrqVar2.f.put(str, new bbrl((cdfp) dbsgVar.b()));
                            }
                        }
                    }), bbri.a);
                }
                if (bbqaVar.h) {
                    bvoo.h("Already logged!", new Object[0]);
                    return;
                }
                bbqaVar.h = true;
                int size = bbqaVar.e.b().size() + bbqaVar.f.b().size();
                ckcw ckcwVar = bbqaVar.b;
                dwyd dwydVar = bbqaVar.d;
                dwyd dwydVar2 = dwyd.UNKNOWN_ENTRY_POINT;
                int i3 = dwydVar.Z;
                if (i3 < 16) {
                    ((ckco) ckcwVar.a(ckdz.Q)).a(bbqq.a(i3, size));
                } else if (i3 < 32) {
                    ((ckco) ckcwVar.a(ckdz.am)).a(bbqq.a(i3 - 16, size));
                }
                if (!bbqaVar.e.b().isEmpty()) {
                    bbqaVar.c.l(bbqaVar.e.e());
                }
                if (!bbqaVar.f.b().isEmpty()) {
                    bbqaVar.c.l(bbqaVar.f.e());
                }
                for (int i4 = 0; i4 < bbqaVar.g; i4++) {
                    ((ckco) bbqaVar.b.a(ckdz.N)).a(bbqaVar.d.Z);
                }
            }
        });
    }

    @Override // defpackage.bbul
    @dzsi
    public final String e(String str) {
        return this.e.a().e(str).f();
    }

    @Override // defpackage.bbul
    @dzsi
    public final String f(String str) {
        return this.e.a().f(str).f();
    }

    @Override // defpackage.bbul
    public final dbsg<String> g(String str) {
        return this.e.a().g(str);
    }

    @Override // defpackage.bbul
    @Deprecated
    public final void h(String str, dwyd dwydVar, bbvh bbvhVar, List<bbtj> list, cjqm cjqmVar) {
        bbui k = bbuj.k();
        k.g(str);
        k.h(dwydVar);
        k.i(cjqmVar);
        for (bbtj bbtjVar : list) {
            k.n(bbtjVar, bbvhVar);
        }
        d(k.m());
    }

    @Override // defpackage.bbul
    public final void j(ccrt ccrtVar) {
        this.a.add(new WeakReference<>(ccrtVar));
    }

    @Override // defpackage.bbul
    public final int k(String str) {
        return this.e.a().h(str);
    }

    @Override // defpackage.bbul
    @Deprecated
    public final void l(String str, dwyd dwydVar, dcka<ilo, bbtn> dckaVar, cdfp cdfpVar, cjqm cjqmVar) {
        bbui k = bbuj.k();
        k.g(str);
        k.h(dwydVar);
        ((bbss) k).a = dbsg.i(cdfpVar);
        k.i(cjqmVar);
        for (Map.Entry<ilo, bbtn> entry : dckaVar.I()) {
            k.o(entry.getValue(), bbvh.e(entry.getKey()));
        }
        d(k.m());
    }
}
