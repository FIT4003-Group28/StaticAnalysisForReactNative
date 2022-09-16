package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahxy  reason: default package */
/* loaded from: classes2.dex */
public final class ahxy {
    public final dzsj<gga> a;
    public final dzsj<ajsa> b;
    public final dzsj<akai> c;
    public final dzsj<akfc> d;
    public final dzsj<akfa> e;
    public final dzsj<cqhn> f;
    public final dzsj<cqhu> g;
    public final dzsj<Executor> h;
    public final dzsj<Executor> i;
    public final dzsj<ajmq> j;
    public final dzsj<ahzd> k;
    public final dzsj<ahzh> l;
    public final dzsj<cpv> m;
    public final dzsj<ajln> n;

    public ahxy(dzsj<gga> dzsjVar, dzsj<ajsa> dzsjVar2, dzsj<akai> dzsjVar3, dzsj<akfc> dzsjVar4, dzsj<akfa> dzsjVar5, dzsj<cqhn> dzsjVar6, dzsj<cqhu> dzsjVar7, dzsj<Executor> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<ajmq> dzsjVar10, dzsj<ahzd> dzsjVar11, dzsj<ahzh> dzsjVar12, dzsj<cpv> dzsjVar13, dzsj<ajln> dzsjVar14) {
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
