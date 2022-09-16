package defpackage;
/* compiled from: PG */
/* renamed from: bdez  reason: default package */
/* loaded from: classes3.dex */
public final class bdez {
    public final dzsj<gfw> a;

    public bdez(dzsj<gfw> dzsjVar) {
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
