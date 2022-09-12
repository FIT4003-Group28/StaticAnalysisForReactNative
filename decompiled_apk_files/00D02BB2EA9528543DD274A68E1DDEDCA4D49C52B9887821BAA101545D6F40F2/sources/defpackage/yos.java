package defpackage;
/* compiled from: PG */
/* renamed from: yos  reason: default package */
/* loaded from: classes7.dex */
public class yos {
    private final dzsj<cqhn> a;
    private final dzsj<cqhu> b;
    private final dzsj<vwv> c;

    public yos(dzsj<cqhn> dzsjVar, dzsj<cqhu> dzsjVar2, dzsj<vwv> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final yor a(douz douzVar, yiu yiuVar, yiw yiwVar) {
        cqhn a = this.a.a();
        b(a, 1);
        cqhu a2 = this.b.a();
        b(a2, 2);
        vwv a3 = this.c.a();
        b(a3, 3);
        b(douzVar, 4);
        b(yiuVar, 5);
        b(yiwVar, 6);
        return new yor(a, a2, a3, douzVar, yiuVar, yiwVar);
    }
}
