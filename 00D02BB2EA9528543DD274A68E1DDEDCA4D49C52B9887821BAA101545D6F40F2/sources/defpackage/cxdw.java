package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cxdw  reason: default package */
/* loaded from: classes5.dex */
public final class cxdw implements Factory<Set<cwwr>> {
    private final dzsj<dbsg<cxej>> a;
    private final dzsj<cxeo> b;

    public cxdw(dzsj<dbsg<cxej>> dzsjVar, dzsj<cxeo> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Object B = ((cxdx) this.a).a().a() ? dcep.B(this.b.a()) : dcmr.a;
        dxjg.f(B);
        return B;
    }
}
