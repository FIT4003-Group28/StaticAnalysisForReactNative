package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bdes  reason: default package */
/* loaded from: classes3.dex */
public final class bdes {
    private final dzsj<Activity> a;
    private final dzsj<bdcz> b;

    public bdes(dzsj<Activity> dzsjVar, dzsj<bdcz> dzsjVar2) {
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

    public final bder a(bbtq bbtqVar) {
        b(bbtqVar, 1);
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 2);
        bdcz a = this.b.a();
        b(a, 3);
        return new bder(bbtqVar, activity, a);
    }
}
