package defpackage;
/* compiled from: PG */
/* renamed from: lmf  reason: default package */
/* loaded from: classes7.dex */
public final class lmf {
    public final dzsj<npo> a;
    public final dzsj<btvo> b;

    public lmf(dzsj<npo> dzsjVar, dzsj<btvo> dzsjVar2) {
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
