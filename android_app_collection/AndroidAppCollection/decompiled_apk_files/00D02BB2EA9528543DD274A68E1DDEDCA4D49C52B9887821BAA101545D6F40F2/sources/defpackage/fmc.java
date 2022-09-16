package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fmc  reason: default package */
/* loaded from: classes6.dex */
final class fmc implements dxis {
    final /* synthetic */ ftt a;
    private volatile bulc b;
    private volatile buky c;

    public fmc(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bwew bwewVar = (bwew) obj;
        bwewVar.ad = this.a.wl();
        bwewVar.ae = this.a.wk();
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bwewVar.af = tr;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bwewVar.ag = tp;
        bwewVar.av = this.a.td();
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        bwewVar.ah = rK;
        bwewVar.ai = new bwig(this.a.ad(), this.a.eW.il());
        bwewVar.aj = new bwic(this.a.ad(), this.a.eW.V(), this.a.gW());
        bwewVar.ak = new bwik(this.a.ad());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        ((bwdr) bwewVar).al = rD;
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        bwewVar.am = rp;
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
        bwewVar.an = bwff.b(bulcVar, bukyVar, sV);
        bwewVar.ao = this.a.te();
        bwewVar.ap = dxjc.c(this.a.m());
        bwewVar.aq = this.a.eW.fB();
        bwewVar.ar = this.a.eW.fA();
        dehq tg = this.a.eW.a.tg();
        dxjg.e(tg);
        bwewVar.as = tg;
        bwewVar.ax = new bwie(this.a.eW.p());
        bwewVar.ay = new azev();
        this.a.eW.fm();
        bwewVar.az = this.a.eW.rG();
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bwewVar.aA = sU;
    }
}
