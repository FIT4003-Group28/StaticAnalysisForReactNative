package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: avrv  reason: default package */
/* loaded from: classes3.dex */
public final class avrv {
    public final dzsj<Activity> a;
    public final dzsj<cjmt> b;
    public final dzsj<acyp> c;
    public final dzsj<avsm> d;
    public final dzsj<btyh> e;

    public avrv(dzsj<Activity> dzsjVar, dzsj<cjmt> dzsjVar2, dzsj<acyp> dzsjVar3, dzsj<avsm> dzsjVar4, dzsj<btyh> dzsjVar5) {
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
