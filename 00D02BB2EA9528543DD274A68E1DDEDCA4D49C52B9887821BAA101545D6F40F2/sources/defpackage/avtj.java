package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: avtj  reason: default package */
/* loaded from: classes3.dex */
public final class avtj {
    public final dzsj<Application> a;
    public final dzsj<avpn> b;

    public avtj(dzsj<Application> dzsjVar, dzsj<avpn> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
