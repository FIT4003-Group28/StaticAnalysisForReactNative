package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uhx  reason: default package */
/* loaded from: classes7.dex */
public final class uhx {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<ufc> c;
    private final dzsj<suy> d;

    public uhx(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<ufc> dzsjVar3, dzsj<suy> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final uhw a(uhv uhvVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        b(this.b.a(), 2);
        ufc a = this.c.a();
        b(a, 3);
        suy a2 = this.d.a();
        b(a2, 4);
        b(uhvVar, 5);
        return new uhw(activity, a, a2, uhvVar);
    }
}
