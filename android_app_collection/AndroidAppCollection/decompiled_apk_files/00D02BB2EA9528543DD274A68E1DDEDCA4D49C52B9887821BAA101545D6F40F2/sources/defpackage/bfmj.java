package defpackage;
/* compiled from: PG */
/* renamed from: bfmj  reason: default package */
/* loaded from: classes3.dex */
public final class bfmj {
    private final dzsj<bfmr> a;

    public bfmj(dzsj<bfmr> dzsjVar) {
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

    public final bfmi a(int i, dcep<dwci> dcepVar, boolean z) {
        bfmr a = this.a.a();
        b(a, 1);
        b(dcepVar, 3);
        return new bfmi(a, i, dcepVar, z);
    }
}
