package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eum  reason: default package */
/* loaded from: classes6.dex */
public final class eum implements dxis {
    public volatile dzsj<aaph> a;
    public volatile dzsj<busw> b;
    final /* synthetic */ ftt c;
    public volatile busw d;
    private volatile dzsj<aapl> e;

    public eum(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aaoj aaojVar = (aaoj) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        aaojVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        aaojVar.aI = tr;
        aaojVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        aaojVar.aK = sU;
        aaojVar.aL = new cpv();
        aaojVar.aM = dxjc.c(this.c.eW.ie());
        aaojVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        aaojVar.a = this.c.wl();
        aaojVar.b = this.c.wq();
        dzsj<gga> ad = this.c.ad();
        dzsj<cqhn> il = this.c.eW.il();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new eul(this, 0);
            this.e = dzsjVar;
        }
        aaojVar.c = new aapr(ad, il, dzsjVar, this.c.fe(), dxjh.c(this.c.rn()), this.c.eW.mL(), dxjh.c(this.c.tU()), dxjh.c(this.c.tT()));
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        aaojVar.d = rp;
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        aaojVar.e = rD;
    }
}
