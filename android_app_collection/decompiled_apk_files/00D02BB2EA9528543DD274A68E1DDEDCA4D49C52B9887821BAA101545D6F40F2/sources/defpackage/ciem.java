package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ciem  reason: default package */
/* loaded from: classes4.dex */
public final class ciem {
    public final dzsj<Activity> a;

    public ciem(dzsj<Activity> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
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
