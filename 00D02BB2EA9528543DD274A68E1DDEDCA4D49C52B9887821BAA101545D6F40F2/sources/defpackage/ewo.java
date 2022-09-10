package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ewo  reason: default package */
/* loaded from: classes6.dex */
public final class ewo implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<batz> b;
    private volatile dzsj<bayv> c;
    private volatile dzsj<bayy> d;
    private volatile dzsj<bazx> e;

    public ewo(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        baat baatVar = (baat) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        baatVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        baatVar.aI = tr;
        baatVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        baatVar.aK = sU;
        baatVar.aL = new cpv();
        baatVar.aM = dxjc.c(this.a.eW.ie());
        baatVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        baatVar.a = this.a.eW.bW();
        this.a.wk();
        dzsj dzsjVar = this.c;
        if (dzsjVar == null) {
            dzsjVar = new ewn(this, 0);
            this.c = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.d;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ewn(this, 2);
            this.d = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj dzsjVar5 = this.e;
        if (dzsjVar5 == null) {
            dzsjVar5 = new ewn(this, 3);
            this.e = dzsjVar5;
        }
        baatVar.b = new bafy(dzsjVar2, dzsjVar4, dzsjVar5, this.a.eW.il(), this.a.eW.o(), this.a.eW.di(), this.a.eW.n(), this.a.ad(), this.a.eW.k(), dxjh.c(this.a.J()), this.a.eW.u());
        baatVar.c = this.a.wq();
        baatVar.d = this.a.wl();
    }

    public final dzsj<batz> b() {
        dzsj<batz> dzsjVar = this.b;
        if (dzsjVar == null) {
            ewn ewnVar = new ewn(this, 1);
            this.b = ewnVar;
            return ewnVar;
        }
        return dzsjVar;
    }
}
