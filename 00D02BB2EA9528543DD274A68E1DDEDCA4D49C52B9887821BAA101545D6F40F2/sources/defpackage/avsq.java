package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: avsq  reason: default package */
/* loaded from: classes.dex */
public final class avsq implements afhy {
    private final dzsj<dxio<avsr>> a;

    public avsq(dzsj<dxio<avsr>> dzsjVar) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    @Override // defpackage.afhy
    /* renamed from: b */
    public final avsp a(Intent intent, @dzsi String str) {
        c(intent, 1);
        dxio<avsr> a = this.a.a();
        c(a, 3);
        return new avsp(intent, str, a);
    }
}
