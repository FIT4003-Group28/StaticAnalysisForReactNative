package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: addd  reason: default package */
/* loaded from: classes2.dex */
public final class addd {
    public final dzsj<dxio<brba>> a;
    public final dzsj<dxio<bwjz>> b;
    public final dzsj<acwt> c;
    public final dzsj<acyr> d;
    public final dzsj<Activity> e;

    public addd(dzsj<dxio<brba>> dzsjVar, dzsj<dxio<bwjz>> dzsjVar2, dzsj<acwt> dzsjVar3, dzsj<acyr> dzsjVar4, dzsj<Activity> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
