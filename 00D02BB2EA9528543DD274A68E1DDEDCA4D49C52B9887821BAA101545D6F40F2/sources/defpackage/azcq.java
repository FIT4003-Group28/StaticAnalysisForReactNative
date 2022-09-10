package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: azcq  reason: default package */
/* loaded from: classes3.dex */
public final class azcq {
    public final dzsj<gga> a;
    public final dzsj<axwi> b;
    public final dzsj<Executor> c;
    public final dzsj<Executor> d;
    public final dzsj<azcd> e;
    public final dzsj<dxio<axwp>> f;
    public final dzsj<axwo> g;
    public final dzsj<axwy> h;
    public final dzsj<btrm> i;
    public final dzsj<gfq> j;
    public final dzsj<cqhn> k;

    public azcq(dzsj<gga> dzsjVar, dzsj<axwi> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<azcd> dzsjVar5, dzsj<dxio<axwp>> dzsjVar6, dzsj<axwo> dzsjVar7, dzsj<axwy> dzsjVar8, dzsj<btrm> dzsjVar9, dzsj<gfq> dzsjVar10, dzsj<cqhn> dzsjVar11) {
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
