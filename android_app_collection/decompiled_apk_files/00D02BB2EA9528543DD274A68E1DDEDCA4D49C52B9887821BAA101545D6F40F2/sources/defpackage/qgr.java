package defpackage;
/* compiled from: PG */
/* renamed from: qgr  reason: default package */
/* loaded from: classes7.dex */
public final class qgr implements qgs {
    private final dzsj<vnq> a;
    private final dzsj<btrm> b;

    public qgr(dzsj<vnq> dzsjVar, dzsj<btrm> dzsjVar2) {
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

    @Override // defpackage.qgs
    public final /* bridge */ /* synthetic */ akvo a(qhu qhuVar, qgv qgvVar) {
        vnq a = this.a.a();
        b(a, 1);
        btrm a2 = this.b.a();
        b(a2, 2);
        b(qhuVar, 3);
        b(qgvVar, 4);
        return new qgq(a, a2, qhuVar, qgvVar);
    }
}
