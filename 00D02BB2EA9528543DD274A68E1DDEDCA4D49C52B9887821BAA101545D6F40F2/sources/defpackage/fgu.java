package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fgu  reason: default package */
/* loaded from: classes6.dex */
public final class fgu implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<abss> b;
    private volatile dzsj<abtc> c;
    private volatile dzsj<abtd> d;
    private volatile dzsj<abtu> e;

    public fgu(ftt fttVar) {
        this.a = fttVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, bupb] */
    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        abet abetVar = (abet) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        abetVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        abetVar.aI = tr;
        abetVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        abetVar.aK = sU;
        abetVar.aL = new cpv();
        abetVar.aM = dxjc.c(this.a.eW.ie());
        abetVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        abetVar.a = this.a.eW.dJ();
        abfa dJ = this.a.eW.dJ();
        ?? tW = this.a.tW();
        anhk qm = this.a.eW.qm();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        abetVar.b = abfh.b(dJ, tW, qm, rp);
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fgt(this, 0);
            this.b = dzsjVar;
        }
        abetVar.c = new abtn(dzsjVar);
        dzsj<gga> ad = this.a.ad();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<cjqy> al = this.a.eW.al();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fgt(this, 1);
            this.c = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.d;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fgt(this, 2);
            this.d = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<dehq> kb = this.a.eW.kb();
        dzsj dzsjVar6 = this.e;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fgt(this, 3);
            this.e = dzsjVar6;
        }
        abetVar.d = new abtt(ad, il, al, dzsjVar3, dzsjVar5, kb, dzsjVar6);
        this.a.eW.dJ();
        abetVar.e = new abeu(new abvg(this.a.rs()));
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        abetVar.f = tn;
        abetVar.g = this.a.wq();
        abetVar.ad = this.a.wl();
        abetVar.ae = new jmz();
    }
}
