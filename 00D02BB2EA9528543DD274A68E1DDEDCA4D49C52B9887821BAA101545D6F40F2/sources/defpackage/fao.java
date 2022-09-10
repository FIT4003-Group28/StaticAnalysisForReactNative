package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: fao  reason: default package */
/* loaded from: classes6.dex */
final class fao<T> implements dzsj<T> {
    final /* synthetic */ fap a;
    private final int b;

    public fao(fap fapVar, int i) {
        this.a = fapVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        int i = this.b;
        if (i != 0) {
            if (i != 1) {
                return (T) this.a.b();
            }
            fap fapVar = this.a;
            return (T) new aruv(fapVar.b.eW.I(), fapVar.b.eW.at());
        }
        fap fapVar2 = this.a;
        dzsj<btvo> V = fapVar2.b.eW.V();
        dzsj<Context> I = fapVar2.b.eW.I();
        dzsj dzsjVar = fapVar2.a;
        if (dzsjVar == null) {
            dzsjVar = new fao(fapVar2, 1);
            fapVar2.a = dzsjVar;
        }
        return (T) new aruq(V, I, dzsjVar);
    }
}
