package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cwyt  reason: default package */
/* loaded from: classes5.dex */
public final class cwyt implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<dzsj<cwyo>>> a;
    private final dzsj<cwyj> b;

    public cwyt(dzsj<dbsg<dzsj<cwyo>>> dzsjVar, dzsj<cwyj> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Object B = (!cwyr.a() || !((dbsg) ((dxjd) this.a).a).a()) ? dcmr.a : dcep.B(this.b.a());
        dxjg.f(B);
        return B;
    }
}
