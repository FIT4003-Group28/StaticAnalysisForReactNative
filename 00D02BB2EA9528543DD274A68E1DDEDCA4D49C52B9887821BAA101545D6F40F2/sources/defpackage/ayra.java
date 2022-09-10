package defpackage;
/* compiled from: PG */
/* renamed from: ayra  reason: default package */
/* loaded from: classes3.dex */
public final class ayra {
    public final dzsj<gga> a;
    public final dzsj<aklj> b;
    public final dzsj<aaxo> c;
    public final dzsj<bvsx> d;
    public final dzsj<dxio<aaap>> e;
    public final dzsj<dxio<axwo>> f;

    public ayra(dzsj<gga> dzsjVar, dzsj<aklj> dzsjVar2, dzsj<aaxo> dzsjVar3, dzsj<bvsx> dzsjVar4, dzsj<dxio<aaap>> dzsjVar5, dzsj<dxio<axwo>> dzsjVar6) {
        a(dzsjVar, 1);
        this.a = dzsjVar;
        a(dzsjVar2, 2);
        this.b = dzsjVar2;
        a(dzsjVar3, 3);
        this.c = dzsjVar3;
        a(dzsjVar4, 4);
        this.d = dzsjVar4;
        a(dzsjVar5, 5);
        this.e = dzsjVar5;
        a(dzsjVar6, 6);
        this.f = dzsjVar6;
    }

    public static <T> void a(T t, int i) {
        if (t != null) {
            return;
        }
        StringBuilder sb = new StringBuilder(93);
        sb.append("@AutoFactory method argument is null but is not marked @Nullable. Argument index: ");
        sb.append(i);
        throw new NullPointerException(sb.toString());
    }

    public final ayqz b(baal baalVar, dqhy dqhyVar, ddho ddhoVar) {
        a(baalVar, 1);
        a(dqhyVar, 2);
        a(ddhoVar, 5);
        gga a = this.a.a();
        a(a, 6);
        aklj a2 = this.b.a();
        a(a2, 7);
        aaxo a3 = this.c.a();
        a(a3, 8);
        bvsx a4 = this.d.a();
        a(a4, 9);
        dxio a5 = ((dxjh) this.e).a();
        a(a5, 10);
        dxio a6 = ((dxjh) this.f).a();
        a(a6, 11);
        return new ayqz(baalVar, dqhyVar, ddhoVar, a, a2, a3, a4, a5, a6);
    }
}
