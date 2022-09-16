package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fke  reason: default package */
/* loaded from: classes6.dex */
final class fke implements dxis {
    final /* synthetic */ ftt a;

    public fke(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        boxz boxzVar = (boxz) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        boxzVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        boxzVar.aI = tr;
        boxzVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        boxzVar.aK = sU;
        boxzVar.aL = new cpv();
        boxzVar.aM = dxjc.c(this.a.eW.ie());
        boxzVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        boxzVar.f = dxjc.c(this.a.cz());
        boxzVar.a = this.a.lE();
    }
}
