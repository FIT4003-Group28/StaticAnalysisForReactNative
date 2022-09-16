package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fqn  reason: default package */
/* loaded from: classes6.dex */
final class fqn<T> implements dzsj<T> {
    final /* synthetic */ fqo a;
    private final int b;

    public fqn(fqo fqoVar, int i) {
        this.a = fqoVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            return (T) new shk();
        }
        fqo fqoVar = this.a;
        ckcw rU = fqoVar.a.eW.a.rU();
        dxjg.e(rU);
        qro bJ = fqoVar.a.eW.bJ();
        azql bD = fqoVar.a.eW.bD();
        qjk bK = fqoVar.a.eW.bK();
        axwe bE = fqoVar.a.eW.bE();
        sic bI = fqoVar.a.eW.bI();
        axwq qn = fqoVar.a.eW.qn();
        dxio c = dxjc.c(fqoVar.a.J());
        dehp tl = fqoVar.a.eW.a.tl();
        dxjg.e(tl);
        Executor sU = fqoVar.a.eW.a.sU();
        dxjg.e(sU);
        return (T) new sbz(rU, bJ, bD, bK, bE, bI, qn, c, tl, sU);
    }
}
