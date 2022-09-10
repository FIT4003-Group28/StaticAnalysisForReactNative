package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxqa  reason: default package */
/* loaded from: classes4.dex */
public final class bxqa {
    public final dzsj<gga> a;
    public final dzsj<btpc> b;
    public final dzsj<bxos> c;
    public final dzsj<dxio<bxpi>> d;
    public final dzsj<dxio<bxpa>> e;
    public final dzsj<bxqn> f;
    public final dzsj<bxpn> g;
    public final dzsj<btvo> h;
    public final dzsj<cqhn> i;
    public final dzsj<axws> j;
    public final dzsj<axwq> k;
    public final dzsj<Executor> l;
    public final dzsj<bxot> m;
    public final dzsj<bxqk> n;

    public bxqa(dzsj<gga> dzsjVar, dzsj<btpc> dzsjVar2, dzsj<bxos> dzsjVar3, dzsj<dxio<bxpi>> dzsjVar4, dzsj<dxio<bxpa>> dzsjVar5, dzsj<bxqn> dzsjVar6, dzsj<bxpn> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<cqhn> dzsjVar9, dzsj<axws> dzsjVar10, dzsj<axwq> dzsjVar11, dzsj<Executor> dzsjVar12, dzsj<bxot> dzsjVar13, dzsj<bxqk> dzsjVar14) {
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
