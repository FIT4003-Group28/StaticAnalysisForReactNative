package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bfks  reason: default package */
/* loaded from: classes3.dex */
public final class bfks {
    private final dzsj<Activity> a;
    private final dzsj<cjqy> b;
    private final dzsj<bhat> c;
    private final dzsj<btvo> d;
    private final dzsj<bbut> e;
    private final dzsj<bwsh> f;
    private final dzsj<bvrb> g;
    private final dzsj<cqhn> h;
    private final dzsj<dxio<apqd>> i;
    private final dzsj<bvjj> j;
    private final dzsj<bvpe> k;
    private final dzsj<huc> l;
    private final dzsj<bmdy> m;
    private final dzsj<bflb> n;

    public bfks(dzsj<Activity> dzsjVar, dzsj<cjqy> dzsjVar2, dzsj<bhat> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<bbut> dzsjVar5, dzsj<bflb> dzsjVar6, dzsj<bwsh> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<cqhn> dzsjVar9, dzsj<dxio<apqd>> dzsjVar10, dzsj<bvjj> dzsjVar11, dzsj<bvpe> dzsjVar12, dzsj<huc> dzsjVar13, dzsj<bmdy> dzsjVar14, dzsj<bflb> dzsjVar15) {
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
        b(dzsjVar7, 7);
        this.f = dzsjVar7;
        b(dzsjVar8, 8);
        this.g = dzsjVar8;
        b(dzsjVar9, 9);
        this.h = dzsjVar9;
        b(dzsjVar10, 10);
        this.i = dzsjVar10;
        b(dzsjVar11, 11);
        this.j = dzsjVar11;
        b(dzsjVar12, 12);
        this.k = dzsjVar12;
        b(dzsjVar13, 13);
        this.l = dzsjVar13;
        b(dzsjVar14, 14);
        this.m = dzsjVar14;
        b(dzsjVar15, 15);
        this.n = dzsjVar15;
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

    public final bfkr a(@dzsi Runnable runnable, @dzsi ckql ckqlVar, dbsg<bfke> dbsgVar) {
        b(dbsgVar, 3);
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 4);
        cjqy a = this.b.a();
        b(a, 5);
        bhat a2 = this.c.a();
        b(a2, 6);
        btvo a3 = this.d.a();
        b(a3, 7);
        bbut a4 = this.e.a();
        b(a4, 8);
        bflb a5 = this.n.a();
        b(a5, 9);
        bwsh a6 = this.f.a();
        b(a6, 10);
        bvrb a7 = this.g.a();
        b(a7, 11);
        cqhn a8 = this.h.a();
        b(a8, 12);
        dxio a9 = ((dxjh) this.i).a();
        b(a9, 13);
        bvjj a10 = this.j.a();
        b(a10, 14);
        bvpe a11 = this.k.a();
        b(a11, 15);
        huc a12 = this.l.a();
        b(a12, 16);
        bmdy a13 = this.m.a();
        b(a13, 17);
        return new bfkr(runnable, ckqlVar, dbsgVar, activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13);
    }
}
