package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: brgy  reason: default package */
/* loaded from: classes.dex */
public final class brgy implements afhy {
    private final dzsj<gga> a;
    private final dzsj<afih> b;
    private final dzsj<afhe> c;
    private final dzsj<eeu> d;
    private final dzsj<cjqy> e;
    private final dzsj<asik> f;
    private final dzsj<dxio<ckcw>> g;
    private final dzsj<dxio<begg>> h;
    private final dzsj<asim> i;
    private final dzsj<dxio<brba>> j;
    private final dzsj<dxio<ascb>> k;
    private final dzsj<dxio<ahjq>> l;
    private final dzsj<akpm> m;
    private final dzsj<dxio<afwr>> n;
    private final dzsj<afhj> o;
    private final dzsj<cklq> p;

    public brgy(dzsj<gga> dzsjVar, dzsj<afih> dzsjVar2, dzsj<afhe> dzsjVar3, dzsj<eeu> dzsjVar4, dzsj<cjqy> dzsjVar5, dzsj<asik> dzsjVar6, dzsj<dxio<ckcw>> dzsjVar7, dzsj<dxio<begg>> dzsjVar8, dzsj<asim> dzsjVar9, dzsj<dxio<brba>> dzsjVar10, dzsj<dxio<ascb>> dzsjVar11, dzsj<dxio<ahjq>> dzsjVar12, dzsj<akpm> dzsjVar13, dzsj<dxio<afwr>> dzsjVar14, dzsj<afhj> dzsjVar15, dzsj<cklq> dzsjVar16) {
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
        b(dzsjVar15, 15);
        this.o = dzsjVar15;
        b(dzsjVar16, 16);
        this.p = dzsjVar16;
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

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, @dzsi String str) {
        b(intent, 1);
        gga a = this.a.a();
        b(a, 3);
        afih a2 = this.b.a();
        b(a2, 4);
        afhe a3 = this.c.a();
        b(a3, 5);
        eeu a4 = this.d.a();
        b(a4, 6);
        cjqy a5 = this.e.a();
        b(a5, 7);
        asik a6 = this.f.a();
        b(a6, 8);
        dxio a7 = ((dxjh) this.g).a();
        b(a7, 9);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 10);
        asim a9 = this.i.a();
        b(a9, 11);
        dxio a10 = ((dxjh) this.j).a();
        b(a10, 12);
        dxio a11 = ((dxjh) this.k).a();
        b(a11, 13);
        dxio a12 = ((dxjh) this.l).a();
        b(a12, 14);
        akpm a13 = this.m.a();
        b(a13, 15);
        dxio a14 = ((dxjh) this.n).a();
        b(a14, 16);
        afhj a15 = this.o.a();
        b(a15, 17);
        cklq a16 = this.p.a();
        b(a16, 18);
        return new brgx(intent, str, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16);
    }
}
