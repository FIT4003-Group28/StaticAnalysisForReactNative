package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: apen  reason: default package */
/* loaded from: classes2.dex */
public final class apen {
    public final dzsj<cqhn> a;
    public final dzsj<begg> b;
    public final dzsj<axyp> c;
    public final dzsj<axwy> d;
    public final dzsj<bwqv> e;
    public final dzsj<gga> f;
    public final dzsj<anhg> g;
    public final dzsj<angp> h;
    public final dzsj<anhk> i;
    public final dzsj<Executor> j;
    public final dzsj<cjqy> k;
    public final dzsj<apdb> l;
    public final dzsj<apcl> m;
    public final dzsj<aoxv> n;
    public final dzsj<btvo> o;

    public apen(dzsj<cqhn> dzsjVar, dzsj<begg> dzsjVar2, dzsj<axyp> dzsjVar3, dzsj<axwy> dzsjVar4, dzsj<bwqv> dzsjVar5, dzsj<gga> dzsjVar6, dzsj<anhg> dzsjVar7, dzsj<angp> dzsjVar8, dzsj<anhk> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<cjqy> dzsjVar11, dzsj<apdb> dzsjVar12, dzsj<apcl> dzsjVar13, dzsj<aoxv> dzsjVar14, dzsj<btvo> dzsjVar15) {
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
