package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: enr  reason: default package */
/* loaded from: classes6.dex */
final class enr implements dxis {
    final /* synthetic */ ftt a;

    public enr(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cdjw cdjwVar = (cdjw) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cdjwVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cdjwVar.aI = tr;
        cdjwVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cdjwVar.aK = sU;
        cdjwVar.aL = new cpv();
        cdjwVar.aM = dxjc.c(this.a.eW.ie());
        cdjwVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
    }
}
