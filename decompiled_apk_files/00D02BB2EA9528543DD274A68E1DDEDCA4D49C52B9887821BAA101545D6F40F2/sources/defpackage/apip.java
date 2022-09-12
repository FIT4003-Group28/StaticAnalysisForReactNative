package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: apip  reason: default package */
/* loaded from: classes2.dex */
public final class apip {
    public final dzsj<Resources> a;
    public final dzsj<apis> b;
    public final dzsj<cjqy> c;
    public final dzsj<aphj> d;

    public apip(dzsj<Resources> dzsjVar, dzsj<apis> dzsjVar2, dzsj<cjqy> dzsjVar3, dzsj<aphj> dzsjVar4) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
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
