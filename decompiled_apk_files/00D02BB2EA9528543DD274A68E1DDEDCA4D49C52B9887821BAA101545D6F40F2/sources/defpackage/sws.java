package defpackage;

import com.google.android.apps.gmm.directions.framework.details.TripDetailsContext;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: sws  reason: default package */
/* loaded from: classes7.dex */
public final class sws implements swy {
    private final dxio<akfa> c;
    private final tma d;
    private final tgi e;
    private final Executor f;
    private final TripDetailsContext.ModelGroupAndTripDetailsContext g;
    @dzsi
    private crzp<dbsg<tmd>> j;
    @dzsi
    private crzp<FetchState> k;
    private dbsg<btlu> h = dbpy.a;
    public final crzo<dbsg<tlv>> a = new crzo<>();
    public final crzo<dbsg<amve>> b = new crzo<>();
    private final crzo<swx> i = new crzo<>();

    public sws(dxio<akfa> dxioVar, tma tmaVar, Executor executor, tgi tgiVar, TripDetailsContext tripDetailsContext) {
        this.c = dxioVar;
        this.d = tmaVar;
        this.e = tgiVar;
        this.g = tripDetailsContext.c().b();
        this.f = executor;
    }

    @Override // defpackage.swy
    public final btlu a() {
        return this.h.b();
    }

    @Override // defpackage.swy
    public final crzm<dbsg<tlv>> b() {
        return this.a.a;
    }

    @Override // defpackage.swy
    public final crzm<dbsg<amve>> c() {
        return this.b.a;
    }

    @Override // defpackage.swy
    public final void d() {
        this.j = new crzp(this) { // from class: swq
            private final sws a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                sws swsVar = this.a;
                if (!crzmVar.k()) {
                    return;
                }
                dbsg<tmd> dbsgVar = (dbsg) crzmVar.l();
                dbsk.s(dbsgVar);
                swsVar.g(dbsgVar);
            }
        };
        this.k = new crzp(this) { // from class: swr
            private final sws a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                sws swsVar = this.a;
                if (!crzmVar.k()) {
                    return;
                }
                FetchState fetchState = (FetchState) crzmVar.l();
                dbsk.s(fetchState);
                if (!fetchState.a().a().equals(tgk.IN_PROGRESS)) {
                    return;
                }
                swsVar.a.a(dbpy.a);
                swsVar.b.a(dbpy.a);
            }
        };
        btlu l = this.c.a().C().l();
        if (l == null) {
            l = btlu.b;
        }
        dbsg<btlu> j = dbsg.j(l);
        this.h = j;
        tma tmaVar = this.d;
        btlu b = j.b();
        dbsk.s(b);
        crzm<dbsg<tmd>> a = tmaVar.a(b);
        if (a.k()) {
            dbsg<tmd> l2 = a.l();
            dbsk.s(l2);
            g(l2);
        }
        crzp<dbsg<tmd>> crzpVar = this.j;
        dbsk.s(crzpVar);
        a.a(crzpVar, this.f);
        crzm<FetchState> a2 = this.e.a();
        crzp<FetchState> crzpVar2 = this.k;
        dbsk.s(crzpVar2);
        a2.a(crzpVar2, this.f);
    }

    @Override // defpackage.swy
    public final void e() {
        tma tmaVar = this.d;
        btlu b = this.h.b();
        dbsk.s(b);
        crzm<dbsg<tmd>> a = tmaVar.a(b);
        crzp<dbsg<tmd>> crzpVar = this.j;
        dbsk.s(crzpVar);
        a.c(crzpVar);
        crzm<FetchState> a2 = this.e.a();
        crzp<FetchState> crzpVar2 = this.k;
        dbsk.s(crzpVar2);
        a2.c(crzpVar2);
        this.j = null;
        this.k = null;
    }

    @Override // defpackage.sxa
    public final void f(amve amveVar) {
    }

    public final void g(dbsg<tmd> dbsgVar) {
        dbsg<amve> p;
        if (!dbsgVar.a() || !this.h.a()) {
            return;
        }
        tmd b = dbsgVar.b();
        dbsk.s(b);
        dbsg<tlv> h = b.h(this.g.a());
        if (h.a()) {
            tlv b2 = h.b();
            this.a.b(h);
            if (this.g.b().a()) {
                p = dbsg.j(b2.g().get(this.g.b().b()));
            } else {
                p = b2.p();
            }
            if (p.a()) {
                this.b.b(p);
                return;
            }
        }
        this.i.b(swx.DATA_NOT_FOUND);
    }
}
