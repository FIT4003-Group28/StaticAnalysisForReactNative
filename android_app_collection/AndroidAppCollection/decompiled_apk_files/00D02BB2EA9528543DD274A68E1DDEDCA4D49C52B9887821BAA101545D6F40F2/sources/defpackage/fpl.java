package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fpl  reason: default package */
/* loaded from: classes6.dex */
final class fpl implements dxis {
    final /* synthetic */ ftt a;

    public fpl(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bypn bypnVar = (bypn) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bypnVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bypnVar.aI = tr;
        bypnVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bypnVar.aK = sU;
        bypnVar.aL = new cpv();
        bypnVar.aM = dxjc.c(this.a.eW.ie());
        bypnVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bypnVar.ae = new cjxo(this.a.a);
        bypnVar.af = dxjc.c(this.a.ec());
        bypnVar.ag = this.a.wq();
        bypnVar.a = this.a.wl();
        Resources c = this.a.eW.a.c();
        dxjg.e(c);
        bypnVar.b = c;
        bypnVar.c = dxjc.c(this.a.eW.ax());
        bypnVar.d = dxjc.c(this.a.ec());
        bypnVar.e = dxjc.c(this.a.eW.bp());
        bypnVar.f = dxjc.c(this.a.eW.al());
    }
}
