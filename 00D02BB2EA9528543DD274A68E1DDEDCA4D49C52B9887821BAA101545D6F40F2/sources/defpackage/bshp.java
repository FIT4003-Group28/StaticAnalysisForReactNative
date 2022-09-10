package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bshp  reason: default package */
/* loaded from: classes4.dex */
public final class bshp {
    public final dzsj<Activity> a;

    public bshp(dzsj<Activity> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bsho a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        return new bsho(activity);
    }
}
