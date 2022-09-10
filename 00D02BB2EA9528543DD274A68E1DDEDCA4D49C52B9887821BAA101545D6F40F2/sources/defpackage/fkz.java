package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fkz  reason: default package */
/* loaded from: classes6.dex */
public final class fkz implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<sev> b;
    private volatile dzsj<sei> c;

    public fkz(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rob robVar = (rob) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        robVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        robVar.aI = tr;
        robVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        robVar.aK = sU;
        robVar.aL = new cpv();
        robVar.aM = dxjc.c(this.a.eW.ie());
        robVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        robVar.b = this.a.wq();
        robVar.c = this.a.wl();
        dzsj<Application> m = this.a.eW.m();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj<qjk> hK = this.a.eW.hK();
        dzsj<sfd> vx = this.a.vx();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fky(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fky(this, 1);
            this.c = dzsjVar3;
        }
        robVar.a = new seq(m, il, hK, vx, dzsjVar2, dzsjVar3, this.a.eW.kb(), this.a.eW.bk());
        robVar.ae = new sfb(this.a.eW.m(), this.a.kR(), this.a.eW.hK(), this.a.eW.di());
    }
}
