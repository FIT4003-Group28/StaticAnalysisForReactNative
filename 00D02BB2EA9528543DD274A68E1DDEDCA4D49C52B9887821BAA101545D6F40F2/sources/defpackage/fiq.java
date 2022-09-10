package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fiq  reason: default package */
/* loaded from: classes6.dex */
final class fiq implements dxis {
    final /* synthetic */ ftt a;

    public fiq(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bkkf bkkfVar = (bkkf) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bkkfVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bkkfVar.aI = tr;
        bkkfVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bkkfVar.aK = sU;
        bkkfVar.aL = new cpv();
        bkkfVar.aM = dxjc.c(this.a.eW.ie());
        bkkfVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bkkfVar.ar = new bgqo(this.a.eW.V());
        bkkfVar.a = this.a.wl();
        bkkfVar.b = this.a.nl();
        dxjg.e(this.a.eW.a.rB());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bkkfVar.c = rD;
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        bkkfVar.d = rp;
        bkkfVar.e = dxjc.c(this.a.qv());
        bkkfVar.f = dxjc.c(this.a.bf());
        bkkfVar.g = dxjc.c(this.a.qw());
        this.a.eW.I();
        this.a.lO();
        this.a.qx();
        bkkfVar.ad = this.a.k();
        bkkfVar.ae = this.a.qG();
    }
}
