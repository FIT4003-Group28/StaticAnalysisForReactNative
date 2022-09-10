package defpackage;
/* compiled from: PG */
/* renamed from: dkj  reason: default package */
/* loaded from: classes6.dex */
public final class dkj {
    public final dzsj<dkh> a;
    public final dzsj<cjqy> b;

    public dkj(dzsj<dkh> dzsjVar, dzsj<cjqy> dzsjVar2) {
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
