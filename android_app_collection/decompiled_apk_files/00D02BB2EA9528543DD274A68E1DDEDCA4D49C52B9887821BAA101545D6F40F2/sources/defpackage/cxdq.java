package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxdq  reason: default package */
/* loaded from: classes5.dex */
public final class cxdq implements Factory<cxdp> {
    private final dzsj<cxdl> a;
    private final dzsj<cxed> b;

    public cxdq(dzsj<cxdl> dzsjVar, dzsj<cxed> dzsjVar2) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxdp(this.a.a(), this.b.a());
    }
}
