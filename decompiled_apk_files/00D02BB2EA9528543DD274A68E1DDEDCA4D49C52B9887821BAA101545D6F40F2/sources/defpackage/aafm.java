package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aafm  reason: default package */
/* loaded from: classes2.dex */
public final class aafm {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<aafq> c;
    public final dzsj<aafh> d;

    public aafm(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<aafq> dzsjVar3, dzsj<aafh> dzsjVar4) {
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
