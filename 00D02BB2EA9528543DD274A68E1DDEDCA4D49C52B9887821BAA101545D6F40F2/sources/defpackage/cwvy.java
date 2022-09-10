package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cwvy  reason: default package */
/* loaded from: classes5.dex */
public final class cwvy implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<dzsj<cwvf>>> a;
    private final dzsj<cwvl> b;

    public cwvy(dzsj<dbsg<dzsj<cwvf>>> dzsjVar, dzsj<cwvl> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Object B = (!((dbsg) ((dxjd) this.a).a).a() || !cwvw.a()) ? dcmr.a : dcep.B(this.b.a());
        dxjg.f(B);
        return B;
    }
}
