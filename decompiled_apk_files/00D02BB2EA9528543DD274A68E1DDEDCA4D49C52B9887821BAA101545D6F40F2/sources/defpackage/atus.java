package defpackage;
/* compiled from: PG */
/* renamed from: atus  reason: default package */
/* loaded from: classes2.dex */
public class atus {
    public final dzsj<vtn> a;

    public atus(dzsj<vtn> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
