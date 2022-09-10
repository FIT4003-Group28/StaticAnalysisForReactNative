package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ezn  reason: default package */
/* loaded from: classes6.dex */
final class ezn implements dxis {
    final /* synthetic */ ftt a;

    public ezn(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aqst aqstVar = (aqst) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aqstVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aqstVar.aI = tr;
        aqstVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aqstVar.aK = sU;
        aqstVar.aL = new cpv();
        aqstVar.aM = dxjc.c(this.a.eW.ie());
        aqstVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aqstVar.a = this.a.wl();
        ftt fttVar = this.a;
        aqstVar.b = new aqvj(fttVar.eV, fttVar.eW.ip());
        aqstVar.c = this.a.wq();
        aqstVar.d = this.a.eW.iH();
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        aqstVar.e = rK;
        Executor sV = this.a.eW.a.sV();
        dxjg.e(sV);
        aqstVar.f = sV;
        dehq tf = this.a.eW.a.tf();
        dxjg.e(tf);
        aqstVar.g = tf;
    }
}
