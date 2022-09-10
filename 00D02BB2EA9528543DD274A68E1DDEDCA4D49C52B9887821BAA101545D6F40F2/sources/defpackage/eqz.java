package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eqz  reason: default package */
/* loaded from: classes6.dex */
final class eqz implements dxis {
    final /* synthetic */ ftt a;

    public eqz(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        btif btifVar = (btif) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        btifVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        btifVar.aI = tr;
        btifVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        btifVar.aK = sU;
        btifVar.aL = new cpv();
        btifVar.aM = dxjc.c(this.a.eW.ie());
        btifVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        btifVar.f = dxjc.c(this.a.cz());
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        btifVar.a = rR;
        btifVar.b = bthu.b(this.a.wk());
        btifVar.c = this.a.wl();
    }
}
