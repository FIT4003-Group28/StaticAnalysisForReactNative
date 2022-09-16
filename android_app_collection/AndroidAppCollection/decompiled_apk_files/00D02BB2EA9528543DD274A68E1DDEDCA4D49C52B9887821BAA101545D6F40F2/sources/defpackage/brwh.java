package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: brwh  reason: default package */
/* loaded from: classes4.dex */
public final class brwh {
    public final dzsj<Map<dghs, brva>> a;
    public final dzsj<btvo> b;
    public final dzsj<bmom> c;

    public brwh(dzsj<Map<dghs, brva>> dzsjVar, dzsj<btvo> dzsjVar2, dzsj<bmom> dzsjVar3) {
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
