package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: abva  reason: default package */
/* loaded from: classes.dex */
public final class abva {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<abuo> c;
    public final dzsj<dxio<abfb>> d;
    public final dzsj<abuy> e;
    public final dzsj<akpm> f;
    public final dzsj<dxio<akzh>> g;

    public abva(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<abuo> dzsjVar3, dzsj<dxio<abfb>> dzsjVar4, dzsj<abuy> dzsjVar5, dzsj<akpm> dzsjVar6, dzsj<dxio<akzh>> dzsjVar7) {
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
