package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdmr  reason: default package */
/* loaded from: classes3.dex */
public class bdmr {
    public final dzsj<Executor> a;
    public final dzsj<bdrt> b;

    public bdmr(dzsj<Executor> dzsjVar, dzsj<bdrt> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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