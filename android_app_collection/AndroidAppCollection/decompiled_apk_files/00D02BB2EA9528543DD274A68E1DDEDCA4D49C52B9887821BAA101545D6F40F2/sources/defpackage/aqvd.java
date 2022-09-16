package defpackage;
/* compiled from: PG */
/* renamed from: aqvd  reason: default package */
/* loaded from: classes2.dex */
public final class aqvd {
    public final dzsj<aqvv> a;
    public final dzsj<dxio<apyz>> b;

    public aqvd(dzsj<aqvv> dzsjVar, dzsj<dxio<apyz>> dzsjVar2) {
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
