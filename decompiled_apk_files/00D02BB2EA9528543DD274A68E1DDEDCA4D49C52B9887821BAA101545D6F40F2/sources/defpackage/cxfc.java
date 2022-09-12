package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cxfc  reason: default package */
/* loaded from: classes5.dex */
public final class cxfc {
    public final dzsj<Executor> a;

    public cxfc(dzsj<Executor> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
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
