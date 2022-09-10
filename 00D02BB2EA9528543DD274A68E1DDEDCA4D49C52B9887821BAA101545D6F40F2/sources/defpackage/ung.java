package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ung  reason: default package */
/* loaded from: classes.dex */
public final class ung implements afhy {
    private final dzsj<ros> a;

    public ung(dzsj<ros> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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
        ros a = this.a.a();
        b(a, 3);
        return new unf(intent, str, a);
    }
}
