package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bcol  reason: default package */
/* loaded from: classes3.dex */
public final class bcol {
    public final dzsj<bcms> a;
    public final dzsj<Activity> b;

    public bcol(dzsj<bcms> dzsjVar, dzsj<Activity> dzsjVar2) {
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
