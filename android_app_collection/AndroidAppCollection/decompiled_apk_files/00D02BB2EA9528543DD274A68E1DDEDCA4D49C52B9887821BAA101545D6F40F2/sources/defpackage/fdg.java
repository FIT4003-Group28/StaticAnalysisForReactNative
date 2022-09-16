package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fdg  reason: default package */
/* loaded from: classes6.dex */
public final class fdg implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<bgvx> b;

    public fdg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ackn acknVar = (ackn) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        acknVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        acknVar.aI = tr;
        acknVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        acknVar.aK = sU;
        acknVar.aL = new cpv();
        acknVar.aM = dxjc.c(this.a.eW.ie());
        acknVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        acknVar.d = rD;
        ((bfdp) acknVar).e = this.a.wq();
        acknVar.a = this.a.wl();
        ftt fttVar = this.a;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqat> K = fttVar.eW.K();
        dzsj<boxa> cn = this.a.cn();
        dzsj<bhat> iX = this.a.iX();
        dzsj dzsjVar2 = this.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fdf(this);
            this.b = dzsjVar2;
        }
        acknVar.b = new acvl(dzsjVar, K, cn, iX, dzsjVar2);
    }
}
