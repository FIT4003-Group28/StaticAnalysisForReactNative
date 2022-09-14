package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bdmc  reason: default package */
/* loaded from: classes3.dex */
public final class bdmc {
    private final dzsj<Activity> a;
    private final dzsj<axru> b;
    private final dzsj<axrx> c;

    public bdmc(dzsj<Activity> dzsjVar, dzsj<axru> dzsjVar2, dzsj<axrx> dzsjVar3) {
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

    public final bdmb a(String str, bdma bdmaVar, bdlz bdlzVar) {
        b(str, 1);
        b(bdmaVar, 2);
        b(bdlzVar, 3);
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 4);
        axru a = this.b.a();
        b(a, 5);
        axrx a2 = this.c.a();
        b(a2, 6);
        return new bdmb(str, bdmaVar, bdlzVar, activity, a, a2);
    }
}
