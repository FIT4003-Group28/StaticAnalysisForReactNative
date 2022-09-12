package defpackage;
/* compiled from: PG */
/* renamed from: bkdn  reason: default package */
/* loaded from: classes3.dex */
public class bkdn {
    public final dzsj<bkdc> a;

    public bkdn(dzsj<bkdc> dzsjVar) {
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
