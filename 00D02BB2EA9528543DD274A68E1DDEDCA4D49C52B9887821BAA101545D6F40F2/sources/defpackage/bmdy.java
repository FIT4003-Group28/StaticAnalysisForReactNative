package defpackage;
/* compiled from: PG */
/* renamed from: bmdy  reason: default package */
/* loaded from: classes3.dex */
public class bmdy {
    public final dzsj<brba> a;

    public bmdy(dzsj<brba> dzsjVar) {
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
