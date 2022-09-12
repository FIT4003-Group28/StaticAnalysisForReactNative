package defpackage;

import dagger.internal.Factory;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cwub  reason: default package */
/* loaded from: classes5.dex */
public final class cwub implements Factory<Set<cxfn>> {
    private final dzsj<dbty<Set<cxfn>>> a;

    public cwub(dzsj<dbty<Set<cxfn>>> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        Set set = (Set) ((dbty) ((dxjd) this.a).a).a();
        dxjg.f(set);
        return set;
    }
}
