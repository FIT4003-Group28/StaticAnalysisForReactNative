package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: byuz  reason: default package */
/* loaded from: classes4.dex */
public final class byuz {
    public final dzsj<ania> a;
    public final dzsj<angp> b;
    public final dzsj<byth> c;
    public final dzsj<Executor> d;
    public final dzsj<bytc> e;

    public byuz(dzsj<ania> dzsjVar, dzsj<angp> dzsjVar2, dzsj<byth> dzsjVar3, dzsj<Executor> dzsjVar4, dzsj<bytc> dzsjVar5) {
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
