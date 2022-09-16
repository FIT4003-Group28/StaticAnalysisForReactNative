package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: est  reason: default package */
/* loaded from: classes6.dex */
final class est implements dxis {
    final /* synthetic */ ftt a;

    public est(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        azrs azrsVar = (azrs) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        azrsVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        azrsVar.aI = tr;
        azrsVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        azrsVar.aK = sU;
        azrsVar.aL = new cpv();
        azrsVar.aM = dxjc.c(this.a.eW.ie());
        azrsVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        azrsVar.a = new bxmc(dxjh.c(this.a.eW.er()));
    }
}
