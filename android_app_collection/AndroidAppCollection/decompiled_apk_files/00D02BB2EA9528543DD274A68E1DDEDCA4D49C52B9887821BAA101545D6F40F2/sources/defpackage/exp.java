package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: exp  reason: default package */
/* loaded from: classes6.dex */
final class exp implements dxis {
    final /* synthetic */ ftt a;
    private volatile bupr b;

    public exp(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cchj cchjVar = (cchj) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        cchjVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        cchjVar.aI = tr;
        cchjVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        cchjVar.aK = sU;
        cchjVar.aL = new cpv();
        cchjVar.aM = dxjc.c(this.a.eW.ie());
        cchjVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        cchjVar.a = rD;
        cchjVar.b = this.a.wl();
        cchjVar.c = this.a.aQ();
        cchjVar.d = this.a.wq();
        cchjVar.e = this.a.wd();
        bupr buprVar = this.b;
        if (buprVar == null) {
            dxio c = dxjc.c(this.a.eW.h());
            bvrb tn = this.a.eW.a.tn();
            dxjg.e(tn);
            buprVar = bupt.b(bups.b(c, tn));
            this.b = buprVar;
        }
        cchjVar.ad = buprVar;
        cchjVar.ae = this.a.EH();
        cchjVar.f = new cchu(this.a.aR(), this.a.bb(), this.a.uu(), this.a.eW.mf());
    }
}
