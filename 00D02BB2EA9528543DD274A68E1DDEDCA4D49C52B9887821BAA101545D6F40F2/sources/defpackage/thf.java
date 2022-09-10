package defpackage;

import android.os.Bundle;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: thf  reason: default package */
/* loaded from: classes7.dex */
public final class thf implements tgi {
    public dbsg<btlu> a = dbpy.a;
    private final dxio<akfa> b;
    private final dxio<tgn> c;
    private final tgx d;
    private final tgw e;
    private final thg f;
    private final thd g;
    private final Executor h;
    @dzsi
    private crzp<btlu> i;

    public thf(dxio<akfa> dxioVar, dxio<tgn> dxioVar2, tgx tgxVar, tgw tgwVar, thg thgVar, Executor executor, thd thdVar) {
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = tgxVar;
        this.e = tgwVar;
        this.f = thgVar;
        this.h = executor;
        this.g = thdVar;
    }

    public static btlu h(@dzsi btlu btluVar) {
        return btluVar != null ? btluVar : btlu.b;
    }

    @Override // defpackage.tgi
    public final crzm<FetchState> a() {
        return this.f.a();
    }

    @Override // defpackage.tgi
    public final void b(Bundle bundle) {
        this.f.c();
        bundle.putParcelable("FetchStateManager.fetch_state", this.f.a.a());
        this.c.a().f(bundle);
    }

    @Override // defpackage.tgi
    public final void c(Bundle bundle) {
        thg thgVar = this.f;
        if (bundle.containsKey("FetchStateManager.fetch_state")) {
            FetchState fetchState = (FetchState) bundle.getParcelable("FetchStateManager.fetch_state");
            dbsk.s(fetchState);
            thgVar.a = fetchState.b();
            thgVar.d();
        }
        this.c.a().g(bundle);
    }

    @Override // defpackage.tgi
    public final void d(tgh tghVar) {
        crzm<btlu> C = this.b.a().C();
        btlu h = h(C.l());
        f(h);
        if (tghVar.d().a()) {
            this.e.b(this.g.b(h, tghVar.c(), tghVar.b()), tghVar.d().b());
        } else if (tghVar.a()) {
            tgx tgxVar = this.d;
            dbsg<dwao> b = tghVar.b();
            dbsg<dqvj> c = tghVar.c();
            ths thsVar = (ths) tgxVar;
            thsVar.j = b;
            thsVar.k = c;
            btlu b2 = thsVar.l.b();
            dbsk.s(b2);
            thsVar.a(thsVar.g.b(b2, thsVar.k, thsVar.j));
        }
        crzp<btlu> crzpVar = new crzp(this) { // from class: the
            private final thf a;

            {
                this.a = this;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                thf thfVar = this.a;
                btlu h2 = thf.h((btlu) crzmVar.l());
                if (btlu.g(thfVar.a.b(), h2)) {
                    return;
                }
                thfVar.g();
                thfVar.f(h2);
            }
        };
        this.i = crzpVar;
        dbsk.s(crzpVar);
        C.a(crzpVar, this.h);
    }

    @Override // defpackage.tgi
    public final void e() {
        if (this.i != null) {
            g();
            crzm<btlu> C = this.b.a().C();
            crzp<btlu> crzpVar = this.i;
            dbsk.s(crzpVar);
            C.c(crzpVar);
        }
    }

    public final void f(btlu btluVar) {
        this.a = dbsg.i(btluVar);
        this.c.a().h(btluVar);
        ths thsVar = (ths) this.d;
        thsVar.l = dbsg.i(btluVar);
        thsVar.b.a().a(thsVar.e, thsVar.c);
        thsVar.h = thsVar.d.a().d();
        thsVar.d.a().a().a(thsVar.f, thsVar.c);
        if (thsVar.l.a() && thsVar.d.a().d() && thsVar.d.a().a().k()) {
            btlu b = thsVar.l.b();
            dbsk.s(b);
            uff l = thsVar.b.a().l();
            dbsk.s(l);
            dwao b2 = thsVar.b(b);
            if ((!thsVar.m.a() || dchl.m(thsVar.m.b(), l.a())) && (!thsVar.n.a() || thsVar.n.b().equals(b2))) {
                return;
            }
            thsVar.a(thsVar.g.b(btluVar, thsVar.k, thsVar.j));
        }
    }

    public final void g() {
        this.f.c();
        this.c.a().i();
        ths thsVar = (ths) this.d;
        thsVar.h = false;
        thsVar.i = false;
        thsVar.c();
        thsVar.a.c();
        thsVar.b.a().c(thsVar.e);
        thsVar.d.a().a().c(thsVar.f);
        thsVar.l = dbpy.a;
        this.a = dbpy.a;
    }
}
