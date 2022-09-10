package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: afjz  reason: default package */
/* loaded from: classes.dex */
public final class afjz implements afhy {
    private final dzsj<gga> a;
    private final dzsj<bvrb> b;
    private final dzsj<afgy> c;

    public afjz(dzsj<gga> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<afgy> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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
        afgy a3 = this.c.a();
        b(a3, 5);
        return new afjy(intent, str, a, a2, a3);
    }
}
