package defpackage;
/* compiled from: PG */
/* renamed from: aynh  reason: default package */
/* loaded from: classes3.dex */
public final class aynh {
    private final dzsj<ahjq> a;
    private final dzsj<ayoj> b;
    private final dzsj<ayqq> c;

    public aynh(dzsj<ahjq> dzsjVar, dzsj<ayoj> dzsjVar2, dzsj<ayqq> dzsjVar3) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
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

    public final ayng a(aymt aymtVar) {
        ahjq a = this.a.a();
        b(a, 1);
        ayoj a2 = this.b.a();
        b(a2, 2);
        ayqq a3 = this.c.a();
        b(a3, 3);
        b(aymtVar, 4);
        return new ayng(a, a2, a3, aymtVar);
    }
}
