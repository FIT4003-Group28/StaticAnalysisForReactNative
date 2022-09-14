package defpackage;
/* compiled from: PG */
/* renamed from: beav  reason: default package */
/* loaded from: classes3.dex */
public final class beav {
    private final dzsj<beas> a;
    private final dzsj<bebu> b;
    private final dzsj<brsc> c;

    public beav(dzsj<beas> dzsjVar, dzsj<bebu> dzsjVar2, dzsj<brsc> dzsjVar3) {
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

    public final beau a(brrx brrxVar, dnwv dnwvVar, int i) {
        beas a = this.a.a();
        b(a, 1);
        bebu a2 = this.b.a();
        b(a2, 2);
        brsc a3 = this.c.a();
        b(a3, 3);
        b(brrxVar, 4);
        b(dnwvVar, 5);
        return new beau(a, a2, a3, brrxVar, dnwvVar, i);
    }
}
