package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: bwui  reason: default package */
/* loaded from: classes.dex */
public final class bwui implements afhy {
    private final dzsj<gga> a;
    private final dzsj<afih> b;
    private final dzsj<afhe> c;
    private final dzsj<dxio<bwsh>> d;
    private final dzsj<eeu> e;
    private final dzsj<dxio<afwr>> f;
    private final dzsj<afhj> g;

    public bwui(dzsj<gga> dzsjVar, dzsj<afih> dzsjVar2, dzsj<afhe> dzsjVar3, dzsj<dxio<bwsh>> dzsjVar4, dzsj<eeu> dzsjVar5, dzsj<dxio<afwr>> dzsjVar6, dzsj<afhj> dzsjVar7) {
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
        afih a2 = this.b.a();
        b(a2, 4);
        afhe a3 = this.c.a();
        b(a3, 5);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 6);
        eeu a5 = this.e.a();
        b(a5, 7);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 8);
        afhj a7 = this.g.a();
        b(a7, 9);
        return new bwuh(intent, str, a, a2, a3, a4, a5, a6, a7);
    }
}
