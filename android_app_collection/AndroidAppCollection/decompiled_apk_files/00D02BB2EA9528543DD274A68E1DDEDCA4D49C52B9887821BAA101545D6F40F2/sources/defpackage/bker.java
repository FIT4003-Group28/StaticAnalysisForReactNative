package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bker  reason: default package */
/* loaded from: classes3.dex */
public class bker {
    private final dzsj<jkf> a;
    private final dzsj<Activity> b;
    private final dzsj<cyt> c;
    private final dzsj<cwy> d;
    private final dzsj<dxio<afha>> e;
    private final dzsj<btvo> f;

    public bker(dzsj<jkf> dzsjVar, dzsj<Activity> dzsjVar2, dzsj<cyt> dzsjVar3, dzsj<cwy> dzsjVar4, dzsj<dxio<afha>> dzsjVar5, dzsj<btvo> dzsjVar6) {
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
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
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

    public final bkeq a(acmv acmvVar, boolean z, @dzsi Runnable runnable) {
        b(acmvVar, 1);
        jkf a = this.a.a();
        b(a, 4);
        Activity activity = (Activity) ((dxjd) this.b).a;
        b(activity, 5);
        cyt a2 = this.c.a();
        b(a2, 6);
        cwy a3 = this.d.a();
        b(a3, 7);
        dxio a4 = ((dxjh) this.e).a();
        b(a4, 8);
        btvo a5 = this.f.a();
        b(a5, 9);
        return new bkeq(acmvVar, z, runnable, a, activity, a2, a3, a4, a5);
    }
}
