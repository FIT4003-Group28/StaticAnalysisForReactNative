package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: azud  reason: default package */
/* loaded from: classes.dex */
public final class azud implements afhy {
    private final dzsj<gga> a;
    private final dzsj<eeu> b;
    private final dzsj<axwy> c;

    public azud(dzsj<gga> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<axwy> dzsjVar3) {
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
        gga a = this.a.a();
        b(a, 1);
        eeu a2 = this.b.a();
        b(a2, 2);
        axwy a3 = this.c.a();
        b(a3, 3);
        b(intent, 4);
        return new azuc(a, a2, a3, intent, str);
    }
}
