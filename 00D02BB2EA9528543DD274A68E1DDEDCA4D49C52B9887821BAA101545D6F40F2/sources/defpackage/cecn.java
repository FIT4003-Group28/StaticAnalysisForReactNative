package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cecn  reason: default package */
/* loaded from: classes4.dex */
public class cecn {
    private final dzsj<Activity> a;

    public cecn(dzsj<Activity> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final cecm a(dqwy dqwyVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(dqwyVar, 2);
        return new cecm(activity, dqwyVar);
    }
}
