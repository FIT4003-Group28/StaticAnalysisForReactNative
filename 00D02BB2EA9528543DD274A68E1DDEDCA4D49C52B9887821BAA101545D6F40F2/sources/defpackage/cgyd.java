package defpackage;
/* compiled from: PG */
/* renamed from: cgyd  reason: default package */
/* loaded from: classes4.dex */
public final class cgyd {
    public final dzsj<bqji> a;
    public final dzsj<cgum> b;

    public cgyd(dzsj<bqji> dzsjVar, dzsj<cgum> dzsjVar2) {
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