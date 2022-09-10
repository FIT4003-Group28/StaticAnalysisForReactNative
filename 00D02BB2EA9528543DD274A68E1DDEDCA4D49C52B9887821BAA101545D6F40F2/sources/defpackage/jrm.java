package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: jrm  reason: default package */
/* loaded from: classes7.dex */
public final class jrm {
    private final dzsj<Activity> a;
    private final dzsj<dxio<afha>> b;

    public jrm(dzsj<Activity> dzsjVar, dzsj<dxio<afha>> dzsjVar2) {
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

    public final jrk a(String str, String str2, String str3) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        dxio a = ((dxjh) this.b).a();
        b(a, 2);
        b(str, 3);
        b(str2, 4);
        b(str3, 5);
        return new jrk(activity, a, str, str2, str3);
    }
}
