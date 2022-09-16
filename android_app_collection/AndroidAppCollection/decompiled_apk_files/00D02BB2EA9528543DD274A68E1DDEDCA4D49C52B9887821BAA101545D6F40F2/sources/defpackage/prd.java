package defpackage;
/* compiled from: PG */
/* renamed from: prd  reason: default package */
/* loaded from: classes7.dex */
public final class prd {
    public final dzsj<gga> a;
    public final dzsj<dxio<bsvm>> b;

    public prd(dzsj<gga> dzsjVar, dzsj<dxio<bsvm>> dzsjVar2) {
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
