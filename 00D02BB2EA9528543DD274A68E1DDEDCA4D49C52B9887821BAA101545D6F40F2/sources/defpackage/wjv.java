package defpackage;
/* compiled from: PG */
/* renamed from: wjv  reason: default package */
/* loaded from: classes7.dex */
public class wjv {
    public final dzsj<vtn> a;
    public final dzsj<wsm> b;

    public wjv(dzsj<vtn> dzsjVar, dzsj<wsm> dzsjVar2) {
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
