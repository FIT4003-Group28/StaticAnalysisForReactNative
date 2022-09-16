package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: axjp  reason: default package */
/* loaded from: classes3.dex */
public final class axjp implements afhy {
    private final dzsj<ceet> a;
    private final dzsj<auhi> b;

    public axjp(dzsj<ceet> dzsjVar, dzsj<auhi> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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
        ceet a = this.a.a();
        b(a, 3);
        auhi a2 = this.b.a();
        b(a2, 4);
        return new axjo(intent, str, a, a2);
    }
}
