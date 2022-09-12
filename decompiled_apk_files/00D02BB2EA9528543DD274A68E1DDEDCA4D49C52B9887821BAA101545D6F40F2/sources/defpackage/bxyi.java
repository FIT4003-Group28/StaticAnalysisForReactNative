package defpackage;
/* compiled from: PG */
/* renamed from: bxyi  reason: default package */
/* loaded from: classes4.dex */
public final class bxyi {
    public final dzsj<dxio<aagc>> a;
    public final dzsj<bxyp> b;

    public bxyi(dzsj<dxio<aagc>> dzsjVar, dzsj<bxyp> dzsjVar2) {
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
