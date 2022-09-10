package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: liz  reason: default package */
/* loaded from: classes7.dex */
public final class liz {
    public final dzsj<btrm> a;
    public final dzsj<cjqy> b;
    public final dzsj<cjqq> c;
    public final dzsj<bwqv> d;
    public final dzsj<cqat> e;
    public final dzsj<bvnx> f;
    public final dzsj<btvo> g;
    public final dzsj<akfa> h;
    public final dzsj<bvjj> i;
    public final dzsj<dxio<cref>> j;
    public final dzsj<ckcw> k;
    public final dzsj<asvx> l;
    public final dzsj<Executor> m;
    public final dzsj<Executor> n;
    public final dzsj<crzm<Boolean>> o;
    public final dzsj<jzv> p;
    public final dzsj<dxio<jzk>> q;
    public final dzsj<koc> r;

    public liz(dzsj<btrm> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<cjqq> dzsjVar3, dzsj<bwqv> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<bvnx> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<akfa> dzsjVar8, dzsj<bvjj> dzsjVar9, dzsj<dxio<cref>> dzsjVar10, dzsj<ckcw> dzsjVar11, dzsj<asvx> dzsjVar12, dzsj<Executor> dzsjVar13, dzsj<Executor> dzsjVar14, dzsj<crzm<Boolean>> dzsjVar15, dzsj<jzv> dzsjVar16, dzsj<dxio<jzk>> dzsjVar17, dzsj<koc> dzsjVar18) {
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
