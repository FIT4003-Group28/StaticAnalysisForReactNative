package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: bzbe  reason: default package */
/* loaded from: classes4.dex */
public final class bzbe {
    public final dzsj<Application> a;
    public final dzsj<auhj> b;
    public final dzsj<auhi> c;
    public final dzsj<bzgl> d;
    public final dzsj<btvo> e;
    public final dzsj<ausy> f;

    public bzbe(dzsj<Application> dzsjVar, dzsj<auhj> dzsjVar2, dzsj<auhi> dzsjVar3, dzsj<bzgl> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<ausy> dzsjVar6) {
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
