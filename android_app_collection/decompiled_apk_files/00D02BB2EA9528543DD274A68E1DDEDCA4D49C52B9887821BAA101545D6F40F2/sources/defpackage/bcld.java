package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bcld  reason: default package */
/* loaded from: classes3.dex */
public class bcld {
    private final dzsj<Activity> a;

    public bcld(dzsj<Activity> dzsjVar) {
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

    public final bclc a(bckr bckrVar) {
        b(bckrVar, 1);
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 2);
        return new bclc(bckrVar, activity);
    }
}
