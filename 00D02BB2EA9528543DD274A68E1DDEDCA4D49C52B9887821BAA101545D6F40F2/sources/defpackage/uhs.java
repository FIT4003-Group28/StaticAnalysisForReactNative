package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: uhs  reason: default package */
/* loaded from: classes7.dex */
public final class uhs {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<cpv> c;
    public final dzsj<uhx> d;
    public final dzsj<ufc> e;

    public uhs(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cpv> dzsjVar3, dzsj<uhx> dzsjVar4, dzsj<ufc> dzsjVar5) {
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