package defpackage;
/* compiled from: PG */
/* renamed from: xhh  reason: default package */
/* loaded from: classes7.dex */
public class xhh {
    public final dzsj<dxio<xfa>> a;

    public xhh(dzsj<dxio<xfa>> dzsjVar) {
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