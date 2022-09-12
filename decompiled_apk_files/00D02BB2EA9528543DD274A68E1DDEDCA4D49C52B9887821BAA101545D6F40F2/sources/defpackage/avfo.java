package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: avfo  reason: default package */
/* loaded from: classes2.dex */
public final class avfo {
    public final dzsj<avlx> a;
    public final dzsj<bvow> b;
    public final dzsj<avra> c;
    public final dzsj<cjqy> d;
    public final dzsj<avtt> e;
    public final dzsj<Executor> f;
    public final dzsj<avgs> g;

    public avfo(dzsj<avlx> dzsjVar, dzsj<bvow> dzsjVar2, dzsj<avra> dzsjVar3, dzsj<cjqy> dzsjVar4, dzsj<avtt> dzsjVar5, dzsj<Executor> dzsjVar6, dzsj<avgs> dzsjVar7) {
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
