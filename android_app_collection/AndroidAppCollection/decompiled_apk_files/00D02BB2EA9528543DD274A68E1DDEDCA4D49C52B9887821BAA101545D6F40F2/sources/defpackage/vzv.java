package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: vzv  reason: default package */
/* loaded from: classes7.dex */
public final class vzv {
    public final dzsj<Activity> a;
    public final dzsj<akox> b;
    public final dzsj<dxio<akzh>> c;
    public final dzsj<akpq> d;
    public final dzsj<dxio<qbt>> e;
    public final dzsj<gll> f;

    public vzv(dzsj<Activity> dzsjVar, dzsj<akox> dzsjVar2, dzsj<dxio<akzh>> dzsjVar3, dzsj<akpq> dzsjVar4, dzsj<dxio<qbt>> dzsjVar5, dzsj<gll> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
