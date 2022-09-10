package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fpv  reason: default package */
/* loaded from: classes6.dex */
public final class fpv implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<xhq> b;

    public fpv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        xhl xhlVar = (xhl) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        xhlVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        xhlVar.aI = tr;
        xhlVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        xhlVar.aK = sU;
        xhlVar.aL = new cpv();
        xhlVar.aM = dxjc.c(this.a.eW.ie());
        xhlVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        xhlVar.f = dxjc.c(this.a.cz());
        xhlVar.a = this.a.wl();
        dxjg.e(this.a.eW.a.tr());
        dzsj<gga> ad = this.a.ad();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fpu(this);
            this.b = dzsjVar;
        }
        xhlVar.b = new xho(ad, dzsjVar, dxjh.c(this.a.m()), this.a.eW.V(), this.a.eW.at());
        xhlVar.c = this.a.eW.mg();
        Executor sU2 = this.a.eW.a.sU();
        dxjg.e(sU2);
        xhlVar.d = sU2;
    }
}
