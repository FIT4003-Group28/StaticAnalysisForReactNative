package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqi  reason: default package */
/* loaded from: classes6.dex */
public final class fqi implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<aplj> b;

    public fqi(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apmg apmgVar = (apmg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        apmgVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        apmgVar.aI = tr;
        apmgVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        apmgVar.aK = sU;
        apmgVar.aL = new cpv();
        apmgVar.aM = dxjc.c(this.a.eW.ie());
        apmgVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        apmgVar.a = this.a.ak();
        apmgVar.b = this.a.lN();
        apmgVar.c = this.a.wl();
        apmgVar.d = this.a.ac();
        bvtd ba = this.a.eW.a.ba();
        dxjg.e(ba);
        apmgVar.at = ba;
        apmgVar.e = new aplp(this.a.ae());
        this.a.wk();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fqh(this);
            this.b = dzsjVar;
        }
        apmgVar.f = new apmn(dzsjVar, this.a.eW.il());
        ckox u = this.a.eW.a.u();
        dxjg.e(u);
        apmgVar.g = u;
        apmgVar.ad = this.a.ag();
        apmgVar.ae = new apll(this.a.ad());
        dxio c = dxjc.c(this.a.fy());
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        apmgVar.af = anlf.b(c, tn, sU2);
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        apmgVar.ag = rp;
        apmgVar.ah = this.a.ai();
        gce sC = this.a.eW.a.sC();
        dxjg.e(sC);
        apmgVar.ai = sC;
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        apmgVar.aj = rz;
        apmgVar.ak = new ftb(this.a);
        Executor sU3 = this.a.eW.a.sU();
        dxjg.e(sU3);
        apmgVar.al = sU3;
        dehq tg = this.a.eW.a.tg();
        dxjg.e(tg);
        apmgVar.am = tg;
    }
}
