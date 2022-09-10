package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccem  reason: default package */
/* loaded from: classes.dex */
public final class ccem implements afhy {
    private final dzsj<cafi> a;
    private final dzsj<gga> b;
    private final dzsj<eeu> c;
    private final dzsj<akfa> d;
    private final dzsj<akfc> e;
    private final dzsj<bvjj> f;
    private final dzsj<auhi> g;
    private final dzsj<bvrb> h;
    private final dzsj<cjqy> i;
    private final dzsj<avae> j;

    public ccem(dzsj<cafi> dzsjVar, dzsj<gga> dzsjVar2, dzsj<eeu> dzsjVar3, dzsj<akfa> dzsjVar4, dzsj<akfc> dzsjVar5, dzsj<bvjj> dzsjVar6, dzsj<auhi> dzsjVar7, dzsj<bvrb> dzsjVar8, dzsj<cjqy> dzsjVar9, dzsj<avae> dzsjVar10) {
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
    public final ccel a(Intent intent, @dzsi String str) {
        cafi a = this.a.a();
        c(a, 1);
        gga a2 = this.b.a();
        c(a2, 2);
        eeu a3 = this.c.a();
        c(a3, 3);
        akfa a4 = this.d.a();
        c(a4, 4);
        akfc a5 = this.e.a();
        c(a5, 5);
        bvjj a6 = this.f.a();
        c(a6, 6);
        auhi a7 = this.g.a();
        c(a7, 7);
        bvrb a8 = this.h.a();
        c(a8, 8);
        cjqy a9 = this.i.a();
        c(a9, 9);
        c(this.j.a(), 10);
        c(intent, 11);
        return new ccel(a, a2, a3, a4, a5, a6, a7, a8, a9, intent, str);
    }
}
