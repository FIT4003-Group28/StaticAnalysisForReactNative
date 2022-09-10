package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fiv  reason: default package */
/* loaded from: classes6.dex */
final class fiv implements dxis {
    final /* synthetic */ ftt a;

    public fiv(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wtx wtxVar = (wtx) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        wtxVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        wtxVar.aI = tr;
        wtxVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        wtxVar.aK = sU;
        wtxVar.aL = new cpv();
        wtxVar.aM = dxjc.c(this.a.eW.ie());
        wtxVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        wtxVar.f = dxjc.c(this.a.cz());
        wtxVar.a = this.a.wl();
        wtxVar.b = new wuc(this.a.eV);
    }
}
