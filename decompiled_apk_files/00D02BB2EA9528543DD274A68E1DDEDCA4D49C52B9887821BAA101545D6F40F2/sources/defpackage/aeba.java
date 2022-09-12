package defpackage;
/* compiled from: PG */
/* renamed from: aeba  reason: default package */
/* loaded from: classes.dex */
public class aeba {
    private final dzsj<ckcw> a;

    public aeba(dzsj<ckcw> dzsjVar) {
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

    public final aeaz a(ckgz ckgzVar) {
        ckcw a = this.a.a();
        b(a, 1);
        b(ckgzVar, 2);
        return new aeaz(a, ckgzVar);
    }
}
