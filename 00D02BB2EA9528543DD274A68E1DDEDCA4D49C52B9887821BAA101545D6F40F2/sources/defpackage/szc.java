package defpackage;
/* compiled from: PG */
/* renamed from: szc  reason: default package */
/* loaded from: classes7.dex */
public final class szc {
    public final dzsj<twk> a;
    public final dzsj<sxq> b;
    public final dzsj<qho> c;
    public final dzsj<sxg> d;

    public szc(dzsj<twk> dzsjVar, dzsj<sxq> dzsjVar2, dzsj<qho> dzsjVar3, dzsj<sxg> dzsjVar4) {
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
