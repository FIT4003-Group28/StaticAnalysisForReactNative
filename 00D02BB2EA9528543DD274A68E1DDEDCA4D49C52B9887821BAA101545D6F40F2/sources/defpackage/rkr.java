package defpackage;

import android.app.Activity;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: rkr  reason: default package */
/* loaded from: classes7.dex */
public final class rkr {
    public final dzsj<Activity> a;
    public final dzsj<qyq> b;
    public final dzsj<rkx> c;
    public final dzsj<rkl> d;
    public final dzsj<cqhn> e;
    public final dzsj<Executor> f;

    public rkr(dzsj<Activity> dzsjVar, dzsj<qyq> dzsjVar2, dzsj<rkx> dzsjVar3, dzsj<rkl> dzsjVar4, dzsj<cqhn> dzsjVar5, dzsj<Executor> dzsjVar6) {
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
