package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lkz  reason: default package */
/* loaded from: classes7.dex */
public final class lkz {
    public final dzsj<bvrb> a;
    public final dzsj<dehq> b;
    public final dzsj<Executor> c;
    public final dzsj<btrm> d;
    public final dzsj<cqat> e;
    public final dzsj<cjqy> f;
    public final dzsj<btvo> g;
    public final dzsj<bvjj> h;
    public final dzsj<ckcw> i;
    public final dzsj<bvly> j;
    public final dzsj<bvlo> k;
    public final dzsj<cqhn> l;
    public final dzsj<lwr> m;
    public final dzsj<aufc> n;

    public lkz(dzsj<bvrb> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<btrm> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<btvo> dzsjVar7, dzsj<bvjj> dzsjVar8, dzsj<ckcw> dzsjVar9, dzsj<bvly> dzsjVar10, dzsj<bvlo> dzsjVar11, dzsj<cqhn> dzsjVar12, dzsj<lwr> dzsjVar13, dzsj<aufc> dzsjVar14) {
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
