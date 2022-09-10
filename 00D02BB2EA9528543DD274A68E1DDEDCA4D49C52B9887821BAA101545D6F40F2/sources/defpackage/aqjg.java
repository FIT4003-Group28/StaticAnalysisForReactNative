package defpackage;

import android.app.Activity;
import android.util.Pair;
import com.google.android.apps.maps.R;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aqjg  reason: default package */
/* loaded from: classes2.dex */
final class aqjg {
    @dzsi
    private cusr<Pair<dcdc<cufw>, Boolean>> A;
    @dzsi
    private crzp<apsi<Set<String>>> B;
    @dzsi
    private crzp<apsi<dbsg<apsg>>> C;
    @dzsi
    private crzm<apsi<dbsg<apsg>>> D;
    @dzsi
    private crzp<apsi<dbsg<apzn>>> E;
    @dzsi
    private crzm<apsi<dbsg<apzn>>> F;
    @dzsi
    private crzp<aqcj> G;
    @dzsi
    private crzm<aqcj> H;
    @dzsi
    private dbsg<aqea> I;
    private final aqil K;
    public final dxio<aqru> a;
    public final dxio<auhi> b;
    public final dxio<aqgo> c;
    public final dxio<aqrp> d;
    public final dxio<aqci> e;
    public final dxio<apyz> f;
    public aqrk g;
    @dzsi
    public ctyy h;
    @dzsi
    public btlu i;
    @dzsi
    public crzm<apsi<Set<String>>> j;
    @dzsi
    public aqea k;
    private final Activity p;
    private final apzy q;
    private final Executor r;
    private final dxio<aprv> s;
    private final dxio<auur> t;
    private final dxio<aqrl> u;
    private final dxio<aqav> v;
    private final dxio<apyu> w;
    private final dxio<aqwq> x;
    private final dxio<aqpe> y;
    @dzsi
    private cuss<Pair<dcdc<cufw>, Boolean>> z;
    public int l = -1;
    private int J = 0;
    public dbsg<apsg> m = dbpy.a;
    public dbsg<apzn> n = dbpy.a;
    public boolean o = false;

    public aqjg(Activity activity, apzy apzyVar, Executor executor, dxio dxioVar, dxio dxioVar2, dxio dxioVar3, dxio dxioVar4, dxio dxioVar5, dxio dxioVar6, dxio dxioVar7, dxio dxioVar8, dxio dxioVar9, dxio dxioVar10, dxio dxioVar11, dxio dxioVar12, dxio dxioVar13, aqil aqilVar) {
        this.p = activity;
        this.q = apzyVar;
        this.r = executor;
        this.s = dxioVar;
        this.t = dxioVar2;
        this.a = dxioVar3;
        this.u = dxioVar4;
        this.b = dxioVar5;
        this.v = dxioVar6;
        this.w = dxioVar7;
        this.c = dxioVar8;
        this.x = dxioVar9;
        this.d = dxioVar10;
        this.y = dxioVar11;
        this.e = dxioVar12;
        this.f = dxioVar13;
        this.K = aqilVar;
    }

    public static boolean h(apzn apznVar) {
        if (!apznVar.e()) {
            return apznVar.c() == 1 || apznVar.c() == 6;
        }
        return false;
    }

    @dzsi
    private final aqea i() {
        if (this.g == null) {
            this.g = this.u.a().a(this.t.a());
        }
        if (!this.g.a()) {
            return null;
        }
        aqeb p = aqec.p();
        aqdk aqdkVar = (aqdk) p;
        aqdkVar.a = this.p.getString(R.string.MERCHANT_MESSAGING_ENABLE_NOTIFICATIONS_TITLE);
        aqdkVar.b = this.g.b();
        aqdkVar.i = cjtd.a(dtxv.bT);
        p.b(this.g.c());
        aqdkVar.c = cqrt.g(2131232419, ibm.b());
        aqdkVar.d = new Runnable(this) { // from class: aqjf
            private final aqjg a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                aqjg aqjgVar = this.a;
                aqrk aqrkVar = aqjgVar.g;
                if (aqrkVar == null) {
                    return;
                }
                aqjgVar.b.a().e(dpyv.BUSINESS_MESSAGE_FROM_CUSTOMER.dm, aufs.ENABLED);
                if (!aqrkVar.d()) {
                    aqrkVar.e();
                }
                aqjgVar.d.a().b();
            }
        };
        aqdkVar.e = cjtd.a(dtxv.bU);
        return p.a();
    }

    public final synchronized void a(ctyy ctyyVar, btlu btluVar) {
        if (ctyyVar.equals(this.h)) {
            return;
        }
        b();
        this.h = ctyyVar;
        this.i = btluVar;
        this.G = new crzp(this) { // from class: aqiu
            private final aqjg a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                crzm<apsi<Set<String>>> crzmVar2;
                aqjg aqjgVar = this.a;
                if (crzmVar.l() == null || (crzmVar2 = aqjgVar.j) == null || !crzmVar2.k()) {
                    return;
                }
                apsi<Set<String>> l = crzmVar2.l();
                dbsk.s(l);
                Set<String> a = l.a();
                if (a.size() == 1) {
                    aqjgVar.d((String) dcft.c(a));
                } else {
                    aqjgVar.f();
                }
            }
        };
        crzm<aqcj> a = this.d.a().a();
        this.H = a;
        crzp<aqcj> crzpVar = this.G;
        dbsk.s(crzpVar);
        a.a(crzpVar, this.r);
        this.B = new crzp(this) { // from class: aqix
            private final aqjg a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                aqjg aqjgVar = this.a;
                apsi apsiVar = (apsi) crzmVar.l();
                if (apsiVar != null) {
                    int b = apsiVar.b();
                    if (b == 0) {
                        throw null;
                    }
                    if (b == 1 || ((Set) apsiVar.a()).isEmpty()) {
                        return;
                    }
                    aqjgVar.o = false;
                    aqjgVar.k = null;
                    aqjgVar.g();
                    if (((Set) apsiVar.a()).size() == 1) {
                        aqjgVar.c((String) dcft.c((Iterable) apsiVar.a()), aqjgVar.h, aqjgVar.i);
                    } else {
                        aqjgVar.f();
                    }
                }
            }
        };
        crzm<apsi<Set<String>>> c = this.s.a().c(btluVar);
        this.j = c;
        crzp<apsi<Set<String>>> crzpVar2 = this.B;
        dbsk.s(crzpVar2);
        c.d(crzpVar2, this.r);
    }

    public final synchronized void b() {
        crzm<aqcj> crzmVar;
        crzm<apsi<Set<String>>> crzmVar2;
        crzp<apsi<Set<String>>> crzpVar = this.B;
        if (crzpVar != null && (crzmVar2 = this.j) != null) {
            crzmVar2.c(crzpVar);
            this.B = null;
            this.j = null;
        }
        crzp<aqcj> crzpVar2 = this.G;
        if (crzpVar2 != null && (crzmVar = this.H) != null) {
            crzmVar.c(crzpVar2);
            this.G = null;
            this.H = null;
        }
        g();
        this.o = false;
        this.h = null;
        this.i = null;
        this.I = null;
    }

    public final synchronized void c(final String str, @dzsi ctyy ctyyVar, @dzsi btlu btluVar) {
        if (ctyyVar == null || btluVar == null) {
            return;
        }
        if (this.A == null && this.z == null) {
            this.z = this.v.a().d().b(ctyyVar, 1, 0, new dbsl(this, str) { // from class: aqiy
                private final aqjg a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    aqjg aqjgVar = this.a;
                    String str2 = this.b;
                    return aqjgVar.c.a().a((cufw) obj, str2);
                }
            });
            cusr<Pair<dcdc<cufw>, Boolean>> cusrVar = new cusr(this) { // from class: aqiz
                private final aqjg a;

                {
                    this.a = this;
                }

                @Override // defpackage.cusr
                public final void a(Object obj) {
                    aqjg aqjgVar = this.a;
                    int size = ((dcdc) ((Pair) obj).first).size();
                    if (size != aqjgVar.l) {
                        aqjgVar.l = size;
                        aqjgVar.e();
                    }
                }
            };
            this.A = cusrVar;
            this.z.q(cusrVar);
        }
        if (this.E == null && this.F == null) {
            this.E = new crzp(this, str) { // from class: aqja
                private final aqjg a;
                private final String b;

                {
                    this.a = this;
                    this.b = str;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    aqjg aqjgVar = this.a;
                    String str2 = this.b;
                    apsi apsiVar = (apsi) crzmVar.l();
                    if (apsiVar != null) {
                        int b = apsiVar.b();
                        if (b == 0) {
                            throw null;
                        }
                        if (b == 1 || !((dbsg) apsiVar.a()).a()) {
                            return;
                        }
                        aqjgVar.n = (dbsg) apsiVar.a();
                        aqjgVar.d(str2);
                    }
                }
            };
            crzm<apsi<dbsg<apzn>>> b = this.w.a().b(str, btluVar);
            this.F = b;
            crzp<apsi<dbsg<apzn>>> crzpVar = this.E;
            dbsk.s(crzpVar);
            b.d(crzpVar, this.r);
        }
        if (this.C != null || this.D != null) {
            return;
        }
        this.C = new crzp(this, str) { // from class: aqjb
            private final aqjg a;
            private final String b;

            {
                this.a = this;
                this.b = str;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                aqjg aqjgVar = this.a;
                String str2 = this.b;
                apsi apsiVar = (apsi) crzmVar.l();
                if (apsiVar != null) {
                    int b2 = apsiVar.b();
                    if (b2 == 0) {
                        throw null;
                    }
                    if (b2 == 1 || !((dbsg) apsiVar.a()).a()) {
                        return;
                    }
                    aqjgVar.m = (dbsg) apsiVar.a();
                    aqjgVar.d(str2);
                }
            }
        };
        crzm<apsi<dbsg<apsg>>> e = this.s.a().e(str, btluVar);
        this.D = e;
        crzp<apsi<dbsg<apsg>>> crzpVar2 = this.C;
        dbsk.s(crzpVar2);
        e.d(crzpVar2, this.r);
    }

    public final synchronized void d(final String str) {
        String string;
        cqtd g;
        if (this.n.a() && this.m.a()) {
            if (h(this.n.b())) {
                final boolean i = this.q.i(this.i);
                if (i) {
                    string = this.p.getString(R.string.LEARN_MORE);
                } else {
                    string = this.p.getString(R.string.BANNER_ENABLE_BUSINESS_MESSAGING_ACTION);
                }
                aqeb p = aqec.p();
                ((aqdk) p).b = this.p.getString(R.string.BANNER_INACTIVE_TEXT);
                ((aqdk) p).i = aqdb.a(i ? dtxv.cd : dtxv.bQ, str).a();
                p.b(string);
                if (i) {
                    g = cqrt.g(2131232300, ibm.b());
                } else {
                    g = cqrt.g(2131232197, ibm.b());
                }
                ((aqdk) p).c = g;
                ((aqdk) p).d = new Runnable(this, i, str) { // from class: aqiv
                    private final aqjg a;
                    private final boolean b;
                    private final String c;

                    {
                        this.a = this;
                        this.b = i;
                        this.c = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aqjg aqjgVar = this.a;
                        boolean z = this.b;
                        String str2 = this.c;
                        if (z) {
                            aqjgVar.f.a().G(str2);
                        } else {
                            aqjgVar.a.a().a(str2);
                        }
                    }
                };
                ((aqdk) p).e = aqdb.a(i ? dtxv.ce : dtxv.bS, str).a();
                ((aqdk) p).f = i ? "" : this.p.getString(R.string.LEARN_MORE);
                ((aqdk) p).g = new Runnable(this) { // from class: aqiw
                    private final aqjg a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.e.a().a();
                    }
                };
                ((aqdk) p).h = aqdb.a(dtxv.bR, str).a();
                this.k = p.a();
                this.J = 0;
            } else if (!this.n.b().e()) {
                aqeb p2 = aqec.p();
                ((aqdk) p2).a = this.p.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_TITLE);
                ((aqdk) p2).b = this.p.getString(R.string.MERCHANT_MESSAGING_ENABLE_MESSAGING_BODY_TEXT);
                ((aqdk) p2).i = aqdb.a(dtxv.bQ, str).a();
                p2.b(this.p.getString(R.string.BANNER_ENABLE_BUSINESS_MESSAGING_ACTION));
                ((aqdk) p2).c = cqrt.g(2131232197, ibm.b());
                ((aqdk) p2).d = new Runnable(this, str) { // from class: aqjd
                    private final aqjg a;
                    private final String b;

                    {
                        this.a = this;
                        this.b = str;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        aqjg aqjgVar = this.a;
                        aqjgVar.a.a().a(this.b);
                    }
                };
                ((aqdk) p2).e = aqdb.a(dtxv.bS, str).a();
                ((aqdk) p2).f = this.p.getString(R.string.LEARN_MORE);
                ((aqdk) p2).g = new Runnable(this) { // from class: aqje
                    private final aqjg a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.e.a().a();
                    }
                };
                ((aqdk) p2).h = aqdb.a(dtxv.bR, str).a();
                this.k = p2.a();
                this.J = 1;
            } else {
                if (this.i != null && !this.n.b().b()) {
                    btlu btluVar = this.i;
                    dbsk.s(btluVar);
                    if (!this.x.a().d(btluVar, str)) {
                        btlu btluVar2 = this.i;
                        dbsk.s(btluVar2);
                        this.k = this.y.a().a(btluVar2, this.m.b().b(), str, new Runnable(this, str) { // from class: aqjc
                            private final aqjg a;
                            private final String b;

                            {
                                this.a = this;
                                this.b = str;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.d(this.b);
                            }
                        });
                        this.J = 0;
                    }
                }
                this.k = i();
                this.J = 1;
            }
            this.o = true;
            e();
        }
    }

    public final synchronized void e() {
        int i = this.l;
        if (i == -1 || !this.o) {
            return;
        }
        aqea aqeaVar = i >= this.J ? this.k : null;
        dbsg<aqea> dbsgVar = this.I;
        if (dbsgVar != null && dbsgVar.f() == aqeaVar) {
            return;
        }
        this.K.a(aqeaVar);
        this.I = dbsg.j(aqeaVar);
    }

    public final synchronized void f() {
        aqea i = i();
        this.o = true;
        dbsg<aqea> dbsgVar = this.I;
        if (dbsgVar == null || dbsgVar.f() != i) {
            this.K.a(i);
            this.I = dbsg.j(i);
        }
    }

    public final synchronized void g() {
        cusr<Pair<dcdc<cufw>, Boolean>> cusrVar;
        crzm<apsi<dbsg<apsg>>> crzmVar;
        crzm<apsi<dbsg<apzn>>> crzmVar2;
        this.k = null;
        this.l = -1;
        this.m = dbpy.a;
        this.n = dbpy.a;
        crzp<apsi<dbsg<apzn>>> crzpVar = this.E;
        if (crzpVar != null && (crzmVar2 = this.F) != null) {
            crzmVar2.c(crzpVar);
            this.F = null;
            this.E = null;
        }
        crzp<apsi<dbsg<apsg>>> crzpVar2 = this.C;
        if (crzpVar2 != null && (crzmVar = this.D) != null) {
            crzmVar.c(crzpVar2);
            this.D = null;
            this.C = null;
        }
        cuss<Pair<dcdc<cufw>, Boolean>> cussVar = this.z;
        if (cussVar == null || (cusrVar = this.A) == null) {
            return;
        }
        cussVar.g(cusrVar);
        this.z = null;
        this.A = null;
    }
}
