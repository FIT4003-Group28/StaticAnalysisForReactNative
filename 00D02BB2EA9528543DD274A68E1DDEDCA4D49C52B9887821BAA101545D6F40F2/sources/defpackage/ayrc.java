package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ayrc  reason: default package */
/* loaded from: classes3.dex */
public final class ayrc {
    private final dzsj<Application> a;
    private final dzsj<gga> b;
    private final dzsj<bvjj> c;
    private final dzsj<dxio<akfa>> d;
    private final dzsj<aeqg> e;
    private final dzsj<brvm> f;
    private final dzsj<bmmq> g;
    private final dzsj<bfhu> h;
    private final dzsj<brwc> i;
    private final dzsj<bfgx> j;
    private final dzsj<ahjq> k;
    private final dzsj<bruu> l;

    public ayrc(dzsj<Application> dzsjVar, dzsj<gga> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<dxio<akfa>> dzsjVar4, dzsj<aeqg> dzsjVar5, dzsj<brvm> dzsjVar6, dzsj<bmmq> dzsjVar7, dzsj<bfhu> dzsjVar8, dzsj<brwc> dzsjVar9, dzsj<bfgx> dzsjVar10, dzsj<ahjq> dzsjVar11, dzsj<bruu> dzsjVar12) {
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

    public final ayrb a(bnjs bnjsVar, Runnable runnable, ddho ddhoVar, aymp aympVar) {
        Application a = this.a.a();
        b(a, 1);
        gga a2 = this.b.a();
        b(a2, 2);
        bvjj a3 = this.c.a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        aeqg a5 = this.e.a();
        b(a5, 5);
        brvm a6 = this.f.a();
        b(a6, 6);
        bmmq a7 = this.g.a();
        b(a7, 7);
        bfhu a8 = this.h.a();
        b(a8, 8);
        brwc a9 = this.i.a();
        b(a9, 9);
        bfgx a10 = this.j.a();
        b(a10, 10);
        ahjq a11 = this.k.a();
        b(a11, 11);
        bruu a12 = this.l.a();
        b(a12, 12);
        b(bnjsVar, 13);
        b(runnable, 14);
        b(ddhoVar, 15);
        b(aympVar, 16);
        return new ayrb(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, bnjsVar, runnable, ddhoVar, aympVar);
    }
}
