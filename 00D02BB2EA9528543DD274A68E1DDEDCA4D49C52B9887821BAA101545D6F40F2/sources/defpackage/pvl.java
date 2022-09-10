package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: pvl  reason: default package */
/* loaded from: classes7.dex */
public final class pvl {
    public final dzsj<gga> a;
    public final dzsj<jkf> b;
    public final dzsj<vop> c;
    public final dzsj<bvrb> d;
    public final dzsj<yys> e;
    public final dzsj<qce> f;
    public final dzsj<qbt> g;
    public final dzsj<byej> h;
    public final dzsj<ziw> i;
    public final dzsj<Executor> j;
    public final dzsj<dxio<uin>> k;
    public final dzsj<qbv> l;
    public final dzsj<cqhn> m;

    public pvl(dzsj<gga> dzsjVar, dzsj<jkf> dzsjVar2, dzsj<vop> dzsjVar3, dzsj<bvrb> dzsjVar4, dzsj<yys> dzsjVar5, dzsj<qce> dzsjVar6, dzsj<qbt> dzsjVar7, dzsj<byej> dzsjVar8, dzsj<ziw> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<dxio<uin>> dzsjVar11, dzsj<qbv> dzsjVar12, dzsj<cqhn> dzsjVar13) {
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
