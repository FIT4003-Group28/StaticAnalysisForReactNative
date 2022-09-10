package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fpf  reason: default package */
/* loaded from: classes6.dex */
final class fpf<T> implements dzsj<T> {
    final /* synthetic */ fpg a;
    private final int b;

    public fpf(fpg fpgVar, int i) {
        this.a = fpgVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                return (T) dbsg.i(this.a.d.wc());
            }
            if (i == 2) {
                return (T) dbsg.i(this.a.d.bn());
            }
            if (i != 3) {
                fpg fpgVar = this.a;
                akox ap = fpgVar.d.ap();
                ftt fttVar = fpgVar.d;
                rb rbVar = fttVar.a;
                Executor sU = fttVar.eW.a.sU();
                dxjg.e(sU);
                return (T) new bynx(ap, rbVar, sU);
            }
            return (T) dbsg.i(this.a.d.eW.qC());
        }
        fpg fpgVar2 = this.a;
        dzsj<bvsl> kf = fpgVar2.d.eW.kf();
        dzsj c = dxjh.c(fpgVar2.d.cC());
        dzsj dzsjVar = fpgVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new fpf(fpgVar2, 1);
            fpgVar2.a = dzsjVar;
        }
        dzsj c2 = dxjh.c(dzsjVar);
        dzsj dzsjVar2 = fpgVar2.b;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fpf(fpgVar2, 2);
            fpgVar2.b = dzsjVar2;
        }
        dzsj c3 = dxjh.c(dzsjVar2);
        dzsj dzsjVar3 = fpgVar2.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fpf(fpgVar2, 3);
            fpgVar2.c = dzsjVar3;
        }
        return (T) new bynr(kf, c, c2, c3, dxjh.c(dzsjVar3), fpgVar2.d.eW.al(), fpgVar2.d.eW.hN(), fpgVar2.d.eW.bu(), fpgVar2.d.eW.po(), fpgVar2.d.eW.pp(), fpgVar2.d.eW.il(), fpgVar2.d.eW.R(), fpgVar2.d.eW.V());
    }
}
