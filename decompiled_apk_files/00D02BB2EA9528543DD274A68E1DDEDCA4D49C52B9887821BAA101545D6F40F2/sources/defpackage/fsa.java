package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fsa  reason: default package */
/* loaded from: classes6.dex */
public final class fsa implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj b;

    public fsa(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cjdi cjdiVar = (cjdi) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cjdiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cjdiVar.aI = tr;
        cjdiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cjdiVar.aK = sU;
        cjdiVar.aL = new cpv();
        cjdiVar.aM = dxjc.c(this.a.eW.ie());
        cjdiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cjdiVar.b = this.a.wl();
        cjdiVar.c = this.a.wq();
        cjdiVar.d = new cjds();
        cjdiVar.e = dxjc.c(this.a.ef());
        cjdiVar.f = dxjc.c(this.a.aX());
        cjdiVar.g = dxjc.c(this.a.cQ());
        cjdiVar.ad = dxjc.c(this.a.aJ());
        cjdiVar.ae = dxjc.c(this.a.oh());
        b();
        cjdiVar.af = new cjcy(this.a.eW.rw(), (cjdf) b());
    }

    public final Object b() {
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<angp> jB = fttVar.eW.jB();
        dzsj<Executor> di = this.a.eW.di();
        dzsj c = dxjh.c(this.a.aX());
        dzsj c2 = dxjh.c(this.a.aJ());
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new frz(this);
            this.b = dzsjVar2;
        }
        return new cjdf(dzsjVar, jB, di, c, c2, dzsjVar2, dxjh.c(this.a.oh()));
    }
}
