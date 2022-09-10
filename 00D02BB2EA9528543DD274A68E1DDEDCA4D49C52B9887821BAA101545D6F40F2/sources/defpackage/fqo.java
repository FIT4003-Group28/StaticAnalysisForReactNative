package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqo  reason: default package */
/* loaded from: classes6.dex */
public final class fqo implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<sbz> b;
    private volatile dzsj<shk> c;

    public fqo(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rom romVar = (rom) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        romVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        romVar.aI = tr;
        romVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        romVar.aK = sU;
        romVar.aL = new cpv();
        romVar.aM = dxjc.c(this.a.eW.ie());
        romVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        romVar.b = this.a.wq();
        romVar.c = this.a.wl();
        dzsj<Application> m = this.a.eW.m();
        dzsj<qjk> hK = this.a.eW.hK();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fqn(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        ftt fttVar = this.a;
        dzsj dzsjVar3 = fttVar.eE;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fns(fttVar, 1438);
            fttVar.eE = dzsjVar3;
        }
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar4 = this.c;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fqn(this, 1);
            this.c = dzsjVar4;
        }
        romVar.a = new shi(m, hK, dzsjVar2, dzsjVar3, il, dzsjVar4, this.a.vx(), this.a.eW.bL(), this.a.eW.V());
    }
}
