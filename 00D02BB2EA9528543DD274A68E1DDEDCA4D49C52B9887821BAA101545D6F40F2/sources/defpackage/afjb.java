package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afjb  reason: default package */
/* loaded from: classes.dex */
public final class afjb implements afhy {
    private final dzsj<gga> a;
    private final dzsj<dxio<akfc>> b;
    private final dzsj<dxio<akfa>> c;
    private final dzsj<dxio<afha>> d;

    public afjb(dzsj<gga> dzsjVar, dzsj<dxio<akfc>> dzsjVar2, dzsj<dxio<akfa>> dzsjVar3, dzsj<dxio<afha>> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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
        gga a = this.a.a();
        b(a, 1);
        dxio a2 = ((dxjh) this.b).a();
        b(a2, 2);
        dxio a3 = ((dxjh) this.c).a();
        b(a3, 3);
        dxio a4 = ((dxjh) this.d).a();
        b(a4, 4);
        b(intent, 5);
        return new afja(a, a2, a3, a4, intent, str);
    }
}
