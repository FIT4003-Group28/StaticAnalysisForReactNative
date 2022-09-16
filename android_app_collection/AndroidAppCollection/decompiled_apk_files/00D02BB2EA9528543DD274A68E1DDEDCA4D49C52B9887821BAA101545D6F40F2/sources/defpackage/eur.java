package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eur  reason: default package */
/* loaded from: classes6.dex */
final class eur implements dxis {
    final /* synthetic */ ftt a;

    public eur(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aazh aazhVar = (aazh) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aazhVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aazhVar.aI = tr;
        aazhVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aazhVar.aK = sU;
        aazhVar.aL = new cpv();
        aazhVar.aM = dxjc.c(this.a.eW.ie());
        aazhVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aazhVar.a = new bvts(this.a.am(), this.a.y(), this.a.ad(), this.a.af());
    }
}
