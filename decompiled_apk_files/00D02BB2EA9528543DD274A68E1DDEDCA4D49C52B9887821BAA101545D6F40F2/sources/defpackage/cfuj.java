package defpackage;
/* compiled from: PG */
/* renamed from: cfuj  reason: default package */
/* loaded from: classes4.dex */
public final class cfuj {
    public final dzsj<axru> a;
    public final dzsj<axrx> b;

    public cfuj(dzsj<axru> dzsjVar, dzsj<axrx> dzsjVar2) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
    }

    public static <T> T a(T t, int i) {
        if (t != null) {
            return t;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }
}
