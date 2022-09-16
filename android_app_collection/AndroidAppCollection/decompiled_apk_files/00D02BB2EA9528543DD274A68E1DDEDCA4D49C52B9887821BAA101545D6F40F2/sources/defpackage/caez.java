package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: caez  reason: default package */
/* loaded from: classes4.dex */
public final class caez {
    private final dzsj<amfi> a;
    private final dzsj<Activity> b;

    public caez(dzsj<amfi> dzsjVar, dzsj<Activity> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final caey a(caex caexVar) {
        amfi a = this.a.a();
        b(a, 1);
        Activity activity = (Activity) ((dxjd) this.b).a;
        b(activity, 2);
        b(caexVar, 3);
        return new caey(a, activity, caexVar);
    }
}
