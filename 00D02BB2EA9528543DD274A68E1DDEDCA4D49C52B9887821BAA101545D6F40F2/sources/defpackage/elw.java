package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: elw  reason: default package */
/* loaded from: classes6.dex */
public final class elw implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<sev> b;

    public elw(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        rlt rltVar = (rlt) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        rltVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        rltVar.aI = tr;
        rltVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        rltVar.aK = sU;
        rltVar.aL = new cpv();
        rltVar.aM = dxjc.c(this.a.eW.ie());
        rltVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        rltVar.f = dxjc.c(this.a.cz());
        rltVar.a = this.a.wl();
        rltVar.b = this.a.wd();
        dzsj<Application> m = this.a.eW.m();
        dzsj<cqhn> il = this.a.eW.il();
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new elv(this);
            this.b = dzsjVar;
        }
        rltVar.c = new sbt(m, il, dzsjVar);
    }
}
