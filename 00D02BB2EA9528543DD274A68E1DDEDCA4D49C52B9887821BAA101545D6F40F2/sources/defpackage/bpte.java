package defpackage;
/* compiled from: PG */
/* renamed from: bpte  reason: default package */
/* loaded from: classes4.dex */
public final class bpte {
    private final dzsj<akox> a;

    public bpte(dzsj<akox> dzsjVar) {
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

    public final bptd a(ges gesVar) {
        akox a = this.a.a();
        b(a, 1);
        b(gesVar, 2);
        return new bptd(a, gesVar);
    }
}
