package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fkj  reason: default package */
/* loaded from: classes6.dex */
final class fkj implements dxis {
    final /* synthetic */ ftt a;

    public fkj(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wbi wbiVar = (wbi) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        wbiVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        wbiVar.aI = tr;
        wbiVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        wbiVar.aK = sU;
        wbiVar.aL = new cpv();
        wbiVar.aM = dxjc.c(this.a.eW.ie());
        wbiVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        wbiVar.b = dxjc.c(this.a.bU());
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        wbiVar.c = rD;
        wbiVar.d = this.a.wq();
        ftt fttVar = this.a;
        rb rbVar = fttVar.a;
        bvrb tn = fttVar.eW.a.tn();
        dxjg.e(tn);
        vwx vwxVar = new vwx(rbVar, tn);
        bvrb tn2 = this.a.eW.a.tn();
        dxjg.e(tn2);
        wbiVar.e = new asjs(vwxVar, tn2, this.a.wl());
        wbiVar.f = new wbf(this.a.eW.di(), this.a.eW.n(), this.a.eW.ry());
    }
}
