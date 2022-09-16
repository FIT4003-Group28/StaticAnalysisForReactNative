package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: err  reason: default package */
/* loaded from: classes6.dex */
public final class err implements dxis {
    final /* synthetic */ ese a;
    private volatile dzsj<uhx> b;

    public err(ese eseVar) {
        this.a = eseVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ueg uegVar = (ueg) obj;
        cjqq tp = this.a.y.eW.a.tp();
        dxjg.e(tp);
        uegVar.aH = tp;
        cjqy tr = this.a.y.eW.a.tr();
        dxjg.e(tr);
        uegVar.aI = tr;
        uegVar.aJ = dbsg.i(this.a.y.ap());
        Executor sU = this.a.y.eW.a.sU();
        dxjg.e(sU);
        uegVar.aK = sU;
        uegVar.aL = new cpv();
        uegVar.aM = dxjc.c(this.a.y.eW.ie());
        uegVar.aN = dxjc.c(this.a.y.eW.iU());
        dxjc.c(this.a.y.lx());
        Executor sU2 = this.a.y.eW.a.sU();
        dxjg.e(sU2);
        uegVar.a = sU2;
        uegVar.b = this.a.y.wq();
        uegVar.c = this.a.y.wl();
        uegVar.d = this.a.o();
        uegVar.e = this.a.m();
        ftt fttVar = this.a.y;
        uegVar.f = new uhj(fttVar.eV, fttVar.eW.il());
        ftt fttVar2 = this.a.y;
        dzsj<rb> dzsjVar = fttVar2.eV;
        dzsj<cqhn> il = fttVar2.eW.il();
        dzsj<cpv> bk = this.a.y.eW.bk();
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new erq(this);
            this.b = dzsjVar2;
        }
        uegVar.g = new uhs(dzsjVar, il, bk, dzsjVar2, this.a.E());
        uegVar.ad = new uhz(this.a.y.eW.il());
    }
}
