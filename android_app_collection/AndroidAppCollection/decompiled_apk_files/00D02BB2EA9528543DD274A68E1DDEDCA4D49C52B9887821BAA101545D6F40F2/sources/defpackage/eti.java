package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eti  reason: default package */
/* loaded from: classes6.dex */
final class eti implements dxis {
    final /* synthetic */ ftt a;
    private volatile bung b;

    public eti(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cedu ceduVar = (cedu) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        ceduVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        ceduVar.aI = tr;
        ceduVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        ceduVar.aK = sU;
        ceduVar.aL = new cpv();
        ceduVar.aM = dxjc.c(this.a.eW.ie());
        ceduVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        ceduVar.a = tn;
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        ceduVar.b = rK;
        ceduVar.c = this.a.wq();
        ceduVar.d = this.a.wl();
        ceduVar.e = new ceug(this.a.ad(), dxjh.c(this.a.eW.p()), this.a.dI(), this.a.eW.il(), this.a.eW.V(), this.a.eW.pt());
        bung bungVar = this.b;
        if (bungVar == null) {
            dxio c = dxjc.c(this.a.eW.h());
            bvrb tn2 = this.a.eW.a.tn();
            dxjg.e(tn2);
            bungVar = new bung(new bunf(c, tn2));
            this.b = bungVar;
        }
        ceduVar.ae = bungVar;
        ceduVar.f = this.a.wk();
    }
}
