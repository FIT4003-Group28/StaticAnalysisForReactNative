package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bnyd  reason: default package */
/* loaded from: classes3.dex */
public class bnyd {
    private final dzsj<Activity> a;
    private final dzsj<cqkj> b;
    private final dzsj<jmx> c;

    public bnyd(dzsj<Activity> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<jmx> dzsjVar3) {
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

    public final bnyc a(gn gnVar, ddho ddhoVar, ddho ddhoVar2) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqkj a = this.b.a();
        b(a, 2);
        b(this.c.a(), 3);
        b(gnVar, 4);
        b(ddhoVar, 5);
        b(ddhoVar2, 6);
        return new bnyc(activity, a, gnVar, ddhoVar, ddhoVar2);
    }
}
