package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fko  reason: default package */
/* loaded from: classes6.dex */
public final class fko implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<btjc> b;
    private volatile dzsj<btke> c;
    private volatile dzsj<btkl> d;
    private volatile dzsj<btiu> e;
    private volatile dzsj<btjy> f;
    private volatile dzsj<btkc> g;
    private volatile dzsj<btin> h;
    private volatile dzsj<btjo> i;
    private volatile dzsj<btjl> j;
    private volatile dzsj<btil> k;

    public fko(ftt fttVar) {
        this.a = fttVar;
    }

    private final btjt b() {
        return new btjt(this.a.a);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        btki btkiVar = (btki) obj;
        btkiVar.aT = this.a.gK();
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        btkiVar.aU = rU;
        dxjg.e(this.a.eW.a.tr());
        btkiVar.aV = this.a.wq();
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        btkiVar.aW = tp;
        btkiVar.aY = this.a.lw();
        btkiVar.ad = this.a.gK();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        btkiVar.ae = rp;
        btkiVar.af = new btjr(this.a.tb(), this.a.eW.n());
        btkiVar.ag = this.a.eW.qq();
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        btkiVar.ah = rz;
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        btkiVar.ai = rK;
        btkiVar.aj = this.a.cO();
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        btkiVar.ak = tr;
        Context gK = this.a.gK();
        btht b = bthu.b(this.a.wk());
        akfa rK2 = this.a.eW.a.rK();
        dxjg.e(rK2);
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        btkiVar.al = new btic(gK, b, rK2, tr2);
        Context gK2 = this.a.gK();
        btig btigVar = new btig(this.a.wk());
        akfa rK3 = this.a.eW.a.rK();
        dxjg.e(rK3);
        cjqy tr3 = this.a.eW.a.tr();
        dxjg.e(tr3);
        btkiVar.am = new btii(gK2, btigVar, rK3, tr3);
        Context gK3 = this.a.gK();
        arag ea = this.a.ea();
        apkd hg = this.a.hg();
        btjt b2 = b();
        bsvm aU = this.a.aU();
        cjqy tr4 = this.a.eW.a.tr();
        dxjg.e(tr4);
        btkiVar.an = new btjf(gK3, ea, hg, b2, aU, tr4);
        Context gK4 = this.a.gK();
        arag ea2 = this.a.ea();
        apkd hg2 = this.a.hg();
        btjt b3 = b();
        cjqy tr5 = this.a.eW.a.tr();
        dxjg.e(tr5);
        btkiVar.ao = new btix(gK4, ea2, hg2, b3, tr5);
        Context gK5 = this.a.gK();
        btjt b4 = b();
        bsvm aU2 = this.a.aU();
        cjqy tr6 = this.a.eW.a.tr();
        dxjg.e(tr6);
        btkiVar.ap = new btja(gK5, b4, aU2, tr6, this.a.fm());
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fkn(this, 0);
            this.b = dzsjVar;
        }
        btkiVar.aq = dxjc.c(dzsjVar);
        Context gK6 = this.a.gK();
        bvjj rB = this.a.eW.a.rB();
        dxjg.e(rB);
        cjqy tr7 = this.a.eW.a.tr();
        dxjg.e(tr7);
        btkiVar.ar = new btip(gK6, rB, tr7, this.a.eW.am());
        Context gK7 = this.a.gK();
        gga wk = this.a.wk();
        cjqy tr8 = this.a.eW.a.tr();
        dxjg.e(tr8);
        aogw fw = this.a.eW.fw();
        anhn ox = this.a.eW.ox();
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        btkiVar.as = new btjj(gK7, wk, tr8, fw, ox, tn);
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fkn(this, 1);
            this.c = dzsjVar2;
        }
        btkiVar.at = dxjc.c(dzsjVar2);
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fkn(this, 2);
            this.d = dzsjVar3;
        }
        btkiVar.au = dxjc.c(dzsjVar3);
        dzsj dzsjVar4 = this.e;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fkn(this, 3);
            this.e = dzsjVar4;
        }
        btkiVar.av = dxjc.c(dzsjVar4);
        dzsj dzsjVar5 = this.f;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fkn(this, 4);
            this.f = dzsjVar5;
        }
        btkiVar.aw = dxjc.c(dzsjVar5);
        dzsj dzsjVar6 = this.g;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fkn(this, 5);
            this.g = dzsjVar6;
        }
        btkiVar.ax = dxjc.c(dzsjVar6);
        btkiVar.ay = dxjc.c(this.a.aR());
        ftt fttVar = this.a;
        rb rbVar = fttVar.a;
        Context gK8 = fttVar.gK();
        btjt b5 = b();
        bzqc fm = this.a.fm();
        fyu fyuVar = this.a.eW;
        Object obj3 = fyuVar.dC;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = fyuVar.dC;
                if (obj2 instanceof dxjf) {
                    Context b6 = fyuVar.a.b();
                    dxjg.e(b6);
                    cqat rR = fyuVar.a.rR();
                    dxjg.e(rR);
                    dewl en = fyuVar.en();
                    Executor sV = fyuVar.a.sV();
                    dxjg.e(sV);
                    obj2 = new acfa(b6, rR, en, sV);
                    dxjc.d(fyuVar.dC, obj2);
                    fyuVar.dC = obj2;
                }
            }
            obj3 = obj2;
        }
        cjqy tr9 = this.a.eW.a.tr();
        dxjg.e(tr9);
        ania qq = this.a.eW.qq();
        apkr dg = this.a.dg();
        akfa rK4 = this.a.eW.a.rK();
        dxjg.e(rK4);
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        btvo rp2 = this.a.eW.a.rp();
        dxjg.e(rp2);
        btkiVar.az = new btkx(rbVar, gK8, b5, fm, (acey) obj3, tr9, qq, dg, rK4, sU, rp2, dxjc.c(this.a.m()));
        dzsj<btin> dzsjVar7 = this.h;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fkn<>(this, 6);
            this.h = dzsjVar7;
        }
        btkiVar.aA = dzsjVar7;
        dzsj<btjo> dzsjVar8 = this.i;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fkn<>(this, 7);
            this.i = dzsjVar8;
        }
        btkiVar.aB = dzsjVar8;
        dzsj<btjl> dzsjVar9 = this.j;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fkn<>(this, 8);
            this.j = dzsjVar9;
        }
        btkiVar.aC = dzsjVar9;
        btkiVar.aD = this.a.qy();
        if (this.k == null) {
            this.k = new fkn(this, 9);
        }
        btkiVar.aE = dxjc.c(this.a.eW.aw());
    }
}
