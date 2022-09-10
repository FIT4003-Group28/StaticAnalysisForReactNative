package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: zkv  reason: default package */
/* loaded from: classes7.dex */
public final class zkv {
    private final dzsj<Activity> a;

    public zkv(dzsj<Activity> dzsjVar) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zku a(int i, boolean z, @dzsi amuk amukVar, amsq amsqVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(amsqVar, 5);
        return new zku(activity, i, z, amukVar, amsqVar);
    }
}
