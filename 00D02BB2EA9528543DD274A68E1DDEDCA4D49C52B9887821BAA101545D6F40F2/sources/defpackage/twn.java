package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: twn  reason: default package */
/* loaded from: classes7.dex */
public class twn {
    public final dzsj<Activity> a;
    public final dzsj<btvo> b;

    public twn(dzsj<Activity> dzsjVar, dzsj<btvo> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final twm a(qib qibVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(qibVar, 2);
        return new twm(activity, qibVar);
    }
}
