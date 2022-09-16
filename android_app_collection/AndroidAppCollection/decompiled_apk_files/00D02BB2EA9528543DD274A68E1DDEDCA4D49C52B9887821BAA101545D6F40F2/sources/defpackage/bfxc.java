package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bfxc  reason: default package */
/* loaded from: classes.dex */
public final class bfxc implements afhy {
    private final dzsj<gga> a;
    private final dzsj<afih> b;
    private final dzsj<afhe> c;
    private final dzsj<dxio<begg>> d;
    private final dzsj<dxio<bbut>> e;
    private final dzsj<eeu> f;
    private final dzsj<dxio<afwr>> g;
    private final dzsj<afhj> h;
    private final dzsj<dxio<btvo>> i;
    private final dzsj<dxio<cafi>> j;
    private final dzsj<dxio<cfrt>> k;
    private final dzsj<dxio<chnm>> l;
    private final dzsj<cklq> m;

    public bfxc(dzsj<gga> dzsjVar, dzsj<afih> dzsjVar2, dzsj<afhe> dzsjVar3, dzsj<dxio<begg>> dzsjVar4, dzsj<dxio<bbut>> dzsjVar5, dzsj<eeu> dzsjVar6, dzsj<dxio<afwr>> dzsjVar7, dzsj<afhj> dzsjVar8, dzsj<dxio<btvo>> dzsjVar9, dzsj<dxio<cafi>> dzsjVar10, dzsj<dxio<cfrt>> dzsjVar11, dzsj<dxio<chnm>> dzsjVar12, dzsj<cklq> dzsjVar13) {
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

    @Override // defpackage.afhy
    public final /* bridge */ /* synthetic */ afhx a(Intent intent, @dzsi String str) {
        b(intent, 1);
        gga a = this.a.a();
        b(a, 3);
        afih a2 = this.b.a();
        b(a2, 4);
        afhe a3 = this.c.a();
        b(a3, 5);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        eeu a6 = this.f.a();
        b(a6, 8);
        dxio a7 = ((dxjh) this.g).a();
        b(a7, 9);
        afhj a8 = this.h.a();
        b(a8, 10);
        dxio a9 = ((dxjh) this.i).a();
        b(a9, 11);
        dxio a10 = ((dxjh) this.j).a();
        b(a10, 12);
        dxio a11 = ((dxjh) this.k).a();
        b(a11, 13);
        dxio a12 = ((dxjh) this.l).a();
        b(a12, 14);
        cklq a13 = this.m.a();
        b(a13, 15);
        return new bfxb(intent, str, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13);
    }
}
