package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxat  reason: default package */
/* loaded from: classes5.dex */
public final class cxat implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<dzsj<cxai>>> a;
    private final dzsj<cxar> b;

    public cxat(dzsj<dbsg<dzsj<cxai>>> dzsjVar, dzsj<cxar> dzsjVar2) {
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
