package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tro  reason: default package */
/* loaded from: classes7.dex */
public final class tro {
    public final dzsj<Activity> a;
    public final dzsj<trj> b;
    public final dzsj<toh> c;
    public final dzsj<toi> d;
    public final dzsj<tnv> e;
    public final dzsj<cqhn> f;

    public tro(dzsj<Activity> dzsjVar, dzsj<trj> dzsjVar2, dzsj<toh> dzsjVar3, dzsj<toi> dzsjVar4, dzsj<tnv> dzsjVar5, dzsj<cqhn> dzsjVar6) {
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
