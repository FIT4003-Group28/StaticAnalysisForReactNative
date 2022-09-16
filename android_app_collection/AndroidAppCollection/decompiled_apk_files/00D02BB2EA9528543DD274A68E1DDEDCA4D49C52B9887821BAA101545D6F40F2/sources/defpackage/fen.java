package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fen  reason: default package */
/* loaded from: classes6.dex */
final class fen implements dxis {
    final /* synthetic */ ftt a;

    public fen(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bdpy bdpyVar = (bdpy) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bdpyVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bdpyVar.aI = tr;
        bdpyVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bdpyVar.aK = sU;
        bdpyVar.aL = new cpv();
        bdpyVar.aM = dxjc.c(this.a.eW.ie());
        bdpyVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bdpyVar.a = rD;
        bdpyVar.b = this.a.eW.aZ();
        bdpyVar.c = bdpx.b(this.a.eW.pd(), this.a.eW.pf(), this.a.eW.pa(), this.a.eW.oY(), this.a.eW.R(), this.a.eW.at(), this.a.eW.k(), dxjh.c(this.a.eW.iW()), dxjh.c(this.a.m()));
    }
}
