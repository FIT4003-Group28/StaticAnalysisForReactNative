package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: esg  reason: default package */
/* loaded from: classes6.dex */
final class esg implements dxis {
    final /* synthetic */ ftt a;

    public esg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ajqq ajqqVar = (ajqq) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ajqqVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ajqqVar.aI = tr;
        ajqqVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ajqqVar.aK = sU;
        ajqqVar.aL = new cpv();
        ajqqVar.aM = dxjc.c(this.a.eW.ie());
        ajqqVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ajqqVar.f = dxjc.c(this.a.cz());
    }
}
