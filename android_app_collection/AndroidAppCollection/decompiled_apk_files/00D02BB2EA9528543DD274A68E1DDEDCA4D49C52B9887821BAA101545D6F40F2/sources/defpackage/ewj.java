package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ewj  reason: default package */
/* loaded from: classes6.dex */
final class ewj implements dxis {
    final /* synthetic */ ftt a;

    public ewj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bvtq bvtqVar = (bvtq) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bvtqVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bvtqVar.aI = tr;
        bvtqVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bvtqVar.aK = sU;
        bvtqVar.aL = new cpv();
        bvtqVar.aM = dxjc.c(this.a.eW.ie());
        bvtqVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bvtqVar.a = this.a.wq();
        bvtqVar.b = new bvts(this.a.am(), this.a.y(), this.a.ad(), this.a.af());
    }
}
