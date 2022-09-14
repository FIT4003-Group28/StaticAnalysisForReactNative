package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: bycb  reason: default package */
/* loaded from: classes4.dex */
public final class bycb {
    public final dzsj<byce> a;
    public final dzsj<bycc> b;
    public final dzsj<bqxt> c;
    public final dzsj<Random> d;
    public final dzsj<bvrb> e;

    public bycb(dzsj<byce> dzsjVar, dzsj<bycc> dzsjVar2, dzsj<bqxt> dzsjVar3, dzsj<Random> dzsjVar4, dzsj<bvrb> dzsjVar5) {
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
