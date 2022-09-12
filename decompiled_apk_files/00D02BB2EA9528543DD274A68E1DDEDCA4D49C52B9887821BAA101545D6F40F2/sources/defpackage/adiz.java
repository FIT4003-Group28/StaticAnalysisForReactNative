package defpackage;
/* compiled from: PG */
/* renamed from: adiz  reason: default package */
/* loaded from: classes2.dex */
public final class adiz {
    public final dzsj<abum> a;
    public final dzsj<acwt> b;

    public adiz(dzsj<abum> dzsjVar, dzsj<acwt> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
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
