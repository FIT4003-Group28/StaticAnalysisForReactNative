package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: bfib  reason: default package */
/* loaded from: classes3.dex */
public final class bfib {
    public final dzsj<Activity> a;
    public final dzsj<eeu> b;
    public final dzsj<glj> c;
    public final dzsj<jkf> d;
    public final dzsj<cqhn> e;
    public final dzsj<cqhu> f;

    public bfib(dzsj<Activity> dzsjVar, dzsj<eeu> dzsjVar2, dzsj<glj> dzsjVar3, dzsj<jkf> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<cqhu> dzsjVar6) {
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
