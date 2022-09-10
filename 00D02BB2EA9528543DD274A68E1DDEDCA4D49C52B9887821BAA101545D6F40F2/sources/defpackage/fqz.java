package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqz  reason: default package */
/* loaded from: classes6.dex */
public final class fqz implements dxis {
    public volatile dzsj<aqrl> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<aqsj> c;

    public fqz(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aqrx aqrxVar = (aqrx) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        aqrxVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        aqrxVar.aI = tr;
        aqrxVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        aqrxVar.aK = sU;
        aqrxVar.aL = new cpv();
        aqrxVar.aM = dxjc.c(this.b.eW.ie());
        aqrxVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        aqrxVar.f = dxjc.c(this.b.cz());
        this.b.eW.cm();
        aqrxVar.a = this.b.wl();
        aqrxVar.b = this.b.lQ();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fqy(this, 0);
            this.c = dzsjVar;
        }
        aqrxVar.c = dxjc.c(dzsjVar);
        dehq tf = this.b.eW.a.tf();
        dxjg.e(tf);
        aqrxVar.d = tf;
    }
}
