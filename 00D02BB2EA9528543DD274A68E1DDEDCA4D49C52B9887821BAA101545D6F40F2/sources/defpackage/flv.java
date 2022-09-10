package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: flv  reason: default package */
/* loaded from: classes6.dex */
public final class flv implements dxis {
    public volatile dzsj<anpc> a;
    public volatile dzsj<aojt> b;
    public volatile dzsj c;
    public volatile dzsj<anpb> d;
    public volatile dzsj f;
    public volatile dzsj g;
    public volatile dzsj h;
    public volatile dzsj<aofe> i;
    public final dzsj<aomr> j;
    final /* synthetic */ ftt k;
    private volatile dzsj<anqx> m;
    private volatile dzsj<anru> n;
    private volatile dzsj<aoiw> o;
    private volatile dzsj<aojq> p;
    private volatile dzsj<anri> q;
    private volatile dzsj<aoiq> r;
    private volatile dzsj<aolt> s;
    private volatile dzsj<aobn> t;
    private volatile dzsj<anrz> u;
    private volatile dzsj<aoog> v;
    private volatile dzsj<apjv> w;
    private volatile Object l = new dxjf();
    public volatile Object e = new dxjf();

    public flv(ftt fttVar, aomr aomrVar) {
        this.k = fttVar;
        this.j = dxjd.b(aomrVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        aomr aomrVar = (aomr) obj;
        cjqq tp = this.k.eW.a.tp();
        dxjg.e(tp);
        aomrVar.aH = tp;
        cjqy tr = this.k.eW.a.tr();
        dxjg.e(tr);
        aomrVar.aI = tr;
        aomrVar.aJ = dbsg.i(this.k.ap());
        Executor sU = this.k.eW.a.sU();
        dxjg.e(sU);
        aomrVar.aK = sU;
        aomrVar.aL = new cpv();
        aomrVar.aM = dxjc.c(this.k.eW.ie());
        aomrVar.aN = dxjc.c(this.k.eW.iU());
        dxjc.c(this.k.lx());
        ftt fttVar = this.k;
        aomrVar.b = new apjy(fttVar.a, dxjc.c(fttVar.kI()), dxjc.c(this.k.sw()));
        cqat rR = this.k.eW.a.rR();
        dxjg.e(rR);
        aomrVar.c = rR;
        aomrVar.d = this.k.eW.jD();
        aomrVar.e = this.k.wd();
        btrm rz = this.k.eW.a.rz();
        dxjg.e(rz);
        aomrVar.f = rz;
        bwqv rD = this.k.eW.a.rD();
        dxjg.e(rD);
        aomrVar.g = rD;
        Object obj3 = this.l;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.l;
                if (obj2 instanceof dxjf) {
                    obj2 = new aotx(this.k.dH());
                    dxjc.d(this.l, obj2);
                    this.l = obj2;
                }
            }
            obj3 = obj2;
        }
        aomrVar.ad = (aotx) obj3;
        aomrVar.ae = new apkh(this.k.aW());
        dzsj dzsjVar = this.s;
        if (dzsjVar == null) {
            dzsjVar = new flu(this, 0);
            this.s = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.t;
        if (dzsjVar3 == null) {
            dzsjVar3 = new flu(this, 11);
            this.t = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.v;
        if (dzsjVar5 == null) {
            dzsjVar5 = new flu(this, 14);
            this.v = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.w;
        if (dzsjVar7 == null) {
            dzsjVar7 = new flu(this, 18);
            this.w = dzsjVar7;
        }
        aomrVar.af = new aoml(dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar7, this.k.eW.al());
        ftt fttVar2 = this.k;
        rb rbVar = fttVar2.a;
        iuk kj = fttVar2.kj();
        cjqy tr2 = this.k.eW.a.tr();
        dxjg.e(tr2);
        dxjg.e(this.k.eW.a.th());
        dehq tg = this.k.eW.a.tg();
        dxjg.e(tg);
        bvjj rB = this.k.eW.a.rB();
        dxjg.e(rB);
        Application a = this.k.eW.a.a();
        dxjg.e(a);
        cjqy tr3 = this.k.eW.a.tr();
        dxjg.e(tr3);
        aomrVar.ag = new ansy(rbVar, kj, tr2, tg, rB, new answ(new ansu(a, tr3)), this.k.kk());
        aomrVar.ah = this.k.wq();
        aomrVar.ai = this.k.wl();
        aomrVar.aj = this.k.cJ();
        aomrVar.ak = this.k.aW();
        aomrVar.al = new aplg(this.k.cv());
        aomrVar.am = new cqhn();
        dxjg.e(this.k.eW.a.sU());
    }

    public final dzsj<anqx> b() {
        dzsj<anqx> dzsjVar = this.m;
        if (dzsjVar == null) {
            flu fluVar = new flu(this, 3);
            this.m = fluVar;
            return fluVar;
        }
        return dzsjVar;
    }

    public final dzsj<anru> c() {
        dzsj<anru> dzsjVar = this.n;
        if (dzsjVar == null) {
            flu fluVar = new flu(this, 4);
            this.n = fluVar;
            return fluVar;
        }
        return dzsjVar;
    }

    public final dzsj<aoiw> d() {
        dzsj<aoiw> dzsjVar = this.o;
        if (dzsjVar == null) {
            flu fluVar = new flu(this, 5);
            this.o = fluVar;
            return fluVar;
        }
        return dzsjVar;
    }

    public final dzsj<aojq> e() {
        dzsj<aojq> dzsjVar = this.p;
        if (dzsjVar == null) {
            flu fluVar = new flu(this, 8);
            this.p = fluVar;
            return fluVar;
        }
        return dzsjVar;
    }

    public final dzsj<anri> f() {
        dzsj<anri> dzsjVar = this.q;
        if (dzsjVar == null) {
            flu fluVar = new flu(this, 9);
            this.q = fluVar;
            return fluVar;
        }
        return dzsjVar;
    }

    public final dzsj<aoiq> g() {
        dzsj<aoiq> dzsjVar = this.r;
        if (dzsjVar == null) {
            flu fluVar = new flu(this, 10);
            this.r = fluVar;
            return fluVar;
        }
        return dzsjVar;
    }

    public final apjv h() {
        gga wk = this.k.wk();
        anhg aW = this.k.aW();
        dxio c = dxjc.c(this.k.bh());
        apkm dN = this.k.dN();
        dxjg.e(this.k.eW.a.rB());
        this.k.eW.am();
        cpv cpvVar = new cpv();
        this.k.eW.jJ();
        dxjg.e(this.k.eW.a.rp());
        return new apjv(wk, aW, c, dN, cpvVar);
    }

    public final dzsj<anrz> i() {
        dzsj<anrz> dzsjVar = this.u;
        if (dzsjVar == null) {
            flu fluVar = new flu(this, 15);
            this.u = fluVar;
            return fluVar;
        }
        return dzsjVar;
    }
}
