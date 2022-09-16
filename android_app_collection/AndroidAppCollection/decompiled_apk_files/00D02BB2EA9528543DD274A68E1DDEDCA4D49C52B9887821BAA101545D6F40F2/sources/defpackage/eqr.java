package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: eqr  reason: default package */
/* loaded from: classes6.dex */
final class eqr<T> implements dzsj<T> {
    final /* synthetic */ eqs a;
    private final int b;

    public eqr(eqs eqsVar, int i) {
        this.a = eqsVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) this.a.b();
            }
            eqs eqsVar = this.a;
            return (T) new aruv(eqsVar.b.eW.I(), eqsVar.b.eW.at());
        }
        eqs eqsVar2 = this.a;
        dzsj<btvo> V = eqsVar2.b.eW.V();
        dzsj<Context> I = eqsVar2.b.eW.I();
        dzsj dzsjVar = eqsVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new eqr(eqsVar2, 1);
            eqsVar2.a = dzsjVar;
        }
        return (T) new aruq(V, I, dzsjVar);
    }
}
