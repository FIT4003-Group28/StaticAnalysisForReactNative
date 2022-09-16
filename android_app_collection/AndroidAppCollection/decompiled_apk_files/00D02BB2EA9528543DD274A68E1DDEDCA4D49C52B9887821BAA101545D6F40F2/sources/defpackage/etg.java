package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: etg  reason: default package */
/* loaded from: classes6.dex */
final class etg implements dxis {
    final /* synthetic */ ftt a;

    public etg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bcba bcbaVar = (bcba) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bcbaVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bcbaVar.aI = tr;
        bcbaVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bcbaVar.aK = sU;
        bcbaVar.aL = new cpv();
        bcbaVar.aM = dxjc.c(this.a.eW.ie());
        bcbaVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        bcbaVar.a = tr2;
        bcbaVar.b = this.a.wq();
        bcbaVar.c = this.a.wl();
        bcbaVar.d = new bcbk(this.a.eW.m());
        bcbaVar.g = this.a.EF();
        bcbaVar.e = this.a.h();
    }
}
