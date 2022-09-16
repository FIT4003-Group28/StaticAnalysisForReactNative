package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fme  reason: default package */
/* loaded from: classes6.dex */
final class fme implements dxis {
    final /* synthetic */ ftt a;
    private volatile bulc b;
    private volatile buky c;

    public fme(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bwey bweyVar = (bwey) obj;
        bweyVar.ad = this.a.wl();
        bweyVar.ae = this.a.wk();
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bweyVar.af = tr;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bweyVar.ag = tp;
        bweyVar.av = this.a.td();
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        bweyVar.ah = rK;
        bweyVar.ai = new bwig(this.a.ad(), this.a.eW.il());
        bweyVar.aj = new bwic(this.a.ad(), this.a.eW.V(), this.a.gW());
        bweyVar.ak = new bwik(this.a.ad());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        ((bwdr) bweyVar).al = rD;
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        bweyVar.am = rp;
        bulc bulcVar = this.b;
        if (bulcVar == null) {
            dxio c = dxjc.c(this.a.eW.h());
            bvrb tn = this.a.eW.a.tn();
            dxjg.e(tn);
            bulcVar = bule.b(buld.b(c, tn));
            this.b = bulcVar;
        }
        buky bukyVar = this.c;
        if (bukyVar == null) {
            dxio c2 = dxjc.c(this.a.eW.h());
            bvrb tn2 = this.a.eW.a.tn();
            dxjg.e(tn2);
            bukyVar = bula.b(bukz.b(c2, tn2));
            this.c = bukyVar;
        }
        Executor sV = this.a.eW.a.sV();
        dxjg.e(sV);
        bweyVar.an = bwff.b(bulcVar, bukyVar, sV);
        bweyVar.ao = this.a.te();
        bweyVar.ap = dxjc.c(this.a.m());
        bweyVar.aq = this.a.eW.fB();
        bweyVar.ar = this.a.eW.fA();
        dehq tg = this.a.eW.a.tg();
        dxjg.e(tg);
        bweyVar.as = tg;
        bweyVar.ax = new bwie(this.a.eW.p());
    }
}
