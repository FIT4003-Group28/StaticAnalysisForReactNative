package defpackage;

import java.util.Random;
/* compiled from: PG */
/* renamed from: bybk  reason: default package */
/* loaded from: classes4.dex */
public final class bybk {
    public final dzsj<bvrb> a;
    public final dzsj<Random> b;

    public bybk(dzsj<bvrb> dzsjVar, dzsj<Random> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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
