package defpackage;

import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: swv  reason: default package */
/* loaded from: classes7.dex */
public final class swv implements swy {
    private final dxio<akfa> b;
    private final tma c;
    private final tmb d;
    private final wuw e;
    private final Executor f;
    private TripDetailsContext.TaxiTripDetailsContext g;
    @dzsi
    private crzp<dbsg<tmd>> l;
    private dbsg<btlu> h = dbpy.a;
    private final crzo<dbsg<tlv>> i = new crzo<>();
    private final crzo<dbsg<amve>> j = new crzo<>();
    private final crzo<swx> k = new crzo<>();
    public dbsg<tmd> a = dbpy.a;

    public swv(dxio<akfa> dxioVar, tma tmaVar, Executor executor, tmb tmbVar, wuw wuwVar, TripDetailsContext tripDetailsContext) {
        this.b = dxioVar;
        this.c = tmaVar;
        this.g = tripDetailsContext.d().b();
        this.f = executor;
        this.d = tmbVar;
        this.e = wuwVar;
    }

    @Override // defpackage.swy
    public final btlu a() {
        return this.h.b();
    }

    @Override // defpackage.swy
    public final crzm<dbsg<tlv>> b() {
        return this.i.a;
    }

    @Override // defpackage.swy
    public final crzm<dbsg<amve>> c() {
        return this.j.a;
    }

    @Override // defpackage.swy
    public final void d() {
        this.l = new crzp(this) { // from class: swu
            private final swv a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                swv swvVar = this.a;
                if (!crzmVar.k()) {
                    return;
                }
                dbsg<tmd> dbsgVar = (dbsg) crzmVar.l();
                dbsk.s(dbsgVar);
                swvVar.a = dbsgVar;
                swvVar.g();
            }
        };
        btlu l = this.b.a().C().l();
        if (l == null) {
            l = btlu.b;
        }
        dbsg<btlu> j = dbsg.j(l);
        this.h = j;
        tma tmaVar = this.c;
        btlu b = j.b();
        dbsk.s(b);
        crzm<dbsg<tmd>> a = tmaVar.a(b);
        if (a.k()) {
            dbsg<tmd> l2 = a.l();
            dbsk.s(l2);
            this.a = l2;
            g();
        }
        crzp<dbsg<tmd>> crzpVar = this.l;
        dbsk.s(crzpVar);
        a.a(crzpVar, this.f);
    }

    @Override // defpackage.swy
    public final void e() {
        tma tmaVar = this.c;
        btlu b = this.h.b();
        dbsk.s(b);
        crzm<dbsg<tmd>> a = tmaVar.a(b);
        crzp<dbsg<tmd>> crzpVar = this.l;
        dbsk.s(crzpVar);
        a.c(crzpVar);
    }

    @Override // defpackage.sxa
    public final void f(amve amveVar) {
        if (b().k()) {
            dbsg<tlv> l = b().l();
            dbsk.s(l);
            if (!l.a()) {
                return;
            }
            dbsg<tlv> l2 = b().l();
            dbsk.s(l2);
            dbsg<Integer> w = l2.b().w(amveVar);
            if (!w.a()) {
                return;
            }
            dbsg j = dbsg.j(this.e.a(amveVar, w.b().intValue()));
            if (!j.a()) {
                return;
            }
            this.d.f(this.h.b(), this.g.a(), ((wuv) j.b()).b().c(), w.b().intValue());
            this.g = TripDetailsContext.TaxiTripDetailsContext.c(this.g.a(), w.b().intValue());
            g();
        }
    }

    public final void g() {
        if (!this.a.a() || !this.h.a()) {
            return;
        }
        tmd b = this.a.b();
        dbsk.s(b);
        dbsg<tlv> h = b.h(this.g.a());
        if (h.a()) {
            this.i.b(h);
            dbsg<amve> j = dbsg.j(h.b().g().get(this.g.b()));
            if (j.a()) {
                this.j.b(j);
            }
        }
        this.k.b(swx.DATA_NOT_FOUND);
    }
}
