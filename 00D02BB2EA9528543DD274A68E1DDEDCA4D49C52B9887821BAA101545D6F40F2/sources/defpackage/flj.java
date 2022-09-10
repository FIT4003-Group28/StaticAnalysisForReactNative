package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: flj  reason: default package */
/* loaded from: classes6.dex */
final class flj implements dxis {
    final /* synthetic */ ftt a;

    public flj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bqzp bqzpVar = (bqzp) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bqzpVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bqzpVar.aI = tr;
        bqzpVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bqzpVar.aK = sU;
        bqzpVar.aL = new cpv();
        bqzpVar.aM = dxjc.c(this.a.eW.ie());
        bqzpVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bqzpVar.f = dxjc.c(this.a.cz());
        bqzpVar.a = this.a.wl();
        bqzpVar.b = new bssh(dxjh.c(this.a.aV()));
    }
}
