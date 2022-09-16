package defpackage;
/* compiled from: PG */
/* renamed from: ccdp  reason: default package */
/* loaded from: classes4.dex */
public final class ccdp {
    public final dzsj<dxio<gce>> a;

    public ccdp(dzsj<dxio<gce>> dzsjVar) {
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
