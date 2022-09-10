package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fqt  reason: default package */
/* loaded from: classes6.dex */
public final class fqt implements dxis {
    public volatile dzsj<wzm> a;
    public volatile dzsj<wzp> b;
    public volatile dzsj<wza> c;
    public volatile dzsj<wzc> d;
    public volatile dzsj<wze> e;
    public volatile dzsj<wyw> f;
    final /* synthetic */ ftt g;
    private volatile dzsj<wzj> h;
    private volatile dzsj<wyy> i;

    public fqt(ftt fttVar) {
        this.g = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wvu wvuVar = (wvu) obj;
        cjqq tp = this.g.eW.a.tp();
        dxjg.e(tp);
        wvuVar.aH = tp;
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        wvuVar.aI = tr;
        wvuVar.aJ = dbsg.i(this.g.ap());
        Executor sU = this.g.eW.a.sU();
        dxjg.e(sU);
        wvuVar.aK = sU;
        wvuVar.aL = new cpv();
        wvuVar.aM = dxjc.c(this.g.eW.ie());
        wvuVar.aN = dxjc.c(this.g.eW.iU());
        dxjc.c(this.g.lx());
        wvuVar.a = this.g.wl();
        ftt fttVar = this.g;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqhn> il = fttVar.eW.il();
        dzsj<vsf> jm = this.g.eW.jm();
        dzsj dzsjVar2 = this.h;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fqs(this, 0);
            this.h = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.i;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fqs(this, 6);
            this.i = dzsjVar4;
        }
        wvuVar.b = new wzx(dzsjVar, il, jm, dzsjVar3, dzsjVar4, this.g.eW.lP());
        wvuVar.c = this.g.wq();
        bvjj rB = this.g.eW.a.rB();
        dxjg.e(rB);
        wvuVar.d = rB;
    }
}
