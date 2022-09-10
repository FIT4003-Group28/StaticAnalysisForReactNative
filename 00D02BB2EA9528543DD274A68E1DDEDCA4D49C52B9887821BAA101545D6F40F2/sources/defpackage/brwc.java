package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brwc  reason: default package */
/* loaded from: classes4.dex */
public final class brwc {
    private final dzsj<beez> a;
    private final dzsj<bker> b;
    private final dzsj<Activity> c;
    private final dzsj<btvo> d;
    private final dzsj<bego> e;

    public brwc(dzsj<beez> dzsjVar, dzsj<bker> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<bego> dzsjVar5) {
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

    public final brwb a(Runnable runnable) {
        beez a = this.a.a();
        b(a, 1);
        bker a2 = this.b.a();
        b(a2, 2);
        Activity activity = (Activity) ((dxjd) this.c).a;
        b(activity, 3);
        btvo a3 = this.d.a();
        b(a3, 4);
        bego a4 = this.e.a();
        b(a4, 5);
        b(runnable, 6);
        return new brwb(a, a2, activity, a3, a4, runnable);
    }
}
