package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fdq  reason: default package */
/* loaded from: classes6.dex */
final class fdq implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<jmz> b;

    public fdq(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        brqk brqkVar = (brqk) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        brqkVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        brqkVar.aI = tr;
        brqkVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        brqkVar.aK = sU;
        brqkVar.aL = new cpv();
        brqkVar.aM = dxjc.c(this.a.eW.ie());
        brqkVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        brqkVar.a = dxjc.c(this.a.av());
        brqkVar.b = this.a.ap();
        brqkVar.c = this.a.bB();
        brqkVar.d = this.a.wo();
        bwqv rD = this.a.eW.a.rD();
        dxjg.e(rD);
        brqkVar.e = rD;
        bvrb tn = this.a.eW.a.tn();
        dxjg.e(tn);
        brqkVar.f = tn;
        brqkVar.g = this.a.wq();
        brqkVar.ad = this.a.wl();
        brqkVar.ae = dxjc.c(this.a.ge());
        brqkVar.af = new brqy(this.a.eW.fr(), this.a.eW.kf(), this.a.eW.k(), this.a.cS());
        brqkVar.ag = dxjc.c(this.a.tA());
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new fdp();
            this.b = dzsjVar;
        }
        brqkVar.ah = new brqt(dzsjVar, this.a.fJ());
        brqkVar.ai = dxjc.c(this.a.cV());
        brqkVar.aj = this.a.bM();
    }
}
