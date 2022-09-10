package defpackage;
/* compiled from: PG */
/* renamed from: tlj  reason: default package */
/* loaded from: classes7.dex */
public final class tlj {
    public final dzsj<wuw> a;

    public tlj(dzsj<wuw> dzsjVar) {
        a(dzsjVar);
        this.a = dzsjVar;
    }

    public static <T> void a(T t) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(1);
        throw new NullPointerException(sb.toString());
    }
}
