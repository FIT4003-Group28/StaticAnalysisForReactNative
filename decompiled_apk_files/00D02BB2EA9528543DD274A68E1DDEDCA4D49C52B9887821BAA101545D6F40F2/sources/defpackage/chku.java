package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: chku  reason: default package */
/* loaded from: classes4.dex */
public final class chku {
    public final dzsj<Executor> a;
    public final dzsj<buqs> b;

    public chku(dzsj<Executor> dzsjVar, dzsj<buqs> dzsjVar2) {
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
