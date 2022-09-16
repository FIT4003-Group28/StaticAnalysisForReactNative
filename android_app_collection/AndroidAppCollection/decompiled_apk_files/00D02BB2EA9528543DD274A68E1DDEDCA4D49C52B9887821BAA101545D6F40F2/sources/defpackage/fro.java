package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fro  reason: default package */
/* loaded from: classes6.dex */
final class fro implements dxis {
    final /* synthetic */ ftt a;

    public fro(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cgfc cgfcVar = (cgfc) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cgfcVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cgfcVar.aI = tr;
        cgfcVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cgfcVar.aK = sU;
        cgfcVar.aL = new cpv();
        cgfcVar.aM = dxjc.c(this.a.eW.ie());
        cgfcVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cgfcVar.f = dxjc.c(this.a.cz());
        cgfcVar.a = this.a.wl();
    }
}
