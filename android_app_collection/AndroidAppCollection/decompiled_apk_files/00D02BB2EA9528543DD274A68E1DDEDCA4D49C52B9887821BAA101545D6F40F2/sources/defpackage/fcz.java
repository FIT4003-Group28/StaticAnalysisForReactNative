package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fcz  reason: default package */
/* loaded from: classes6.dex */
final class fcz implements dxis {
    final /* synthetic */ ftt a;

    public fcz(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        yii yiiVar = (yii) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        yiiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        yiiVar.aI = tr;
        yiiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        yiiVar.aK = sU;
        yiiVar.aL = new cpv();
        yiiVar.aM = dxjc.c(this.a.eW.ie());
        yiiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        yiiVar.f = dxjc.c(this.a.cz());
        ((yie) yiiVar).a = this.a.wl();
        ftt fttVar = this.a;
        yiiVar.c = new yon(fttVar.eV, fttVar.eW.il(), this.a.eS());
    }
}
