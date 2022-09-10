package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bshj  reason: default package */
/* loaded from: classes4.dex */
public final class bshj {
    public final dzsj<Activity> a;
    public final dzsj<gga> b;
    public final dzsj<cqhn> c;
    public final dzsj<brdi> d;

    public bshj(dzsj<Activity> dzsjVar, dzsj<gga> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<brdi> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
    }

    public static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bshi a() {
        Activity activity = (Activity) ((dxjd) this.a).a;
        b(activity, 1);
        gga a = this.b.a();
        b(a, 2);
        cqhn a2 = this.c.a();
        b(a2, 3);
        brdi a3 = this.d.a();
        b(a3, 4);
        return new bshi(activity, a, a2, a3);
    }
}
