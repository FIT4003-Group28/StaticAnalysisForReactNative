package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aaph  reason: default package */
/* loaded from: classes2.dex */
public final class aaph {
    public final dzsj<Activity> a;

    public aaph(dzsj<Activity> dzsjVar) {
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