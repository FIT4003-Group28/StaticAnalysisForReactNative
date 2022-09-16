package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: eqo  reason: default package */
/* loaded from: classes6.dex */
final class eqo<T> implements dzsj<T> {
    final /* synthetic */ eqp a;
    private final int b;

    public eqo(eqp eqpVar, int i) {
        this.a = eqpVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) this.a.b();
            }
            eqp eqpVar = this.a;
            return (T) new aruv(eqpVar.b.eW.I(), eqpVar.b.eW.at());
        }
        eqp eqpVar2 = this.a;
        dzsj<btvo> V = eqpVar2.b.eW.V();
        dzsj<Context> I = eqpVar2.b.eW.I();
        dzsj dzsjVar = eqpVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new eqo(eqpVar2, 1);
            eqpVar2.a = dzsjVar;
        }
        return (T) new aruq(V, I, dzsjVar);
    }
}
