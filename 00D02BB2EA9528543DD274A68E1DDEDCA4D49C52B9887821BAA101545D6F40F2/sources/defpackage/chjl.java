package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chjl  reason: default package */
/* loaded from: classes4.dex */
public final class chjl {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<beya> c;
    public final dzsj<bfct> d;
    public final dzsj<bfbc> e;
    public final dzsj<bfaq> f;
    public final dzsj<dbpk> g;
    public final dzsj<bwqv> h;
    public final dzsj<bvrb> i;
    public final dzsj<dxio<bzmm>> j;
    public final dzsj<Executor> k;
    public final dzsj<bfbl> l;
    public final dzsj<bfbn> m;

    public chjl(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<beya> dzsjVar3, dzsj<bfct> dzsjVar4, dzsj<bfbc> dzsjVar5, dzsj<bfaq> dzsjVar6, dzsj<dbpk> dzsjVar7, dzsj<bwqv> dzsjVar8, dzsj<bvrb> dzsjVar9, dzsj<dxio<bzmm>> dzsjVar10, dzsj<Executor> dzsjVar11, dzsj<bfbl> dzsjVar12, dzsj<bfbn> dzsjVar13) {
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
