package defpackage;
/* compiled from: PG */
/* renamed from: crlg  reason: default package */
/* loaded from: classes5.dex */
public final class crlg {
    private final dzsj<btrm> a;
    private final dzsj<bvgl> b;
    private final dzsj<crfl> c;

    public crlg(dzsj<btrm> dzsjVar, dzsj<bvgl> dzsjVar2, dzsj<crfl> dzsjVar3) {
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

    public final crlf a(crlb crlbVar, amwb amwbVar) {
        btrm a = this.a.a();
        b(a, 1);
        bvgl a2 = this.b.a();
        b(a2, 2);
        b(crlbVar, 4);
        b(amwbVar, 5);
        return new crlf(a, a2, this.c.a(), crlbVar, amwbVar);
    }
}
