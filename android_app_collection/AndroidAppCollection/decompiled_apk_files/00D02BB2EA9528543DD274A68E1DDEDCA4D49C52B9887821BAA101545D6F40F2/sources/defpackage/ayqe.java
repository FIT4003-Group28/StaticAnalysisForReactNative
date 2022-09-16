package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ayqe  reason: default package */
/* loaded from: classes3.dex */
public final class ayqe {
    private final dzsj<Application> a;
    private final dzsj<btvo> b;
    private final dzsj<bvjj> c;
    private final dzsj<dxio<akfa>> d;
    private final dzsj<brvh> e;
    private final dzsj<aeqg> f;
    private final dzsj<brvm> g;
    private final dzsj<bmmq> h;
    private final dzsj<bfhu> i;
    private final dzsj<brwc> j;
    private final dzsj<bfgx> k;
    private final dzsj<ahjq> l;
    private final dzsj<bruu> m;

    public ayqe(dzsj<Application> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<brvh> dzsjVar5, dzsj<aeqg> dzsjVar6, dzsj<brvm> dzsjVar7, dzsj<bmmq> dzsjVar8, dzsj<bfhu> dzsjVar9, dzsj<brwc> dzsjVar10, dzsj<bfgx> dzsjVar11, dzsj<ahjq> dzsjVar12, dzsj<bruu> dzsjVar13) {
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

    public final ayqd a(bnjs bnjsVar, Runnable runnable, ddho ddhoVar) {
        Application a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        bvjj a2 = this.c.a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        brvh a4 = this.e.a();
        b(a4, 5);
        aeqg a5 = this.f.a();
        b(a5, 6);
        brvm a6 = this.g.a();
        b(a6, 7);
        bmmq a7 = this.h.a();
        b(a7, 8);
        bfhu a8 = this.i.a();
        b(a8, 9);
        brwc a9 = this.j.a();
        b(a9, 10);
        bfgx a10 = this.k.a();
        b(a10, 11);
        ahjq a11 = this.l.a();
        b(a11, 12);
        bruu a12 = this.m.a();
        b(a12, 13);
        b(bnjsVar, 14);
        b(runnable, 15);
        b(ddhoVar, 16);
        return new ayqd(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, bnjsVar, runnable, ddhoVar);
    }
}
