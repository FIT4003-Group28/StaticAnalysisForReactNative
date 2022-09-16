package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bozp  reason: default package */
/* loaded from: classes3.dex */
public class bozp {
    public final dzsj<cqhn> a;
    public final dzsj<bozs> b;
    public final dzsj<Resources> c;

    public bozp(dzsj<cqhn> dzsjVar, dzsj<bozs> dzsjVar2, dzsj<Resources> dzsjVar3) {
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
