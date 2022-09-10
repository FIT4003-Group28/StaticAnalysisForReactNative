package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: arpu  reason: default package */
/* loaded from: classes.dex */
public final class arpu implements afhy {
    private final dzsj<gga> a;
    private final dzsj<afih> b;
    private final dzsj<afhe> c;
    private final dzsj<btvo> d;
    private final dzsj<bvjj> e;
    private final dzsj<cjqy> f;
    private final dzsj<dxio<ascb>> g;
    private final dzsj<eeu> h;
    private final dzsj<dxio<afwr>> i;
    private final dzsj<qeg> j;

    public arpu(dzsj<gga> dzsjVar, dzsj<afih> dzsjVar2, dzsj<afhe> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<bvjj> dzsjVar5, dzsj<cjqy> dzsjVar6, dzsj<dxio<ascb>> dzsjVar7, dzsj<eeu> dzsjVar8, dzsj<dxio<afwr>> dzsjVar9, dzsj<qeg> dzsjVar10) {
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
        btvo a4 = this.d.a();
        b(a4, 6);
        b(this.e.a(), 7);
        cjqy a5 = this.f.a();
        b(a5, 8);
        dxio a6 = ((dxjh) this.g).a();
        b(a6, 9);
        eeu a7 = this.h.a();
        b(a7, 10);
        dxio a8 = ((dxjh) this.i).a();
        b(a8, 11);
        qeg a9 = this.j.a();
        b(a9, 12);
        return new arpt(intent, str, a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
}
