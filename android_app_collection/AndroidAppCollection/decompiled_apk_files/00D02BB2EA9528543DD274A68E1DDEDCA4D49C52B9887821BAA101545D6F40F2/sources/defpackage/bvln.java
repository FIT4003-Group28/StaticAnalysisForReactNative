package defpackage;
/* compiled from: PG */
/* renamed from: bvln  reason: default package */
/* loaded from: classes.dex */
public final class bvln {
    public final dzsj<bvlu> a;

    public bvln(dzsj<bvlu> dzsjVar) {
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
