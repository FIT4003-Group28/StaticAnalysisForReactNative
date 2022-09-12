package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: suq  reason: default package */
/* loaded from: classes7.dex */
public class suq {
    private final dzsj<Activity> a;

    public suq(dzsj<Activity> dzsjVar) {
        b(dzsjVar);
        this.a = dzsjVar;
    }

    private static <T> void b(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }

    public final sup a(boolean z) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity);
        return new sup(activity, z);
    }
}
