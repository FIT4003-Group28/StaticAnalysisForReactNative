package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eyg  reason: default package */
/* loaded from: classes6.dex */
public final class eyg implements dxis {
    public volatile dzsj<qsm> a;
    public volatile dzsj b;
    public volatile Object c = new dxjf();
    final /* synthetic */ ftt d;
    private volatile dzsj<sbz> e;
    private volatile dzsj<sim> f;
    private volatile dzsj<wbx> g;

    public eyg(ftt fttVar) {
        this.d = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rnw rnwVar;
        rnw rnwVar2 = (rnw) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        rnwVar2.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        rnwVar2.aI = tr;
        rnwVar2.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        rnwVar2.aK = sU;
        rnwVar2.aL = new cpv();
        rnwVar2.aM = dxjc.c(this.d.eW.ie());
        rnwVar2.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        rnwVar2.a = this.d.wq();
        rnwVar2.b = this.d.wl();
        dzsj<Application> m = this.d.eW.m();
        dzsj<btvo> V = this.d.eW.V();
        dzsj<qjk> hK = this.d.eW.hK();
        dzsj<azql> bP = this.d.eW.bP();
        dzsj<cqhn> il = this.d.eW.il();
        dzsj<sic> nt = this.d.eW.nt();
        dzsj<ros> hP = this.d.hP();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new eyf(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eyf(this, 1);
            this.f = dzsjVar3;
        }
        dzsj c = dxjh.c(dzsjVar3);
        dzsj<Executor> di = this.d.eW.di();
        dzsj<Executor> o = this.d.eW.o();
        ftt fttVar = this.d;
        dzsj dzsjVar4 = fttVar.eD;
        if (dzsjVar4 == null) {
            rnwVar = rnwVar2;
            dzsjVar4 = new fns(fttVar, 1436);
            fttVar.eD = dzsjVar4;
        } else {
            rnwVar = rnwVar2;
        }
        dzsj<axwq> u = this.d.eW.u();
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new eyf(this, 3);
            this.g = dzsjVar5;
        }
        rnwVar.c = new scp(m, V, hK, bP, il, nt, hP, dzsjVar2, c, di, o, dzsjVar4, u, dzsjVar5, this.d.eV);
    }
}
