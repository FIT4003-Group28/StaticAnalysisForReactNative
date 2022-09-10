package defpackage;

import com.google.android.libraries.social.populous.core.AutocompletionCallbackMetadata;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import com.google.android.libraries.social.populous.core.ClientVersion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: czgk  reason: default package */
/* loaded from: classes5.dex */
public final class czgk implements cyuc {
    public final cyqp a;
    public final dehp b;
    public final ClientConfigInternal c;
    public final cyhd d;
    public final cych e;
    public final ClientVersion f;
    public final czdb g;
    public final cyph h;
    public final czgl i;
    public final cycl<dbsg<cyqe>> j;
    public final czfl l;
    private transient dehn<Void> n;
    private final transient Object m = new Object();
    public final transient AtomicReference<dbsg<cyqe>> k = new AtomicReference<>(dbpy.a);

    public czgk(cyqp cyqpVar, dehp dehpVar, ClientConfigInternal clientConfigInternal, cyhd cyhdVar, cych cychVar, ClientVersion clientVersion, czdb czdbVar, cyph cyphVar, czgl czglVar, cycl cyclVar, czfl czflVar) {
        this.a = cyqpVar;
        this.b = dehpVar;
        this.c = clientConfigInternal;
        this.d = cyhdVar;
        this.e = cychVar;
        this.f = clientVersion;
        this.g = czdbVar;
        this.h = cyphVar;
        this.i = czglVar;
        this.j = cyclVar;
        this.l = czflVar;
        e();
    }

    public static cyor g(dbsg<cytq> dbsgVar) {
        return (cyor) dbsgVar.h(czfv.a).c(cyor.a);
    }

    @Override // defpackage.cyuc
    public final dehn<cyts> a(final cytq cytqVar) {
        if (!dyaz.b() || this.e.c == cycg.SUCCESS_LOGGED_IN) {
            dbtp b = this.h.b();
            dehn<cyts> g = deew.g(deha.o(deew.g(e(), new defg(this, cytqVar) { // from class: czfp
                private final czgk a;
                private final cytq b;

                {
                    this.a = this;
                    this.b = cytqVar;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    return this.a.f(dbsg.i(this.b), (dbsg) obj);
                }
            }, this.b)), new defg(this, cytqVar) { // from class: czfw
                private final czgk a;
                private final cytq b;

                {
                    this.a = this;
                    this.b = cytqVar;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    int i;
                    int i2;
                    dcdc<cyqg> c;
                    dudy dudyVar;
                    czgk czgkVar = this.a;
                    cytq cytqVar2 = this.b;
                    cyds cydsVar = (cyds) obj;
                    dbtp b2 = czgkVar.h.b();
                    cyqf a = czgkVar.a.a();
                    dcen N = dcep.N();
                    dcpd<cydt> it = cytqVar2.f.l.iterator();
                    while (true) {
                        i = 4;
                        i2 = 3;
                        if (!it.hasNext()) {
                            break;
                        }
                        cydt cydtVar = cydt.EMAIL;
                        int ordinal = it.next().ordinal();
                        if (ordinal == 0) {
                            N.b(cysj.EMAIL.name());
                        } else if (ordinal == 1) {
                            N.b(cysj.PHONE.name());
                        } else if (ordinal == 3) {
                            N.b(cysj.GROUP.name());
                        } else if (ordinal == 4) {
                            N.b(cysj.IN_APP_NOTIFICATION_TARGET.name());
                            N.b(cysj.IN_APP_EMAIL.name());
                            N.b(cysj.IN_APP_PHONE.name());
                            N.b(cysj.IN_APP_GAIA.name());
                        }
                    }
                    dcep f = N.f();
                    int i3 = cytqVar2.f.f;
                    int size = cytqVar2.d.a().size();
                    if (cytqVar2.b.isEmpty()) {
                        if (dyaq.d()) {
                            i3 = (i3 + size) * decl.b(dyaz.a.a().g());
                        }
                        if (cytqVar2.h.a() == cygp.FIELD_FLATTENED) {
                            c = a.b(f, i3);
                        } else {
                            c = a.a(f, i3);
                        }
                    } else {
                        dcdc<String> r = dcdc.r(dchl.k(czdb.d(cytqVar2.b, false), czgc.a));
                        if (dyaq.d()) {
                            i3 = (i3 + size) * decl.b(dyaz.a.a().h());
                        }
                        if (cytqVar2.h.a() == cygp.FIELD_FLATTENED) {
                            c = a.d(r, f, i3);
                        } else {
                            c = a.c(r, f, i3);
                        }
                    }
                    cypg.a(czgkVar.h, 24, b2, cytqVar2.k);
                    dbtp b3 = czgkVar.h.b();
                    dccx F = dcdc.F();
                    try {
                        for (cyqg cyqgVar : c) {
                            dspd dspdVar = cyqgVar.c;
                            dsqa c2 = dsqa.c();
                            dsgk dsgkVar = dsgk.c;
                            try {
                                dspj s = dspdVar.s();
                                dsqw dsqwVar = (dsqw) dsgkVar.cu(i);
                                try {
                                    try {
                                        dstc b4 = dsst.a.b(dsqwVar);
                                        b4.f(dsqwVar, dspk.n(s), c2);
                                        b4.j(dsqwVar);
                                        try {
                                            s.b(0);
                                            dsqw.cv(dsqwVar);
                                            cywm cywmVar = new cywm((dsgk) dsqwVar);
                                            cywmVar.e(cygl.PAPI_TOPN);
                                            F.g(cywmVar);
                                            i = 4;
                                        } catch (dsrm e) {
                                            throw e;
                                        }
                                    } catch (RuntimeException e2) {
                                        if (e2.getCause() instanceof dsrm) {
                                            throw ((dsrm) e2.getCause());
                                        }
                                        throw e2;
                                    }
                                } catch (IOException e3) {
                                    if (!(e3.getCause() instanceof dsrm)) {
                                        throw new dsrm(e3.getMessage());
                                    }
                                    throw ((dsrm) e3.getCause());
                                }
                            } catch (dsrm e4) {
                                throw e4;
                            }
                        }
                        cypg.a(czgkVar.h, 31, b3, cytqVar2.k);
                        dbsg<cyqe> i4 = czgkVar.i();
                        Long l = (Long) i4.h(czgd.a).f();
                        Integer num = null;
                        if (i4.a() && (dudyVar = i4.b().d) != null) {
                            num = Integer.valueOf(dudyVar.b);
                        }
                        cytr c3 = cyts.c();
                        c3.b(F.f());
                        c3.e = cyes.SUCCESS;
                        c3.f = cyer.PEOPLE_API_TOP_N;
                        cydr e5 = AutocompletionCallbackMetadata.e();
                        e5.b(cydsVar);
                        if (true != czgkVar.h(i4)) {
                            i2 = 1;
                        }
                        ((cybv) e5).a = i2;
                        c3.d = e5.a();
                        c3.c = l;
                        c3.a = num;
                        return deha.a(c3.a());
                    } catch (dsrm e6) {
                        return deha.b(e6);
                    }
                }
            }, this.b);
            if (dyaz.f()) {
                deha.q(g, new czgj(this, b, cytqVar, g), dege.a);
            }
            return g;
        }
        cytr c = cyts.c();
        c.f = cyer.PEOPLE_API_TOP_N;
        c.e = cyes.SKIPPED;
        c.b(dcdc.e());
        return deha.a(c.a());
    }

    @Override // defpackage.cyuc
    public final cyer b() {
        return cyer.PEOPLE_API_TOP_N;
    }

    @Override // defpackage.cyuc
    public final dehn<Void> c() {
        if (!dyaz.b() || this.e.c == cycg.SUCCESS_LOGGED_IN) {
            return deew.h(deha.o(deew.g(e(), new defg(this) { // from class: czfx
                private final czgk a;

                {
                    this.a = this;
                }

                @Override // defpackage.defg
                public final dehn a(Object obj) {
                    return this.a.f(dbpy.a, (dbsg) obj);
                }
            }, this.b)), czfy.a, dege.a);
        }
        return dehk.a;
    }

    @Override // defpackage.cyuc
    public final void d(cydz cydzVar) {
    }

    public final dehn<dbsg<cyqe>> e() {
        if (dyaz.e()) {
            return this.j.b();
        }
        dbsg<cyqe> dbsgVar = this.k.get();
        if (dbsgVar.a()) {
            return deha.a(dbsgVar);
        }
        return this.b.c(new Callable(this) { // from class: czfz
            private final czgk a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                czgk czgkVar = this.a;
                czgkVar.k.set(czgkVar.a.g().a());
                return czgkVar.k.get();
            }
        });
    }

    public final dehn<cyds> f(final dbsg<cytq> dbsgVar, dbsg<cyqe> dbsgVar2) {
        boolean h = h(dbsgVar2);
        long b = this.d.e().b();
        boolean z = true;
        if (dbsgVar2.a() && b - dbsgVar2.b().b <= this.c.o) {
            z = false;
        }
        synchronized (this.m) {
            if (h || z) {
                dehn<Void> dehnVar = this.n;
                if (dehnVar == null || dehnVar.isDone()) {
                    this.n = deha.f(new deff(this, dbsgVar) { // from class: czga
                        private final czgk a;
                        private final dbsg b;

                        {
                            this.a = this;
                            this.b = dbsgVar;
                        }

                        @Override // defpackage.deff
                        public final dehn a() {
                            czgk czgkVar = this.a;
                            dbsg dbsgVar3 = this.b;
                            ClientConfigInternal clientConfigInternal = (ClientConfigInternal) dbsgVar3.h(czge.a).c(czgkVar.c);
                            dbtp b2 = czgkVar.h.b();
                            cylx b3 = czgkVar.d.b();
                            dsge bZ = dsgf.e.bZ();
                            dued duedVar = clientConfigInternal.h;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dsgf dsgfVar = (dsgf) bZ.b;
                            dsgfVar.b = duedVar.cg;
                            dsgfVar.a |= 1;
                            dsgl bZ2 = dsgm.c.bZ();
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dsgm dsgmVar = (dsgm) bZ2.b;
                            dsgmVar.b = 2;
                            dsgmVar.a |= 1;
                            dsgm bK = bZ2.bK();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dsgf dsgfVar2 = (dsgf) bZ.b;
                            bK.getClass();
                            dsgfVar2.d = bK;
                            dsgfVar2.a |= 4;
                            cylt e = cylu.e();
                            e.b(czgkVar.e);
                            e.c(czgkVar.d.a());
                            e.d(clientConfigInternal);
                            ((cyim) e).a = czgkVar.f;
                            dehn<cyli> i = b3.i(bZ.bK(), e.a());
                            deha.q(i, new czgg(czgkVar, czgk.g(dbsgVar3), b2), dege.a);
                            dehn h2 = deew.h(i, new dbrn(czgkVar, dbsgVar3) { // from class: czfq
                                private final czgk a;
                                private final dbsg b;

                                {
                                    this.a = czgkVar;
                                    this.b = dbsgVar3;
                                }

                                @Override // defpackage.dbrn
                                public final Object a(Object obj) {
                                    dshf dshfVar;
                                    dsia dsiaVar;
                                    final czgk czgkVar2 = this.a;
                                    dbsg dbsgVar4 = this.b;
                                    final cyli cyliVar = (cyli) obj;
                                    dbtp b4 = czgkVar2.h.b();
                                    final ArrayList arrayList = new ArrayList();
                                    dsgh dsghVar = cyliVar.a;
                                    if (dsghVar == null) {
                                        dsghVar = dsgh.c;
                                    }
                                    for (dsgk dsgkVar : dsghVar.a) {
                                        cydt cydtVar = cydt.EMAIL;
                                        int a = dsgj.a(dsgkVar.a);
                                        int i2 = a - 1;
                                        if (a == 0) {
                                            throw null;
                                        }
                                        if (i2 == 0) {
                                            if (dsgkVar.a == 1) {
                                                dsiaVar = (dsia) dsgkVar.b;
                                            } else {
                                                dsiaVar = dsia.e;
                                            }
                                            dsgd dsgdVar = dsiaVar.b;
                                            if (dsgdVar == null) {
                                                dsgdVar = dsgd.d;
                                            }
                                            cyqg cyqgVar = new cyqg(0L, dsgdVar.c, dsgkVar.bR());
                                            czgkVar2.i.b(cyqgVar, dsgkVar);
                                            arrayList.add(cyqgVar);
                                        } else if (i2 == 1) {
                                            if (dsgkVar.a == 2) {
                                                dshfVar = (dshf) dsgkVar.b;
                                            } else {
                                                dshfVar = dshf.e;
                                            }
                                            dsgv dsgvVar = dshfVar.a;
                                            if (dsgvVar == null) {
                                                dsgvVar = dsgv.f;
                                            }
                                            dsgd dsgdVar2 = dsgvVar.d;
                                            if (dsgdVar2 == null) {
                                                dsgdVar2 = dsgd.d;
                                            }
                                            cyqg cyqgVar2 = new cyqg(0L, dsgdVar2.c, dsgkVar.bR());
                                            czgkVar2.i.b(cyqgVar2, dsgkVar);
                                            arrayList.add(cyqgVar2);
                                        }
                                    }
                                    czgkVar2.a.m(new Runnable(czgkVar2, arrayList, cyliVar) { // from class: czft
                                        private final czgk a;
                                        private final List b;
                                        private final cyli c;

                                        {
                                            this.a = czgkVar2;
                                            this.b = arrayList;
                                            this.c = cyliVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            long j;
                                            czgk czgkVar3 = this.a;
                                            List<cyqg> list = this.b;
                                            cyli cyliVar2 = this.c;
                                            czgkVar3.a.f().b();
                                            czgkVar3.a.a().f();
                                            List<Long> e2 = czgkVar3.a.a().e(list);
                                            cyqp cyqpVar = czgkVar3.a;
                                            ArrayList arrayList2 = new ArrayList();
                                            for (int i3 = 0; i3 < list.size(); i3++) {
                                                cyqg cyqgVar3 = list.get(i3);
                                                if (e2 != null) {
                                                    j = e2.get(i3).longValue();
                                                } else {
                                                    j = cyqgVar3.a;
                                                }
                                                List<cysn> list2 = cyqgVar3.d;
                                                for (cysn cysnVar : list2) {
                                                    cysnVar.a = j;
                                                }
                                                arrayList2.addAll(list2);
                                            }
                                            cyqpVar.f().a(arrayList2);
                                            long b5 = czgkVar3.d.e().b();
                                            long size = list.size();
                                            dsgh dsghVar2 = cyliVar2.a;
                                            if (dsghVar2 == null) {
                                                dsghVar2 = dsgh.c;
                                            }
                                            dudy dudyVar = dsghVar2.b;
                                            if (dudyVar == null) {
                                                dudyVar = dudy.d;
                                            }
                                            cyqe cyqeVar = new cyqe(1L, b5, size, dudyVar);
                                            czgkVar3.a.g().b(cyqeVar);
                                            if (dyaz.e()) {
                                                czgkVar3.j.d(dbsg.i(cyqeVar));
                                            } else {
                                                czgkVar3.k.set(dbsg.i(cyqeVar));
                                            }
                                        }
                                    });
                                    cypg.a(czgkVar2.h, 16, b4, czgk.g(dbsgVar4));
                                    return null;
                                }
                            }, czgkVar.b);
                            return deha.m(h2, deew.g(i, new defg(czgkVar, dbsgVar3) { // from class: czfr
                                private final czgk a;
                                private final dbsg b;

                                {
                                    this.a = czgkVar;
                                    this.b = dbsgVar3;
                                }

                                @Override // defpackage.defg
                                public final dehn a(Object obj) {
                                    czgk czgkVar2 = this.a;
                                    dbsg dbsgVar4 = this.b;
                                    cyli cyliVar = (cyli) obj;
                                    if (!czgkVar2.c.O) {
                                        return dehk.a;
                                    }
                                    czfl czflVar = czgkVar2.l;
                                    dsgh dsghVar = cyliVar.a;
                                    if (dsghVar == null) {
                                        dsghVar = dsgh.c;
                                    }
                                    dehn<Void> e2 = deha.e(new Runnable(czflVar, dsghVar) { // from class: czfk
                                        private final czfl a;
                                        private final dsgh b;

                                        {
                                            this.a = czflVar;
                                            this.b = dsghVar;
                                        }

                                        @Override // java.lang.Runnable
                                        public final void run() {
                                            dshi dshiVar;
                                            czfl czflVar2 = this.a;
                                            dsgh dsghVar2 = this.b;
                                            dccx F = dcdc.F();
                                            for (dsgk dsgkVar : dsghVar2.a) {
                                                boolean z2 = true;
                                                if (dsgkVar.a == 1) {
                                                    dsia dsiaVar = (dsia) dsgkVar.b;
                                                    for (dsgt dsgtVar : dsiaVar.c) {
                                                        if (dsgtVar.b == 4) {
                                                            dbsk.a(z2);
                                                            if (dsgtVar.b == 4) {
                                                                dshiVar = (dshi) dsgtVar.c;
                                                            } else {
                                                                dshiVar = dshi.e;
                                                            }
                                                            long b4 = czflVar2.a.b();
                                                            dsgi bZ3 = dsgk.c.bZ();
                                                            dshz ca = dsia.e.ca(dsiaVar);
                                                            if (ca.c) {
                                                                ca.bF();
                                                                ca.c = false;
                                                            }
                                                            ((dsia) ca.b).c = dsia.ck();
                                                            ca.b(dsgtVar);
                                                            if (bZ3.c) {
                                                                bZ3.bF();
                                                                bZ3.c = false;
                                                            }
                                                            dsgk dsgkVar2 = (dsgk) bZ3.b;
                                                            dsia bK2 = ca.bK();
                                                            bK2.getClass();
                                                            dsgkVar2.b = bK2;
                                                            int i2 = z2 ? 1 : 0;
                                                            int i3 = z2 ? 1 : 0;
                                                            int i4 = z2 ? 1 : 0;
                                                            int i5 = z2 ? 1 : 0;
                                                            dsgkVar2.a = i2;
                                                            dspd bR = bZ3.bK().bR();
                                                            int a = dshh.a(dshiVar.b);
                                                            int i6 = a - 1;
                                                            if (a != 0) {
                                                                if (i6 == 0) {
                                                                    F.g(new cysi(cygf.IN_APP_EMAIL.name(), dshiVar.b == 2 ? (String) dshiVar.c : "", b4, bR));
                                                                    F.g(new cysi(cygf.IN_APP_TARGET.name(), dshiVar.b == 2 ? (String) dshiVar.c : "", b4, bR));
                                                                } else if (i6 == z2) {
                                                                    F.g(new cysi(cygf.IN_APP_PHONE.name(), dshiVar.b == 3 ? (String) dshiVar.c : "", b4, bR));
                                                                    F.g(new cysi(cygf.IN_APP_TARGET.name(), dshiVar.b == 3 ? (String) dshiVar.c : "", b4, bR));
                                                                } else if (i6 == 2) {
                                                                    int i7 = dshiVar.a;
                                                                    int i8 = z2 ? 1 : 0;
                                                                    char c = z2 ? 1 : 0;
                                                                    char c2 = z2 ? 1 : 0;
                                                                    char c3 = z2 ? 1 : 0;
                                                                    if ((i7 & i8) != 0) {
                                                                        F.g(new cysi(cygf.IN_APP_GAIA.name(), dshiVar.d, b4, bR));
                                                                    }
                                                                }
                                                                if ((dshiVar.a & 1) != 0) {
                                                                    F.g(new cysi(cygf.IN_APP_TARGET.name(), dshiVar.d, b4, bR));
                                                                }
                                                                z2 = true;
                                                            } else {
                                                                throw null;
                                                            }
                                                        }
                                                    }
                                                    continue;
                                                }
                                            }
                                            dcdc f = F.f();
                                            if (!f.isEmpty()) {
                                                czflVar2.b.h().d(f);
                                            }
                                        }
                                    }, czflVar.c);
                                    deha.q(e2, new czgh(czgkVar2, dbsgVar4), dege.a);
                                    return e2;
                                }
                            }, czgkVar.b), deew.g(h2, new defg(czgkVar, dbsgVar3) { // from class: czfs
                                private final czgk a;
                                private final dbsg b;

                                {
                                    this.a = czgkVar;
                                    this.b = dbsgVar3;
                                }

                                @Override // defpackage.defg
                                public final dehn a(Object obj) {
                                    final czgk czgkVar2 = this.a;
                                    dbsg dbsgVar4 = this.b;
                                    Void r4 = (Void) obj;
                                    dehn d = deha.d(new Callable(czgkVar2) { // from class: czfu
                                        private final czgk a;

                                        {
                                            this.a = czgkVar2;
                                        }

                                        @Override // java.util.concurrent.Callable
                                        public final Object call() {
                                            return Long.valueOf(this.a.a.i().a());
                                        }
                                    }, czgkVar2.b);
                                    deha.q(d, new czgi(czgkVar2, dbsgVar4), dege.a);
                                    return d;
                                }
                            }, czgkVar.b)).b(defi.a(), dege.a);
                        }
                    }, this.b);
                }
            }
        }
        cyor g = g(dbsgVar);
        if (h) {
            this.h.c(2, g);
            if (dbsgVar.a()) {
                deha.q(this.n, new czgf(this, this.h.b(), g), dege.a);
            }
            return deew.h(this.n, czgb.a, dege.a);
        }
        this.h.c(3, g);
        return deha.a(cyds.DID_NOT_WAIT_FOR_RESULTS);
    }

    public final boolean h(dbsg<cyqe> dbsgVar) {
        return !dbsgVar.a() || this.d.e().b() - dbsgVar.b().b > this.c.p;
    }

    public final dbsg<cyqe> i() {
        if (dyaz.e()) {
            dbsg<dbsg<cyqe>> c = this.j.c();
            return c.a() ? c.b() : dbpy.a;
        }
        return this.k.get();
    }
}
