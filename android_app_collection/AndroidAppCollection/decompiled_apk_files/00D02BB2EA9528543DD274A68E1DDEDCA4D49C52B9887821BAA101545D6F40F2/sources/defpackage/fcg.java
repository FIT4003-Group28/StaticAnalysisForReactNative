package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fcg  reason: default package */
/* loaded from: classes6.dex */
final class fcg implements dxis {
    final /* synthetic */ ftt a;

    public fcg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        avua avuaVar = (avua) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        avuaVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        avuaVar.aI = tr;
        avuaVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        avuaVar.aK = sU;
        avuaVar.aL = new cpv();
        avuaVar.aM = dxjc.c(this.a.eW.ie());
        avuaVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        avuaVar.a = this.a.wl();
        avuaVar.b = this.a.wq();
        avuaVar.c = this.a.O();
        avuaVar.d = dxjc.c(this.a.aT());
    }
}
