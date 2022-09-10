package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: aluo  reason: default package */
/* loaded from: classes.dex */
public final class aluo implements afhy {
    private final dzsj<gga> a;
    private final dzsj<afih> b;
    private final dzsj<afhe> c;
    private final dzsj<eeu> d;
    private final dzsj<akox> e;
    private final dzsj<dxio<ahjq>> f;
    private final dzsj<bvrb> g;
    private final dzsj<dxio<araj>> h;
    private final dzsj<dxio<afwr>> i;

    public aluo(dzsj<gga> dzsjVar, dzsj<afih> dzsjVar2, dzsj<afhe> dzsjVar3, dzsj<eeu> dzsjVar4, dzsj<akox> dzsjVar5, dzsj<dxio<ahjq>> dzsjVar6, dzsj<bvrb> dzsjVar7, dzsj<dxio<araj>> dzsjVar8, dzsj<dxio<afwr>> dzsjVar9) {
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
        b(intent, 1);
        gga a = this.a.a();
        b(a, 3);
        afih a2 = this.b.a();
        b(a2, 4);
        afhe a3 = this.c.a();
        b(a3, 5);
        eeu a4 = this.d.a();
        b(a4, 6);
        akox a5 = this.e.a();
        b(a5, 7);
        dxio a6 = ((dxjh) this.f).a();
        b(a6, 8);
        bvrb a7 = this.g.a();
        b(a7, 9);
        dxio a8 = ((dxjh) this.h).a();
        b(a8, 10);
        dxio a9 = ((dxjh) this.i).a();
        b(a9, 11);
        return new alun(intent, str, a, a2, a3, a4, a5, a6, a7, a8, a9);
    }
}
