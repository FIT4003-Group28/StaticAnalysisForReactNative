package defpackage;
/* compiled from: PG */
/* renamed from: abvi  reason: default package */
/* loaded from: classes2.dex */
public final class abvi {
    public final dzsj<dxio<abfb>> a;
    public final dzsj<akpm> b;

    public abvi(dzsj<dxio<abfb>> dzsjVar, dzsj<akpm> dzsjVar2) {
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
