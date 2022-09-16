package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fbk  reason: default package */
/* loaded from: classes6.dex */
final class fbk<T> implements dzsj<T> {
    final /* synthetic */ fbl a;
    private final int b;

    public fbk(fbl fblVar, int i) {
        this.a = fblVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fbl fblVar = this.a;
            gga wk = fblVar.a.wk();
            Executor sU = fblVar.a.eW.a.sU();
            dxjg.e(sU);
            return (T) new cctx(wk, sU, fblVar.a.kr(), fblVar.a.aB());
        }
        fbl fblVar2 = this.a;
        dzsj<cqhn> il = fblVar2.a.eW.il();
        ftt fttVar = fblVar2.a;
        return (T) new ccyl(il, fttVar.eV, fttVar.uA());
    }
}
