package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ezt  reason: default package */
/* loaded from: classes6.dex */
final class ezt implements dxis {
    final /* synthetic */ ftt a;

    public ezt(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bsub bsubVar = (bsub) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bsubVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bsubVar.aI = tr;
        bsubVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bsubVar.aK = sU;
        bsubVar.aL = new cpv();
        bsubVar.aM = dxjc.c(this.a.eW.ie());
        bsubVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bsubVar.b = this.a.wq();
    }
}
