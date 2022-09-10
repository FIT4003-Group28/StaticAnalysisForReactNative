package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afjk  reason: default package */
/* loaded from: classes2.dex */
public final class afjk implements afhy {
    private final dzsj<afhb> a;
    private final dzsj<gga> b;
    private final dzsj<bvrb> c;
    private final dzsj<afgy> d;

    public afjk(dzsj<afhb> dzsjVar, dzsj<gga> dzsjVar2, dzsj<bvrb> dzsjVar3, dzsj<afgy> dzsjVar4) {
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
        b(intent, 1);
        afhb a = this.a.a();
        b(a, 3);
        gga a2 = this.b.a();
        b(a2, 4);
        bvrb a3 = this.c.a();
        b(a3, 5);
        afgy a4 = this.d.a();
        b(a4, 6);
        return new afjj(intent, str, a, a2, a3, a4);
    }
}
