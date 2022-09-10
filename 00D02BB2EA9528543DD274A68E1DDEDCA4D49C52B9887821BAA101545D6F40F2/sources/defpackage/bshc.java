package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bshc  reason: default package */
/* loaded from: classes4.dex */
public final class bshc {
    public final dzsj<Activity> a;

    public bshc(dzsj<Activity> dzsjVar) {
        b(dzsjVar);
        this.a = dzsjVar;
    }

    public static <T> void b(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final bshb a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity);
        return new bshb(activity);
    }
}
