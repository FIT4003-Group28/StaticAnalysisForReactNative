package defpackage;
/* compiled from: PG */
/* renamed from: bzej  reason: default package */
/* loaded from: classes4.dex */
public final class bzej {
    private final dzsj<amub> a;
    private final dzsj<bzfw> b;
    private final dzsj<bzfm> c;
    private final dzsj<bzdn> d;
    private final dzsj<byzk> e;
    private final dzsj<bzfj> f;
    private final dzsj<cqat> g;

    public bzej(dzsj<amub> dzsjVar, dzsj<bzfw> dzsjVar2, dzsj<bzfm> dzsjVar3, dzsj<bzdn> dzsjVar4, dzsj<byzk> dzsjVar5, dzsj<bzfj> dzsjVar6, dzsj<cqat> dzsjVar7) {
        b(dzsjVar, 1);
        this.a = dzsjVar;
        b(dzsjVar2, 2);
        this.b = dzsjVar2;
        b(dzsjVar3, 3);
        this.c = dzsjVar3;
        b(dzsjVar4, 4);
        this.d = dzsjVar4;
        b(dzsjVar5, 5);
        this.e = dzsjVar5;
        b(dzsjVar6, 6);
        this.f = dzsjVar6;
        b(dzsjVar7, 7);
        this.g = dzsjVar7;
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

    public final bzei a(dbsz<bzek> dbszVar, bzdg bzdgVar) {
        amub amubVar = (amub) ((dxjd) this.a).a;
        b(amubVar, 1);
        bzfw a = this.b.a();
        b(a, 2);
        bzfm a2 = this.c.a();
        b(a2, 3);
        bzdn a3 = this.d.a();
        b(a3, 4);
        byzk a4 = this.e.a();
        b(a4, 5);
        bzfj a5 = this.f.a();
        b(a5, 6);
        cqat a6 = this.g.a();
        b(a6, 7);
        b(dbszVar, 8);
        b(bzdgVar, 9);
        return new bzei(amubVar, a, a2, a3, a4, a5, a6, dbszVar, bzdgVar);
    }
}
