package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: acrq  reason: default package */
/* loaded from: classes2.dex */
public class acrq {
    private final dzsj<cqkj> a;
    private final dzsj<cqhn> b;
    private final dzsj<Activity> c;
    private final dzsj<cjqy> d;
    private final dzsj<gce> e;

    public acrq(dzsj<cqkj> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<gce> dzsjVar5) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
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

    public final acrp a() {
        cqkj a = this.a.a();
        b(a, 1);
        cqhn a2 = this.b.a();
        b(a2, 2);
        Activity activity = (Activity) ((dxjd) this.c).a;
        b(activity, 3);
        cjqy a3 = this.d.a();
        b(a3, 4);
        gce a4 = this.e.a();
        b(a4, 5);
        return new acrp(a, a2, activity, a3, a4, true);
    }
}
