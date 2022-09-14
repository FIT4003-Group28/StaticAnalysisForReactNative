package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ahfg  reason: default package */
/* loaded from: classes2.dex */
public final class ahfg {
    public final dzsj<ahht> a;
    public final dzsj<ahbd> b;
    public final dzsj<ahez> c;
    public final dzsj<axnt> d;
    public final dzsj<axjh> e;
    public final dzsj<Executor> f;
    public final dzsj<cqhn> g;

    public ahfg(dzsj<ahht> dzsjVar, dzsj<ahbd> dzsjVar2, dzsj<ahez> dzsjVar3, dzsj<axnt> dzsjVar4, dzsj<axjh> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<cqhn> dzsjVar7) {
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
        a(dzsjVar7, 7);
        this.g = dzsjVar7;
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
