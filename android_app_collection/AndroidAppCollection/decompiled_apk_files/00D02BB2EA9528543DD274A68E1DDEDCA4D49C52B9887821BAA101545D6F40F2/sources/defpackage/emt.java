package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: emt  reason: default package */
/* loaded from: classes6.dex */
final class emt implements dxis {
    final /* synthetic */ ftt a;

    public emt(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        byog byogVar = (byog) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        byogVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        byogVar.aI = tr;
        byogVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        byogVar.aK = sU;
        byogVar.aL = new cpv();
        byogVar.aM = dxjc.c(this.a.eW.ie());
        byogVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        byogVar.ae = new cjxo(this.a.a);
        byogVar.af = dxjc.c(this.a.ec());
        byogVar.ag = this.a.wq();
        this.a.h();
        this.a.eW.ar();
        byogVar.a = this.a.eW.cw();
        byoi cw = this.a.eW.cw();
        Resources c = this.a.eW.a.c();
        dxjg.e(c);
        aufl cu = this.a.eW.cu();
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        byogVar.b = new bysi(cw, c, cu, tr2, dxjc.c(this.a.ec()));
        dxjg.e(this.a.eW.a.rp());
        byogVar.c = this.a.eW.cu();
        dxjg.e(this.a.eW.a.rB());
        dxjc.c(this.a.ec());
        cjqy tr3 = this.a.eW.a.tr();
        dxjg.e(tr3);
        byogVar.d = tr3;
        byogVar.e = this.a.wl();
    }
}
