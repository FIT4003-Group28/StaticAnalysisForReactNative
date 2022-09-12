package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bfxg  reason: default package */
/* loaded from: classes.dex */
public final class bfxg implements afhy {
    private final dzsj<gga> a;
    private final dzsj<begg> b;
    private final dzsj<bjbu> c;
    private final dzsj<eeu> d;
    private final dzsj<auhi> e;
    private final dzsj<bvjj> f;
    private final dzsj<bvrb> g;

    public bfxg(dzsj<gga> dzsjVar, dzsj<begg> dzsjVar2, dzsj<bjbu> dzsjVar3, dzsj<eeu> dzsjVar4, dzsj<auhi> dzsjVar5, dzsj<bvjj> dzsjVar6, dzsj<bvrb> dzsjVar7) {
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
        gga a = this.a.a();
        b(a, 3);
        begg a2 = this.b.a();
        b(a2, 4);
        bjbu a3 = this.c.a();
        b(a3, 5);
        eeu a4 = this.d.a();
        b(a4, 6);
        auhi a5 = this.e.a();
        b(a5, 7);
        bvjj a6 = this.f.a();
        b(a6, 8);
        bvrb a7 = this.g.a();
        b(a7, 9);
        return new bfxf(intent, str, a, a2, a3, a4, a5, a6, a7);
    }
}
