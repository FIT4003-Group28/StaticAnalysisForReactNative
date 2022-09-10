package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: eql  reason: default package */
/* loaded from: classes6.dex */
final class eql<T> implements dzsj<T> {
    final /* synthetic */ eqm a;
    private final int b;

    public eql(eqm eqmVar, int i) {
        this.a = eqmVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) this.a.b();
            }
            eqm eqmVar = this.a;
            return (T) new aruv(eqmVar.b.eW.I(), eqmVar.b.eW.at());
        }
        eqm eqmVar2 = this.a;
        dzsj<btvo> V = eqmVar2.b.eW.V();
        dzsj<Context> I = eqmVar2.b.eW.I();
        dzsj dzsjVar = eqmVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new eql(eqmVar2, 1);
            eqmVar2.a = dzsjVar;
        }
        return (T) new aruq(V, I, dzsjVar);
    }
}
