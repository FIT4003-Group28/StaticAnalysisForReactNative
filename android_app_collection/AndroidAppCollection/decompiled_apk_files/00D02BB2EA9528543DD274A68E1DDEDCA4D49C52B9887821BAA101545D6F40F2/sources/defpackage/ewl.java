package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ewl  reason: default package */
/* loaded from: classes6.dex */
final class ewl implements dxis {
    final /* synthetic */ ftt a;

    public ewl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        byck byckVar = (byck) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        byckVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        byckVar.aI = tr;
        byckVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        byckVar.aK = sU;
        byckVar.aL = new cpv();
        byckVar.aM = dxjc.c(this.a.eW.ie());
        byckVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        byckVar.a = this.a.wq();
        byckVar.b = dxjc.c(this.a.m());
    }
}
