package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fes  reason: default package */
/* loaded from: classes6.dex */
final class fes implements dxis {
    final /* synthetic */ ftt a;
    private volatile buyk b;

    public fes(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bdjk bdjkVar = (bdjk) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        bdjkVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        bdjkVar.aI = tr;
        bdjkVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        bdjkVar.aK = sU;
        bdjkVar.aL = new cpv();
        bdjkVar.aM = dxjc.c(this.a.eW.ie());
        bdjkVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bdjkVar.f = dxjc.c(this.a.cz());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        bdjkVar.d = rD;
        cjqy tr2 = this.a.eW.a.tr();
        dxjg.e(tr2);
        bdjkVar.e = tr2;
        bdjkVar.g = dxjc.c(this.a.m());
        buyk buykVar = this.b;
        if (buykVar == null) {
            dxio c = dxjc.c(this.a.eW.h());
            bvrb tn = this.a.eW.a.tn();
            dxjg.e(tn);
            buykVar = new buyk(new buyj(c, tn));
            this.b = buykVar;
        }
        bdjkVar.ag = buykVar;
        btvo rp = this.a.eW.a.rp();
        dxjg.e(rp);
        bdjkVar.ad = rp;
        bdjkVar.ae = this.a.wl();
        bdjkVar.af = new cqhn();
    }
}
