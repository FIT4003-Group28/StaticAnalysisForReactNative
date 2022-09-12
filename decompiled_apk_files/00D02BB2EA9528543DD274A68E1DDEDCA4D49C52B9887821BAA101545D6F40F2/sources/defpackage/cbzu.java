package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: cbzu  reason: default package */
/* loaded from: classes4.dex */
public final class cbzu {
    public final dzsj<Context> a;
    public final dzsj<cbzj> b;

    public cbzu(dzsj<Context> dzsjVar, dzsj<cbzj> dzsjVar2) {
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
