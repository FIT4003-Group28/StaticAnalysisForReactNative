package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fha  reason: default package */
/* loaded from: classes6.dex */
public final class fha implements dxis {
    private volatile dzsj<cezg> B;
    private volatile dzsj<cfkq> C;
    public volatile dzsj a;
    public volatile dzsj b;
    public volatile dzsj<cfjy> c;
    public volatile dzsj d;
    public volatile dzsj<cfhw> e;
    public volatile dzsj<cfkz> f;
    public volatile dzsj<cflc> g;
    public volatile dzsj<cfku> h;
    public volatile dzsj i;
    public volatile dzsj<cfia> j;
    public volatile dzsj k;
    public volatile dzsj<cfig> l;
    public volatile dzsj<cfij> m;
    public volatile dzsj<cfks> n;
    public volatile dzsj<cezt> o;
    public volatile dzsj p;
    public volatile dzsj<cfgl> q;
    final /* synthetic */ ftt r;
    private volatile dzsj<cfgm> s;
    private volatile dzsj<ceze> v;
    private volatile dzsj<cfgv> w;
    private volatile dzsj x;
    private volatile dzsj z;
    private volatile Object t = new dxjf();
    private volatile Object u = new dxjf();
    private volatile Object y = new dxjf();
    private volatile Object A = new dxjf();

    public fha(ftt fttVar) {
        this.r = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cezj cezjVar = (cezj) obj;
        cjqq tp = this.r.eW.a.tp();
        dxjg.e(tp);
        cezjVar.aH = tp;
        cjqy tr = this.r.eW.a.tr();
        dxjg.e(tr);
        cezjVar.aI = tr;
        cezjVar.aJ = dbsg.i(this.r.ap());
        Executor sU = this.r.eW.a.sU();
        dxjg.e(sU);
        cezjVar.aK = sU;
        cezjVar.aL = new cpv();
        cezjVar.aM = dxjc.c(this.r.eW.ie());
        cezjVar.aN = dxjc.c(this.r.eW.iU());
        dxjc.c(this.r.lx());
        cezjVar.c = this.r.wq();
        cezjVar.d = this.r.wl();
        dzsj<gga> ad = this.r.ad();
        dzsj<cqhn> il = this.r.eW.il();
        dzsj dzsjVar = this.z;
        if (dzsjVar == null) {
            dzsjVar = new fgz(this, 0);
            this.z = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<auju> bh = this.r.eW.bh();
        dzsj<cfgv> g = g();
        dzsj<ceze> f = f();
        dzsj dzsjVar3 = this.C;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fgz(this, 22);
            this.C = dzsjVar3;
        }
        cezjVar.e = new cfjo(ad, il, dzsjVar2, bh, g, f, dzsjVar3, this.r.eW.R(), k(), this.r.eW.fr());
        cezjVar.f = new cjxo(this.r.a);
        cezjVar.g = e();
        cezjVar.ad = j();
        cezjVar.ae = c();
        cezjVar.af = this.r.gu();
        cezjVar.ag = i();
        cezjVar.ah = this.r.ck();
        dxjg.e(this.r.eW.a.rp());
        cezjVar.ai = new cpv();
    }

    public final dzsj<cfgm> b() {
        dzsj<cfgm> dzsjVar = this.s;
        if (dzsjVar == null) {
            fgz fgzVar = new fgz(this, 1);
            this.s = fgzVar;
            return fgzVar;
        }
        return dzsjVar;
    }

    public final cfgv c() {
        Object obj;
        Object obj2 = this.t;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.t;
                if (obj instanceof dxjf) {
                    obj = new cfgv();
                    dxjc.d(this.t, obj);
                    this.t = obj;
                }
            }
            obj2 = obj;
        }
        return (cfgv) obj2;
    }

    public final cfgl d() {
        return new cfgl(this.r.ap(), dxjc.c(this.r.av()));
    }

    public final ceze e() {
        Object obj;
        Object obj2 = this.u;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.u;
                if (obj instanceof dxjf) {
                    ftt fttVar = this.r;
                    rb rbVar = fttVar.a;
                    akox ap = fttVar.ap();
                    hwc bB = this.r.bB();
                    akpn aw = this.r.aw();
                    alec bJ = this.r.bJ();
                    akzh au = this.r.au();
                    dxio c = dxjc.c(this.r.cu());
                    cfgv c2 = c();
                    cqat rR = this.r.eW.a.rR();
                    dxjg.e(rR);
                    Executor sU = this.r.eW.a.sU();
                    dxjg.e(sU);
                    gga wk = this.r.wk();
                    akto bG = this.r.bG();
                    gce sC = this.r.eW.a.sC();
                    dxjg.e(sC);
                    cfgn cfgnVar = new cfgn(wk, bG, sC);
                    cfgw gu = this.r.gu();
                    cfgl d = d();
                    btvo rp = this.r.eW.a.rp();
                    dxjg.e(rp);
                    obj = new ceze(rbVar, ap, bB, aw, bJ, au, c, c2, rR, sU, cfgnVar, gu, d, rp);
                    dxjc.d(this.u, obj);
                    this.u = obj;
                }
            }
            obj2 = obj;
        }
        return (ceze) obj2;
    }

    public final dzsj<ceze> f() {
        dzsj<ceze> dzsjVar = this.v;
        if (dzsjVar == null) {
            fgz fgzVar = new fgz(this, 2);
            this.v = fgzVar;
            return fgzVar;
        }
        return dzsjVar;
    }

    public final dzsj<cfgv> g() {
        dzsj<cfgv> dzsjVar = this.w;
        if (dzsjVar == null) {
            fgz fgzVar = new fgz(this, 4);
            this.w = fgzVar;
            return fgzVar;
        }
        return dzsjVar;
    }

    public final dzsj h() {
        dzsj dzsjVar = this.x;
        if (dzsjVar == null) {
            fgz fgzVar = new fgz(this, 5);
            this.x = fgzVar;
            return fgzVar;
        }
        return dzsjVar;
    }

    public final cezt i() {
        Object obj;
        Object obj2 = this.y;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof dxjf) {
                    Application a = this.r.eW.a.a();
                    dxjg.e(a);
                    buxk vg = this.r.eW.vg();
                    Executor sV = this.r.eW.a.sV();
                    dxjg.e(sV);
                    obj = new cezt(a, vg, sV);
                    dxjc.d(this.y, obj);
                    this.y = obj;
                }
            }
            obj2 = obj;
        }
        return (cezt) obj2;
    }

    public final cezg j() {
        Object obj;
        Object obj2 = this.A;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.A;
                if (obj instanceof dxjf) {
                    cfgv c = c();
                    bdvy fq = this.r.fq();
                    bwqv rD = this.r.eW.a.rD();
                    dxjg.e(rD);
                    cezg cezgVar = new cezg(c, fq, rD);
                    dxjc.d(this.A, cezgVar);
                    this.A = cezgVar;
                    obj = cezgVar;
                }
            }
            obj2 = obj;
        }
        return (cezg) obj2;
    }

    public final dzsj<cezg> k() {
        dzsj<cezg> dzsjVar = this.B;
        if (dzsjVar == null) {
            fgz fgzVar = new fgz(this, 23);
            this.B = fgzVar;
            return fgzVar;
        }
        return dzsjVar;
    }
}
