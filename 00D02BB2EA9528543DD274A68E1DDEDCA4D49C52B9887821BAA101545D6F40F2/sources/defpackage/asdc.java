package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: asdc  reason: default package */
/* loaded from: classes2.dex */
public final class asdc {
    public final dzsj<btvo> a;
    public final dzsj<bvsl> b;
    public final dzsj<ahjq> c;
    public final dzsj<bvjj> d;
    public final dzsj<Resources> e;
    public final dzsj<amfi> f;
    public final dzsj<cqat> g;
    public final dzsj<brwl> h;
    public final dzsj<bnjv> i;
    public final dzsj<bmef> j;
    public final dzsj<vwv> k;
    public final dzsj<cfpe> l;
    public final dzsj<bxbe> m;
    public final dzsj<dxio<awps>> n;
    public final dzsj<asac> o;

    public asdc(dzsj<btvo> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<ahjq> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<Resources> dzsjVar5, dzsj<amfi> dzsjVar6, dzsj<cqat> dzsjVar7, dzsj<brwl> dzsjVar8, dzsj<bnjv> dzsjVar9, dzsj<bmef> dzsjVar10, dzsj<vwv> dzsjVar11, dzsj<cfpe> dzsjVar12, dzsj<bxbe> dzsjVar13, dzsj<dxio<awps>> dzsjVar14, dzsj<asac> dzsjVar15) {
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
        a(dzsjVar14, 14);
        this.n = dzsjVar14;
        a(dzsjVar15, 15);
        this.o = dzsjVar15;
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
