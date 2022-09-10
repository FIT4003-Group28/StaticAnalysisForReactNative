package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: etr  reason: default package */
/* loaded from: classes6.dex */
final class etr implements dxis {
    final /* synthetic */ ftt a;
    private volatile buse b;

    public etr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdlu cdluVar = (cdlu) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cdluVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cdluVar.aI = tr;
        cdluVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cdluVar.aK = sU;
        cdluVar.aL = new cpv();
        cdluVar.aM = dxjc.c(this.a.eW.ie());
        cdluVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        cdluVar.a = rD;
        cdluVar.b = this.a.wq();
        cdluVar.c = new cebd(this.a.eW.al(), this.a.uv());
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        cdluVar.d = rp;
        cdluVar.e = cdnl.b(dxjc.c(this.a.aG()), this.a.aC(), bqsp.b(this.a.fL()), cdjn.b(), fyu.vy(), this.a.eW.jc());
        ftt fttVar = this.a;
        cdluVar.f = new cdmx(fttVar.a, fttVar.eC());
        btvo rp2 = this.a.eW.a.rp();
        dxjg.e(rp2);
        ftt fttVar2 = this.a;
        cdluVar.g = bqrw.b(rp2, fttVar2.a, fttVar2.wl(), this.a.eC());
        cdluVar.ad = this.a.eW.bo();
        cdluVar.ae = dxjc.c(this.a.bf());
        ftt fttVar3 = this.a;
        cdluVar.af = cdlw.b(new bquw(fttVar3.a, fttVar3.wk(), this.a.wd()));
        dzsj<bbpz> jd = this.a.eW.jd();
        ftt fttVar4 = this.a;
        dzsj dzsjVar = fttVar4.dY;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar4, 1403);
            fttVar4.dY = dzsjVar;
        }
        cdluVar.ag = new cdkw(jd, dzsjVar);
        cdluVar.ah = this.a.eW.jc();
        if (this.b == null) {
            dxio c = dxjc.c(this.a.eW.h());
            bvrb tn = this.a.eW.a.tn();
            dxjg.e(tn);
            this.b = new buse(new busd(c, tn));
        }
        dxjg.e(this.a.eW.a.tf());
    }
}
