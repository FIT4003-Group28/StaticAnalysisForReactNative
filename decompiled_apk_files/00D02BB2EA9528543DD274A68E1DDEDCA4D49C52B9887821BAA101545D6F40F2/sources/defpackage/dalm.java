package defpackage;

import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: dalm  reason: default package */
/* loaded from: classes5.dex */
public final class dalm implements Factory<dall> {
    private final dzsj<damc> a;
    private final dzsj<dalh> b;
    private final dzsj<dalc> c;
    private final dzsj<damf> d;

    public dalm(dzsj<damc> dzsjVar, dzsj<dalh> dzsjVar2, dzsj<dalc> dzsjVar3, dzsj<damf> dzsjVar4) {
        this.a = dzsjVar;
        this.b = dzsjVar2;
        this.c = dzsjVar3;
        this.d = dzsjVar4;
    }

    @Override // defpackage.dzsj
    public final /* bridge */ /* synthetic */ Object a() {
        return new dall(this.a.a(), this.b.a(), this.c.a(), this.d.a());
    }
}
