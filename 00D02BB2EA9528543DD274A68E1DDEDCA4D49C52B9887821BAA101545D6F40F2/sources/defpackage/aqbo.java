package defpackage;

import com.google.android.libraries.messaging.lighter.model.ContactId;
import java.util.Collection;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqbo  reason: default package */
/* loaded from: classes2.dex */
public final class aqbo {
    public final dxio<akfa> a;
    public final dxio<aqav> b;
    public final dxio<apyv> c;
    public final dxio<apzy> d;
    public final dxio<aqdj> e;
    public final ckcw f;
    public final bvjj g;
    private final gga j;
    private final dxio<bvkx> k;
    private final dxio<aqcz> l;
    private final dxio<aqcm> m;
    private final Executor n;
    private final ckmm o;
    public final ConcurrentHashMap<ContactId, ctyy> h = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<Integer, dehn<dbsg<ctyy>>> p = new ConcurrentHashMap<>();
    public btlu i = btlu.a;
    @dzsi
    private crzp<btlu> q = null;
    @dzsi
    private crzp<List<btlu>> r = null;
    @dzsi
    private crzp<dbsg<List<String>>> s = null;
    @dzsi
    private crzp<ContactId> t = null;

    public aqbo(gga ggaVar, dxio<akfa> dxioVar, dxio<aqav> dxioVar2, dxio<bvkx> dxioVar3, dxio<apyv> dxioVar4, dxio<apzy> dxioVar5, dxio<aqdj> dxioVar6, dxio<aqcz> dxioVar7, dxio<aqcm> dxioVar8, ckmm ckmmVar, Executor executor, ckcw ckcwVar, bvjj bvjjVar) {
        this.j = ggaVar;
        this.a = dxioVar;
        this.b = dxioVar2;
        this.k = dxioVar3;
        this.c = dxioVar4;
        this.d = dxioVar5;
        this.l = dxioVar7;
        this.m = dxioVar8;
        this.o = ckmmVar;
        this.e = dxioVar6;
        this.n = executor;
        this.f = ckcwVar;
        this.g = bvjjVar;
    }

    @dzsi
    private final ContactId n(int i) {
        return aqda.b(this.a.a().o(), i);
    }

    private final void o(@dzsi String str, int i) {
        ContactId b = aqda.b(str, i);
        dbsg<ctyy> f = b == null ? dbpy.a : f(b);
        if (f.a()) {
            aqcz a = this.l.a();
            final ctyy b2 = f.b();
            final aqav a2 = a.a.a();
            final dehn<Boolean> a3 = a2.a().a(b2, 1);
            deha.m(a3).b(new Callable(a3, b2, a2) { // from class: aqcs
                private final dehn a;
                private final ctyy b;
                private final aqav c;

                {
                    this.a = a3;
                    this.b = b2;
                    this.c = a2;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    dehn dehnVar = this.a;
                    ctyy ctyyVar = this.b;
                    aqav aqavVar = this.c;
                    if (!Boolean.TRUE.equals(deha.s(dehnVar))) {
                        aqavVar.c().p(ctyyVar);
                    }
                    return new Object();
                }
            }, a.d);
        }
    }

    public final synchronized void a() {
        if (this.q == null) {
            this.q = new crzp(this) { // from class: aqaw
                private final aqbo a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    aqbo aqboVar = this.a;
                    btlu q = btlu.q((btlu) crzmVar.l());
                    if (aqboVar.d.a().a() && aqboVar.i.l() && !q.equals(aqboVar.i)) {
                        aqboVar.m(aqboVar.i);
                    }
                    if (!q.l()) {
                        aqboVar.e.a().b(0);
                    } else if (!q.equals(aqboVar.i)) {
                        String str = q.d;
                        String str2 = q.s().name;
                        aqboVar.b(str2, 1);
                        if (aqboVar.c.a().c() && aqboVar.c.a().d() && aqboVar.g.F(bvjk.js, dcdc.e()).contains(str2)) {
                            aqboVar.b(str2, 2);
                        }
                    }
                    aqboVar.i = q;
                }
            };
            crzm<btlu> C = this.a.a().C();
            crzp<btlu> crzpVar = this.q;
            dbsk.s(crzpVar);
            C.d(crzpVar, this.n);
        }
        if (this.r == null) {
            final akfa a = this.a.a();
            this.r = new crzp(this, a) { // from class: aqax
                private final aqbo a;
                private final akfa b;

                {
                    this.a = this;
                    this.b = a;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    final aqbo aqboVar = this.a;
                    final dcep K = dcep.K(this.b.s());
                    dcpd it = K.iterator();
                    while (it.hasNext()) {
                        aqboVar.b((String) it.next(), 1);
                    }
                    deew.h(aqboVar.b.a().b().c(), new dbrn(aqboVar, K) { // from class: aqbc
                        private final aqbo a;
                        private final dcep b;

                        {
                            this.a = aqboVar;
                            this.b = K;
                        }

                        @Override // defpackage.dbrn
                        public final Object a(Object obj) {
                            aqbo aqboVar2 = this.a;
                            dcep dcepVar = this.b;
                            dcdc dcdcVar = (dcdc) obj;
                            int size = dcdcVar.size();
                            for (int i = 0; i < size; i++) {
                                ctyy ctyyVar = (ctyy) dcdcVar.get(i);
                                dbsg<String> a2 = ctyyVar.b().a();
                                if (a2.a() && !dcepVar.contains(a2.b())) {
                                    aqboVar2.c(ctyyVar);
                                }
                            }
                            return null;
                        }
                    }, dege.a);
                }
            };
            crzm<List<btlu>> D = a.D();
            crzp<List<btlu>> crzpVar2 = this.r;
            dbsk.s(crzpVar2);
            D.d(crzpVar2, this.n);
        }
        if (this.c.a().c() && this.s == null) {
            this.s = new crzp(this) { // from class: aqay
                private final aqbo a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    aqbo aqboVar = this.a;
                    dbsg dbsgVar = (dbsg) crzmVar.l();
                    if (dbsgVar == null || !dbsgVar.a() || !aqboVar.c.a().d()) {
                        return;
                    }
                    dcpd it = ((dcne) dcnm.o(dcep.K((Collection) dbsgVar.b()), dcep.K(aqboVar.a.a().s()))).iterator();
                    while (it.hasNext()) {
                        aqboVar.b((String) it.next(), 2);
                    }
                }
            };
            crzm<dbsg<List<String>>> G = this.g.G(bvjk.js);
            crzp<dbsg<List<String>>> crzpVar3 = this.s;
            dbsk.s(crzpVar3);
            G.d(crzpVar3, this.n);
        }
        if (this.t == null) {
            this.t = new aqbj(this);
            crzm<ContactId> a2 = this.m.a().a();
            crzp<ContactId> crzpVar4 = this.t;
            dbsk.s(crzpVar4);
            a2.a(crzpVar4, this.n);
        }
    }

    public final void b(String str, int i) {
        this.o.e(cwsv.a("MessagingLighterRegistrationStartEvent"));
        String o = this.a.a().o();
        if (str.isEmpty() || dbsj.d(o)) {
            return;
        }
        this.k.a().k(new aqbi(this.j, this, i, str, o), dege.a, bvkw.ON_STARTUP_FULLY_COMPLETE);
    }

    public final dehn<csut> c(final ctyy ctyyVar) {
        ContactId e = ctyyVar.b().e();
        if (this.h.containsKey(e)) {
            this.h.remove(e);
        }
        csuu b = this.b.a().b();
        ctmm c = ctmn.c();
        ((ctmh) c).a = "unregister";
        c.b(ctmr.c);
        final ctmn a = c.a();
        final ctdr ctdrVar = (ctdr) b;
        for (ctuk ctukVar : ctdrVar.n.values()) {
            ctukVar.f(ctyyVar);
        }
        return deew.h(ctdrVar.o.c(new Callable(ctdrVar, ctyyVar) { // from class: ctdc
            private final ctdr a;
            private final ctyy b;

            {
                this.a = ctdrVar;
                this.b = ctyyVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                ctdr ctdrVar2 = this.a;
                ctyy ctyyVar2 = this.b;
                synchronized (ctdrVar2.i) {
                    ctdrVar2.l.put(Long.valueOf(ctyyVar2.a()), ctdrVar2.b.c(ctyyVar2));
                }
                if (ctdrVar2.b.g(ctyyVar2)) {
                    ctct ctctVar = (ctct) ctdrVar2.h;
                    ctctVar.d.a(new Runnable(ctctVar, ctyyVar2) { // from class: ctbe
                        private final ctct a;
                        private final ctyy b;

                        {
                            this.a = ctctVar;
                            this.b = ctyyVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.H(this.b).T();
                        }
                    });
                    for (csuv csuvVar : ctdrVar2.f) {
                        dcdc<ContactId> f = ctyyVar2.b().f();
                        int size = f.size();
                        for (int i = 0; i < size; i++) {
                            f.get(i);
                            csuvVar.e();
                        }
                    }
                    return true;
                }
                return false;
            }
        }), new dbrn(ctdrVar, ctyyVar, a) { // from class: ctdd
            private final ctdr a;
            private final ctyy b;
            private final ctmn c;

            {
                this.a = ctdrVar;
                this.b = ctyyVar;
                this.c = a;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                final ctdr ctdrVar2 = this.a;
                final ctyy ctyyVar2 = this.b;
                ctmn ctmnVar = this.c;
                if (Boolean.TRUE.equals((Boolean) obj)) {
                    ctud ctudVar = ctdrVar2.p;
                    ctudVar.b.a(UUID.randomUUID(), new ctxj(ctyyVar2), ctudVar.b.d.a(), ctyyVar2, ctmnVar, false).Pk(new Runnable(ctdrVar2, ctyyVar2) { // from class: ctdl
                        private final ctdr a;
                        private final ctyy b;

                        {
                            this.a = ctdrVar2;
                            this.b = ctyyVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            ctdr ctdrVar3 = this.a;
                            ctyy ctyyVar3 = this.b;
                            synchronized (ctdrVar3.i) {
                                ctdrVar3.l.remove(Long.valueOf(ctyyVar3.a()));
                            }
                        }
                    }, dege.a);
                    csus b2 = csut.b();
                    ((cstz) b2).a = 1;
                    return b2.a();
                }
                csus b3 = csut.b();
                ((cstz) b3).a = 2;
                return b3.a();
            }
        }, dege.a);
    }

    public final synchronized void d() {
        akfa a = this.a.a();
        if (this.q != null) {
            crzm<btlu> C = a.C();
            crzp<btlu> crzpVar = this.q;
            dbsk.s(crzpVar);
            C.c(crzpVar);
            this.q = null;
        }
        if (this.r != null) {
            crzm<List<btlu>> D = a.D();
            crzp<List<btlu>> crzpVar2 = this.r;
            dbsk.s(crzpVar2);
            D.c(crzpVar2);
            this.r = null;
        }
        if (this.s != null) {
            crzm<dbsg<List<String>>> G = this.g.G(bvjk.js);
            crzp<dbsg<List<String>>> crzpVar3 = this.s;
            dbsk.s(crzpVar3);
            G.c(crzpVar3);
            this.s = null;
        }
        if (this.t != null) {
            crzm<ContactId> a2 = this.m.a().a();
            crzp<ContactId> crzpVar4 = this.t;
            dbsk.s(crzpVar4);
            a2.c(crzpVar4);
            this.t = null;
        }
    }

    public final dbsg<ctyy> e(int i) {
        ContactId n = n(i);
        return n == null ? dbpy.a : f(n);
    }

    final dbsg<ctyy> f(ContactId contactId) {
        return dbsg.j(this.h.get(contactId));
    }

    public final synchronized dehn<dbsg<ctyy>> g(int i) {
        if (i == 2) {
            if (!this.c.a().d()) {
                return deha.c();
            }
            i = 2;
        }
        ContactId n = n(i);
        if (n == null) {
            return deha.a(dbpy.a);
        }
        if (this.i.equals(this.a.a().j())) {
            dehn<dbsg<ctyy>> dehnVar = this.p.get(Integer.valueOf(i));
            if (dehnVar != null) {
                return dehnVar;
            }
        } else {
            for (dehn<dbsg<ctyy>> dehnVar2 : this.p.values()) {
                dehnVar2.cancel(true);
            }
            this.p.clear();
        }
        this.i = this.a.a().j();
        dehn<dbsg<ctyy>> j = j(n);
        this.p.put(Integer.valueOf(i), j);
        j.Pk(new aqbe(this, i), dege.a);
        return j;
    }

    public final synchronized void h(int i) {
        this.p.remove(Integer.valueOf(i));
        if (this.d.a().a()) {
            if (i == 2) {
                if (this.c.a().a()) {
                    i = 2;
                }
            }
            dbsg<ctyy> e = e(i);
            if (e.a()) {
                ctyy b = e.b();
                dbsk.l(aqda.a(b, this.a.a().j()));
                if (!aqda.c(b)) {
                    this.l.a().a(b);
                } else if (this.c.a().a()) {
                    if (this.d.a().h()) {
                        this.b.a().c().n(b);
                    } else {
                        this.l.a().b(b);
                    }
                }
                if (!this.c.a().a() || this.p.isEmpty()) {
                    this.e.a().a(e.b());
                }
            }
        }
        this.o.e(cwsv.a("MessagingLighterRegistrationSuccessEvent"));
    }

    public final synchronized dehn<dbsg<ctyy>> i(String str, int i) {
        ContactId b;
        b = aqda.b(str, i);
        return b == null ? deha.a(dbpy.a) : j(b);
    }

    public final synchronized dehn<dbsg<ctyy>> j(final ContactId contactId) {
        if (aqda.e(contactId) == 2 && !this.c.a().d()) {
            return deha.c();
        }
        dbsg<ctyy> f = f(contactId);
        if (f.a()) {
            return deha.a(f);
        }
        return deew.g(deee.g(degp.q(this.b.a().b().b(contactId)), Throwable.class, new dbrn(contactId) { // from class: aqaz
            private final ContactId a;

            {
                this.a = contactId;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                Throwable th = (Throwable) obj;
                return dbpy.a;
            }
        }, dege.a), new aqbh(this.f, contactId, this, this.b), dege.a);
    }

    public final synchronized dehn<dbsg<ctyy>> k(final ContactId contactId) {
        aqav a;
        a = this.b.a();
        dbsk.s(a);
        return deew.h(deee.g(degp.q(a.b().b(contactId)), Throwable.class, aqba.a, dege.a), new dbrn(this, contactId) { // from class: aqbb
            private final aqbo a;
            private final ContactId b;

            {
                this.a = this;
                this.b = contactId;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dbsg<ctyy> dbsgVar = (dbsg) obj;
                this.a.l(this.b, dbsgVar);
                return dbsgVar;
            }
        }, dege.a);
    }

    public final void l(ContactId contactId, dbsg<ctyy> dbsgVar) {
        if (dbsgVar.a()) {
            this.h.put(contactId, dbsgVar.b());
        }
    }

    public final void m(btlu btluVar) {
        String t = btluVar.t();
        o(t, 1);
        if (!this.c.a().a() || this.d.a().h()) {
            return;
        }
        o(t, 2);
    }
}
