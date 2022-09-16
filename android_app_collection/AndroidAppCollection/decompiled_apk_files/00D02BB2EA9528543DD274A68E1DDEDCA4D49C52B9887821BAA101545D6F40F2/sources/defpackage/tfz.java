package defpackage;
/* compiled from: PG */
/* renamed from: tfz  reason: default package */
/* loaded from: classes7.dex */
public final class tfz {
    public final dzsj<gga> a;

    public tfz(dzsj<gga> dzsjVar) {
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
