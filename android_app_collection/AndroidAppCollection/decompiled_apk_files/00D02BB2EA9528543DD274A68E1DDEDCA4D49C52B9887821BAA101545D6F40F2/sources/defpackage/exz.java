package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: exz  reason: default package */
/* loaded from: classes6.dex */
final class exz implements dxis {
    final /* synthetic */ ftt a;

    public exz(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        axtz axtzVar = (axtz) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        axtzVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        axtzVar.aI = tr;
        axtzVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        axtzVar.aK = sU;
        axtzVar.aL = new cpv();
        axtzVar.aM = dxjc.c(this.a.eW.ie());
        axtzVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        axtzVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        axtzVar.b = rD;
        axtzVar.c = this.a.wl();
        ftt fttVar = this.a;
        axtzVar.d = new axvm(fttVar.eV, fttVar.P(), this.a.fe());
        axtzVar.e = dxjc.c(this.a.eW.al());
    }
}
