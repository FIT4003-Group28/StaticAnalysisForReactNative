package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxtp  reason: default package */
/* loaded from: classes4.dex */
public final class bxtp {
    public final dzsj<dxio<axwq>> a;
    public final dzsj<dxio<akfa>> b;
    public final dzsj<bxtf> c;
    public final dzsj<bato> d;
    public final dzsj<ahjq> e;
    public final dzsj<btvo> f;
    public final dzsj<dxio<wdy>> g;
    public final dzsj<cqat> h;
    public final dzsj<wdw> i;
    public final dzsj<Executor> j;
    public final dzsj<dehp> k;

    public bxtp(dzsj<dxio<axwq>> dzsjVar, dzsj<dxio<akfa>> dzsjVar2, dzsj<bxtf> dzsjVar3, dzsj<bato> dzsjVar4, dzsj<ahjq> dzsjVar5, dzsj<btvo> dzsjVar6, dzsj<dxio<wdy>> dzsjVar7, dzsj<cqat> dzsjVar8, dzsj<wdw> dzsjVar9, dzsj<Executor> dzsjVar10, dzsj<dehp> dzsjVar11) {
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
