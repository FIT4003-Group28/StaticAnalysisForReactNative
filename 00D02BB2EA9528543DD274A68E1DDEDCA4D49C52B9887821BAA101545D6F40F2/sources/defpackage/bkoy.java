package defpackage;
/* compiled from: PG */
/* renamed from: bkoy  reason: default package */
/* loaded from: classes3.dex */
public final class bkoy {
    private final dzsj<blmi> a;
    private final dzsj<bego> b;

    public bkoy(dzsj<blmi> dzsjVar, dzsj<bego> dzsjVar2) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
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

    public final bkox a(boolean z) {
        blmi a = this.a.a();
        b(a, 1);
        bego a2 = this.b.a();
        b(a2, 2);
        return new bkox(a, a2, z);
    }
}
