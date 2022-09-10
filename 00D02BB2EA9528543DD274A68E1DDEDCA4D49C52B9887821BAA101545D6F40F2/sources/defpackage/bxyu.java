package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bxyu  reason: default package */
/* loaded from: classes4.dex */
public final class bxyu {
    private final dzsj<cqat> a;
    private final dzsj<Activity> b;

    public bxyu(dzsj<cqat> dzsjVar, dzsj<Activity> dzsjVar2) {
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

    public final bxyt a(bxzr bxzrVar, bxym bxymVar) {
        cqat a = this.a.a();
        b(a, 1);
        Activity activity = (Activity) ((dxjd) this.b).a;
        b(activity, 2);
        b(bxzrVar, 3);
        b(bxymVar, 4);
        return new bxyt(a, activity, bxzrVar, bxymVar);
    }
}
