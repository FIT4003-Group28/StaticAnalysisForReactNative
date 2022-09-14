package defpackage;
/* compiled from: PG */
/* renamed from: caza  reason: default package */
/* loaded from: classes4.dex */
public final class caza {
    public final dzsj<cbqg> a;

    public caza(dzsj<cbqg> dzsjVar) {
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
