package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: jop  reason: default package */
/* loaded from: classes.dex */
public final class jop implements afhy {
    private final dzsj<gga> a;
    private final dzsj<bvrb> b;
    private final dzsj<auhi> c;
    private final dzsj<bvjj> d;
    private final dzsj<dxio<joc>> e;
    private final dzsj<dxio<ahjq>> f;
    private final dzsj<btvo> g;

    public jop(dzsj<gga> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<auhi> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<dxio<joc>> dzsjVar5, dzsj<dxio<ahjq>> dzsjVar6, dzsj<btvo> dzsjVar7) {
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
        bvrb a2 = this.b.a();
        b(a2, 4);
        auhi a3 = this.c.a();
        b(a3, 5);
        bvjj a4 = this.d.a();
        b(a4, 6);
        dxio a5 = ((dxjh) this.e).a();
        b(a5, 7);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 8);
        btvo a7 = this.g.a();
        b(a7, 9);
        return new joo(intent, str, a, a2, a3, a4, a5, a6, a7);
    }
}
