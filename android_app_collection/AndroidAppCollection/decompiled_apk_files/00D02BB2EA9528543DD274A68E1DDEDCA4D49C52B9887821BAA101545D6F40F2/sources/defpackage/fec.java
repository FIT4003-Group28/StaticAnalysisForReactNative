package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fec  reason: default package */
/* loaded from: classes6.dex */
final class fec implements dxis {
    final /* synthetic */ ftt a;

    public fec(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        azqt azqtVar = (azqt) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        azqtVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        azqtVar.aI = tr;
        azqtVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        azqtVar.aK = sU;
        azqtVar.aL = new cpv();
        azqtVar.aM = dxjc.c(this.a.eW.ie());
        azqtVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        azqtVar.f = dxjc.c(this.a.cz());
        dxjg.e(this.a.eW.a.tr());
        azqtVar.a = dxjc.c(this.a.eU());
    }
}
