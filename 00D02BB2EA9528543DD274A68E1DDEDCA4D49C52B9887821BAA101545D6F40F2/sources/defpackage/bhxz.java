package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bhxz  reason: default package */
/* loaded from: classes3.dex */
public final class bhxz {
    public final dzsj<ff> a;
    public final dzsj<bvrb> b;
    public final dzsj<cztz> c;
    public final dzsj<dxio<akfa>> d;
    public final dzsj<axwy> e;
    public final dzsj<dxio<axwq>> f;
    public final dzsj<buju> g;
    public final dzsj<cqhn> h;
    public final dzsj<btvo> i;
    public final dzsj<axws> j;
    public final dzsj<Executor> k;
    public final dzsj<cjqy> l;

    public bhxz(dzsj<ff> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<cztz> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<axwy> dzsjVar5, dzsj<dxio<axwq>> dzsjVar6, dzsj<buju> dzsjVar7, dzsj<cqhn> dzsjVar8, dzsj<btvo> dzsjVar9, dzsj<axws> dzsjVar10, dzsj<Executor> dzsjVar11, dzsj<cjqy> dzsjVar12) {
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
        a(dzsjVar11, 11);
        this.k = dzsjVar11;
        a(dzsjVar12, 12);
        this.l = dzsjVar12;
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
