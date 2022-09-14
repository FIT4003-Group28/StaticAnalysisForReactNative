package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cbuq  reason: default package */
/* loaded from: classes4.dex */
public final class cbuq {
    public final dzsj<cbvn> a;
    public final dzsj<cbvy> b;
    public final dzsj<Executor> c;
    public final dzsj<cqhn> d;

    public cbuq(dzsj<cbvn> dzsjVar, dzsj<cbvy> dzsjVar2, dzsj<Executor> dzsjVar3, dzsj<cqhn> dzsjVar4) {
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
