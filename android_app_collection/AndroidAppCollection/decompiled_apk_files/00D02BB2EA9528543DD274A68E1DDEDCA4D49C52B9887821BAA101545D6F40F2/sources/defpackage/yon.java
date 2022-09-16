package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yon  reason: default package */
/* loaded from: classes7.dex */
public class yon {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<cqhu> c;

    public yon(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqhu> dzsjVar3) {
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

    public final yom a(yis yisVar, douz douzVar, yiw yiwVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        cqhu a2 = this.c.a();
        b(a2, 3);
        b(yisVar, 4);
        b(douzVar, 5);
        b(yiwVar, 6);
        return new yom(activity, a, a2, yisVar, douzVar, yiwVar);
    }
}
