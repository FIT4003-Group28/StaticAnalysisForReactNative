package defpackage;
/* compiled from: PG */
/* renamed from: ngq  reason: default package */
/* loaded from: classes7.dex */
public final class ngq {
    private final dzsj<crem> a;
    private final dzsj<cref> b;
    private final dzsj<cqhn> c;

    public ngq(dzsj<crem> dzsjVar, dzsj<cref> dzsjVar2, dzsj<cqhn> dzsjVar3) {
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

    public final ngp a(noo nooVar) {
        crem a = this.a.a();
        b(a, 1);
        b(nooVar, 2);
        cref a2 = this.b.a();
        b(a2, 3);
        cqhn a3 = this.c.a();
        b(a3, 4);
        return new ngp(a, nooVar, a2, a3);
    }
}
