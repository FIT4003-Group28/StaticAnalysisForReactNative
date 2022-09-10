package defpackage;

import android.os.Bundle;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atdd  reason: default package */
/* loaded from: classes2.dex */
public final class atdd extends aslq<atlq, atlo> implements atcw, atcv, btph {
    private static final dcqe m = dcqe.c("atdd");
    private final atdb A;
    public final atcu e;
    public final cjqy f;
    public final dbsg<atbs> g;
    public final crmt h;
    @dzsi
    public final asac i;
    public boolean j;
    @dzsi
    public eapd k;
    @dzsi
    public crhp l;
    private final btrm n;
    private final bwqv o;
    private final crms p;
    private final crmu q;
    private final atdc r;
    private final aufc s;
    private final crzm<Boolean> t;
    private final Executor u;
    private final crzp<aufb> v;
    private final crzp<Boolean> w;
    private boolean x;
    private boolean y;
    private aslf z;

    public atdd(btrm btrmVar, btvo btvoVar, cjqy cjqyVar, bwqv bwqvVar, dbsg<atbs> dbsgVar, aufc aufcVar, Executor executor, crmu crmuVar, crmt crmtVar, @dzsi asac asacVar, crzm<Boolean> crzmVar, atcu atcuVar, atdc atdcVar) {
        super(new atlo(), btvoVar);
        this.v = new atcz(this);
        this.w = new atda(this);
        this.k = null;
        this.l = null;
        this.A = new atdb(this);
        this.e = atcuVar;
        this.n = btrmVar;
        this.f = cjqyVar;
        this.o = bwqvVar;
        this.g = dbsgVar;
        this.r = atdcVar;
        this.p = new crms(bwqvVar);
        this.h = crmtVar;
        this.q = crmuVar;
        this.s = aufcVar;
        this.t = crzmVar;
        this.u = executor;
        asle asleVar = new asle(((atlo) this.a).c);
        asleVar.a = asld.FOLLOWING;
        asleVar.c();
        asleVar.d = false;
        this.z = asleVar.a();
        this.i = asacVar;
    }

    private final void M(aslf aslfVar) {
        if (aslfVar.a == asld.FOLLOWING && aslfVar.a() == null) {
            this.z = aslfVar;
        }
    }

    @Override // defpackage.asmp
    public final void A(boolean z, aslo... asloVarArr) {
        atlo atloVar = (atlo) this.a;
        asln aslnVar = new asln(atloVar.c);
        aslnVar.a = asld.INSPECT_ROUTE_SECTION;
        aslnVar.f = ((atlo) this.a).c;
        aslnVar.e(asloVarArr);
        aslnVar.d = z;
        atloVar.b(aslnVar.a());
        u();
    }

    @Override // defpackage.asmp
    public final void B() {
        aslf aslfVar = ((atlo) this.a).c;
        if (aslfVar.a != asld.INSPECT_ROUTE_SECTION) {
            return;
        }
        if (aslfVar instanceof aslp) {
            ((atlo) this.a).b(((aslp) aslfVar).g);
        } else {
            asle asleVar = new asle();
            asleVar.a = asld.FOLLOWING;
            ((atlo) this.a).b(asleVar.a());
        }
        u();
    }

    @Override // defpackage.asmp
    public final void C(@dzsi crqw crqwVar) {
        ((atlo) this.a).b = crqwVar;
        u();
    }

    @Override // defpackage.asmp
    public final void D(@dzsi astg astgVar) {
        ((atlo) this.a).d = astgVar;
        u();
    }

    @Override // defpackage.asmp
    public final void E() {
        ((atlo) this.a).b(this.z);
        u();
    }

    @Override // defpackage.atcw
    public final void F() {
        ((atlo) this.a).s = false;
        u();
    }

    @Override // defpackage.atcw
    public final void G() {
    }

    public final void H(@dzsi Bundle bundle) {
        atlo atloVar = (atlo) this.a;
        atloVar.l = null;
        atloVar.m = false;
        atloVar.n = null;
        atloVar.o = true;
        atloVar.p = null;
        atloVar.q = null;
        atloVar.r = null;
        atloVar.s = false;
        atloVar.t = 0;
        atloVar.u = false;
        atloVar.v = false;
        atloVar.w = false;
        atloVar.x = null;
        if (bundle == null) {
            return;
        }
        try {
            atlp atlpVar = (atlp) this.o.d(atlp.class, bundle, "navigationFragmentState");
            if (atlpVar == null) {
                return;
            }
            atlo atloVar2 = (atlo) this.a;
            atloVar2.r = atlpVar;
            atloVar2.o = atlpVar.b;
            atloVar2.e = atlpVar.h;
            atloVar2.g = atlpVar.i;
            atloVar2.h = atlpVar.j;
            atloVar2.i = atlpVar.k;
            atloVar2.j = atlpVar.l;
            atloVar2.u = atlpVar.n;
            atloVar2.v = false;
            atloVar2.w = atlpVar.o;
            atloVar2.x = atlpVar.p;
            asle asleVar = new asle();
            asleVar.a = atlpVar.a;
            asleVar.b = atlpVar.e;
            asleVar.c = atlpVar.f;
            asleVar.d = atlpVar.g;
            atloVar2.b(asleVar.a());
        } catch (IOException e) {
            bvoo.h("Corrupt NAVIGATION_FRAGMENT_STATE_KEY data: %s", e);
        }
    }

    public final void I() {
        dbsk.l(this.d);
        dbsk.m(this.j, "receivedNavigationServiceStateEvent");
        u();
        atdc atdcVar = this.r;
        atlq atlqVar = (atlq) this.c;
        dbsk.s(atlqVar);
        atdcVar.a(atlqVar);
        asle<?> b = ((atlo) this.a).c.b();
        b.c = false;
        aslf a = b.a();
        M(a);
        ((atlo) this.a).b(a);
    }

    public final void J() {
        ilo a = this.p.a();
        atlo atloVar = (atlo) this.a;
        atloVar.p = a;
        atloVar.x = (crmw) this.q.a.p(bwrj.COMPLETED_NAVIGATION);
        if (a == null && !this.h.b()) {
            ((atlo) this.a).q = null;
        } else if (a == null) {
        } else {
            ((atlo) this.a).q = this.h.a();
        }
    }

    public final void K(boolean z) {
        ((atlo) this.a).w = z;
        u();
    }

    public final void L() {
        asle asleVar = new asle(((atlo) this.a).c);
        asleVar.a = asld.FOLLOWING;
        asleVar.d = false;
        aslf a = asleVar.a();
        M(a);
        ((atlo) this.a).b(a);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        throw null;
    }

    @Override // defpackage.atcv
    public final void Oc(atlq atlqVar, @dzsi atlq atlqVar2) {
    }

    @Override // defpackage.aslq, defpackage.asmo
    public final void Qr(Bundle bundle) {
        bwqv bwqvVar = this.o;
        atlq a = ((atlo) this.a).a();
        aslf aslfVar = a.c;
        asld asldVar = aslfVar.a;
        boolean z = a.p;
        amuo amuoVar = a.o;
        Float a2 = aslfVar.a();
        aslf aslfVar2 = a.c;
        bwqvVar.c(bundle, "navigationFragmentState", new atlp(asldVar, z, amuoVar, a2, aslfVar2.c, aslfVar2.d, a.e, a.g, a.h, a.i, a.j, a.r, a.u, a.v, a.w));
    }

    @Override // defpackage.atcw
    public final void a(amuo amuoVar) {
        atlo atloVar = (atlo) this.a;
        asle asleVar = new asle(atloVar.c);
        asleVar.a = asld.INSPECT_STEP;
        asleVar.d = false;
        atloVar.b(asleVar.a());
        ((atlo) this.a).n = amuoVar;
        u();
    }

    @Override // defpackage.aslq, defpackage.asmo
    public final void b() {
        atlo atloVar = (atlo) this.a;
        this.j = false;
        btrm btrmVar = this.n;
        atdb atdbVar = this.A;
        dceq a = dcet.a();
        a.b(crhp.class, new atdf(0, crhp.class, atdbVar, bvrj.UI_THREAD));
        a.b(crhk.class, new atdf(1, crhk.class, atdbVar, bvrj.UI_THREAD));
        a.b(crhn.class, new atdf(2, crhn.class, atdbVar, bvrj.UI_THREAD));
        a.b(aryn.class, new atdf(3, aryn.class, atdbVar, bvrj.UI_THREAD));
        a.b(crhy.class, new atdf(4, crhy.class, atdbVar, bvrj.UI_THREAD));
        a.b(bznv.class, new atdf(5, bznv.class, atdbVar, bvrj.UI_THREAD));
        a.b(crih.class, new atdf(6, crih.class, atdbVar, bvrj.UI_THREAD));
        btrmVar.g(atdbVar, a.a());
        this.s.i().d(this.v, this.u);
        this.t.d(this.w, this.u);
        super.b();
    }

    @Override // defpackage.aslq, defpackage.asmo
    public final void c() {
        super.c();
        this.t.c(this.w);
        this.s.i().c(this.v);
        this.n.a(this.A);
        this.j = false;
        atlo atloVar = (atlo) this.a;
        asle<?> b = atloVar.c.b();
        b.c = true;
        atloVar.b(b.a());
    }

    @Override // defpackage.atcw
    public final void e(amub amubVar, akrn akrnVar, boolean z, boolean z2, boolean z3) {
        atlo atloVar = (atlo) this.a;
        aslj asljVar = new aslj(atloVar.c);
        asljVar.a = asld.INSPECT_POINT_ON_ROUTE;
        asljVar.e = amubVar;
        asljVar.f = (float) amubVar.M(akrnVar);
        asljVar.g = z;
        asljVar.h = z2;
        asljVar.i = z3;
        asljVar.d = false;
        atloVar.b(asljVar.a());
        u();
    }

    @Override // defpackage.atcw
    public final void f() {
    }

    @Override // defpackage.aslq
    public final void u() {
        if (this.d) {
            if (this.x) {
                this.y = true;
                return;
            }
            this.x = true;
            this.c = ((atlo) this.a).a();
            this.r.b((atlq) this.c, (atlq) this.c);
            this.x = false;
            if (!this.y) {
                return;
            }
            this.y = false;
            u();
        }
    }

    @Override // defpackage.asmp
    public final void v() {
        L();
        u();
    }

    @Override // defpackage.asmp
    public final void w(Float f) {
        atlo atloVar = (atlo) this.a;
        asle<?> b = atloVar.c.b();
        b.b = f;
        atloVar.b(b.a());
        this.c = ((atlo) this.a).a();
    }

    @Override // defpackage.asmp
    public final void x() {
        atlo atloVar = (atlo) this.a;
        asle<?> b = atloVar.c.b();
        b.c();
        atloVar.b(b.a());
        this.c = ((atlo) this.a).a();
    }

    @Override // defpackage.asmp
    public final void y() {
        atlo atloVar = (atlo) this.a;
        asle asleVar = new asle(atloVar.c);
        asleVar.a = asld.FREE_MOVEMENT;
        asleVar.d = false;
        atloVar.b(asleVar.a());
        u();
    }

    @Override // defpackage.asmp
    public final void z() {
        atlo atloVar = (atlo) this.a;
        asle asleVar = new asle(atloVar.c);
        asleVar.a = asld.OVERVIEW;
        asleVar.d = true;
        atloVar.b(asleVar.a());
        u();
    }
}
