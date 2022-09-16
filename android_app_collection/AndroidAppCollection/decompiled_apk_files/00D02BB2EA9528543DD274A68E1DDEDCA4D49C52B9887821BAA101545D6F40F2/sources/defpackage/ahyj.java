package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: ahyj  reason: default package */
/* loaded from: classes2.dex */
public final class ahyj implements afhy {
    private final dzsj<ahwf> a;

    public ahyj(dzsj<ahwf> dzsjVar) {
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
        ahwf a = this.a.a();
        b(a, 3);
        return new ahyi(intent, str, a);
    }
}
