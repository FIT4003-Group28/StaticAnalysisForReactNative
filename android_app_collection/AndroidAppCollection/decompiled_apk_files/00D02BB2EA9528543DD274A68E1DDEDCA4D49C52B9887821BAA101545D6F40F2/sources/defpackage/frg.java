package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: frg  reason: default package */
/* loaded from: classes6.dex */
public final class frg implements dxis {
    public volatile Object a = new dxjf();
    public volatile dzsj<buni> b;
    final /* synthetic */ ftt c;
    public volatile bujr d;
    public volatile buni e;
    private volatile dzsj f;
    private volatile dzsj g;
    private volatile dzsj<aajk> h;
    private volatile dzsj i;

    public frg(ftt fttVar) {
        this.c = fttVar;
    }

    private final dzsj b() {
        dzsj dzsjVar = this.g;
        if (dzsjVar == null) {
            frf frfVar = new frf(this, 1);
            this.g = frfVar;
            return frfVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cbei cbeiVar = (cbei) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        cbeiVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        cbeiVar.aI = tr;
        cbeiVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        cbeiVar.aK = sU;
        cbeiVar.aL = new cpv();
        cbeiVar.aM = dxjc.c(this.c.eW.ie());
        cbeiVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        cbeiVar.b = this.c.wl();
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        cbeiVar.c = rD;
        cbeiVar.d = this.c.bB();
        cbeiVar.e = this.c.wd();
        cbeiVar.f = this.c.wq();
        cbeiVar.g = dxjc.c(this.c.aK());
        cbeiVar.ad = dxjc.c(this.c.eW.il());
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        cbeiVar.ae = rp;
        cbeiVar.af = dxjc.c(this.c.ub());
        cbeiVar.ag = dxjc.c(this.c.az());
        cbeiVar.ah = this.c.vz();
        cbeiVar.ai = cbdy.b();
        dzsj dzsjVar = this.f;
        if (dzsjVar == null) {
            dzsjVar = new frf(this, 0);
            this.f = dzsjVar;
        }
        ftt fttVar = this.c;
        cbeiVar.aj = new cbca(dzsjVar, fttVar.eV, fttVar.vA(), this.c.eW.mL());
        cbeiVar.ak = dxjc.c(this.c.as());
        cbeiVar.al = dxjc.c(this.c.cu());
        cbeiVar.am = dxjc.c(this.c.dE());
        ckcw rU = this.c.eW.a.rU();
        dxjg.e(rU);
        cbeiVar.an = rU;
        dzsj b = b();
        ftt fttVar2 = this.c;
        cbeiVar.ao = new cbcq(b, fttVar2.eV, fttVar2.eW.V());
        dzsj b2 = b();
        ftt fttVar3 = this.c;
        cbeiVar.ap = new cbcc(b2, fttVar3.eV, fttVar3.eW.il(), this.c.eW.V());
        cbeiVar.aq = new cbes(this.c.ad(), dxjh.c(this.c.tV()));
        cbeiVar.ar = new cbco(this.c.eW.er(), dxjh.c(this.c.eW.il()), this.c.eS(), dxjh.c(this.c.cD()));
        dzsj<bwqv> er = this.c.eW.er();
        dzsj<gga> ad = this.c.ad();
        dzsj<cqhn> il = this.c.eW.il();
        dzsj c = dxjh.c(this.c.bf());
        dzsj c2 = dxjh.c(this.c.tV());
        dzsj<bbpv> ba = this.c.eW.ba();
        dzsj<akfa> p = this.c.eW.p();
        dzsj c3 = dxjh.c(this.c.eW.jb());
        dzsj dzsjVar2 = this.h;
        if (dzsjVar2 == null) {
            dzsjVar2 = new frf(this, 2);
            this.h = dzsjVar2;
        }
        cbeiVar.as = new cbdq(er, ad, il, c, c2, ba, p, c3, dzsjVar2, this.c.vA());
        dzsj dzsjVar3 = this.i;
        if (dzsjVar3 == null) {
            dzsjVar3 = new frf(this, 3);
            this.i = dzsjVar3;
        }
        cbeiVar.at = new cbew(dzsjVar3, this.c.y(), dxjh.c(this.c.eW.il()), this.c.vC(), this.c.eW.mL(), this.c.ad());
        cbeiVar.au = new cjxo(this.c.a);
        cbeiVar.av = this.c.eW.jh();
    }
}
