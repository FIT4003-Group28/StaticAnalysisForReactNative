package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: elz  reason: default package */
/* loaded from: classes6.dex */
public final class elz implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<pzh> b;
    private volatile dzsj<pyv> c;
    private final dzsj<pyz> d;

    public elz(ftt fttVar, pyz pyzVar) {
        this.a = fttVar;
        this.d = dxjd.b(pyzVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        pyz pyzVar = (pyz) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        pyzVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        pyzVar.aI = tr;
        pyzVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        pyzVar.aK = sU;
        pyzVar.aL = new cpv();
        pyzVar.aM = dxjc.c(this.a.eW.ie());
        pyzVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        pyzVar.a = this.a.wl();
        pyzVar.b = this.a.wq();
        dzsj<gga> ad = this.a.ad();
        dzsj<pyz> dzsjVar = this.d;
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ely(this, 0);
            this.b = dzsjVar2;
        }
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ely(this, 1);
            this.c = dzsjVar3;
        }
        pyzVar.c = new pzc(ad, dzsjVar, dzsjVar2, dzsjVar3);
    }
}
