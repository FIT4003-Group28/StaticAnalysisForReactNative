package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxcd  reason: default package */
/* loaded from: classes5.dex */
public final class cxcd implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<dzsj<cxcg>>> a;
    private final dzsj<cxcj> b;

    public cxcd(dzsj<dbsg<dzsj<cxcg>>> dzsjVar, dzsj<cxcj> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Object B = (!((dbsg) ((dxjd) this.a).a).a() || !cxcb.a()) ? dcmr.a : dcep.B(this.b.a());
        dxjg.f(B);
        return B;
    }
}
