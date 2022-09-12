package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cwxx  reason: default package */
/* loaded from: classes5.dex */
public final class cwxx implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<dzsj<cwxp>>> a;
    private final dzsj<cwxu> b;

    public cwxx(dzsj<dbsg<dzsj<cwxp>>> dzsjVar, dzsj<cwxu> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Object B = ((dbsg) ((dxjd) this.a).a).a() ? dcep.B(this.b.a()) : dcmr.a;
        dxjg.f(B);
        return B;
    }
}
