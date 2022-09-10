package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: zpj  reason: default package */
/* loaded from: classes7.dex */
public final class zpj {
    public final dzsj<Resources> a;
    public final dzsj<cqhn> b;
    public final dzsj<cjbx> c;
    public final dzsj<cezv> d;
    public final dzsj<zaz> e;

    public zpj(dzsj<Resources> dzsjVar, dzsj<cqhn> dzsjVar2, dzsj<cjbx> dzsjVar3, dzsj<cezv> dzsjVar4, dzsj<zaz> dzsjVar5) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
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
