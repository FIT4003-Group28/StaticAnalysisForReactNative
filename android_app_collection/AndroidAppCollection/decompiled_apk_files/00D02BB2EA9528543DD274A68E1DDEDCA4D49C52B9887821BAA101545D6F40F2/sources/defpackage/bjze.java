package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bjze  reason: default package */
/* loaded from: classes3.dex */
public final class bjze {
    public final dzsj<gga> a;
    public final dzsj<cqhn> b;
    public final dzsj<bwqv> c;
    public final dzsj<bjyr> d;
    public final dzsj<bkak> e;
    public final dzsj<bjxd> f;
    public final dzsj<btrm> g;
    public final dzsj<bvfk> h;
    public final dzsj<Executor> i;
    public final dzsj<bjgi> j;
    public final dzsj<dxio<afha>> k;
    public final dzsj<bjgy> l;

    public bjze(dzsj<gga> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bwqv> dzsjVar3, dzsj<bjyr> dzsjVar4, dzsj<bkak> dzsjVar5, dzsj<bjxd> dzsjVar6, dzsj<btrm> dzsjVar7, dzsj<bvfk> dzsjVar8, dzsj<Executor> dzsjVar9, dzsj<bjgi> dzsjVar10, dzsj<dxio<afha>> dzsjVar11, dzsj<bjgy> dzsjVar12) {
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
