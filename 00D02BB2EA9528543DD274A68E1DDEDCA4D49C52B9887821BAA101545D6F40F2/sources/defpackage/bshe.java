package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bshe  reason: default package */
/* loaded from: classes4.dex */
public final class bshe {
    public final dzsj<Activity> a;

    public bshe(dzsj<Activity> dzsjVar) {
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

    public final bshd a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity);
        return new bshd(activity);
    }
}
