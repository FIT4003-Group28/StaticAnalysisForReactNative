package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: bozk  reason: default package */
/* loaded from: classes3.dex */
public final class bozk {
    public final dzsj<cqhn> a;
    public final dzsj<dbsg<cfll>> b;
    public final dzsj<bozp> c;
    public final dzsj<boyc> d;
    public final dzsj<boyb> e;
    public final dzsj<Resources> f;

    public bozk(dzsj<cqhn> dzsjVar, dzsj<dbsg<cfll>> dzsjVar2, dzsj<bozp> dzsjVar3, dzsj<boyc> dzsjVar4, dzsj<boyb> dzsjVar5, dzsj<Resources> dzsjVar6) {
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
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
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
