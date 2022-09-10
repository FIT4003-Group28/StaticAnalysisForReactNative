package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.transit.go.service.TransitTripService;
/* compiled from: PG */
/* renamed from: fyr  reason: default package */
/* loaded from: classes6.dex */
final class fyr implements dxis {
    private volatile dzsj<bzgl> A;
    private volatile dzsj<bzfh> B;
    private volatile dzsj<bzci> C;
    public final TransitTripService a;
    public volatile dzsj<byzr> d;
    public volatile dzsj<bzai> e;
    public volatile dzsj<bzgc> f;
    public volatile dzsj<bzag> g;
    public volatile dzsj<bzgq> h;
    public volatile dzsj<fyo> i;
    public volatile dzsj<bzed> j;
    public volatile dzsj<bzea> k;
    public volatile dzsj<vxv> l;
    public volatile dzsj<bzbe> m;
    public volatile dzsj<bzat> n;
    public final dzsj<TransitTripService> u;
    final /* synthetic */ fyu v;
    public volatile buvq w;
    private volatile dzsj<crnz> x;
    private volatile dzsj<byzk> z;
    public volatile Object b = new dxjf();
    public volatile Object c = new dxjf();
    private volatile Object y = new dxjf();
    public volatile Object o = new dxjf();
    public volatile Object p = new dxjf();
    public volatile Object q = new dxjf();
    public volatile Object r = new dxjf();
    public volatile Object s = new dxjf();
    public volatile Object t = new dxjf();

    public fyr(fyu fyuVar, TransitTripService transitTripService) {
        this.v = fyuVar;
        this.a = transitTripService;
        this.u = dxjd.b(transitTripService);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        TransitTripService transitTripService = (TransitTripService) obj;
        transitTripService.a = dxjc.c(this.v.pJ());
        transitTripService.b = dxjc.c(this.v.er());
        transitTripService.c = dxjc.c(this.v.lx());
        dzsj dzsjVar = this.C;
        if (dzsjVar == null) {
            dzsjVar = new fyn(this, 0);
            this.C = dzsjVar;
        }
        transitTripService.d = dxjc.c(dzsjVar);
        transitTripService.e = dxjc.c(i());
        transitTripService.f = dxjc.c(this.v.bv());
        fyu fyuVar = this.v;
        dzsj dzsjVar2 = fyuVar.eu;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fxy(fyuVar, 755);
            fyuVar.eu = dzsjVar2;
        }
        transitTripService.g = dxjc.c(dzsjVar2);
        dxjc.c(c());
        dehq tj = this.v.a.tj();
        dxjg.e(tj);
        transitTripService.h = tj;
    }

    public final byzk b() {
        Object obj;
        Object obj2 = this.y;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof dxjf) {
                    cqat rR = this.v.a.rR();
                    dxjg.e(rR);
                    btrm rz = this.v.a.rz();
                    dxjg.e(rz);
                    cjqy tr = this.v.a.tr();
                    dxjg.e(tr);
                    btpa rx = this.v.a.rx();
                    dxjg.e(rx);
                    dxio c = dxjc.c(this.v.k());
                    dzsj dzsjVar = this.x;
                    if (dzsjVar == null) {
                        dzsjVar = new fyn(this, 3);
                        this.x = dzsjVar;
                    }
                    obj = new byzk(rR, rz, tr, rx, c, dxjc.c(dzsjVar));
                    dxjc.d(this.y, obj);
                    this.y = obj;
                }
            }
            obj2 = obj;
        }
        return (byzk) obj2;
    }

    public final dzsj<byzk> c() {
        dzsj<byzk> dzsjVar = this.z;
        if (dzsjVar == null) {
            fyn fynVar = new fyn(this, 2);
            this.z = fynVar;
            return fynVar;
        }
        return dzsjVar;
    }

    public final vyl d() {
        Application a = this.v.a.a();
        dxjg.e(a);
        return new vyl(a, this.v.g());
    }

    public final byzt e() {
        vyl d = d();
        Application a = this.v.a.a();
        dxjg.e(a);
        btvo rp = this.v.a.rp();
        dxjg.e(rp);
        cqat rR = this.v.a.rR();
        dxjg.e(rR);
        vxw vxwVar = new vxw(rR);
        bvjj rB = this.v.a.rB();
        dxjg.e(rB);
        return new byzt(d, a, rp, vxwVar, rB);
    }

    public final bzgl f() {
        btvo rp = this.v.a.rp();
        dxjg.e(rp);
        ahjq wf = this.v.wf();
        bvjj rB = this.v.a.rB();
        dxjg.e(rB);
        vwv qw = this.v.qw();
        dzsj<bzcb> lx = this.v.lx();
        akfa rK = this.v.a.rK();
        dxjg.e(rK);
        return new bzgl(rp, wf, rB, qw, lx, rK, this.v.qq(), this.v.dG());
    }

    public final dzsj<bzgl> g() {
        dzsj<bzgl> dzsjVar = this.A;
        if (dzsjVar == null) {
            fyn fynVar = new fyn(this, 9);
            this.A = fynVar;
            return fynVar;
        }
        return dzsjVar;
    }

    public final vxv h() {
        cqat rR = this.v.a.rR();
        dxjg.e(rR);
        btpc sz = this.v.a.sz();
        dxjg.e(sz);
        return new vxv(rR, sz, this.v.nN());
    }

    public final dzsj<bzfh> i() {
        dzsj<bzfh> dzsjVar = this.B;
        if (dzsjVar == null) {
            fyn fynVar = new fyn(this, 1);
            this.B = fynVar;
            return fynVar;
        }
        return dzsjVar;
    }
}
