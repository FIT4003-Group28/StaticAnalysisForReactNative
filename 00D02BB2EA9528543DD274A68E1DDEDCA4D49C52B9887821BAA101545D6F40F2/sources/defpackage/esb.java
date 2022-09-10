package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: esb  reason: default package */
/* loaded from: classes6.dex */
public final class esb implements dxis {
    final /* synthetic */ ese a;
    private volatile dzsj<trj> b;

    public esb(ese eseVar) {
        this.a = eseVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tnr tnrVar = (tnr) obj;
        cjqq tp = this.a.y.eW.a.tp();
        dxjg.e(tp);
        tnrVar.aH = tp;
        cjqy tr = this.a.y.eW.a.tr();
        dxjg.e(tr);
        tnrVar.aI = tr;
        tnrVar.aJ = dbsg.i(this.a.y.ap());
        Executor sU = this.a.y.eW.a.sU();
        dxjg.e(sU);
        tnrVar.aK = sU;
        tnrVar.aL = new cpv();
        tnrVar.aM = dxjc.c(this.a.y.eW.ie());
        tnrVar.aN = dxjc.c(this.a.y.eW.iU());
        dxjc.c(this.a.y.lx());
        tnrVar.b = this.a.y.wq();
        tnrVar.c = dxjc.c(this.a.y.eW.p());
        tnrVar.d = this.a.y.wl();
        dzsj<rb> dzsjVar = this.a.y.eV;
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new esa(this);
            this.b = dzsjVar2;
        }
        tnrVar.e = new tro(dzsjVar, dzsjVar2, this.a.y.eW.dv(), this.a.y.eW.dv(), this.a.y.bw(), this.a.y.eW.il());
    }
}
