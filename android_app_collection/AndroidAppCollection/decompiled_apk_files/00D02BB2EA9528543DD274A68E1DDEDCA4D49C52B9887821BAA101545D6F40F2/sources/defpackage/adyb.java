package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: adyb  reason: default package */
/* loaded from: classes2.dex */
public final class adyb {
    public final dzsj<cqhn> a;
    public final dzsj<abfa> b;
    public final dzsj<dxio<cafi>> c;
    public final dzsj<btrm> d;
    public final dzsj<Resources> e;
    public final dzsj<adxf> f;
    public final dzsj<iyj> g;
    public final dzsj<axjh> h;
    public final dzsj<adwv> i;
    public final dzsj<bkpi> j;
    public final dzsj<bnos> k;
    public final dzsj<adyo> l;
    public final dzsj<fd> m;

    public adyb(dzsj<cqhn> dzsjVar, dzsj<abfa> dzsjVar2, dzsj<dxio<cafi>> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<Resources> dzsjVar5, dzsj<adxf> dzsjVar6, dzsj<iyj> dzsjVar7, dzsj<axjh> dzsjVar8, dzsj<adwv> dzsjVar9, dzsj<bkpi> dzsjVar10, dzsj<bnos> dzsjVar11, dzsj<adyo> dzsjVar12, dzsj<fd> dzsjVar13) {
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
        a(dzsjVar13, 13);
        this.m = dzsjVar13;
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
