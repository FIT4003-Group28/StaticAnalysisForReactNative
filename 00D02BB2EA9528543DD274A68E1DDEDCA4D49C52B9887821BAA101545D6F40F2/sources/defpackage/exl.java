package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: exl  reason: default package */
/* loaded from: classes6.dex */
final class exl implements dxis {
    final /* synthetic */ ftt a;

    public exl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ccgu ccguVar = (ccgu) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ccguVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ccguVar.aI = tr;
        ccguVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ccguVar.aK = sU;
        ccguVar.aL = new cpv();
        ccguVar.aM = dxjc.c(this.a.eW.ie());
        ccguVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        ccguVar.f = dxjc.c(this.a.cz());
        ccguVar.a = this.a.wl();
        ccguVar.b = dxjc.c(this.a.bb());
    }
}
