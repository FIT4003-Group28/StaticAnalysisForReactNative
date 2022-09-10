package defpackage;
/* compiled from: PG */
/* renamed from: aydo  reason: default package */
/* loaded from: classes3.dex */
public final class aydo {
    private final dzsj<gga> a;
    private final dzsj<aklj> b;
    private final dzsj<aaxo> c;
    private final dzsj<bvsx> d;
    private final dzsj<dxio<aaap>> e;

    public aydo(dzsj<gga> dzsjVar, dzsj<aklj> dzsjVar2, dzsj<aaxo> dzsjVar3, dzsj<bvsx> dzsjVar4, dzsj<dxio<aaap>> dzsjVar5) {
        c(dzsjVar, 1);
        this.a = dzsjVar;
        c(dzsjVar2, 2);
        this.b = dzsjVar2;
        c(dzsjVar3, 3);
        this.c = dzsjVar3;
        c(dzsjVar4, 4);
        this.d = dzsjVar4;
        c(dzsjVar5, 5);
        this.e = dzsjVar5;
    }

    private static <T> void c(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final aydn a(baal baalVar, dqhy dqhyVar, boolean z, boolean z2, ddho ddhoVar) {
        c(baalVar, 1);
        c(dqhyVar, 2);
        c(ddhoVar, 5);
        gga a = this.a.a();
        c(a, 6);
        aklj a2 = this.b.a();
        c(a2, 7);
        aaxo a3 = this.c.a();
        c(a3, 8);
        bvsx a4 = this.d.a();
        c(a4, 9);
        dxio a5 = ((dxjh) this.e).a();
        c(a5, 10);
        baai A = baalVar.A();
        dbsk.t(A, "EntityListItem has no experience content");
        return new aydn(baalVar, A, baalVar.y(a), dqhyVar, z, z2, ddhoVar, a, a2, a3, a4, a5);
    }

    public final aydn b(baal baalVar, diwb diwbVar, boolean z, boolean z2, ddho ddhoVar) {
        c(baalVar, 1);
        c(diwbVar, 2);
        c(ddhoVar, 5);
        gga a = this.a.a();
        c(a, 6);
        aklj a2 = this.b.a();
        c(a2, 7);
        aaxo a3 = this.c.a();
        c(a3, 8);
        bvsx a4 = this.d.a();
        c(a4, 9);
        dxio a5 = ((dxjh) this.e).a();
        c(a5, 10);
        return new aydn(baalVar, diwbVar, z, z2, ddhoVar, a, a2, a3, a4, a5);
    }
}
