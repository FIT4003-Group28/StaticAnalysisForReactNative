package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eof  reason: default package */
/* loaded from: classes6.dex */
public final class eof implements dxis {
    public volatile dzsj a;
    final /* synthetic */ ftt b;
    private volatile dzsj<rby> c;
    private volatile dzsj<rbv> d;

    public eof(ftt fttVar) {
        this.b = fttVar;
    }

    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, qus] */
    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        que queVar = (que) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        queVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        queVar.aI = tr;
        queVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        queVar.aK = sU;
        queVar.aL = new cpv();
        queVar.aM = dxjc.c(this.b.eW.ie());
        queVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        queVar.a = (quv) this.b.eW.np();
        queVar.b = this.b.ts();
        queVar.c = this.b.wl();
        queVar.d = this.b.wq();
        ftt fttVar = this.b;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqhn> il = fttVar.eW.il();
        dzsj<Executor> di = this.b.eW.di();
        dzsj<acyp> ik = this.b.eW.ik();
        dzsj<iwl> D = this.b.D();
        dzsj dzsjVar2 = this.c;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eoe(this, 0);
            this.c = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.d;
        if (dzsjVar4 == null) {
            dzsjVar4 = new eoe(this, 2);
            this.d = dzsjVar4;
        }
        queVar.e = new rbn(dzsjVar, il, di, ik, D, dzsjVar3, dzsjVar4);
        queVar.f = this.b.go();
        queVar.g = this.b.wd();
        queVar.ad = this.b.wk();
        queVar.ae = this.b.eW.bW();
        queVar.af = new cjxo(this.b.a);
        queVar.ag = dxjc.c(this.b.ge());
    }
}
