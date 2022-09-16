package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fmy  reason: default package */
/* loaded from: classes6.dex */
public final class fmy implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<sff> b;
    private volatile dzsj<vyd> c;
    private volatile dzsj<rzz> d;
    private volatile dzsj<rzs> e;

    public fmy(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rof rofVar;
        rof rofVar2 = (rof) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        rofVar2.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        rofVar2.aI = tr;
        rofVar2.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        rofVar2.aK = sU;
        rofVar2.aL = new cpv();
        rofVar2.aM = dxjc.c(this.a.eW.ie());
        rofVar2.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        rofVar2.a = this.a.wq();
        rofVar2.b = this.a.wl();
        dzsj<Application> m = this.a.eW.m();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fmx(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<vsf> jm = this.a.eW.jm();
        dzsj<gle> dF = this.a.dF();
        dzsj<akox> as = this.a.as();
        dzsj<hwc> cy = this.a.cy();
        fyu fyuVar = this.a.eW;
        dzsj dzsjVar3 = fyuVar.dP;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fxy(fyuVar, 729);
            fyuVar.dP = dzsjVar3;
        }
        dzsj dzsjVar4 = this.c;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fmx(this, 1);
            this.c = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<cqhu> eS = this.a.eS();
        dzsj<qds> nD = this.a.eW.nD();
        dzsj<btrm> n = this.a.eW.n();
        dzsj<dehq> kb = this.a.eW.kb();
        dzsj dzsjVar6 = this.d;
        if (dzsjVar6 == null) {
            rofVar = rofVar2;
            dzsjVar6 = new fmx(this, 2);
            this.d = dzsjVar6;
        } else {
            rofVar = rofVar2;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.e;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fmx(this, 3);
            this.e = dzsjVar8;
        }
        rof rofVar3 = rofVar;
        rofVar3.g = new sfz(m, dzsjVar2, il, jm, dF, as, cy, dzsjVar3, dzsjVar5, eS, nD, n, kb, dzsjVar7, dzsjVar8, this.a.eW.at(), this.a.eW.V(), this.a.ad());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        rofVar3.ad = rD;
        rofVar3.ae = this.a.wd();
    }
}
