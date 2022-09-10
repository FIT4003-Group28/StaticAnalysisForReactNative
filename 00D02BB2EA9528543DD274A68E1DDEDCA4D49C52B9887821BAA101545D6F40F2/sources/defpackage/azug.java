package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: azug  reason: default package */
/* loaded from: classes.dex */
public final class azug implements afhy {
    private final dzsj<axwy> a;

    public azug(dzsj<axwy> dzsjVar) {
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
        axwy a = this.a.a();
        b(a, 1);
        b(intent, 2);
        return new azuf(a, intent, str);
    }
}
