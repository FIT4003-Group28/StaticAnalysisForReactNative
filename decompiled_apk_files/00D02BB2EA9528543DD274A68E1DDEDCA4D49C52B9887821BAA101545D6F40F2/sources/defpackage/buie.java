package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: buie  reason: default package */
/* loaded from: classes4.dex */
public final class buie {
    private final dzsj<buhu> a;
    private final dzsj<buhv> b;
    private final dzsj<buhk> c;
    private final dzsj<buhm> d;
    private final dzsj<buhr> e;
    private final dzsj<buig> f;
    private final dzsj<buif> g;
    private final dzsj<buhx> h;
    private final dzsj<buho> i;
    private final dzsj<buhq> j;
    private final dzsj<cqat> k;
    private final dzsj<dbsg<ckcz>> l;
    private final dzsj<Executor> m;

    public buie(dzsj<buhu> dzsjVar, dzsj<buhv> dzsjVar2, dzsj<buhk> dzsjVar3, dzsj<buhm> dzsjVar4, dzsj<buhr> dzsjVar5, dzsj<buig> dzsjVar6, dzsj<buif> dzsjVar7, dzsj<buhx> dzsjVar8, dzsj<buho> dzsjVar9, dzsj<buhq> dzsjVar10, dzsj<cqat> dzsjVar11, dzsj<dbsg<ckcz>> dzsjVar12, dzsj<Executor> dzsjVar13) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
        b(dzsjVar11, 11);
        this.k = dzsjVar11;
        b(dzsjVar12, 12);
        this.l = dzsjVar12;
        b(dzsjVar13, 13);
        this.m = dzsjVar13;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final buid a(buad buadVar) {
        buhu a = this.a.a();
        b(a, 1);
        buhv a2 = this.b.a();
        b(a2, 2);
        buhk a3 = this.c.a();
        b(a3, 3);
        buhm a4 = this.d.a();
        b(a4, 4);
        buhr a5 = this.e.a();
        b(a5, 5);
        buig a6 = this.f.a();
        b(a6, 6);
        buif a7 = this.g.a();
        b(a7, 7);
        buhx a8 = this.h.a();
        b(a8, 8);
        buho a9 = this.i.a();
        b(a9, 9);
        buhq a10 = this.j.a();
        b(a10, 10);
        cqat a11 = this.k.a();
        b(a11, 11);
        dbsg<ckcz> a12 = this.l.a();
        b(a12, 12);
        Executor a13 = this.m.a();
        b(a13, 13);
        b(buadVar, 14);
        return new buid(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, buadVar);
    }
}
