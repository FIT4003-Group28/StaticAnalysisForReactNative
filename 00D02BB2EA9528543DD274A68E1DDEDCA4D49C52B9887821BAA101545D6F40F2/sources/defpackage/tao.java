package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tao  reason: default package */
/* loaded from: classes7.dex */
public final class tao {
    public final dzsj<Activity> a;

    public tao(dzsj<Activity> dzsjVar) {
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

    public final tan a(amve amveVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(amveVar, 2);
        return new tan(activity, amveVar);
    }
}
