package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eyi  reason: default package */
/* loaded from: classes6.dex */
final class eyi implements dxis {
    final /* synthetic */ ftt a;

    public eyi(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        akmg akmgVar = (akmg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        akmgVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        akmgVar.aI = tr;
        akmgVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        akmgVar.aK = sU;
        akmgVar.aL = new cpv();
        akmgVar.aM = dxjc.c(this.a.eW.ie());
        akmgVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        akmgVar.a = this.a.wl();
        akmgVar.b = this.a.wq();
        cqat rR = this.a.eW.a.rR();
        dxjg.e(rR);
        akmgVar.c = rR;
        akmgVar.d = dxjc.c(this.a.as());
        akmgVar.e = this.a.bM();
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        akmgVar.f = tn;
        Application a = this.a.eW.a.a();
        dxjg.e(a);
        dxjc.c(this.a.as());
        akmgVar.g = new akoc(a);
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        akmgVar.ad = tr2;
    }
}
