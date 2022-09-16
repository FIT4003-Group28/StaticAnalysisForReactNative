package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ceyb  reason: default package */
/* loaded from: classes4.dex */
public class ceyb {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<bkpi> c;
    private final dzsj<bqji> d;
    private final dzsj<ceda> e;
    private final dzsj<cexu> f;
    private final dzsj<cebm> g;
    private final dzsj<ixf> h;
    private final dzsj<blmp> i;
    private final dzsj<cebr> j;
    private final dzsj<ceys> k;
    private final dzsj<bwqv> l;

    public ceyb(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<bkpi> dzsjVar3, dzsj<bqji> dzsjVar4, dzsj<ceda> dzsjVar5, dzsj<cexu> dzsjVar6, dzsj<cebm> dzsjVar7, dzsj<ixf> dzsjVar8, dzsj<blmp> dzsjVar9, dzsj<cebr> dzsjVar10, dzsj<ceys> dzsjVar11, dzsj<bwqv> dzsjVar12) {
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

    public final ceya a(cdjd cdjdVar, drkr drkrVar, boolean z, dbsg<drfs> dbsgVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(this.b.a(), 2);
        bkpi a = this.c.a();
        b(a, 3);
        bqji a2 = this.d.a();
        b(a2, 4);
        ceda a3 = this.e.a();
        b(a3, 5);
        cexu a4 = this.f.a();
        b(a4, 6);
        cebm a5 = this.g.a();
        b(a5, 7);
        ixf a6 = this.h.a();
        b(a6, 8);
        blmp a7 = this.i.a();
        b(a7, 9);
        cebr a8 = this.j.a();
        b(a8, 10);
        ceys a9 = this.k.a();
        b(a9, 11);
        bwqv a10 = this.l.a();
        b(a10, 12);
        b(cdjdVar, 13);
        b(drkrVar, 14);
        b(dbsgVar, 16);
        return new ceya(activity, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, cdjdVar, drkrVar, z, dbsgVar);
    }
}
