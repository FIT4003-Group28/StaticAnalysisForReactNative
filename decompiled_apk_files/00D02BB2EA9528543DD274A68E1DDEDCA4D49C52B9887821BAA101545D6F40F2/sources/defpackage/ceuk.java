package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ceuk  reason: default package */
/* loaded from: classes4.dex */
public final class ceuk {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<akfa> c;
    public final dzsj<bvjj> d;
    public final dzsj<btvo> e;
    public final dzsj<cklf> f;
    public final dzsj<ceev> g;
    public final dzsj<nvh> h;
    public final dzsj<ceuo> i;

    public ceuk(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<akfa> dzsjVar3, dzsj<bvjj> dzsjVar4, dzsj<btvo> dzsjVar5, dzsj<cklf> dzsjVar6, dzsj<ceev> dzsjVar7, dzsj<nvh> dzsjVar8, dzsj<ceuo> dzsjVar9) {
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
