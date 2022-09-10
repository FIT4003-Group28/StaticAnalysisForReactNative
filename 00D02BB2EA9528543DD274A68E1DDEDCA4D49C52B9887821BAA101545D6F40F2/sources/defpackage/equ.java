package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: equ  reason: default package */
/* loaded from: classes6.dex */
final class equ implements dxis {
    final /* synthetic */ ftt a;

    public equ(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bcpq bcpqVar = (bcpq) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bcpqVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bcpqVar.aI = tr;
        bcpqVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bcpqVar.aK = sU;
        bcpqVar.aL = new cpv();
        bcpqVar.aM = dxjc.c(this.a.eW.ie());
        bcpqVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bcpqVar.f = dxjc.c(this.a.cz());
        ((bcqw) bcpqVar).b = this.a.wl();
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        bcpqVar.a = rp;
    }
}
