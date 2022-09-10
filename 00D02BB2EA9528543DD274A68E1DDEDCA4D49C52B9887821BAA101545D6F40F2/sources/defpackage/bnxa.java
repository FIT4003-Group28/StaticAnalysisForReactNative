package defpackage;
/* compiled from: PG */
/* renamed from: bnxa  reason: default package */
/* loaded from: classes3.dex */
public class bnxa {
    private final dzsj<boxa> a;

    public bnxa(dzsj<boxa> dzsjVar) {
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

    public final bnwz a(bwrs<ilo> bwrsVar) {
        b(bwrsVar, 1);
        boxa a = this.a.a();
        b(a, 2);
        return new bnwz(bwrsVar, a);
    }
}
