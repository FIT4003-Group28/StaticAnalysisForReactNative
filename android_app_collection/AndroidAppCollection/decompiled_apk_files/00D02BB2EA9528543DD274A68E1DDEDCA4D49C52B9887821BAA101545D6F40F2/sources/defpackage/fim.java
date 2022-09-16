package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fim  reason: default package */
/* loaded from: classes6.dex */
final class fim implements dxis {
    final /* synthetic */ ftt a;

    public fim(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        afdg afdgVar = (afdg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        afdgVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        afdgVar.aI = tr;
        afdgVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        afdgVar.aK = sU;
        afdgVar.aL = new cpv();
        afdgVar.aM = dxjc.c(this.a.eW.ie());
        afdgVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        afdgVar.a = this.a.wl();
        afdgVar.b = this.a.wq();
        afdgVar.c = dxjc.c(this.a.eW.p());
    }
}
