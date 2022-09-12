package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: kcp  reason: default package */
/* loaded from: classes7.dex */
public class kcp {
    public final dzsj<Context> a;
    public final dzsj<bvrb> b;
    public final dzsj<cfon> c;

    public kcp(dzsj<Context> dzsjVar, dzsj<bvrb> dzsjVar2, dzsj<cfon> dzsjVar3) {
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
