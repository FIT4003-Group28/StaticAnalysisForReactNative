package defpackage;

import android.app.Service;
/* compiled from: PG */
/* renamed from: bzag  reason: default package */
/* loaded from: classes4.dex */
public final class bzag {
    public final dzsj<Service> a;
    public final dzsj<dehq> b;
    public final dzsj<auhi> c;
    public final dzsj<byzr> d;
    public final dzsj<byzi> e;
    public final dzsj<ckoq> f;
    public final dzsj<bzai> g;
    public final dzsj<cqat> h;
    public final dzsj<bzgc> i;

    public bzag(dzsj<Service> dzsjVar, dzsj<dehq> dzsjVar2, dzsj<auhi> dzsjVar3, dzsj<byzr> dzsjVar4, dzsj<byzi> dzsjVar5, dzsj<ckoq> dzsjVar6, dzsj<bzai> dzsjVar7, dzsj<cqat> dzsjVar8, dzsj<bzgc> dzsjVar9) {
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
        a(dzsjVar8, 8);
        this.h = dzsjVar8;
        a(dzsjVar9, 9);
        this.i = dzsjVar9;
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
