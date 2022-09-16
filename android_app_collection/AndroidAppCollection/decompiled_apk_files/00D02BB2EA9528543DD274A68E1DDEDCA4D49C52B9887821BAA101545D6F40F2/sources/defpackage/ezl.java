package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ezl  reason: default package */
/* loaded from: classes6.dex */
public final class ezl implements dxis {
    public volatile dzsj<benm> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<apny> c;
    private volatile dzsj<bgyb> d;
    private volatile dzsj<bepv> e;
    private volatile dzsj<beni> f;

    public ezl(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        benf benfVar = (benf) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        benfVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        benfVar.aI = tr;
        benfVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        benfVar.aK = sU;
        benfVar.aL = new cpv();
        benfVar.aM = dxjc.c(this.b.eW.ie());
        benfVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        ftt fttVar = this.b;
        benfVar.b = fttVar.a;
        benfVar.c = dxjc.c(fttVar.ti());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        benfVar.d = rD;
        ((beiv) benfVar).e = this.b.cp();
        benfVar.f = this.b.eW.ni();
        benfVar.g = this.b.wq();
        dzsj<rb> dzsjVar = this.b.eV;
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ezk(this, 0);
            this.c = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<cqhn> il = this.b.eW.il();
        dzsj dzsjVar4 = this.d;
        if (dzsjVar4 == null) {
            dzsjVar4 = new ezk(this, 1);
            this.d = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.e;
        if (dzsjVar6 == null) {
            dzsjVar6 = new ezk(this, 2);
            this.e = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj<beio> nm = this.b.eW.nm();
        fyu fyuVar = this.b.eW;
        dzsj dzsjVar8 = fyuVar.dr;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fxy(fyuVar, 637);
            fyuVar.dr = dzsjVar8;
        }
        dzsj dzsjVar9 = this.f;
        if (dzsjVar9 == null) {
            dzsjVar9 = new ezk(this, 3);
            this.f = dzsjVar9;
        }
        benfVar.ah = new benl(dzsjVar, dzsjVar3, il, dzsjVar5, dzsjVar7, nm, dzsjVar8, dzsjVar9, this.b.eW.di());
        benfVar.ai = this.b.wl();
    }
}
