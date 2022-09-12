package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwwc  reason: default package */
/* loaded from: classes5.dex */
public final class cwwc implements Factory<cwwb> {
    private final dzsj<cxer> a;

    public cwwc(dzsj<cxer> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cwwb a() {
        return new cwwb(((cxes) this.a).a());
    }
}
