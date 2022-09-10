package defpackage;
/* compiled from: PG */
/* renamed from: bvts  reason: default package */
/* loaded from: classes4.dex */
public final class bvts {
    private final dzsj<bvuw> a;
    private final dzsj<cqkj> b;
    private final dzsj<gga> c;
    private final dzsj<bwde> d;

    public bvts(dzsj<bvuw> dzsjVar, dzsj<cqkj> dzsjVar2, dzsj<gga> dzsjVar3, dzsj<bwde> dzsjVar4) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
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

    public final bvtr a(@dzsi bwce bwceVar) {
        bvuw a = this.a.a();
        b(a, 1);
        b(this.b.a(), 2);
        gga a2 = this.c.a();
        b(a2, 3);
        bwde a3 = this.d.a();
        b(a3, 4);
        return new bvtr(a, a2, a3, bwceVar);
    }
}
