package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fbr  reason: default package */
/* loaded from: classes6.dex */
public final class fbr implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<ccrf> b;
    private volatile dzsj<cctx> c;

    public fbr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cclf cclfVar = (cclf) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cclfVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cclfVar.aI = tr;
        cclfVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cclfVar.aK = sU;
        cclfVar.aL = new cpv();
        cclfVar.aM = dxjc.c(this.a.eW.ie());
        cclfVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cclfVar.a = new ccyz(this.a.eW.il());
        cclfVar.b = this.a.wl();
        cclfVar.c = this.a.wk();
        cclfVar.d = this.a.wq();
        cclfVar.e = dxjc.c(this.a.qw());
        cclfVar.f = dxjc.c(this.a.bf());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        cclfVar.g = rD;
        dzsj<Executor> di = this.a.eW.di();
        dzsj<bbpv> ba = this.a.eW.ba();
        dzsj<bbrq> jb = this.a.eW.jb();
        dzsj<chhr> uu = this.a.uu();
        dzsj<ccrh> uA = this.a.uA();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fbq(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<akfa> p = this.a.eW.p();
        dzsj<cctn> uy = this.a.uy();
        dzsj<ccru> uB = this.a.uB();
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fbq(this, 1);
            this.c = dzsjVar3;
        }
        cclfVar.ad = new ccsk(di, ba, jb, uu, uA, dzsjVar2, p, uy, uB, dzsjVar3);
    }
}
