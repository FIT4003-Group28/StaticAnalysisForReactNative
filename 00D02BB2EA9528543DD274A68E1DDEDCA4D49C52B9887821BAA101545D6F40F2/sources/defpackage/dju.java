package defpackage;
/* compiled from: PG */
/* renamed from: dju  reason: default package */
/* loaded from: classes6.dex */
public final class dju {
    public final dzsj<cjqy> a;
    public final dzsj<crow> b;

    public dju(dzsj<cjqy> dzsjVar, dzsj<crow> dzsjVar2) {
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
