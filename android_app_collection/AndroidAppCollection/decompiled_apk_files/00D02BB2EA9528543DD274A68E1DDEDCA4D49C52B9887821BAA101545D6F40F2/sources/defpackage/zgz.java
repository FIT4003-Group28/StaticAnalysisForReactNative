package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: zgz  reason: default package */
/* loaded from: classes7.dex */
public class zgz {
    public final dzsj<btvo> a;
    public final dzsj<bvjj> b;
    public final dzsj<cqhn> c;
    public final dzsj<cjqq> d;
    public final dzsj<Activity> e;
    public final dzsj<pnq> f;
    public final dzsj<pnw> g;
    public final dzsj<pot> h;

    public zgz(dzsj<btvo> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<cjqq> dzsjVar4, dzsj<Activity> dzsjVar5, dzsj<pnq> dzsjVar6, dzsj<pnw> dzsjVar7, dzsj<pot> dzsjVar8) {
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
