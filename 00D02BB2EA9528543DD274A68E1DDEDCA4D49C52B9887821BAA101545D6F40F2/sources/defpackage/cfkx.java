package defpackage;
/* compiled from: PG */
/* renamed from: cfkx  reason: default package */
/* loaded from: classes4.dex */
public class cfkx {
    public final dzsj<cfgv> a;
    public final dzsj<cfku> b;

    public cfkx(dzsj<cfgv> dzsjVar, dzsj<cfku> dzsjVar2) {
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