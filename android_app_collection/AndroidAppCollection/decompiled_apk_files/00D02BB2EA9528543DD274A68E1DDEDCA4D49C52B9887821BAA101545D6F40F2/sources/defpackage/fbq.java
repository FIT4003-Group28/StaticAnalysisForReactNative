package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fbq  reason: default package */
/* loaded from: classes6.dex */
final class fbq<T> implements dzsj<T> {
    final /* synthetic */ fbr a;
    private final int b;

    public fbq(fbr fbrVar, int i) {
        this.a = fbrVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            fbr fbrVar = this.a;
            gga wk = fbrVar.a.wk();
            Executor sU = fbrVar.a.eW.a.sU();
            dxjg.e(sU);
            return (T) new cctx(wk, sU, fbrVar.a.kr(), fbrVar.a.aB());
        }
        fbr fbrVar2 = this.a;
        Executor sU2 = fbrVar2.a.eW.a.sU();
        dxjg.e(sU2);
        return (T) new ccrf(sU2, new cctt(fbrVar2.a.wk()));
    }
}
