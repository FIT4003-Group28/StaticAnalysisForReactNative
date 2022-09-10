package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: rfa  reason: default package */
/* loaded from: classes7.dex */
public final class rfa {
    public final dzsj<Activity> a;
    public final dzsj<ivg> b;
    public final dzsj<cqhn> c;
    public final dzsj<dxio<qbt>> d;
    public final dzsj<zpy> e;
    public final dzsj<dxio<reu>> f;

    public rfa(dzsj<Activity> dzsjVar, dzsj<ivg> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<dxio<qbt>> dzsjVar4, dzsj<zpy> dzsjVar5, dzsj<dxio<reu>> dzsjVar6) {
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
