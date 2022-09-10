package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ezr  reason: default package */
/* loaded from: classes6.dex */
final class ezr implements dxis {
    final /* synthetic */ ftt a;

    public ezr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        btde btdeVar = (btde) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        btdeVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        btdeVar.aI = tr;
        btdeVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        btdeVar.aK = sU;
        btdeVar.aL = new cpv();
        btdeVar.aM = dxjc.c(this.a.eW.ie());
        btdeVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        btdeVar.b = this.a.wq();
        btdeVar.c = this.a.wl();
    }
}
