package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aens  reason: default package */
/* loaded from: classes2.dex */
public class aens {
    private final dzsj<Activity> a;

    public aens(dzsj<Activity> dzsjVar) {
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

    public final aenr a(ddho ddhoVar, eapg eapgVar, boolean z, aenq aenqVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(ddhoVar, 2);
        b(eapgVar, 4);
        b(aenqVar, 6);
        return new aenr(activity, ddhoVar, 524314, eapgVar, z, aenqVar);
    }
}
