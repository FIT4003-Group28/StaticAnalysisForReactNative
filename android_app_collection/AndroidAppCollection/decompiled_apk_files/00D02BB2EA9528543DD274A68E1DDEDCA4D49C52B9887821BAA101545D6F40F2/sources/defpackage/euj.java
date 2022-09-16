package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: euj  reason: default package */
/* loaded from: classes6.dex */
public final class euj implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<aafq> b;
    private volatile dzsj c;

    public euj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aaec aaecVar = (aaec) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aaecVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aaecVar.aI = tr;
        aaecVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aaecVar.aK = sU;
        aaecVar.aL = new cpv();
        aaecVar.aM = dxjc.c(this.a.eW.ie());
        aaecVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aaecVar.f = dxjc.c(this.a.cz());
        aaecVar.a = this.a.wl();
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqhn> il = fttVar.eW.il();
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eui(this, 0);
            this.b = dzsjVar2;
        }
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eui(this, 1);
            this.c = dzsjVar3;
        }
        aaecVar.b = new aafm(dzsjVar, il, dzsjVar2, dzsjVar3);
    }
}
