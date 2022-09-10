package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cexl  reason: default package */
/* loaded from: classes4.dex */
public class cexl {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<Executor> c;
    public final dzsj<dxio<afha>> d;
    public final dzsj<cavs> e;
    public final dzsj<axjh> f;
    public final dzsj<ceet> g;
    public final dzsj<cetx> h;
    public final dzsj<cetz> i;
    public final dzsj<cexn> j;
    public final dzsj<ceyw> k;
    public final dzsj<cetv> l;
    public final dzsj<axni> m;
    public final dzsj<cese> n;

    public cexl(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<dxio<afha>> dzsjVar4, dzsj<cavs> dzsjVar5, dzsj<axjh> dzsjVar6, dzsj<ceet> dzsjVar7, dzsj<cetx> dzsjVar8, dzsj<cetz> dzsjVar9, dzsj<cexn> dzsjVar10, dzsj<ceyw> dzsjVar11, dzsj<cetv> dzsjVar12, dzsj<axni> dzsjVar13, dzsj<cese> dzsjVar14) {
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
