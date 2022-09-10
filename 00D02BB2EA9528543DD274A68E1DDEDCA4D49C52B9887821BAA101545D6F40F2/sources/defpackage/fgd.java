package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fgd  reason: default package */
/* loaded from: classes6.dex */
final class fgd implements dxis {
    final /* synthetic */ ftt a;

    public fgd(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bgex bgexVar = (bgex) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bgexVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bgexVar.aI = tr;
        bgexVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bgexVar.aK = sU;
        bgexVar.aL = new cpv();
        bgexVar.aM = dxjc.c(this.a.eW.ie());
        bgexVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bgexVar.a = this.a.wl();
        ftt fttVar = this.a;
        bgexVar.b = new bgqe(fttVar.eV, fttVar.eW.il(), this.a.pw(), this.a.eW.al(), this.a.ad(), this.a.py(), this.a.pu());
        bgexVar.c = dxjc.c(this.a.lN());
        bgexVar.d = this.a.px();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bgexVar.e = rD;
        bgexVar.f = dxjc.c(this.a.az());
        this.a.eW.lX();
        bgexVar.g = new cpv();
    }
}
