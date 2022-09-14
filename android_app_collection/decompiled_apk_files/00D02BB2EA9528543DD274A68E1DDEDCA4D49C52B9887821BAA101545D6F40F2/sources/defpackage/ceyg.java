package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: ceyg  reason: default package */
/* loaded from: classes4.dex */
public final class ceyg {
    public final dzsj<Activity> a;
    public final dzsj<btrm> b;
    public final dzsj<cqhn> c;
    public final dzsj<btvo> d;
    public final dzsj<cefh> e;
    public final dzsj<ceuo> f;
    public final dzsj<nvh> g;
    public final dzsj<isd> h;
    public final dzsj<cese> i;
    public final dzsj<cebr> j;

    public ceyg(dzsj<Activity> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<btvo> dzsjVar4, dzsj<cefh> dzsjVar5, dzsj<ceuo> dzsjVar6, dzsj<nvh> dzsjVar7, dzsj<isd> dzsjVar8, dzsj<cese> dzsjVar9, dzsj<cebr> dzsjVar10) {
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
        a(dzsjVar10, 10);
        this.j = dzsjVar10;
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
