package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fcl  reason: default package */
/* loaded from: classes6.dex */
final class fcl<T> implements dzsj<T> {
    final /* synthetic */ fcm a;
    private final int b;

    public fcl(fcm fcmVar, int i) {
        this.a = fcmVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, bvec] */
    @Override // defpackage.dzsj
    public final T a() {
        if (this.b != 0) {
            return (T) this.a.b();
        }
        fcm fcmVar = this.a;
        ?? eo = fcmVar.a.eW.eo();
        dxio c = dxjc.c(fcmVar.a.eW.cQ());
        akfa rK = fcmVar.a.eW.a.rK();
        dxjg.e(rK);
        Executor sV = fcmVar.a.eW.a.sV();
        dxjg.e(sV);
        return (T) new avqd(eo, c, rK, sV);
    }
}
