package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bsju  reason: default package */
/* loaded from: classes4.dex */
public final class bsju {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<aehr> c;
    public final dzsj<aeol> d;
    public final dzsj<cqkj> e;
    public final dzsj<aeqi> f;
    public final dzsj<btvo> g;

    public bsju(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<aehr> dzsjVar3, dzsj<aeol> dzsjVar4, dzsj<cqkj> dzsjVar5, dzsj<aeqi> dzsjVar6, dzsj<btvo> dzsjVar7) {
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
