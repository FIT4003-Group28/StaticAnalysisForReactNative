package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: boum  reason: default package */
/* loaded from: classes3.dex */
public final class boum {
    private final dzsj<Activity> a;
    private final dzsj<cklf> b;

    public boum(dzsj<Activity> dzsjVar, dzsj<cklf> dzsjVar2) {
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

    public final boul a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cklf a = this.b.a();
        b(a, 2);
        return new boul(activity, a);
    }
}
