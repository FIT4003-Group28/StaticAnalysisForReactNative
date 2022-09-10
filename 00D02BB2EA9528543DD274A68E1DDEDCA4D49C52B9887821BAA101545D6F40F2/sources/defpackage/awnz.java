package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: awnz  reason: default package */
/* loaded from: classes.dex */
public final class awnz implements afhy {
    private final dzsj<gga> a;

    public awnz(dzsj<gga> dzsjVar) {
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
        gga a = this.a.a();
        b(a, 3);
        return new awny(intent, str, a);
    }
}
