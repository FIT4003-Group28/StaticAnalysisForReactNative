package defpackage;
/* compiled from: PG */
/* renamed from: wgg  reason: default package */
/* loaded from: classes7.dex */
public final class wgg {
    public final dzsj<dxio<bzmm>> a;
    public final dzsj<dxio<cjnf>> b;

    public wgg(dzsj<dxio<bzmm>> dzsjVar, dzsj<dxio<cjnf>> dzsjVar2) {
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
