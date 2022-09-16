package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bydb  reason: default package */
/* loaded from: classes4.dex */
public final class bydb {
    public final dzsj<gga> a;
    public final dzsj<cklf> b;
    public final dzsj<buka> c;
    public final dzsj<cqat> d;
    public final dzsj<bvjj> e;
    public final dzsj<bttf> f;
    public final dzsj<cjqy> g;
    public final dzsj<cjxl> h;
    public final dzsj<dxio<bsvm>> i;
    public final dzsj<dxio<awnv>> j;
    public final dzsj<ckcw> k;
    public final dzsj<dxio<akfa>> l;
    public final dzsj<cqhn> m;
    public final dzsj<Executor> n;
    public final dzsj<Executor> o;

    public bydb(dzsj<gga> dzsjVar, dzsj<cklf> dzsjVar2, dzsj<buka> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<bttf> dzsjVar6, dzsj<cjqy> dzsjVar7, dzsj<cjxl> dzsjVar8, dzsj<dxio<bsvm>> dzsjVar9, dzsj<dxio<awnv>> dzsjVar10, dzsj<ckcw> dzsjVar11, dzsj<dxio<akfa>> dzsjVar12, dzsj<cqhn> dzsjVar13, dzsj<Executor> dzsjVar14, dzsj<Executor> dzsjVar15) {
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
