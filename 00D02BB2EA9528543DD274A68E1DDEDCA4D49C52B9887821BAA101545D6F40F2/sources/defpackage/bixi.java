package defpackage;
/* compiled from: PG */
/* renamed from: bixi  reason: default package */
/* loaded from: classes3.dex */
public class bixi {
    private final dzsj<gga> a;
    private final dzsj<beas> b;

    public bixi(dzsj<gga> dzsjVar, dzsj<beas> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final bixh a(dnwv dnwvVar) {
        gga a = this.a.a();
        b(a, 1);
        beas a2 = this.b.a();
        b(a2, 2);
        b(dnwvVar, 3);
        return new bixh(a, a2, dnwvVar);
    }
}
