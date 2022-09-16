package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bqcb  reason: default package */
/* loaded from: classes4.dex */
public final class bqcb {
    public final dzsj<gga> a;
    public final dzsj<eeu> b;
    public final dzsj<jmx> c;
    public final dzsj<bnyd> d;
    public final dzsj<Executor> e;
    public final dzsj<jkf> f;
    public final dzsj<cqhn> g;
    public final dzsj<jlp> h;
    public final dzsj<bqbb> i;
    public final dzsj<zzn> j;
    public final dzsj<afwr> k;
    public final dzsj<bpzq> l;
    public final dzsj<bqau> m;
    public final dzsj<gdc> n;
    public final dzsj<cpv> o;

    public bqcb(dzsj<gga> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<jmx> dzsjVar3, dzsj<bnyd> dzsjVar4, dzsj<Executor> dzsjVar5, dzsj<jkf> dzsjVar6, dzsj<cqhn> dzsjVar7, dzsj<jlp> dzsjVar8, dzsj<bqbb> dzsjVar9, dzsj<zzn> dzsjVar10, dzsj<afwr> dzsjVar11, dzsj<bpzq> dzsjVar12, dzsj<bqau> dzsjVar13, dzsj<gdc> dzsjVar14, dzsj<cpv> dzsjVar15) {
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
