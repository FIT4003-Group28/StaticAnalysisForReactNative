package defpackage;
/* compiled from: PG */
/* renamed from: jso  reason: default package */
/* loaded from: classes7.dex */
public final class jso {
    public final dzsj<cqhn> a;
    public final dzsj<jsh> b;

    public jso(dzsj<cqhn> dzsjVar, dzsj<jsh> dzsjVar2) {
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
