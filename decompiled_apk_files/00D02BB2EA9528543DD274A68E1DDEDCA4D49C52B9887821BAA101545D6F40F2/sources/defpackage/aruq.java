package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: aruq  reason: default package */
/* loaded from: classes2.dex */
public final class aruq {
    public final dzsj<btvo> a;
    public final dzsj<Context> b;
    public final dzsj<aruv> c;

    public aruq(dzsj<btvo> dzsjVar, dzsj<Context> dzsjVar2, dzsj<aruv> dzsjVar3) {
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
