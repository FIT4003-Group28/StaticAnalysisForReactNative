package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ftn  reason: default package */
/* loaded from: classes6.dex */
public final class ftn implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<apvo> b;
    private volatile dzsj<apuy> c;

    public ftn(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        apuz apuzVar = (apuz) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        apuzVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        apuzVar.aI = tr;
        apuzVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        apuzVar.aK = sU;
        apuzVar.aL = new cpv();
        apuzVar.aM = dxjc.c(this.a.eW.ie());
        apuzVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        apuzVar.a = this.a.wq();
        apuzVar.b = this.a.wl();
        dzsj<gga> ad = this.a.ad();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new ftm(this, 0);
            this.b = dzsjVar;
        }
        apuzVar.c = new apvs(ad, dzsjVar, this.a.eW.il());
        apuzVar.d = (aprw) this.a.eW.iM();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ftm(this, 1);
            this.c = dzsjVar2;
        }
        dxjc.c(dzsjVar2);
        ftt fttVar = this.a;
        dzsj dzsjVar3 = fttVar.cO;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fns(fttVar, 1317);
            fttVar.cO = dzsjVar3;
        }
        apuzVar.e = dxjc.c(dzsjVar3);
    }
}
