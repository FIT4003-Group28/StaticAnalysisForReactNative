package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdwu  reason: default package */
/* loaded from: classes3.dex */
public class bdwu {
    public final dzsj<cqhn> a;
    public final dzsj<bdwr> b;
    public final dzsj<Executor> c;

    public bdwu(dzsj<cqhn> dzsjVar, dzsj<bdwr> dzsjVar2, dzsj<Executor> dzsjVar3) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
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