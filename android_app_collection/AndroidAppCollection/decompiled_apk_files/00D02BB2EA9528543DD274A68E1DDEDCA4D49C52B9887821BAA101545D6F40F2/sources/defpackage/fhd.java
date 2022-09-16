package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fhd  reason: default package */
/* loaded from: classes6.dex */
public final class fhd implements dxis {
    public volatile dzsj<qsm> a;
    final /* synthetic */ ftt b;
    private volatile dzsj<sbz> c;
    private volatile dzsj<sim> d;

    public fhd(ftt fttVar) {
        this.b = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rnz rnzVar = (rnz) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        rnzVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        rnzVar.aI = tr;
        rnzVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        rnzVar.aK = sU;
        rnzVar.aL = new cpv();
        rnzVar.aM = dxjc.c(this.b.eW.ie());
        rnzVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        rnzVar.b = this.b.wq();
        rnzVar.c = this.b.wl();
        dzsj<Application> m = this.b.eW.m();
        dzsj<btvo> V = this.b.eW.V();
        dzsj<qjk> hK = this.b.eW.hK();
        dzsj<azql> bP = this.b.eW.bP();
        dzsj<cqhn> il = this.b.eW.il();
        dzsj<sic> nt = this.b.eW.nt();
        dzsj<sfd> vx = this.b.vx();
        dzsj<ros> hP = this.b.hP();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fhc(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fhc(this, 1);
            this.d = dzsjVar3;
        }
        rnzVar.a = new sdy(m, V, hK, bP, il, nt, vx, hP, dzsjVar2, dxjh.c(dzsjVar3), this.b.eW.di(), this.b.eW.o(), this.b.eW.bm(), this.b.eW.u(), this.b.eV);
        rnzVar.ae = this.b.vw();
    }
}
