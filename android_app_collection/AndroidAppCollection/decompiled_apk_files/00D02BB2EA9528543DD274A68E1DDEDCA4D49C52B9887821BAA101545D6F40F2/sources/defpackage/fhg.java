package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fhg  reason: default package */
/* loaded from: classes6.dex */
final class fhg implements dxis {
    final /* synthetic */ ftt a;

    public fhg(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        aoln aolnVar = (aoln) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        aolnVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        aolnVar.aI = tr;
        aolnVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        aolnVar.aK = sU;
        aolnVar.aL = new cpv();
        aolnVar.aM = dxjc.c(this.a.eW.ie());
        aolnVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        aolnVar.a = this.a.wl();
        aolnVar.b = this.a.lN();
        aolnVar.c = this.a.kO();
        Application a = this.a.eW.a.a();
        dxjg.e(a);
        aolnVar.d = a;
        aolnVar.e = new aolm(this.a.lO(), this.a.eW.il(), this.a.ad(), this.a.eW.V(), this.a.m(), this.a.aX(), this.a.eW.n());
    }
}
