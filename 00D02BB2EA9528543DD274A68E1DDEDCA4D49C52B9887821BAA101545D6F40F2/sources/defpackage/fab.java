package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fab  reason: default package */
/* loaded from: classes6.dex */
final class fab implements dxis {
    final /* synthetic */ ftt a;

    public fab(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        asmg asmgVar = (asmg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        asmgVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        asmgVar.aI = tr;
        asmgVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        asmgVar.aK = sU;
        asmgVar.aL = new cpv();
        asmgVar.aM = dxjc.c(this.a.eW.ie());
        asmgVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        asmgVar.f = dxjc.c(this.a.cz());
        asmgVar.c = this.a.wl();
    }
}
