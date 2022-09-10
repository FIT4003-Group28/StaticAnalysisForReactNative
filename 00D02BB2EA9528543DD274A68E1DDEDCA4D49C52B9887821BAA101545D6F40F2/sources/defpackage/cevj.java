package defpackage;
/* compiled from: PG */
/* renamed from: cevj  reason: default package */
/* loaded from: classes4.dex */
public class cevj {
    private final dzsj<axwy> a;

    public cevj(dzsj<axwy> dzsjVar) {
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

    public final cevi a(dhsp dhspVar) {
        axwy a = this.a.a();
        b(a, 1);
        b(dhspVar, 2);
        return new cevi(a, dhspVar);
    }
}
