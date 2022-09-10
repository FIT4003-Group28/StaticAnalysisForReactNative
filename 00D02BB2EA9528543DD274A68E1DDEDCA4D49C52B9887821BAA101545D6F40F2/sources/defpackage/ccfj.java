package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccfj  reason: default package */
/* loaded from: classes.dex */
public final class ccfj implements afhy {
    private final dzsj<btvo> a;
    private final dzsj<ceet> b;
    private final dzsj<cfrt> c;
    private final dzsj<chnm> d;
    private final dzsj<ccem> e;
    private final dzsj<ccfy> f;
    private final dzsj<eeu> g;
    private final dzsj<akfa> h;
    private final dzsj<auhi> i;

    public ccfj(dzsj<btvo> dzsjVar, dzsj<ceet> dzsjVar2, dzsj<cfrt> dzsjVar3, dzsj<chnm> dzsjVar4, dzsj<ccem> dzsjVar5, dzsj<ccfy> dzsjVar6, dzsj<eeu> dzsjVar7, dzsj<akfa> dzsjVar8, dzsj<auhi> dzsjVar9) {
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
        btvo a = this.a.a();
        b(a, 1);
        ceet a2 = this.b.a();
        b(a2, 2);
        cfrt a3 = this.c.a();
        b(a3, 3);
        chnm a4 = this.d.a();
        b(a4, 4);
        ccem a5 = this.e.a();
        b(a5, 5);
        ccfy a6 = this.f.a();
        b(a6, 6);
        eeu a7 = this.g.a();
        b(a7, 7);
        akfa a8 = this.h.a();
        b(a8, 8);
        auhi a9 = this.i.a();
        b(a9, 9);
        b(intent, 10);
        return new ccfi(a, a2, a3, a4, a5, a6, a7, a8, a9, intent, str);
    }
}
