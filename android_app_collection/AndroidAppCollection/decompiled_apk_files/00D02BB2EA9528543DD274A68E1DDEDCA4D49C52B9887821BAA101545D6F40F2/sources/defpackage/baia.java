package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: baia  reason: default package */
/* loaded from: classes3.dex */
public final class baia {
    public final dzsj<baez> a;
    public final dzsj<cqhn> b;
    public final dzsj<Executor> c;
    public final dzsj<gga> d;
    public final dzsj<bwqv> e;
    public final dzsj<dxio<axwi>> f;
    public final dzsj<baib> g;
    public final dzsj<bbat> h;
    public final dzsj<bbca> i;
    public final dzsj<btvo> j;

    public baia(dzsj<baez> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<gga> dzsjVar4, dzsj<bwqv> dzsjVar5, dzsj<dxio<axwi>> dzsjVar6, dzsj<baib> dzsjVar7, dzsj<bbat> dzsjVar8, dzsj<bbca> dzsjVar9, dzsj<btvo> dzsjVar10) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
