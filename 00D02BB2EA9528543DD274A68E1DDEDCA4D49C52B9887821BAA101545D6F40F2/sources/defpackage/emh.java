package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: emh  reason: default package */
/* loaded from: classes6.dex */
final class emh implements dxis {
    final /* synthetic */ ftt a;

    public emh(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        dcu dcuVar = (dcu) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        dcuVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        dcuVar.aI = tr;
        dcuVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        dcuVar.aK = sU;
        dcuVar.aL = new cpv();
        dcuVar.aM = dxjc.c(this.a.eW.ie());
        dcuVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        dcuVar.b = this.a.eW.kC();
        dcuVar.c = this.a.wq();
        dcuVar.d = this.a.wl();
        Application a = this.a.eW.a.a();
        dxjg.e(a);
        dcuVar.e = a;
        dcuVar.f = this.a.eu();
        dcuVar.g = this.a.eh();
        dcuVar.ad = new cjxo(this.a.a);
    }
}
