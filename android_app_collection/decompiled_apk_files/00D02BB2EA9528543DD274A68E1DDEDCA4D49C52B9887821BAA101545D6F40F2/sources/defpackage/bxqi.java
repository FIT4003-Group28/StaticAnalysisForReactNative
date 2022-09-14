package defpackage;
/* compiled from: PG */
/* renamed from: bxqi  reason: default package */
/* loaded from: classes4.dex */
public final class bxqi {
    private final dzsj<bxqd> a;

    public bxqi(dzsj<bxqd> dzsjVar) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
    }

    private static <T> void b(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final bxqh a(bxqg bxqgVar) {
        bxqd a = this.a.a();
        b(a, 1);
        b(bxqgVar, 2);
        return new bxqh(a, bxqgVar);
    }
}
