package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccez  reason: default package */
/* loaded from: classes.dex */
public final class ccez implements afhy {
    private final dzsj<gga> a;
    private final dzsj<bvjj> b;
    private final dzsj<dxio<auhi>> c;
    private final dzsj<begg> d;
    private final dzsj<cafi> e;
    private final dzsj<akfa> f;
    private final dzsj<akfc> g;
    private final dzsj<bvrb> h;
    private final dzsj<bolb> i;
    private final dzsj<bokp> j;
    private final dzsj<cqkj> k;

    public ccez(dzsj<gga> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<dxio<auhi>> dzsjVar3, dzsj<begg> dzsjVar4, dzsj<cafi> dzsjVar5, dzsj<akfa> dzsjVar6, dzsj<akfc> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<bolb> dzsjVar9, dzsj<bokp> dzsjVar10, dzsj<cqkj> dzsjVar11) {
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
        bvjj a2 = this.b.a();
        b(a2, 4);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 5);
        begg a4 = this.d.a();
        b(a4, 6);
        cafi a5 = this.e.a();
        b(a5, 7);
        akfa a6 = this.f.a();
        b(a6, 8);
        akfc a7 = this.g.a();
        b(a7, 9);
        bvrb a8 = this.h.a();
        b(a8, 10);
        bolb a9 = this.i.a();
        b(a9, 11);
        bokp a10 = this.j.a();
        b(a10, 12);
        cqkj a11 = this.k.a();
        b(a11, 13);
        return new ccey(intent, str, a, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11);
    }
}
