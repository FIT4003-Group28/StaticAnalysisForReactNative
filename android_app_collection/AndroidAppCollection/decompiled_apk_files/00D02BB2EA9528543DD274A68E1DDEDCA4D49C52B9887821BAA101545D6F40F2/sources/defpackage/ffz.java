package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ffz  reason: default package */
/* loaded from: classes6.dex */
final class ffz implements dxis {
    final /* synthetic */ ftt a;

    public ffz(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bgev bgevVar = (bgev) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bgevVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bgevVar.aI = tr;
        bgevVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bgevVar.aK = sU;
        bgevVar.aL = new cpv();
        bgevVar.aM = dxjc.c(this.a.eW.ie());
        bgevVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bgevVar.ar = new bgqo(this.a.eW.V());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bgevVar.a = rD;
        bgevVar.b = this.a.wl();
        bgevVar.c = new bgpu(this.a.eW.il(), this.a.l(), this.a.eW.mK(), this.a.tX(), this.a.tY(), this.a.tZ(), this.a.lk());
    }
}
