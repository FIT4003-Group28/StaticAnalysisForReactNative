package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: dpx  reason: default package */
/* loaded from: classes6.dex */
public final class dpx {
    public final dzsj<Resources> a;
    public final dzsj<dbsg<czw>> b;
    public final dzsj<btvo> c;
    public final dzsj<dgu> d;
    public final dzsj<dkj> e;

    public dpx(dzsj<Resources> dzsjVar, dzsj<dbsg<czw>> dzsjVar2, dzsj<btvo> dzsjVar3, dzsj<dgu> dzsjVar4, dzsj<dkj> dzsjVar5) {
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
