package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fdx  reason: default package */
/* loaded from: classes6.dex */
public final class fdx implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<ajpg> b;
    private volatile dzsj<ajoj> c;

    public fdx(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        airr airrVar = (airr) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        airrVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        airrVar.aI = tr;
        airrVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        airrVar.aK = sU;
        airrVar.aL = new cpv();
        airrVar.aM = dxjc.c(this.a.eW.ie());
        airrVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        airrVar.a = this.a.wl();
        airrVar.b = this.a.wq();
        airrVar.c = dxjc.c(this.a.cB());
        airrVar.d = this.a.wd();
        airrVar.e = this.a.eW.ot();
        airrVar.f = this.a.eW.es();
        airrVar.g = this.a.ds();
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        airrVar.ad = rR;
        airrVar.ae = this.a.dn();
        airrVar.af = new cqhn();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        airrVar.ag = rp;
        airrVar.ah = new cqhu();
        airrVar.ai = this.a.m20do();
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        airrVar.aj = rz;
        airrVar.ak = this.a.eW.sA();
        btxc vt = this.a.eW.a.vt();
        dxjg.e(vt);
        airrVar.bd = vt;
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        airrVar.al = rK;
        airrVar.am = dxjc.c(this.a.eW.k());
        airrVar.an = this.a.uc();
        airrVar.ao = b();
        airrVar.ap = this.a.ue();
        airrVar.aq = dxjc.c(this.a.m());
        airrVar.ar = this.a.eW.qp();
        airrVar.as = dxjc.c(this.a.H());
        airrVar.at = this.a.eW.eQ();
        airrVar.au = this.a.dt();
        airrVar.av = this.a.eW.eu();
        fyu fyuVar = this.a.eW;
        dxio c = dxjc.c(fyuVar.h());
        bvrb tn = fyuVar.a.tn();
        dxjg.e(tn);
        bvce bvceVar = new bvce(c, tn);
        aijp ew = this.a.eW.ew();
        cztz m = this.a.eW.a.m();
        dxjg.e(m);
        ftt fttVar = this.a;
        rb rbVar = fttVar.a;
        Executor sV = fttVar.eW.a.sV();
        dxjg.e(sV);
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fdw(this, 0);
            this.b = dzsjVar;
        }
        dxio c2 = dxjc.c(dzsjVar);
        cqat rR2 = this.a.eW.a.rR();
        dxjg.e(rR2);
        airrVar.aw = new ajof(bvceVar, ew, m, rbVar, sV, sU2, c2, rR2, this.a.eW.or());
        airrVar.ax = this.a.cv();
        airrVar.ay = this.a.uf();
        ftt fttVar2 = this.a;
        Object obj3 = fttVar2.cK;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fttVar2.cK;
                if (obj2 instanceof dxjf) {
                    ailb<aigo> eG = fttVar2.eW.eG();
                    fttVar2.ck();
                    akox ap = fttVar2.ap();
                    dxio c3 = dxjc.c(fttVar2.av());
                    btvo rp2 = fttVar2.eW.a.rp();
                    dxjg.e(rp2);
                    aigf m20do = fttVar2.m20do();
                    cqat rR3 = fttVar2.eW.a.rR();
                    dxjg.e(rR3);
                    gle bM = fttVar2.bM();
                    aidm dr = fttVar2.dr();
                    Executor sU3 = fttVar2.eW.a.sU();
                    dxjg.e(sU3);
                    obj2 = new ajad(eG, ap, c3, rp2, m20do, rR3, bM, dr, sU3);
                    dxjc.d(fttVar2.cK, obj2);
                    fttVar2.cK = obj2;
                }
            }
            obj3 = obj2;
        }
        airrVar.az = (ajad) obj3;
        bvjj rB = this.a.eW.a.rB();
        dxjg.e(rB);
        airrVar.aA = rB;
        airrVar.aB = ahtu.a;
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fdw(this, 1);
            this.c = dzsjVar2;
        }
        airrVar.aC = dxjc.c(dzsjVar2);
        airrVar.aO = this.a.tz();
        airrVar.aP = new cpv();
        Executor sU4 = this.a.eW.a.sU();
        dxjg.e(sU4);
        airrVar.aQ = sU4;
        Executor sV2 = this.a.eW.a.sV();
        dxjg.e(sV2);
        airrVar.aR = sV2;
    }

    public final ajsm b() {
        dzsj<gga> ad = this.a.ad();
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cztz m = this.a.eW.a.m();
        dxjg.e(m);
        aijp ew = this.a.eW.ew();
        bvnt ud = this.a.ud();
        aihl<aimj, aiig, aiik> eu = this.a.eW.eu();
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        return new ajsm(ad, sU, m, ew, ud, eu, rR);
    }
}
