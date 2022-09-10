package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: frm  reason: default package */
/* loaded from: classes6.dex */
public final class frm implements dxis {
    private volatile dzsj<buky> A;
    private volatile buuu B;
    public volatile buke a;
    public volatile dzsj<cgsi> b;
    public volatile dzsj<cgyd> c;
    public volatile dzsj<cgya> d;
    public volatile dzsj<cgyn> e;
    public volatile dzsj<cgwx> f;
    public volatile dzsj<cgyi> g;
    public volatile dzsj<cgyk> h;
    public volatile dzsj<cgxb> i;
    public volatile dzsj<cgxo> j;
    public volatile dzsj<cgwr> k;
    public volatile bumy l;
    public volatile dzsj<bumy> m;
    final /* synthetic */ ftt n;
    public volatile buku o;
    public volatile bume p;
    public volatile buky q;
    private volatile dzsj<buke> r;
    private volatile dzsj<cgum> s;
    private volatile dzsj<cham> t;
    private volatile dzsj<chbm> u;
    private volatile dzsj<cgyq> v;
    private volatile dzsj<cgzg> w;
    private volatile dzsj<chat> x;
    private volatile dzsj<buku> y;
    private volatile dzsj<bume> z;

    public frm(ftt fttVar) {
        this.n = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        cgdv cgdvVar = (cgdv) obj;
        cjqq tp = this.n.eW.a.tp();
        dxjg.e(tp);
        cgdvVar.aH = tp;
        cjqy tr = this.n.eW.a.tr();
        dxjg.e(tr);
        cgdvVar.aI = tr;
        cgdvVar.aJ = dbsg.i(this.n.ap());
        Executor sU = this.n.eW.a.sU();
        dxjg.e(sU);
        cgdvVar.aK = sU;
        cgdvVar.aL = new cpv();
        cgdvVar.aM = dxjc.c(this.n.eW.ie());
        cgdvVar.aN = dxjc.c(this.n.eW.iU());
        dxjc.c(this.n.lx());
        cgdvVar.ak = dxjc.c(this.n.cb());
        btrm rz = this.n.eW.a.rz();
        dxjg.e(rz);
        cgdvVar.al = rz;
        cgdvVar.am = this.n.wk();
        bwqv rD = this.n.eW.a.rD();
        dxjg.e(rD);
        cgdvVar.an = rD;
        buuu buuuVar = this.B;
        if (buuuVar == null) {
            dxio c = dxjc.c(this.n.eW.h());
            bvrb tn = this.n.eW.a.tn();
            dxjg.e(tn);
            buuuVar = buuw.b(buuv.b(c, tn));
            this.B = buuuVar;
        }
        cgdvVar.bl = buuuVar;
        btvo rp = this.n.eW.a.rp();
        dxjg.e(rp);
        cgdvVar.ao = rp;
        akfa rK = this.n.eW.a.rK();
        dxjg.e(rK);
        cgdvVar.ap = rK;
        cgdvVar.aq = this.n.wl();
        cgdvVar.ar = this.n.wq();
        cgdvVar.as = this.n.fq();
        cgdvVar.at = this.n.cJ();
        cgdvVar.au = new cjxo(this.n.a);
        bvrb tn2 = this.n.eW.a.tn();
        dxjg.e(tn2);
        cgdvVar.av = tn2;
        cgdvVar.aw = this.n.gw();
        ftt fttVar = this.n;
        Object obj4 = fttVar.dZ;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj3 = fttVar.dZ;
                if (obj3 instanceof dxjf) {
                    obj3 = new cgdy(fttVar.wk(), dxjc.c(fttVar.eW.im()), fttVar.co(), fttVar.cJ());
                    dxjc.d(fttVar.dZ, obj3);
                    fttVar.dZ = obj3;
                }
            }
            obj4 = obj3;
        }
        cgdvVar.ax = (cgdy) obj4;
        Application a = this.n.eW.a.a();
        dxjg.e(a);
        cqat rR = this.n.eW.a.rR();
        dxjg.e(rR);
        cgdvVar.ay = new cgez(a, rR, this.n.eW.qf());
        dzsj<rb> dzsjVar = this.n.eV;
        dzsj dzsjVar2 = this.u;
        if (dzsjVar2 == null) {
            dzsjVar2 = new frl(this, 0);
            this.u = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.v;
        if (dzsjVar4 == null) {
            dzsjVar4 = new frl(this, 14);
            this.v = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.w;
        if (dzsjVar6 == null) {
            dzsjVar6 = new frl(this, 15);
            this.w = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.x;
        if (dzsjVar8 == null) {
            dzsjVar8 = new frl(this, 16);
            this.x = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj<cgep> gE = this.n.gE();
        ftt fttVar2 = this.n;
        dzsj dzsjVar10 = fttVar2.ed;
        if (dzsjVar10 == null) {
            dzsjVar10 = new fns(fttVar2, 1405);
            fttVar2.ed = dzsjVar10;
        }
        cgdvVar.az = new chad(dzsjVar, dzsjVar3, dzsjVar5, dzsjVar7, dzsjVar9, gE, dzsjVar10, this.n.eW.V(), this.n.as(), this.n.jn(), this.n.eW.k(), this.n.eW.al());
        dzsj<btpc> cx = this.n.eW.cx();
        ftt fttVar3 = this.n;
        cgdvVar.aA = new cgrs(cx, fttVar3.eV, fttVar3.vg());
        dzsj<btpc> cx2 = this.n.eW.cx();
        ftt fttVar4 = this.n;
        cgdvVar.aB = new cgrq(cx2, fttVar4.eV, fttVar4.vg());
        dzsj<btpc> cx3 = this.n.eW.cx();
        ftt fttVar5 = this.n;
        cgdvVar.aC = new cgro(cx3, fttVar5.eV, fttVar5.vg());
        dzsj<btpc> cx4 = this.n.eW.cx();
        ftt fttVar6 = this.n;
        cgdvVar.aO = new cgrm(cx4, fttVar6.eV, fttVar6.vh());
        cgdvVar.aP = new cgdr();
        cgdvVar.aQ = this.n.eW.aK();
        dzsj dzsjVar11 = this.y;
        if (dzsjVar11 == null) {
            dzsjVar11 = new frl(this, 18);
            this.y = dzsjVar11;
        }
        cgdvVar.aR = new cgtq(dzsjVar11);
        dzsj dzsjVar12 = this.z;
        if (dzsjVar12 == null) {
            dzsjVar12 = new frl(this, 19);
            this.z = dzsjVar12;
        }
        cgdvVar.aS = new cgts(dzsjVar12);
        dzsj dzsjVar13 = this.A;
        if (dzsjVar13 == null) {
            dzsjVar13 = new frl(this, 20);
            this.A = dzsjVar13;
        }
        cgdvVar.aT = new cgrg(dzsjVar13);
        ftt fttVar7 = this.n;
        cgdvVar.aU = new cgtx(fttVar7.eV, fttVar7.eW.cx(), this.n.gA());
        ftt fttVar8 = this.n;
        cgdvVar.aV = new cgrj(fttVar8.eV, fttVar8.eW.cx(), this.n.eW.aw(), this.n.v());
        cgdvVar.aW = this.n.wd();
        bvjj rB = this.n.eW.a.rB();
        dxjg.e(rB);
        cgdvVar.aX = rB;
        cgdvVar.aY = this.n.gz();
        cgdvVar.aZ = this.n.fg();
        cgdvVar.ba = this.n.bM();
        cgdvVar.bb = this.n.bB();
        cgdvVar.bc = dxjc.c(this.n.eW.k());
        cgdvVar.bd = dxjc.c(this.n.cS());
        cgdvVar.be = dxjc.c(this.n.eW.im());
        ftt fttVar9 = this.n;
        Object obj5 = fttVar9.ee;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj2 = fttVar9.ee;
                if (obj2 instanceof dxjf) {
                    obj2 = new cgut(fttVar9.wk());
                    dxjc.d(fttVar9.ee, obj2);
                    fttVar9.ee = obj2;
                }
            }
            obj5 = obj2;
        }
        cgdvVar.bf = (cgut) obj5;
        cjqy tr2 = this.n.eW.a.tr();
        dxjg.e(tr2);
        cgdvVar.bg = tr2;
        cjqq tp2 = this.n.eW.a.tp();
        dxjg.e(tp2);
        cgdvVar.bh = tp2;
        cgdvVar.bi = this.n.eW.sr();
        cgex cgexVar = new cgex();
        cgexVar.a = dxjc.c(this.n.av());
        cgexVar.b = dxjc.c(this.n.cl());
        cgexVar.c = this.n.lH();
        cgexVar.d = this.n.ap();
        cgexVar.e = this.n.bM();
        cgdvVar.bj = cgexVar;
        cztz m = this.n.eW.a.m();
        dxjg.e(m);
        cgdvVar.bk = m;
    }

    public final dzsj<buke> b() {
        dzsj<buke> dzsjVar = this.r;
        if (dzsjVar == null) {
            frl frlVar = new frl(this, 2);
            this.r = frlVar;
            return frlVar;
        }
        return dzsjVar;
    }

    public final dzsj<cgum> c() {
        dzsj<cgum> dzsjVar = this.s;
        if (dzsjVar == null) {
            frl frlVar = new frl(this, 5);
            this.s = frlVar;
            return frlVar;
        }
        return dzsjVar;
    }

    public final dzsj<cham> d() {
        dzsj<cham> dzsjVar = this.t;
        if (dzsjVar == null) {
            frl frlVar = new frl(this, 3);
            this.t = frlVar;
            return frlVar;
        }
        return dzsjVar;
    }
}
