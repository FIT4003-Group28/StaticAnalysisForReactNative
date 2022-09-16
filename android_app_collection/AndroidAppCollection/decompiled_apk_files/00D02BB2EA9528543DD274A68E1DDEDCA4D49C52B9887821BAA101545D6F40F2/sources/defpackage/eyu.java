package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: eyu  reason: default package */
/* loaded from: classes6.dex */
final class eyu<T> implements dzsj<T> {
    final /* synthetic */ eyv a;
    private final int b;

    public eyu(eyv eyvVar, int i) {
        this.a = eyvVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) this.a.b();
            }
            eyv eyvVar = this.a;
            return (T) new aruv(eyvVar.b.eW.I(), eyvVar.b.eW.at());
        }
        eyv eyvVar2 = this.a;
        dzsj<btvo> V = eyvVar2.b.eW.V();
        dzsj<Context> I = eyvVar2.b.eW.I();
        dzsj dzsjVar = eyvVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new eyu(eyvVar2, 1);
            eyvVar2.a = dzsjVar;
        }
        return (T) new aruq(V, I, dzsjVar);
    }
}
