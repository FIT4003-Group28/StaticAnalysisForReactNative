package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: bfsm  reason: default package */
/* loaded from: classes3.dex */
public final class bfsm {
    public final dzsj<Context> a;

    public bfsm(dzsj<Context> dzsjVar) {
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
