package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fma  reason: default package */
/* loaded from: classes6.dex */
final class fma implements dxis {
    final /* synthetic */ ftt a;

    public fma(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        axua axuaVar = (axua) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        axuaVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        axuaVar.aI = tr;
        axuaVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        axuaVar.aK = sU;
        axuaVar.aL = new cpv();
        axuaVar.aM = dxjc.c(this.a.eW.ie());
        axuaVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        axuaVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        axuaVar.a = rD;
        axuaVar.b = this.a.wl();
        ftt fttVar = this.a;
        axuaVar.c = new axvo(fttVar.eV, fttVar.fe(), this.a.J());
        axuaVar.d = dxjc.c(this.a.eW.al());
    }
}
