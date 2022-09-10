package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ffx  reason: default package */
/* loaded from: classes6.dex */
public final class ffx implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<abss> b;
    private volatile dzsj<abtc> c;
    private volatile dzsj<abtd> d;
    private volatile dzsj<abtu> e;

    public ffx(ftt fttVar) {
        this.a = fttVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bupb] */
    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        abep abepVar = (abep) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        abepVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        abepVar.aI = tr;
        abepVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        abepVar.aK = sU;
        abepVar.aL = new cpv();
        abepVar.aM = dxjc.c(this.a.eW.ie());
        abepVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        abfa dJ = this.a.eW.dJ();
        ?? tW = this.a.tW();
        anhk qm = this.a.eW.qm();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        abepVar.a = abfh.b(dJ, tW, qm, rp);
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new ffw(this, 0);
            this.b = dzsjVar;
        }
        abepVar.b = new abtn(dzsjVar);
        dzsj<gga> ad = this.a.ad();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<cjqy> al = this.a.eW.al();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ffw(this, 1);
            this.c = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.d;
        if (dzsjVar4 == null) {
            dzsjVar4 = new ffw(this, 2);
            this.d = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<dehq> kb = this.a.eW.kb();
        dzsj dzsjVar6 = this.e;
        if (dzsjVar6 == null) {
            dzsjVar6 = new ffw(this, 3);
            this.e = dzsjVar6;
        }
        abepVar.c = new abtt(ad, il, al, dzsjVar3, dzsjVar5, kb, dzsjVar6);
        this.a.eW.dJ();
        abepVar.d = new aber(new abuq(this.a.ad(), this.a.eW.k(), this.a.pl(), this.a.dF(), this.a.as(), this.a.eW.kf(), dxjh.c(this.a.eW.mq()), dxjh.c(this.a.az())));
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        abepVar.e = tn;
        abepVar.f = this.a.wq();
        abepVar.g = this.a.wl();
        abepVar.ad = new jmz();
    }
}
