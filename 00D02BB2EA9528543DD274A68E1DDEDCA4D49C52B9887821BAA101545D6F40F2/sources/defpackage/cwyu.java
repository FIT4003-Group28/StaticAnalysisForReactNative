package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwyu  reason: default package */
/* loaded from: classes5.dex */
public final class cwyu implements Factory<cwyp> {
    private final dzsj<dbsg<dzsj<cwyo>>> a;
    private final dzsj<cwyj> b;

    public cwyu(dzsj<dbsg<dzsj<cwyo>>> dzsjVar, dzsj<cwyj> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cwyp a() {
        cwyj cwyqVar;
        dbsg dbsgVar = (dbsg) ((dxjd) this.a).a;
        dzsj<cwyj> dzsjVar = this.b;
        if (cwyr.a() && dbsgVar.a()) {
            cwyqVar = dzsjVar.a();
        } else {
            cwyqVar = new cwyq();
        }
        dxjg.f(cwyqVar);
        return cwyqVar;
    }
}
