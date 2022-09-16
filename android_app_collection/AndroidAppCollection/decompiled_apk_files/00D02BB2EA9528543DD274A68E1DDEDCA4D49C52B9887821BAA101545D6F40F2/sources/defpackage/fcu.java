package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fcu  reason: default package */
/* loaded from: classes6.dex */
public final class fcu implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<yon> b;
    private volatile dzsj<yos> c;

    public fcu(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        yig yigVar = (yig) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        yigVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        yigVar.aI = tr;
        yigVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        yigVar.aK = sU;
        yigVar.aL = new cpv();
        yigVar.aM = dxjc.c(this.a.eW.ie());
        yigVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        yigVar.f = dxjc.c(this.a.cz());
        yigVar.a = this.a.wl();
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqhn> il = fttVar.eW.il();
        dzsj<cqhu> eS = this.a.eS();
        dzsj<vwv> lH = this.a.eW.lH();
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fct(this, 0);
            this.b = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.c;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fct(this, 1);
            this.c = dzsjVar4;
        }
        yigVar.b = new yoi(dzsjVar, il, eS, lH, dzsjVar3, dzsjVar4);
    }
}
