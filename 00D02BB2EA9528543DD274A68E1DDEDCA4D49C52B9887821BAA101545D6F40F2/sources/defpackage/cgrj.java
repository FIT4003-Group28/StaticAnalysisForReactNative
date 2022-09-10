package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cgrj  reason: default package */
/* loaded from: classes4.dex */
public final class cgrj {
    public final dzsj<Activity> a;
    public final dzsj<btpc> b;
    public final dzsj<bvjj> c;
    public final dzsj<awwq> d;

    public cgrj(dzsj<Activity> dzsjVar, dzsj<btpc> dzsjVar2, dzsj<bvjj> dzsjVar3, dzsj<awwq> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
