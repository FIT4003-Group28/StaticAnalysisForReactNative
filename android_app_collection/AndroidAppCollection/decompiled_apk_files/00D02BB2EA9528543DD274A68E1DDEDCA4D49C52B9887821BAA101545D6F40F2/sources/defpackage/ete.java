package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ete  reason: default package */
/* loaded from: classes6.dex */
final class ete implements dxis {
    final /* synthetic */ ftt a;

    public ete(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aizf aizfVar = (aizf) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aizfVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aizfVar.aI = tr;
        aizfVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aizfVar.aK = sU;
        aizfVar.aL = new cpv();
        aizfVar.aM = dxjc.c(this.a.eW.ie());
        aizfVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        dxjg.e(this.a.eW.a.rp());
        aizfVar.b = this.a.wl();
        aizfVar.c = this.a.wq();
        fyu fyuVar = this.a.eW;
        dzsj dzsjVar = fyuVar.dA;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar, 679);
            fyuVar.dA = dzsjVar;
        }
        aizfVar.d = new aizy(dzsjVar, this.a.eW.il());
    }
}
