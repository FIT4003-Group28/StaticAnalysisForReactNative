package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: foh  reason: default package */
/* loaded from: classes6.dex */
final class foh implements dxis {
    final /* synthetic */ ftt a;

    public foh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bmln bmlnVar = (bmln) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bmlnVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bmlnVar.aI = tr;
        bmlnVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bmlnVar.aK = sU;
        bmlnVar.aL = new cpv();
        bmlnVar.aM = dxjc.c(this.a.eW.ie());
        bmlnVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bmlnVar.ar = new bgqo(this.a.eW.V());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bmlnVar.a = rD;
        bmlnVar.b = this.a.wl();
        bmlnVar.c = new bmmy(this.a.nB());
    }
}
