package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abdf  reason: default package */
/* loaded from: classes2.dex */
public final class abdf {
    public final dzsj<Executor> a;
    public final dzsj<cqhn> b;
    public final dzsj<cqkj> c;
    public final dzsj<gdc> d;
    public final dzsj<abdn> e;
    public final dzsj<abdb> f;

    public abdf(dzsj<Executor> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cqkj> dzsjVar3, dzsj<gdc> dzsjVar4, dzsj<abdn> dzsjVar5, dzsj<abdb> dzsjVar6) {
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
