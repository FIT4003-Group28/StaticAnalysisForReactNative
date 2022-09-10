package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwrl  reason: default package */
/* loaded from: classes5.dex */
public final class cwrl implements Factory<cwrk> {
    private final dzsj<cxai> a;
    private final dzsj<cwuc> b;
    private final dzsj<dehq> c;
    private final dzsj<cwvg> d;
    private final dzsj<cwxq> e;
    private final dzsj<cwyp> f;
    private final dzsj<cwzp> g;
    private final dzsj<cxan> h;
    private final dzsj<dbsg<cxdi>> i;

    public cwrl(dzsj<cxai> dzsjVar, dzsj<cwuc> dzsjVar2, dzsj<dehq> dzsjVar3, dzsj<cwvg> dzsjVar4, dzsj<cwxq> dzsjVar5, dzsj<cwyp> dzsjVar6, dzsj<cwzp> dzsjVar7, dzsj<cxan> dzsjVar8, dzsj<dbsg<cxdi>> dzsjVar9) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
        this.e = dzsjVar5;
        this.f = dzsjVar6;
        this.g = dzsjVar7;
        this.h = dzsjVar8;
        this.i = dzsjVar9;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new cwrk(this.a, this.b.a(), this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }
}
