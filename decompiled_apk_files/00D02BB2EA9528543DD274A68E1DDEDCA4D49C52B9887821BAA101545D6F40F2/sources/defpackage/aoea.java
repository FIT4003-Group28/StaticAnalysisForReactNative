package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aoea  reason: default package */
/* loaded from: classes2.dex */
public final class aoea {
    public final dzsj<Activity> a;
    public final dzsj<cqat> b;

    public aoea(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2) {
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