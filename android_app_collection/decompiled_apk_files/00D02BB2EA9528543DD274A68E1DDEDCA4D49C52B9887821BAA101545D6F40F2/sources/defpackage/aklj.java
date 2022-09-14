package defpackage;
/* compiled from: PG */
/* renamed from: aklj  reason: default package */
/* loaded from: classes2.dex */
public class aklj {
    private final dzsj<cjqq> a;

    public aklj(dzsj<cjqq> dzsjVar) {
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

    public final akli a(dhti dhtiVar, String str) {
        b(dhtiVar, 1);
        b(str, 2);
        cjqq a = this.a.a();
        b(a, 3);
        return new akli(dhtiVar, str, a);
    }
}
