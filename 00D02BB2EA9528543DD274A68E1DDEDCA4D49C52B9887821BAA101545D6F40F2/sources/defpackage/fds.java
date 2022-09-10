package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fds  reason: default package */
/* loaded from: classes6.dex */
final class fds implements dxis {
    final /* synthetic */ ftt a;

    public fds(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bvui bvuiVar = (bvui) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bvuiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bvuiVar.aI = tr;
        bvuiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bvuiVar.aK = sU;
        bvuiVar.aL = new cpv();
        bvuiVar.aM = dxjc.c(this.a.eW.ie());
        bvuiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bvuiVar.a = new bvts(this.a.am(), this.a.y(), this.a.ad(), this.a.af());
    }
}
