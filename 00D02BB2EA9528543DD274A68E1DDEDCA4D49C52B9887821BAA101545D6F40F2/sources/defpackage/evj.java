package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: evj  reason: default package */
/* loaded from: classes6.dex */
final class evj implements dxis {
    final /* synthetic */ ftt a;

    public evj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        gel gelVar = (gel) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        gelVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        gelVar.aI = tr;
        gelVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        gelVar.aK = sU;
        gelVar.aL = new cpv();
        gelVar.aM = dxjc.c(this.a.eW.ie());
        gelVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        gelVar.a = this.a.wq();
        gelVar.b = this.a.ge();
    }
}
