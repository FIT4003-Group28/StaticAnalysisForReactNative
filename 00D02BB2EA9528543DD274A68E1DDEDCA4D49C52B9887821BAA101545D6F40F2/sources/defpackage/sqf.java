package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: sqf  reason: default package */
/* loaded from: classes7.dex */
public final class sqf {
    private final dzsj<Activity> a;
    private final dzsj<cqat> b;
    private final dzsj<dxio<qbt>> c;
    private final dzsj<dxio<ascb>> d;
    private final dzsj<vtn> e;

    public sqf(dzsj<Activity> dzsjVar, dzsj<cqat> dzsjVar2, dzsj<dxio<qbt>> dzsjVar3, dzsj<dxio<ascb>> dzsjVar4, dzsj<vtn> dzsjVar5) {
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

    public final sqe a(int i, @dzsi sph sphVar, @dzsi dnui dnuiVar, sps spsVar, Runnable runnable) {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        cqat a = this.b.a();
        b(a, 2);
        dxio a2 = ((dxjh) this.c).a();
        b(a2, 3);
        dxio a3 = ((dxjh) this.d).a();
        b(a3, 4);
        vtn a4 = this.e.a();
        b(a4, 5);
        b(spsVar, 9);
        b(runnable, 10);
        return new sqe(activity, a, a2, a3, a4, i, sphVar, dnuiVar, spsVar, runnable);
    }
}
