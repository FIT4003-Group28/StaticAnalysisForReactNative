package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: tfu  reason: default package */
/* loaded from: classes7.dex */
public final class tfu {
    public final dzsj<szq> a;
    public final dzsj<svq> b;
    public final dzsj<Activity> c;
    public final dzsj<cqhn> d;

    public tfu(dzsj<szq> dzsjVar, dzsj<svq> dzsjVar2, dzsj<Activity> dzsjVar3, dzsj<cqhn> dzsjVar4) {
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
