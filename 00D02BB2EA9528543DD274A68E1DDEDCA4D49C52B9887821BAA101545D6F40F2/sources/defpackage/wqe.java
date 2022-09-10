package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: wqe  reason: default package */
/* loaded from: classes7.dex */
public final class wqe {
    public final dzsj<Activity> a;
    public final dzsj<cqkj> b;
    public final dzsj<qsc> c;
    public final dzsj<cqhn> d;

    public wqe(dzsj<Activity> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<qsc> dzsjVar3, dzsj<cqhn> dzsjVar4) {
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
