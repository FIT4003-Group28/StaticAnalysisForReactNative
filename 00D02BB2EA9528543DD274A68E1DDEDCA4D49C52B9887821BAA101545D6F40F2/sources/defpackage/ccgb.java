package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ccgb  reason: default package */
/* loaded from: classes.dex */
public final class ccgb implements afhy {
    private final dzsj<bvvw> a;
    private final dzsj<btvo> b;
    private final dzsj<ccgo> c;
    private final dzsj<ccgp> d;
    private final dzsj<cfrt> e;
    private final dzsj<chnm> f;
    private final dzsj<auhi> g;

    public ccgb(dzsj<bvvw> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<ccgo> dzsjVar3, dzsj<ccgp> dzsjVar4, dzsj<cfrt> dzsjVar5, dzsj<chnm> dzsjVar6, dzsj<auhi> dzsjVar7) {
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
        bvvw a = this.a.a();
        b(a, 3);
        btvo a2 = this.b.a();
        b(a2, 4);
        ccgo a3 = this.c.a();
        b(a3, 5);
        ccgp a4 = this.d.a();
        b(a4, 6);
        cfrt a5 = this.e.a();
        b(a5, 7);
        chnm a6 = this.f.a();
        b(a6, 8);
        auhi a7 = this.g.a();
        b(a7, 9);
        return new ccga(intent, str, a, a2, a3, a4, a5, a6, a7);
    }
}
