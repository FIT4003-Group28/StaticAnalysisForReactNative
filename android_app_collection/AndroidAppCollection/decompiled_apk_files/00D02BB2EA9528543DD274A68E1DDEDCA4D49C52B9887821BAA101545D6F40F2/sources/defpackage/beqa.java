package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: beqa  reason: default package */
/* loaded from: classes3.dex */
public final class beqa {
    public final dzsj<ff> a;
    public final dzsj<cqhn> b;
    public final dzsj<cqhu> c;
    public final dzsj<bgyb> d;
    public final dzsj<dxio<acwo>> e;
    public final dzsj<bepf> f;
    public final dzsj<bepo> g;
    public final dzsj<bepr> h;
    public final dzsj<beid> i;
    public final dzsj<beie> j;
    public final dzsj<bepv> k;
    public final dzsj<Executor> l;

    public beqa(dzsj<ff> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3, dzsj<bgyb> dzsjVar4, dzsj<dxio<acwo>> dzsjVar5, dzsj<bepf> dzsjVar6, dzsj<bepo> dzsjVar7, dzsj<bepr> dzsjVar8, dzsj<beid> dzsjVar9, dzsj<beie> dzsjVar10, dzsj<bepv> dzsjVar11, dzsj<Executor> dzsjVar12) {
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
