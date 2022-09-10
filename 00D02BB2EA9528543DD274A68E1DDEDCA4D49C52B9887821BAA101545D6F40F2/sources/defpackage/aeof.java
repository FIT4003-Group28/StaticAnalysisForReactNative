package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aeof  reason: default package */
/* loaded from: classes2.dex */
public class aeof {
    public final dzsj<Activity> a;
    public final dzsj<aenp> b;
    public final dzsj<aeol> c;
    public final dzsj<cqat> d;
    public final dzsj<cqkj> e;
    public final dzsj<btvo> f;
    public final dzsj<cqhu> g;
    public final dzsj<aeqi> h;

    public aeof(dzsj<Activity> dzsjVar, dzsj<aenp> dzsjVar2, dzsj<aeol> dzsjVar3, dzsj<cqat> dzsjVar4, dzsj<cqkj> dzsjVar5, dzsj<btvo> dzsjVar6, dzsj<cqhu> dzsjVar7, dzsj<aeqi> dzsjVar8) {
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
