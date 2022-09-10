package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fiy  reason: default package */
/* loaded from: classes6.dex */
public final class fiy implements dxis {
    public final blox a;
    final /* synthetic */ ftt b;
    private volatile dzsj<blzs> c;
    private volatile dzsj<blye> d;
    private volatile dzsj<blwm> e;
    private volatile dzsj<blyz> f;

    public fiy(ftt fttVar, blox bloxVar) {
        this.b = fttVar;
        this.a = bloxVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        blox bloxVar = (blox) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bloxVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bloxVar.aI = tr;
        bloxVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bloxVar.aK = sU;
        bloxVar.aL = new cpv();
        bloxVar.aM = dxjc.c(this.b.eW.ie());
        bloxVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bloxVar.f = dxjc.c(this.b.cz());
        bloxVar.b = new blwb(this.b.eW.pu(), this.b.eW.p(), this.b.eW.R());
        dzsj<rb> dzsjVar = this.b.eV;
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fix(this, 0);
            this.c = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.d;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fix(this, 1);
            this.d = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<angp> jB = this.b.eW.jB();
        dzsj<blpg> pu = this.b.eW.pu();
        dzsj<akfa> p = this.b.eW.p();
        dzsj<cjqy> al = this.b.eW.al();
        dzsj<bvrb> R = this.b.eW.R();
        dzsj<blpp> tk = this.b.tk();
        dzsj<cqat> K = this.b.eW.K();
        dzsj<bqly> aJ = this.b.aJ();
        ftt fttVar = this.b;
        dzsj dzsjVar6 = fttVar.eG;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fns(fttVar, 1441);
            fttVar.eG = dzsjVar6;
        }
        bloxVar.c = new blyw(dzsjVar, dzsjVar3, dzsjVar5, jB, pu, p, al, R, tk, K, aJ, dzsjVar6);
        dzsj<rb> dzsjVar7 = this.b.eV;
        dzsj dzsjVar8 = this.e;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fix(this, 2);
            this.e = dzsjVar8;
        }
        bloxVar.d = new blxp(dzsjVar7, dzsjVar8, this.b.eW.n(), this.b.eW.V(), this.b.eW.aw(), this.b.aX(), this.b.eW.R(), this.b.eW.al(), this.b.eW.hN(), this.b.tk(), this.b.bb(), this.b.eW.K());
        dzsj<blyz> dzsjVar9 = this.f;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fix<>(this, 3);
            this.f = dzsjVar9;
        }
        bloxVar.e = dzsjVar9;
        bloxVar.g = this.b.wl();
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bloxVar.ad = rD;
        bloxVar.ae = this.b.aJ();
        ckcw rU = this.b.eW.a.rU();
        dxjg.e(rU);
        bloxVar.af = rU;
        bloxVar.ag = this.b.tk();
        bloxVar.ah = this.b.wk();
        ckmm r = this.b.eW.a.r();
        dxjg.e(r);
        bloxVar.ai = r;
    }
}
