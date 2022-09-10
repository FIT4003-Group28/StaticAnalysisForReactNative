package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ayqc  reason: default package */
/* loaded from: classes3.dex */
public final class ayqc {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;

    public ayqc(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2) {
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

    public final ayqb a(@dzsi baad baadVar, ayfk ayfkVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        b(ayfkVar, 4);
        return new ayqb(activity, a, baadVar, ayfkVar);
    }
}
