package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fdn  reason: default package */
/* loaded from: classes6.dex */
public final class fdn implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bnfb> b;
    private volatile dzsj<bnfe> c;
    private volatile dzsj<bgpu> d;

    public fdn(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bnae bnaeVar = (bnae) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bnaeVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bnaeVar.aI = tr;
        bnaeVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bnaeVar.aK = sU;
        bnaeVar.aL = new cpv();
        bnaeVar.aM = dxjc.c(this.a.eW.ie());
        bnaeVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bnaeVar.a = rD;
        bnaeVar.b = this.a.wl();
        dzsj<gga> ad = this.a.ad();
        dzsj<bwqv> er = this.a.eW.er();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fdm(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fdm(this, 1);
            this.c = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.d;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fdm(this, 2);
            this.d = dzsjVar5;
        }
        bnaeVar.c = new bnfh(ad, er, dzsjVar2, dzsjVar4, dzsjVar5, this.a.l());
    }
}
