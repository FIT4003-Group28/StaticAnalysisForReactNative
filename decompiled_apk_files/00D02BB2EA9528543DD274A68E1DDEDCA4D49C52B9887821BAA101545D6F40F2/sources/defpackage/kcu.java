package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: kcu  reason: default package */
/* loaded from: classes7.dex */
public class kcu {
    public final dzsj<kcp> a;
    public final dzsj<cfns> b;
    public final dzsj<cqhn> c;
    public final dzsj<Executor> d;

    public kcu(dzsj<kcp> dzsjVar, dzsj<cfns> dzsjVar2, dzsj<cqhn> dzsjVar3, dzsj<Executor> dzsjVar4) {
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
