package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: mtq  reason: default package */
/* loaded from: classes7.dex */
public final class mtq {
    public final dzsj<Context> a;
    public final dzsj<bvsl> b;
    public final dzsj<myg> c;

    public mtq(dzsj<Context> dzsjVar, dzsj<bvsl> dzsjVar2, dzsj<myg> dzsjVar3) {
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
