package defpackage;
/* compiled from: PG */
/* renamed from: bkdy  reason: default package */
/* loaded from: classes3.dex */
public class bkdy {
    private final dzsj<bkea> a;

    public bkdy(dzsj<bkea> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
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

    public final bkdx a(dgjc dgjcVar, bkdf bkdfVar) {
        b(dgjcVar, 1);
        b(bkdfVar, 2);
        bkea a = this.a.a();
        b(a, 3);
        return new bkdx(dgjcVar, bkdfVar, a);
    }
}
