package defpackage;
/* compiled from: PG */
/* renamed from: bzfm  reason: default package */
/* loaded from: classes4.dex */
public final class bzfm {
    private final dzsj<bzfw> a;
    private final dzsj<bzdv> b;
    private final dzsj<byzk> c;
    private final dzsj<bzfj> d;
    private final dzsj<cqat> e;

    public bzfm(dzsj<bzfw> dzsjVar, dzsj<bzdv> dzsjVar2, dzsj<byzk> dzsjVar3, dzsj<bzfj> dzsjVar4, dzsj<cqat> dzsjVar5) {
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

    public final bzfl a(dbsz<bzek> dbszVar, bzdg bzdgVar) {
        bzfw a = this.a.a();
        b(a, 1);
        bzdv a2 = this.b.a();
        b(a2, 2);
        byzk a3 = this.c.a();
        b(a3, 3);
        bzfj a4 = this.d.a();
        b(a4, 4);
        cqat a5 = this.e.a();
        b(a5, 5);
        b(dbszVar, 6);
        b(bzdgVar, 7);
        return new bzfl(a, a2, a3, a4, a5, dbszVar, bzdgVar);
    }
}
