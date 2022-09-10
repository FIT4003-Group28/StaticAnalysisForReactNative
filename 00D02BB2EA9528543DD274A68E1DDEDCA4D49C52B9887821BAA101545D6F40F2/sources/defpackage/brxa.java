package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: brxa  reason: default package */
/* loaded from: classes.dex */
public final class brxa {
    public final dzsj<btvo> a;
    public final dzsj<bryi> b;
    public final dzsj<bvjj> c;
    public final dzsj<Activity> d;
    public final dzsj<cpv> e;

    public brxa(dzsj<btvo> dzsjVar, dzsj<bryi> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<Activity> dzsjVar4, dzsj<cpv> dzsjVar5) {
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
