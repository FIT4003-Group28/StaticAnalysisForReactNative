package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fff  reason: default package */
/* loaded from: classes6.dex */
public final class fff implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bdis> b;
    private volatile dzsj<bdin> c;

    public fff(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bdgy bdgyVar = (bdgy) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bdgyVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bdgyVar.aI = tr;
        bdgyVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bdgyVar.aK = sU;
        bdgyVar.aL = new cpv();
        bdgyVar.aM = dxjc.c(this.a.eW.ie());
        bdgyVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bdgyVar.b = rD;
        bdgyVar.c = this.a.wl();
        bdgyVar.d = this.a.wq();
        bdgyVar.e = dxjc.c(this.a.eW.bu());
        dzsj<gga> ad = this.a.ad();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<buti> my = this.a.eW.my();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new ffe(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<bbut> bf = this.a.bf();
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ffe(this, 1);
            this.c = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj<gdc> lD = this.a.lD();
        ftt fttVar = this.a;
        dzsj dzsjVar5 = fttVar.dA;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fns(fttVar, 1371);
            fttVar.dA = dzsjVar5;
        }
        bdgyVar.f = new bdjd(ad, il, my, dzsjVar2, bf, dzsjVar4, lD, dzsjVar5);
    }
}
