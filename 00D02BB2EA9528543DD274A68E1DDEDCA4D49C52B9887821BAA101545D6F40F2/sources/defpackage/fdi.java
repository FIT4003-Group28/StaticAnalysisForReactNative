package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fdi  reason: default package */
/* loaded from: classes6.dex */
final class fdi implements dxis {
    final /* synthetic */ ftt a;

    public fdi(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bilo biloVar = (bilo) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        biloVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        biloVar.aI = tr;
        biloVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        biloVar.aK = sU;
        biloVar.aL = new cpv();
        biloVar.aM = dxjc.c(this.a.eW.ie());
        biloVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        biloVar.b = this.a.wl();
        biloVar.c = this.a.wq();
        biloVar.d = new bixb(this.a.fe(), this.a.ad(), this.a.eW.cx());
    }
}
