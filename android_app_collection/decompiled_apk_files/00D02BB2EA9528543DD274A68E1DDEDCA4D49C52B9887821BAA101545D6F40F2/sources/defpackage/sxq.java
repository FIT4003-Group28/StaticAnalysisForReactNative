package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: sxq  reason: default package */
/* loaded from: classes7.dex */
public class sxq {
    private final dzsj<Activity> a;
    private final dzsj<jkf> b;
    private final dzsj<cqhn> c;

    public sxq(dzsj<Activity> dzsjVar, dzsj<jkf> dzsjVar2, dzsj<cqhn> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final sxp a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        jkf a = this.b.a();
        b(a, 2);
        cqhn a2 = this.c.a();
        b(a2, 3);
        return new sxp(activity, a, a2);
    }
}
