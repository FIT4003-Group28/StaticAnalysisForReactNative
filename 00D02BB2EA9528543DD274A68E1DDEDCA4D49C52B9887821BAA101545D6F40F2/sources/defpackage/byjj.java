package defpackage;
/* compiled from: PG */
/* renamed from: byjj  reason: default package */
/* loaded from: classes4.dex */
public class byjj {
    private final dzsj<vtn> a;

    public byjj(dzsj<vtn> dzsjVar) {
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

    public final byji a(byny bynyVar, byjh byjhVar) {
        vtn a = this.a.a();
        b(a, 1);
        b(bynyVar, 2);
        b(byjhVar, 3);
        return new byji(a, bynyVar, byjhVar);
    }
}
