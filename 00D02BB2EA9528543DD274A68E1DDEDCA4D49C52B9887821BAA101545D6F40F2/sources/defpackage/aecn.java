package defpackage;
/* compiled from: PG */
/* renamed from: aecn  reason: default package */
/* loaded from: classes.dex */
public final class aecn {
    private final dzsj<cqat> a;
    private final dzsj<bvjj> b;
    private final dzsj<aedf> c;
    private final dzsj<aedc> d;
    private final dzsj<aedh> e;
    private final dzsj<aedr> f;
    private final dzsj<aedj> g;
    private final dzsj<afzs> h;
    private final dzsj<acyr> i;
    private final dzsj<acyp> j;

    public aecn(dzsj<cqat> dzsjVar, dzsj<bvjj> dzsjVar2, dzsj<aedf> dzsjVar3, dzsj<aedc> dzsjVar4, dzsj<aedh> dzsjVar5, dzsj<aedr> dzsjVar6, dzsj<aedj> dzsjVar7, dzsj<afzs> dzsjVar8, dzsj<acyr> dzsjVar9, dzsj<acyp> dzsjVar10) {
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
        b(dzsjVar8, 8);
        this.h = dzsjVar8;
        b(dzsjVar9, 9);
        this.i = dzsjVar9;
        b(dzsjVar10, 10);
        this.j = dzsjVar10;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final aecm a(aecy aecyVar) {
        cqat a = this.a.a();
        b(a, 1);
        bvjj a2 = this.b.a();
        b(a2, 2);
        aedf a3 = this.c.a();
        b(a3, 3);
        aedc a4 = this.d.a();
        b(a4, 4);
        aedh a5 = this.e.a();
        b(a5, 5);
        aedr a6 = this.f.a();
        b(a6, 6);
        aedj a7 = this.g.a();
        b(a7, 7);
        afzs a8 = this.h.a();
        b(a8, 8);
        acyr a9 = this.i.a();
        b(a9, 9);
        acyp a10 = this.j.a();
        b(a10, 10);
        b(aecyVar, 11);
        return new aecm(a, a2, a3, a4, a5, a6, a7, a8, a9, a10, aecyVar);
    }
}
