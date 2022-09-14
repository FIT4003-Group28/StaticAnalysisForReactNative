package defpackage;

import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aowl  reason: default package */
/* loaded from: classes2.dex */
public final class aowl {
    public final dzsj<Resources> a;
    public final dzsj<apii> b;
    public final dzsj<aphy> c;
    public final dzsj<aphj> d;

    public aowl(dzsj<Resources> dzsjVar, dzsj<apii> dzsjVar2, dzsj<aphy> dzsjVar3, dzsj<aphj> dzsjVar4) {
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
