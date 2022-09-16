package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fbo  reason: default package */
/* loaded from: classes6.dex */
public final class fbo implements dxis {
    public volatile bvds a;
    final /* synthetic */ ftt b;
    private volatile dzsj<bvds> c;
    private volatile dzsj<ccrf> d;
    private volatile dzsj<cctx> e;

    public fbo(ftt fttVar) {
        this.b = fttVar;
    }

    private final dzsj<ccrf> b() {
        dzsj<ccrf> dzsjVar = this.d;
        if (dzsjVar == null) {
            fbn fbnVar = new fbn(this, 1);
            this.d = fbnVar;
            return fbnVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bhnf bhnfVar = (bhnf) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bhnfVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bhnfVar.aI = tr;
        bhnfVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bhnfVar.aK = sU;
        bhnfVar.aL = new cpv();
        bhnfVar.aM = dxjc.c(this.b.eW.ie());
        bhnfVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bhnfVar.a = dxjc.c(this.b.bf());
        dzsj<cqhn> il = this.b.eW.il();
        dzsj<bvrb> R = this.b.eW.R();
        dzsj<butl> oz = this.b.oz();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new fbn(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        ftt fttVar = this.b;
        bhnfVar.b = new bhtl(il, R, oz, dzsjVar2, fttVar.eV, dxjh.c(fttVar.qw()), this.b.jn(), dxjh.c(this.b.bf()), dxjh.c(this.b.qv()), b(), this.b.uy(), this.b.eW.mf(), this.b.eW.aw(), this.b.eW.V(), this.b.je(), this.b.uC(), this.b.jg(), this.b.ou(), this.b.nd(), this.b.l());
        bhnfVar.c = this.b.wk();
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bhnfVar.d = rD;
        bhnfVar.e = this.b.wl();
        bhnfVar.f = this.b.wq();
        bhnfVar.g = dxjc.c(this.b.qw());
        dzsj<Executor> di = this.b.eW.di();
        dzsj<bbpv> ba = this.b.eW.ba();
        dzsj<bbrq> jb = this.b.eW.jb();
        dzsj<chhr> uu = this.b.uu();
        dzsj<ccrh> uA = this.b.uA();
        dzsj<ccrf> b = b();
        dzsj<akfa> p = this.b.eW.p();
        dzsj<cctn> uy = this.b.uy();
        dzsj<ccru> uB = this.b.uB();
        dzsj dzsjVar3 = this.e;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fbn(this, 2);
            this.e = dzsjVar3;
        }
        bhnfVar.ad = new ccsk(di, ba, jb, uu, uA, b, p, uy, uB, dzsjVar3);
        bhnfVar.ae = this.b.wd();
        bhnfVar.af = new cpv();
    }
}
