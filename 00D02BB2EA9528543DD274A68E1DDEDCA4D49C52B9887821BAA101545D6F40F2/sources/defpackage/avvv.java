package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avvv  reason: default package */
/* loaded from: classes3.dex */
public final class avvv {
    public final dzsj<fd> a;
    public final dzsj<avij> b;
    public final dzsj<Executor> c;
    public final dzsj<Executor> d;
    public final dzsj<cjqy> e;
    public final dzsj<cjqq> f;
    public final dzsj<avik> g;
    public final dzsj<btvo> h;
    public final dzsj<away> i;
    public final dzsj<akfa> j;
    public final dzsj<avuk> k;
    public final dzsj<avzo> l;
    public final dzsj<avzm> m;
    public final dzsj<avzp> n;

    public avvv(dzsj<fd> dzsjVar, dzsj<avij> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cjqq> dzsjVar6, dzsj<avik> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<away> dzsjVar9, dzsj<akfa> dzsjVar10, dzsj<avuk> dzsjVar11, dzsj<avzo> dzsjVar12, dzsj<avzm> dzsjVar13, dzsj<avzp> dzsjVar14) {
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
