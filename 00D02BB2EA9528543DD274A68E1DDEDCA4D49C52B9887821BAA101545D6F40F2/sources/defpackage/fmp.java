package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: fmp  reason: default package */
/* loaded from: classes6.dex */
final class fmp<T> implements dzsj<T> {
    final /* synthetic */ fmq a;
    private final int b;

    public fmp(fmq fmqVar, int i) {
        this.a = fmqVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) this.a.b();
            }
            fmq fmqVar = this.a;
            return (T) new aruv(fmqVar.b.eW.I(), fmqVar.b.eW.at());
        }
        fmq fmqVar2 = this.a;
        dzsj<btvo> V = fmqVar2.b.eW.V();
        dzsj<Context> I = fmqVar2.b.eW.I();
        dzsj dzsjVar = fmqVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new fmp(fmqVar2, 1);
            fmqVar2.a = dzsjVar;
        }
        return (T) new aruq(V, I, dzsjVar);
    }
}
