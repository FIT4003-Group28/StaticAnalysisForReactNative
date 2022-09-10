package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ayyu  reason: default package */
/* loaded from: classes3.dex */
public final class ayyu implements ayyh {
    private final dzsj<Application> a;
    private final dzsj<bvjj> b;
    private final dzsj<dxio<akfa>> c;
    private final dzsj<aeqg> d;
    private final dzsj<brvm> e;
    private final dzsj<bmmq> f;
    private final dzsj<bfhu> g;
    private final dzsj<bfgx> h;
    private final dzsj<ahjq> i;
    private final dzsj<begg> j;
    private final dzsj<befw> k;
    private final dzsj<bwqv> l;
    private final dzsj<cqhn> m;
    private final dzsj<bruu> n;

    public ayyu(dzsj<Application> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<dxio<akfa>> dzsjVar3, dzsj<aeqg> dzsjVar4, dzsj<brvm> dzsjVar5, dzsj<bmmq> dzsjVar6, dzsj<bfhu> dzsjVar7, dzsj<bfgx> dzsjVar8, dzsj<ahjq> dzsjVar9, dzsj<begg> dzsjVar10, dzsj<befw> dzsjVar11, dzsj<bwqv> dzsjVar12, dzsj<cqhn> dzsjVar13, dzsj<bruu> dzsjVar14) {
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
        b(dzsjVar14, 14);
        this.n = dzsjVar14;
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

    @Override // defpackage.ayyh
    public final /* bridge */ /* synthetic */ ayyg a(bnjs bnjsVar, ilo iloVar, bvqg bvqgVar, cjtd cjtdVar) {
        Application a = this.a.a();
        b(a, 1);
        bvjj a2 = this.b.a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        aeqg a4 = this.d.a();
        b(a4, 4);
        brvm a5 = this.e.a();
        b(a5, 5);
        bmmq a6 = this.f.a();
        b(a6, 6);
        bfhu a7 = this.g.a();
        b(a7, 7);
        bfgx a8 = this.h.a();
        b(a8, 8);
        ahjq a9 = this.i.a();
        b(a9, 9);
        begg a10 = this.j.a();
        b(a10, 10);
        befw a11 = this.k.a();
        b(a11, 11);
        bwqv a12 = this.l.a();
        b(a12, 12);
        b(this.m.a(), 13);
        bruu a13 = this.n.a();
        b(a13, 14);
        b(bnjsVar, 15);
        b(iloVar, 16);
        b(bvqgVar, 17);
        b(cjtdVar, 18);
        return new ayyt(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, bnjsVar, iloVar, bvqgVar, cjtdVar);
    }
}
