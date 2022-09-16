package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: yat  reason: default package */
/* loaded from: classes7.dex */
public final class yat {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<vwv> c;
    public final dzsj<byae> d;
    public final dzsj<dxio<afha>> e;
    public final dzsj<wtu> f;
    public final dzsj<cwy> g;

    public yat(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<vwv> dzsjVar3, dzsj<byae> dzsjVar4, dzsj<dxio<afha>> dzsjVar5, dzsj<wtu> dzsjVar6, dzsj<cwy> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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
