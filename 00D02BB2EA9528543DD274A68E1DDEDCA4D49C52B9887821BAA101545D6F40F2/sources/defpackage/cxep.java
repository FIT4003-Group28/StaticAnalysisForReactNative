package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cxep  reason: default package */
/* loaded from: classes5.dex */
public final class cxep implements Factory<cxeo> {
    private final dzsj<cwwp> a;
    private final dzsj<dehq> b;
    private final dzsj<cxec> c;
    private final dzsj<cxef> d;
    private final dzsj<cwuc> e;
    private final dzsj<cxfg> f;
    private final dzsj<cxew> g;

    public cxep(dzsj<cwwp> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<cxec> dzsjVar3, dzsj<cxef> dzsjVar4, dzsj<cwuc> dzsjVar5, dzsj<cxfg> dzsjVar6, dzsj<cxew> dzsjVar7) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
        this.g = dzsjVar7;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cxeo(((cwwq) this.a).a(), this.b.a(), dxjc.c(this.c), dxjc.c(this.d), this.e.a(), this.f, ((cxex) this.g).a());
    }
}
