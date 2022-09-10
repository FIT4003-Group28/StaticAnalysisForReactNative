package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwwq  reason: default package */
/* loaded from: classes5.dex */
public final class cwwq implements Factory<cwwp> {
    private final dzsj<cwwl> a;
    private final dzsj<cwwt> b;
    private final dzsj<cwuc> c;
    private final dzsj<cxfc> d;

    public cwwq(dzsj<cwwl> dzsjVar, dzsj<cwwt> dzsjVar2, dzsj<cwuc> dzsjVar3, dzsj<cxfc> dzsjVar4) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
    }

    @Override // defpackage.dzsj
    /* renamed from: b */
    public final cwwp a() {
        return new cwwp(this.a, this.b, this.c, this.d);
    }
}
