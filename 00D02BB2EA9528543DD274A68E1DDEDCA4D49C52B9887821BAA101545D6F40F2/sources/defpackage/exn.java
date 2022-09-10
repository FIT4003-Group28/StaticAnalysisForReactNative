package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: exn  reason: default package */
/* loaded from: classes6.dex */
final class exn implements dxis {
    final /* synthetic */ ftt a;
    private volatile bupr b;

    public exn(ftt fttVar) {
        this.a = fttVar;
    }

    /* JADX WARN: Type inference failed for: r0v35, types: [ccif, java.lang.Object] */
    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cchc cchcVar = (cchc) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cchcVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cchcVar.aI = tr;
        cchcVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cchcVar.aK = sU;
        cchcVar.aL = new cpv();
        cchcVar.aM = dxjc.c(this.a.eW.ie());
        cchcVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        cchcVar.a = this.a.wk();
        akfa rK = this.a.eW.a.rK();
        dxjg.e(rK);
        cchcVar.b = rK;
        cchcVar.c = this.a.wl();
        cchcVar.d = this.a.ba();
        cchcVar.e = this.a.aQ();
        cchcVar.f = this.a.wq();
        bupr buprVar = this.b;
        if (buprVar == null) {
            dxio c = dxjc.c(this.a.eW.h());
            bvrb tn = this.a.eW.a.tn();
            dxjg.e(tn);
            buprVar = bupt.b(bups.b(c, tn));
            this.b = buprVar;
        }
        cchcVar.ag = buprVar;
        cchcVar.g = new cpv();
    }
}
