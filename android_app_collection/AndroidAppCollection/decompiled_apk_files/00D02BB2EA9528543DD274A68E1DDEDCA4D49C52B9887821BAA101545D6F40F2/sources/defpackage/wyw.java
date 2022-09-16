package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: wyw  reason: default package */
/* loaded from: classes7.dex */
public class wyw {
    private final dzsj<Activity> a;
    private final dzsj<cqhn> b;
    private final dzsj<vtn> c;
    private final dzsj<btvo> d;
    private final dzsj<gce> e;

    public wyw(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<vtn> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<gce> dzsjVar5) {
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

    public final wyv a(wyu wyuVar, djws djwsVar, drhn drhnVar) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqhn a = this.b.a();
        b(a, 2);
        vtn a2 = this.c.a();
        b(a2, 3);
        btvo a3 = this.d.a();
        b(a3, 4);
        gce a4 = this.e.a();
        b(a4, 5);
        b(wyuVar, 6);
        b(djwsVar, 7);
        b(drhnVar, 8);
        return new wyv(activity, a, a2, a3, a4, wyuVar, djwsVar, drhnVar);
    }
}
