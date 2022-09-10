package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fsc  reason: default package */
/* loaded from: classes6.dex */
final class fsc implements dxis {
    final /* synthetic */ ftt a;

    public fsc(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bnaf bnafVar = (bnaf) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bnafVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bnafVar.aI = tr;
        bnafVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bnafVar.aK = sU;
        bnafVar.aL = new cpv();
        bnafVar.aM = dxjc.c(this.a.eW.ie());
        bnafVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bnafVar.ar = new bgqo(this.a.eW.V());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bnafVar.a = rD;
        bnafVar.b = this.a.wl();
        ftt fttVar = this.a;
        bnafVar.c = new bnfn(fttVar.eV, fttVar.eW.il(), this.a.eW.al(), this.a.eW.er());
    }
}
