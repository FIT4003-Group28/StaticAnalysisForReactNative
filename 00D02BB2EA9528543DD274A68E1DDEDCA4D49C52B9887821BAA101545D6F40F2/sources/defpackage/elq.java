package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: elq  reason: default package */
/* loaded from: classes6.dex */
final class elq implements dxis {
    final /* synthetic */ ftt a;

    public elq(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bpdw bpdwVar = (bpdw) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bpdwVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bpdwVar.aI = tr;
        bpdwVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bpdwVar.aK = sU;
        bpdwVar.aL = new cpv();
        bpdwVar.aM = dxjc.c(this.a.eW.ie());
        bpdwVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bpdwVar.f = dxjc.c(this.a.cz());
        bpdwVar.c = this.a.wl();
        dxjg.e(this.a.eW.a.rD());
        bpdwVar.d = this.a.wd();
        dxjg.e(this.a.eW.a.rp());
    }
}
