package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bsht  reason: default package */
/* loaded from: classes4.dex */
public final class bsht {
    public final dzsj<Activity> a;

    public bsht(dzsj<Activity> dzsjVar) {
        a(dzsjVar);
        this.a = dzsjVar;
    }

    public static <T> void a(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
