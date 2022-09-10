package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atxn  reason: default package */
/* loaded from: classes2.dex */
public final class atxn {
    public final dzsj<btrm> a;
    public final dzsj<btvo> b;
    public final dzsj<cref> c;
    public final dzsj<akfa> d;
    public final dzsj<ahwf> e;
    public final dzsj<aufc> f;
    public final dzsj<gga> g;
    public final dzsj<cqat> h;
    public final dzsj<ajus> i;
    public final dzsj<dehq> j;
    public final dzsj<Executor> k;
    public final dzsj<atsr> l;
    public final dzsj<cqhn> m;
    public final dzsj<cjqy> n;
    public final dzsj<cjqq> o;
    public final dzsj<Boolean> p;
    public final dzsj<ajae> q;
    public final dzsj<cqkj> r;

    public atxn(dzsj<btrm> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<cref> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<ahwf> dzsjVar5, dzsj<aufc> dzsjVar6, dzsj<gga> dzsjVar7, dzsj<cqat> dzsjVar8, dzsj<ajus> dzsjVar9, dzsj<dehq> dzsjVar10, dzsj<Executor> dzsjVar11, dzsj<atsr> dzsjVar12, dzsj<cqhn> dzsjVar13, dzsj<cjqy> dzsjVar14, dzsj<cjqq> dzsjVar15, dzsj<Boolean> dzsjVar16, dzsj<ajae> dzsjVar17, dzsj<cqkj> dzsjVar18) {
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
        a(dzsjVar16, 16);
        this.p = dzsjVar16;
        a(dzsjVar17, 17);
        this.q = dzsjVar17;
        a(dzsjVar18, 18);
        this.r = dzsjVar18;
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
