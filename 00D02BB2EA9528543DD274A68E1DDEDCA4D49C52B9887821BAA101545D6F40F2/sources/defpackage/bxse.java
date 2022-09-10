package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxse  reason: default package */
/* loaded from: classes4.dex */
public final class bxse {
    private final dzsj<Activity> a;
    private final dzsj<apkr> b;

    public bxse(dzsj<Activity> dzsjVar, dzsj<apkr> dzsjVar2) {
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

    public final bxsd a(ddho ddhoVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        apkr a = this.b.a();
        b(a, 2);
        b(ddhoVar, 3);
        return new bxsd(activity, a, ddhoVar);
    }
}
