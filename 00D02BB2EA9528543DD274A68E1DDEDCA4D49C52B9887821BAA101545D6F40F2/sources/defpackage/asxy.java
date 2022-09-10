package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: asxy  reason: default package */
/* loaded from: classes2.dex */
public final class asxy {
    public final dzsj<Activity> a;
    public final dzsj<asya> b;

    public asxy(dzsj<Activity> dzsjVar, dzsj<asya> dzsjVar2) {
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
