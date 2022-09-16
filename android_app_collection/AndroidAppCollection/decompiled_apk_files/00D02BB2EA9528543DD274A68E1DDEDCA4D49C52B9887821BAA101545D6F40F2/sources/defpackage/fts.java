package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fts  reason: default package */
/* loaded from: classes6.dex */
final class fts implements dxis {
    final /* synthetic */ ftt a;

    public fts(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ckvr ckvrVar = (ckvr) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ckvrVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ckvrVar.aI = tr;
        ckvrVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ckvrVar.aK = sU;
        ckvrVar.aL = new cpv();
        ckvrVar.aM = dxjc.c(this.a.eW.ie());
        ckvrVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ckvrVar.f = dxjc.c(this.a.cz());
        ckvrVar.a = this.a.eW.qP();
        awfh qP = this.a.eW.qP();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        ckvrVar.b = new ckvt(qP, rp);
    }
}
