package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: attg  reason: default package */
/* loaded from: classes2.dex */
public final class attg {
    public final dzsj<btrm> a;
    public final dzsj<cref> b;
    public final dzsj<Context> c;
    public final dzsj<cqat> d;
    public final dzsj<cjqy> e;
    public final dzsj<cjqq> f;
    public final dzsj<dehq> g;
    public final dzsj<Executor> h;
    public final dzsj<atsr> i;
    public final dzsj<Boolean> j;
    public final dzsj<btvo> k;
    public final dzsj<pnq> l;
    public final dzsj<bvjj> m;
    public final dzsj<araj> n;
    public final dzsj<cqhn> o;
    public final dzsj<pot> p;

    public attg(dzsj<btrm> dzsjVar, dzsj<cref> dzsjVar2, dzsj<Context> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<cjqq> dzsjVar6, dzsj<dehq> dzsjVar7, dzsj<Executor> dzsjVar8, dzsj<atsr> dzsjVar9, dzsj<Boolean> dzsjVar10, dzsj<btvo> dzsjVar11, dzsj<pnq> dzsjVar12, dzsj<bvjj> dzsjVar13, dzsj<araj> dzsjVar14, dzsj<cqhn> dzsjVar15, dzsj<pot> dzsjVar16) {
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
