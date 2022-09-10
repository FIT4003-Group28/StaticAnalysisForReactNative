package defpackage;
/* compiled from: PG */
/* renamed from: bnxt  reason: default package */
/* loaded from: classes3.dex */
public final class bnxt {
    private final dzsj<cqat> a;
    private final dzsj<btrm> b;
    private final dzsj<bxer> c;

    public bnxt(dzsj<cqat> dzsjVar, dzsj<btrm> dzsjVar2, dzsj<bxer> dzsjVar3) {
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

    public final bnxs a(dhjx dhjxVar, @dzsi akqs akqsVar) {
        b(dhjxVar, 1);
        cqat a = this.a.a();
        b(a, 3);
        btrm a2 = this.b.a();
        b(a2, 4);
        bxer a3 = this.c.a();
        b(a3, 5);
        return new bnxs(dhjxVar, akqsVar, a, a2, a3);
    }
}
