package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fmi  reason: default package */
/* loaded from: classes6.dex */
final class fmi implements dxis {
    final /* synthetic */ ftt a;
    private volatile bulc b;
    private volatile buky c;

    public fmi(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bwfh bwfhVar = (bwfh) obj;
        bwfhVar.ad = this.a.wl();
        bwfhVar.ae = this.a.wk();
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bwfhVar.af = tr;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bwfhVar.ag = tp;
        bwfhVar.av = this.a.td();
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        bwfhVar.ah = rK;
        bwfhVar.ai = new bwig(this.a.ad(), this.a.eW.il());
        bwfhVar.aj = new bwic(this.a.ad(), this.a.eW.V(), this.a.gW());
        bwfhVar.ak = new bwik(this.a.ad());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        ((bwdr) bwfhVar).al = rD;
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        bwfhVar.am = rp;
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
        bwfhVar.an = bwff.b(bulcVar, bukyVar, sV);
        bwfhVar.ao = this.a.te();
        bwfhVar.ap = dxjc.c(this.a.m());
        bwfhVar.aq = this.a.eW.fB();
        bwfhVar.ar = this.a.eW.fA();
        dehq tg = this.a.eW.a.tg();
        dxjg.e(tg);
        bwfhVar.as = tg;
    }
}
