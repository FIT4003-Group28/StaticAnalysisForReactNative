package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: vot  reason: default package */
/* loaded from: classes7.dex */
public final class vot {
    private final dzsj<Activity> a;

    public vot(dzsj<Activity> dzsjVar) {
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

    public final vos a(cqkf<jbk> cqkfVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(cqkfVar, 2);
        return new vos(activity, cqkfVar);
    }
}
