package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atuz  reason: default package */
/* loaded from: classes2.dex */
public final class atuz {
    public final dzsj<asbr> a;
    public final dzsj<btrm> b;
    public final dzsj<bvjj> c;
    public final dzsj<cref> d;
    public final dzsj<cqat> e;
    public final dzsj<cjqy> f;
    public final dzsj<cjqq> g;
    public final dzsj<Context> h;
    public final dzsj<dehq> i;
    public final dzsj<Executor> j;
    public final dzsj<atsr> k;
    public final dzsj<Boolean> l;
    public final dzsj<atus> m;
    public final dzsj<atuw> n;
    public final dzsj<btvo> o;
    public final dzsj<crfl> p;

    public atuz(dzsj<asbr> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<cref> dzsjVar4, dzsj<cqat> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<cjqq> dzsjVar7, dzsj<Context> dzsjVar8, dzsj<dehq> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<atsr> dzsjVar11, dzsj<Boolean> dzsjVar12, dzsj<atus> dzsjVar13, dzsj<atuw> dzsjVar14, dzsj<btvo> dzsjVar15, dzsj<crfl> dzsjVar16) {
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
