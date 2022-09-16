package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccfy  reason: default package */
/* loaded from: classes.dex */
public final class ccfy implements afhy {
    private final dzsj<cfrt> a;
    private final dzsj<chnm> b;
    private final dzsj<gga> c;
    private final dzsj<eeu> d;
    private final dzsj<akfa> e;
    private final dzsj<akfc> f;
    private final dzsj<bvjj> g;
    private final dzsj<auhi> h;
    private final dzsj<bvrb> i;
    private final dzsj<avae> j;
    private final dzsj<ccem> k;

    public ccfy(dzsj<cfrt> dzsjVar, dzsj<chnm> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<eeu> dzsjVar4, dzsj<akfa> dzsjVar5, dzsj<akfc> dzsjVar6, dzsj<bvjj> dzsjVar7, dzsj<auhi> dzsjVar8, dzsj<bvrb> dzsjVar9, dzsj<avae> dzsjVar10, dzsj<ccem> dzsjVar11) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
        c(dzsjVar3, 3);
        this.c = dzsjVar3;
        c(dzsjVar4, 4);
        this.d = dzsjVar4;
        c(dzsjVar5, 5);
        this.e = dzsjVar5;
        c(dzsjVar6, 6);
        this.f = dzsjVar6;
        c(dzsjVar7, 7);
        this.g = dzsjVar7;
        c(dzsjVar8, 8);
        this.h = dzsjVar8;
        c(dzsjVar9, 9);
        this.i = dzsjVar9;
        c(dzsjVar10, 10);
        this.j = dzsjVar10;
        c(dzsjVar11, 11);
        this.k = dzsjVar11;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.afhy
    /* renamed from: b */
    public final ccfx a(Intent intent, @dzsi String str) {
        cfrt a = this.a.a();
        c(a, 1);
        chnm a2 = this.b.a();
        c(a2, 2);
        gga a3 = this.c.a();
        c(a3, 3);
        eeu a4 = this.d.a();
        c(a4, 4);
        akfa a5 = this.e.a();
        c(a5, 5);
        akfc a6 = this.f.a();
        c(a6, 6);
        bvjj a7 = this.g.a();
        c(a7, 7);
        auhi a8 = this.h.a();
        c(a8, 8);
        bvrb a9 = this.i.a();
        c(a9, 9);
        c(this.j.a(), 10);
        ccem a10 = this.k.a();
        c(a10, 11);
        c(intent, 12);
        return new ccfx(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, intent, str);
    }
}
