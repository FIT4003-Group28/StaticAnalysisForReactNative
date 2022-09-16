package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dpt  reason: default package */
/* loaded from: classes6.dex */
public final class dpt {
    public final dzsj<akfa> a;
    public final dzsj<Executor> b;
    public final dzsj<ailb<aigo>> c;
    public final dzsj<cqat> d;

    public dpt(dzsj<akfa> dzsjVar, dzsj<Executor> dzsjVar2, dzsj<ailb<aigo>> dzsjVar3, dzsj<cqat> dzsjVar4) {
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
