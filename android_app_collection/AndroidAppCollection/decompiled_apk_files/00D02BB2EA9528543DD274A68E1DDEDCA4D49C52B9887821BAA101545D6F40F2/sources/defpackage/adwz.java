package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: adwz  reason: default package */
/* loaded from: classes2.dex */
public final class adwz {
    public final dzsj<Activity> a;
    public final dzsj<cqhn> b;
    public final dzsj<Executor> c;
    public final dzsj<akfc> d;
    public final dzsj<bnoq> e;
    public final dzsj<bvan> f;

    public adwz(dzsj<Activity> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<akfc> dzsjVar4, dzsj<bnoq> dzsjVar5, dzsj<bvan> dzsjVar6) {
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
