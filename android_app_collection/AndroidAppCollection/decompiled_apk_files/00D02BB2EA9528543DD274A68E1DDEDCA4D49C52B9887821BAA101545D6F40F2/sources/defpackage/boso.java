package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: boso  reason: default package */
/* loaded from: classes3.dex */
public final class boso {
    public final dzsj<Activity> a;
    public final dzsj<jmx> b;
    public final dzsj<cjqy> c;
    public final dzsj<bbut> d;
    public final dzsj<boxa> e;
    public final dzsj<bnyd> f;
    public final dzsj<cqkj> g;
    public final dzsj<btvo> h;
    public final dzsj<cqhn> i;

    public boso(dzsj<Activity> dzsjVar, dzsj<jmx> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<bbut> dzsjVar4, dzsj<boxa> dzsjVar5, dzsj<bnyd> dzsjVar6, dzsj<cqkj> dzsjVar7, dzsj<btvo> dzsjVar8, dzsj<cqhn> dzsjVar9) {
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
