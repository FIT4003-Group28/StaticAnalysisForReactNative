package defpackage;
/* compiled from: PG */
/* renamed from: beot  reason: default package */
/* loaded from: classes3.dex */
public final class beot {
    public final dzsj<beor> a;

    public beot(dzsj<beor> dzsjVar) {
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
