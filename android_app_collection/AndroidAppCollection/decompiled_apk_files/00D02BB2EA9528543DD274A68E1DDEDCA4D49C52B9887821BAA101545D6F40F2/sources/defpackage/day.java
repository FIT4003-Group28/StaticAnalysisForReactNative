package defpackage;
/* compiled from: PG */
/* renamed from: day  reason: default package */
/* loaded from: classes5.dex */
public final class day {
    public final dzsj<czw> a;
    public final dzsj<dbd> b;
    public final dzsj<dgc> c;

    public day(dzsj<czw> dzsjVar, dzsj<dbd> dzsjVar2, dzsj<dgc> dzsjVar3) {
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
