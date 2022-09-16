package defpackage;
/* compiled from: PG */
/* renamed from: beph  reason: default package */
/* loaded from: classes3.dex */
public final class beph {
    public final dzsj<bmel> a;

    public beph(dzsj<bmel> dzsjVar) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
