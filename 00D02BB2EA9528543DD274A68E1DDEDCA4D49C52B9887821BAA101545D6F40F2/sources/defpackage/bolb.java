package defpackage;
/* compiled from: PG */
/* renamed from: bolb  reason: default package */
/* loaded from: classes3.dex */
public final class bolb {
    private final dzsj<bokp> a;
    private final dzsj<bvrb> b;

    public bolb(dzsj<bokp> dzsjVar, dzsj<bvrb> dzsjVar2) {
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

    public final bola a(String str) {
        bokp a = this.a.a();
        b(a, 2);
        bvrb a2 = this.b.a();
        b(a2, 3);
        return new bola(str, a, a2);
    }
}
