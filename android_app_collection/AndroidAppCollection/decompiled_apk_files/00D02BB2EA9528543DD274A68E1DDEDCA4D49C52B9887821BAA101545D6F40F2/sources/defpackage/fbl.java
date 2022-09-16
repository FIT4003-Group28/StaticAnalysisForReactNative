package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fbl  reason: default package */
/* loaded from: classes6.dex */
public final class fbl implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<ccyl> b;
    private volatile dzsj<cctx> c;

    public fbl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ccko cckoVar = (ccko) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cckoVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cckoVar.aI = tr;
        cckoVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cckoVar.aK = sU;
        cckoVar.aL = new cpv();
        cckoVar.aM = dxjc.c(this.a.eW.ie());
        cckoVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cckoVar.a = dxjc.c(this.a.qw());
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj c = dxjh.c(fttVar.qw());
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fbk(this, 0);
            this.b = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<chhr> uu = this.a.uu();
        dzsj<ccrh> uA = this.a.uA();
        dzsj dzsjVar4 = this.c;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fbk(this, 1);
            this.c = dzsjVar4;
        }
        cckoVar.b = new ccys(dzsjVar, c, il, dzsjVar3, uu, uA, dzsjVar4);
        cckoVar.c = this.a.wl();
        cckoVar.d = this.a.wq();
    }
}
