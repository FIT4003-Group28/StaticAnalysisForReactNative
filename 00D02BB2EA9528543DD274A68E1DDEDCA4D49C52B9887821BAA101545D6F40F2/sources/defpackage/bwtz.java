package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bwtz  reason: default package */
/* loaded from: classes4.dex */
final class bwtz {
    public final dzsj<akto> a;
    public final dzsj<Executor> b;
    public final dzsj<btrm> c;
    public final dzsj<bwsh> d;
    public final dzsj<alhv> e;
    public final dzsj<akox> f;
    public final dzsj<befw> g;
    public final dzsj<cjqy> h;
    public final dzsj<akzh> i;
    public final dzsj<abal> j;
    public final dzsj<bwuy> k;
    public final dzsj<qbt> l;

    public bwtz(dzsj<akto> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<btrm> dzsjVar3, dzsj<bwsh> dzsjVar4, dzsj<alhv> dzsjVar5, dzsj<akox> dzsjVar6, dzsj<befw> dzsjVar7, dzsj<cjqy> dzsjVar8, dzsj<akzh> dzsjVar9, dzsj<abal> dzsjVar10, dzsj<bwuy> dzsjVar11, dzsj<qbt> dzsjVar12) {
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
