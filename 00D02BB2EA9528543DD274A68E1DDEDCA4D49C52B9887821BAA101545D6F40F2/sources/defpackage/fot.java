package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fot  reason: default package */
/* loaded from: classes6.dex */
public final class fot implements dxis {
    public volatile dzsj a;
    public volatile dzsj<cdaq> b;
    final /* synthetic */ ftt c;
    private volatile dzsj d;

    public fot(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdbb cdbbVar = (cdbb) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        cdbbVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        cdbbVar.aI = tr;
        cdbbVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        cdbbVar.aK = sU;
        cdbbVar.aL = new cpv();
        cdbbVar.aM = dxjc.c(this.c.eW.ie());
        cdbbVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        cdbbVar.e = this.c.wl();
        cdbbVar.f = this.c.wq();
        cdbbVar.g = this.c.fC();
        cdbbVar.ad = dxjc.c(this.c.aR());
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        cdbbVar.ae = rD;
        cdbbVar.af = new cdem(this.c.ad());
        dzsj<gga> ad = this.c.ad();
        dzsj<Executor> di = this.c.eW.di();
        dzsj<cqhn> il = this.c.eW.il();
        dzsj c = dxjh.c(this.c.aR());
        dzsj<cdfx> fD = this.c.fD();
        dzsj dzsjVar = this.d;
        if (dzsjVar == null) {
            dzsjVar = new fos(this, 0);
            this.d = dzsjVar;
        }
        cdbbVar.ag = new cdey(ad, di, il, c, fD, dzsjVar, this.c.fe(), this.c.eW.V(), this.c.eW.aw(), this.c.eW.p(), this.c.eW.al(), this.c.eW.at(), this.c.eW.bh(), this.c.ks(), this.c.fP());
        cdbbVar.ah = new cdam(this.c.eW.il(), this.c.eS(), this.c.lf(), this.c.eW.V());
        cdbbVar.ai = this.c.eW.qm();
        cdbbVar.aj = this.c.p();
        cdbbVar.ak = this.c.eW.aH();
        cdbbVar.al = this.c.wd();
        cdbbVar.am = this.c.gD();
        bvrb tn = this.c.eW.a.tn();
        dxjg.e(tn);
        cdbbVar.an = tn;
        cdbbVar.ao = this.c.h();
        cdbbVar.ap = this.c.fL();
        cdbbVar.aq = dxjc.c(this.c.eW.k());
        dxio c2 = dxjc.c(this.c.T());
        axrg aH = this.c.eW.aH();
        dxio c3 = dxjc.c(this.c.eW.aw());
        dxio c4 = dxjc.c(this.c.eW.p());
        ftt fttVar = this.c;
        cdbbVar.ar = new bbux(c2, aH, c3, c4, fttVar.a, dxjc.c(fttVar.eW.at()), dxjc.c(this.c.eW.V()));
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        cdbbVar.as = rp;
        cdbbVar.at = this.c.wk();
        Executor sU2 = this.c.eW.a.sU();
        dxjg.e(sU2);
        cdbbVar.au = sU2;
        cdbbVar.av = this.c.tm();
        cdbbVar.aw = this.c.eW.fe();
    }
}
