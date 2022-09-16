package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: lks  reason: default package */
/* loaded from: classes7.dex */
public final class lks {
    public final dzsj<btrm> a;
    public final dzsj<cjqy> b;
    public final dzsj<bwqv> c;
    public final dzsj<btvo> d;
    public final dzsj<dxio<bvsf>> e;
    public final dzsj<akfa> f;
    public final dzsj<bvjj> g;
    public final dzsj<bnwn> h;
    public final dzsj<ckcw> i;
    public final dzsj<ahjq> j;
    public final dzsj<cqat> k;
    public final dzsj<Executor> l;
    public final dzsj<Executor> m;
    public final dzsj<jzv> n;
    public final dzsj<dbsg<vxn>> o;

    public lks(dzsj<btrm> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<dxio<bvsf>> dzsjVar5, dzsj<akfa> dzsjVar6, dzsj<bvjj> dzsjVar7, dzsj<bnwn> dzsjVar8, dzsj<ckcw> dzsjVar9, dzsj<ahjq> dzsjVar10, dzsj<cqat> dzsjVar11, dzsj<Executor> dzsjVar12, dzsj<Executor> dzsjVar13, dzsj<jzv> dzsjVar14, dzsj<dbsg<vxn>> dzsjVar15) {
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
